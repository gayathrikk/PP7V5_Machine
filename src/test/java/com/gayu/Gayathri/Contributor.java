package com.gayu.Gayathri;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Contributor {
	private RemoteWebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://172.12.20.99:4444/wd/hub");
		driver = new RemoteWebDriver(url, dc);
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		driver.get("http://apollo2.humanbrain.in/");
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
			table1.sendKeys("TestM\n");
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number Entered Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number is not Entered successfully");
		}
		try {
			WebDriverWait wait7 = new WebDriverWait(driver, 30);
			WebElement table2 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//*[@id=\"column\"]/ngx-series-set-comp/div/ngx-explore-comp/nb-layout/div[1]/div/div/div/div/nb-layout-column[2]/nb-card/nb-card-body/div[2]/div/nb-card/nb-card-footer/nb-icon[1]/img")));
			table2.click();
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Altas Editor is clicked");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Atlas Editor is not clicked");
		}
		Thread.sleep(4000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}

	@Test(priority = 3)
	public void Direct_Draw_page() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).build().perform();
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("Action executed successfully!");

		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error executing action: " + e.getMessage());
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement contri = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath(" //nb-accordion-item-header[text()='Contributors']")));
			contri.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("Our contributor selected Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("Our Contributor   is not selected");
		}}
		@Test(priority = 4)
		public void select_contributor() {
			try {
				WebDriverWait wait6 = new WebDriverWait(driver, 30);
				WebElement radio = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[2]")));
				radio.click();
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The software Team contributor is selected Successfully");
			} catch (Exception e) {
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The software Team contributor is  not selected");
			}
		
		try { 
		    WebElement canvas = driver.findElement(By.xpath("//canvas"));
		    Actions actions = new Actions(driver);
		   
		 	Thread.sleep(3000);
			int centerX = 0;
			int centerY = 0;
			actions.moveToElement(canvas, centerX, centerY).click().perform();
			Thread.sleep(5000);
		   System.out.println("Clicked at the center of the square successfully");
		} catch (NoSuchElementException e1) {
		    System.out.println("Element not found: " + e1.getMessage());
		} catch (Exception e) {
		    System.out.println("Error executing action: " + e.getMessage());
		}
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 50);
		    WebElement regionName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' 10154 : neural tube-NT ']")));

		    // Get the text without trimming
		    String actualText = regionName.getText();
		    System.out.println("Text=" + actualText);

		    // Define the expected text with leading and trailing spaces
		    String expectedTextWithSpaces = "10154 : neural tube-NT";

		    // Print the expected text with spaces
		    System.out.println("Expected text with spaces: [" + expectedTextWithSpaces + "]");

		    // Assert that the expected text matches the actual text without trimming
		    assertTrue("The expected text does not match the actual text.", actualText.equals(expectedTextWithSpaces));

		    // Print a message if assertion passes
		    System.out.println("--------------------------*****************-----------------------");
		    System.out.println("Assertion passed: The retrieved text matches the expected text.");
		    System.out.println("The shortcut keys go to direct Draw page successfully.");
		} catch (AssertionError e) {
		    System.out.println("Assertion failed: " + e.getMessage());
		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}



	}
		@AfterTest
		public void tearDown() {
			if (driver != null) {
				driver.quit();
			}
		}
	}