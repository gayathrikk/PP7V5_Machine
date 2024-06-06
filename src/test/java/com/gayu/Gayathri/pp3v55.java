package com.gayu.Gayathri;

import java.io.InputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;

public class pp3v55 {
    @Test
    public void testStorageDetails() {
        // Set up SSH connection
        JSch jsch = new JSch();
        com.jcraft.jsch.Session session = null;
        try {
            // Replace these with your SSH server details
            String user = "hbp";
            String host = "pp3v5.humanbrain.in";
            String password = "Health#123";
            int port = 22;

            // Establish SSH session
            session = jsch.getSession(user, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();

            // Execute command on SSH server
            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand("df -h /dev/nvme0n1"); // Command to retrieve storage details
            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            // Get output
            InputStream in = channel.getInputStream();
            channel.connect();
            byte[] tmp = new byte[1024];
            StringBuilder output = new StringBuilder();
            while (true) {
                while (in.available() > 0) {
                    int i = in.read(tmp, 0, 1024);
                    if (i < 0) break;
                    output.append(new String(tmp, 0, i));
                }
                if (channel.isClosed()) {
                    if (in.available() > 0) continue;
                    System.out.println("Exit status: " + channel.getExitStatus());
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ee) {
                    // Handle exception
                }
            }

            // Parse and format output as table
            String[] lines = output.toString().split("\n");
            System.out.println("+------------------+--------+--------+--------+------+---------------------+");
            System.out.println("|   Filesystem     |  Size  |  Used  |  Avail | Use% | Mounted on          |");
            System.out.println("+------------------+--------+--------+--------+------+---------------------+");
            boolean alertTriggered = false;
            StringBuilder alertMessage = new StringBuilder();
            for (int i = 1; i < lines.length; i++) {
                String[] parts = lines[i].trim().split("\\s+");
                if (parts.length < 6) continue; // Ensure there are enough columns to avoid ArrayIndexOutOfBoundsException
                System.out.printf("| %-16s | %6s | %6s | %6s | %4s | %-19s |\n", parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);

                // Check for storage usage percentage
                String usePercentageStr = parts[4].replace("%", "");
                int usePercentage = Integer.parseInt(usePercentageStr);
                if (usePercentage > 10) {
                    String alert = "ALERT: Storage usage for " + parts[0] + " is over 10%: " + parts[4] + ". Used: " + parts[2] + " out of " + parts[1] + "\n";
                    System.out.println(alert);
                    alertMessage.append(alert);
                    alertTriggered = true;
                }
            }
            System.out.println("+------------------+--------+--------+--------+------+---------------------+");
            channel.disconnect();
            session.disconnect();

            // Send email alert if any alert is triggered
            if (alertTriggered) {
                sendEmailAlert(alertMessage.toString());
                throw new Exception("Storage usage exceeds 10% on one or more filesystems. Email alert sent.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Fail the test if an exception occurs
            throw new RuntimeException("Test failed due to an error: " + e.getMessage());
        }
    }

    private void sendEmailAlert(String messageContent) {
        // Set up email properties
        String to = "annotation.divya@gmail.com"; // Replace with the recipient's email address
        String from = "softwaretestingteam9@gmail.com"; // Replace with your email address
        final String username = "Divya D"; // Replace with your email username
        final String password = ""; // Replace with your email password or App Password

        String host = "smtp.gmail.com"; // Gmail SMTP server
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "465");

        // Get the Session object
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // Set From: header field of the header
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("Storage Usage Alert");

            // Now set the actual message
            message.setText(messageContent);

            // Send message
            Transport.send(message);

            System.out.println("Sent email successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }}
