package com.gayu.Gayathri;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Set;

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

public class ShortcutKey_TRS {
	public class ShortcutKey_add {
		private RemoteWebDriver driver;

		@BeforeTest
		public void setup() throws MalformedURLException {
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			URL url = new URL("http://172.12.20.99:4443/wd/hub");
			driver = new RemoteWebDriver(url, dc);
		}
@Test (priority=1)
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
@Test (priority=2)
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
@Test (priority=3)
		public void Direct_Draw_page() throws InterruptedException {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				Actions actions = new Actions(driver);
				actions.keyDown(Keys.SHIFT).sendKeys("o").keyUp(Keys.SHIFT).build().perform();
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("Action executed successfully!");

			} catch (NoSuchElementException e) {
				System.out.println("Element not found: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error executing action: " + e.getMessage());
			}

			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);

				// Click on the annotation icon
				WebElement annotation = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//nb-accordion-item-header[text()='Annotation']")));
				annotation.click();

				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The annotation icon is clicked");

			} catch (Exception e) {
				System.out.println("The annotation icon is not clicked");
			}

			try {
				Actions actions = new Actions(driver);

				// Press ALT + V
				actions.keyDown(Keys.ALT).sendKeys("v").keyUp(Keys.ALT).build().perform();
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("Action executed successfully!");

			} catch (NoSuchElementException e) {
				System.out.println("Element not found: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error executing action: " + e.getMessage());
			}
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				WebElement search = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
				search.sendKeys("brain");
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The search icon is clicked");
			} catch (Exception e) {
				System.out.println("The search icon is not clicked");
			}
		}
@Test (priority=4)
		public void search() {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				WebElement brainId = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='10155_anchor']")));
				brainId.click();
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The option is selected");
			} catch (Exception e) {
				System.out.println("The option is not clicked");
			}
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				WebElement canvas = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[@id=\"atlasEditorMap\"]/div[1]/div[1]/div[2]")));
				canvas.click();
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("The canvas is clicked");
			} catch (Exception e) {
				System.out.println("The canvas is not clicked");
			}
		}
@Test (priority=5)
		public void drawSquareInMiddle() throws InterruptedException {
			try {
				Actions actions = new Actions(driver);

				actions.sendKeys("a").perform();
				Thread.sleep(3000);
				System.out.println("--------------------------*****************-----------------------");
				System.out.println("Action executed successfully!");

			} catch (NoSuchElementException e1) {
				System.out.println("Element not found: " + e1.getMessage());
			} catch (Exception e) {
				System.out.println("Error executing action: " + e.getMessage());
			}
			try { 
			    WebElement canvas = driver.findElement(By.xpath("//canvas"));
			    Actions actions = new Actions(driver);
			    actions.moveToElement(canvas).click();
			    actions.moveByOffset(200, 0).click();   
			    actions.moveByOffset(0, 200).click();  
			    actions.moveByOffset(-200, 0).click();  
			    actions.moveByOffset(0, -200).click();  
			    actions.release().perform();     
			    Thread.sleep(5000);
			    System.out.println("Square drawn successfully on the canvas");
			    actions.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).build().perform();
			    System.out.println("Drawn region saved sucessfully");
			} catch (NoSuchElementException e1) {
			    System.out.println("Element not found: " + e1.getMessage());
			} catch (Exception e) {
			    System.out.println("Error executing action: " + e.getMessage());
			}
			
		}
@Test (priority=6)
		 public void testCanvasDrag() throws InterruptedException {
	try {
		Actions actions = new Actions(driver);
		WebElement canvas = driver.findElement(By.xpath("//canvas"));
		 actions.keyDown(Keys.SHIFT).sendKeys("T").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("TRS action executed successfully!");

	} catch (NoSuchElementException e1) {
		System.out.println("Element not found: " + e1.getMessage());
	} catch (Exception e) {
		System.out.println("Error executing deletion action: " + e.getMessage());
	}
	try {
		Actions actions = new Actions(driver);
		WebElement canvas = driver.findElement(By.xpath("//canvas"));

	    int pixelsPerInch = 96;
        int pixelsToMove = pixelsPerInch;

        actions.moveToElement(canvas).clickAndHold().perform();
        actions.moveByOffset(pixelsToMove, 0).perform();
        actions.release().perform();
		Thread.sleep(3000);
		System.out.println("--------------------------*****************-----------------------");
		System.out.println("Square moved successfully!");
		 actions.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).build().perform();
		    System.out.println("Moved region saved sucessfully");
		   actions.keyDown(Keys.SHIFT).sendKeys("y").keyUp(Keys.SHIFT).build().perform();
		   System.out.println("TRS Removed Sucessfully");
           actions.moveToElement(canvas, pixelsToMove, 0).click().perform();
           System.out.println("The Square region selected");
           Thread.sleep(5000);
	} catch (NoSuchElementException e1) {
		System.out.println("Element not found: " + e1.getMessage());
	} catch (Exception e) {
		System.out.println("Error executing deletion action: " + e.getMessage());
	}

try {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	Actions actions = new Actions(driver);
	actions.sendKeys("d").perform();
	WebElement del = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));
	del.click();
	Thread.sleep(3000);
	Thread.sleep(3000);
	System.out.println("--------------------------*****************-----------------------");
	System.out.println("The selected region deleted successfully!");

} catch (NoSuchElementException e1) {
	System.out.println("Element not found: " + e1.getMessage());
} catch (Exception e) {
	System.out.println("Error executing action: " + e.getMessage());
}
try {
	Actions actions = new Actions(driver);
	WebElement canvas = driver.findElement(By.xpath("//canvas"));
	 actions.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(3000);
	System.out.println("--------------------------*****************-----------------------");
	System.out.println("Deleted Region saved sucessfully successfully!");

} catch (NoSuchElementException e1) {
	System.out.println("Element not found: " + e1.getMessage());
} catch (Exception e) {
	System.out.println("Error executing deletion action: " + e.getMessage());
}}
			@AfterTest
			public void tearDown() {
				if (driver != null) {
					driver.quit();
				}
			}
		}}