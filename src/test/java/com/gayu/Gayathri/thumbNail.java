package com.gayu.Gayathri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class thumbNail {
	private RemoteWebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://172.12.20.99:4443/wd/hub");
		driver = new RemoteWebDriver(url, dc);
	}
 
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		driver.get("https://apollo2.humanbrain.in");
		driver.manage().window().maximize();
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("The server is Opened sucessfully");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement viewerSectionLink = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'ng-tns-c93-3')]")));
		viewerSectionLink.click();
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("The Viewer Icon is clicked");
		String parentWindow = driver.getWindowHandle();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement login = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
		login.click();
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("The login Button is clicked");
		Thread.sleep(4000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		Thread.sleep(4000);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement emailInput = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		emailInput.sendKeys("softwareteam45@gmail.com");
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("Mail I'd is entered");
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement Next = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		Next.click();
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("The Next Button is clicked");
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		System.out.println("--------------------------*****************-----------------------");
		WebElement PasswordInput = wait4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		PasswordInput.sendKeys("Health#123");
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("Password is entered");
		WebDriverWait wait5 = new WebDriverWait(driver, 20);
		WebElement Next2 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		Next2.click();
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("The Next Button is clicked");
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
	}
		@Test(priority = 2)
		public void table() throws InterruptedException {
			String parentWindow = driver.getWindowHandle();
			try {
				WebDriverWait wait6 = new WebDriverWait(driver, 30);
				WebElement table1 = wait6
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search tags']")));
				table1.sendKeys("59\n");
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The number Entered Successfully");
			} catch (Exception e) {
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The number is not Entered successfully");
			}
			try {
				WebDriverWait wait7 = new WebDriverWait(driver, 30);
				WebElement icon = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//nb-icon[@icon='viewer'])[3]")));
				icon.click();
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The BioSample is clicked");
			} catch (Exception e) {
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The BioSample is not clicked");
			}
//			try {
//				WebDriverWait wait7 = new WebDriverWait(driver, 30);
//				WebElement B1 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Block face image'])[1]")));
//				B1.click();
//				System.out.println("--------------------------*****************-----------------------");
//				System.out.println("The Block Face Image is clicked");
//			} catch (Exception e) {
//				System.out.println("--------------------------*****************-----------------------");
//				System.out.println("The Block Face Image is not clicked");
//			}
			Thread.sleep(4000);
			Set<String> allWindows = driver.getWindowHandles();
			for (String window : allWindows) {
				if (!window.equals(parentWindow)) {
					driver.switchTo().window(window);
					break;
				}
			}
		}
		

		@Test(priority=3)
		public void thumbnailview() throws InterruptedException {
//			try {
//				 WebDriverWait wait = new WebDriverWait(driver, 10);
//				    WebElement hd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='2'])[1]")));
//				    hd.click();
//				System.out.println("--------------------------*****************-----------------------");
//				System.out.println("The number is clicked");
//			} catch (Exception e) {
//				System.out.println("--------------------------*****************-----------------------");
//				System.out.println("The number is not clicked");
//			}
		   
		    JavascriptExecutor js = (JavascriptExecutor) driver; // Create an instance of JavascriptExecutor

		    for (int i = 1; i <=1000 ; i++) {
		        // Click on thumbnail
		    	WebElement spanElement = driver.findElement(By.cssSelector("span.ngx-gallery-remaining-count"));

		        // Wait for a brief moment for any potential errors to log
		        try {
		            Thread.sleep(1000); // Adjust this wait time as needed
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }

		    // Check for console log messages
		    LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		    for (LogEntry entry : logEntries) {
		        if (entry.getLevel() == Level.SEVERE && entry.getMessage().contains("Failed to load resource: the server responded with a status of 404")) {
		            System.out.println("404 Error logged: " + entry.getMessage());
		        }
		    }
		}
		@Test(priority=4)
		public void thumbnailview_BFIWHITE() throws InterruptedException {
			try {
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				    WebElement hd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='BFI White'])[1]")));
				    hd.click();
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The BFI White is clicked");
			} catch (Exception e) {
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The BFI White is not clicked");
			}
			 JavascriptExecutor js = (JavascriptExecutor) driver; // Create an instance of JavascriptExecutor

			    for (int i = 1; i <=1000 ; i++) {
			        // Click on thumbnail
			    	WebElement spanElement = driver.findElement(By.cssSelector(".ngx-gallery-remaining-count"));
			    		 // Wait for a brief moment for any potential errors to log
			        try {
			            Thread.sleep(1000); // Adjust this wait time as needed
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			    }

			    // Check for console log messages
			    LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
			    for (LogEntry entry : logEntries) {
			        if (entry.getLevel() == Level.SEVERE && entry.getMessage().contains("Failed to load resource: the server responded with a status of 404")) {
			            System.out.println("404 Error logged: " + entry.getMessage());
			        }
			    
			    }}}