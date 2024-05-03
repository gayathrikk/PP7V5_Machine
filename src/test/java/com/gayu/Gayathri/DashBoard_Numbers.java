package com.gayu.Gayathri;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoard_Numbers {
	private RemoteWebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://172.12.20.99:4444"
				+ "/wd/hub");
		driver = new RemoteWebDriver(url, dc);
	}

	@Test(priority = 1, enabled=true)
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
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement dashboard = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/viewer/assets/images/colorsvg/cellreports.svg']")));
			dashboard.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Dashboard button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Dashboard button is not clicked ");
		}
	}
	@Test(priority = 2, enabled=true)
	public void table1() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			System.out.println("--------------------------*******Manipulation_Table**********-----------------------");
			WebElement addicon = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='ADD'])[1]")));
			addicon.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Add button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Add button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-overlay-0\"]/nb-windows-container/nb-window/nb-card/nb-card-header/div[2]/button[3]")));
			close.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement waiting = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[1]")));
			waiting.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Total count Number is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Total count Number not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close2 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close2.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 2 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 2 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement inProgress = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='value w-50 inprgcol click']")));
			inProgress.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close3 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close3.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 3 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 3 is not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement rejected = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[1]")));
			rejected.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close4 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close4.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 4 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 4 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement SubReady = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click p-2'])[1]")));
			SubReady.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close5 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close5.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 5 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 5 is not clicked ");
		}
	}
	@Test (priority=3, enabled=true)
	public void OrganExtraction() {
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			System.out.println("--------------------------*******Organ_Extraction_Table**********-----------------------");
			WebElement SubIn= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='value incol p-2 click']")));
			SubIn.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close6 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close6.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 6 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 6 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MriToDo= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[2]")));
			MriToDo.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close7 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close7.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 7 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 7 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MriDone= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 outcol click'])[1]")));
			MriDone.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close8 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close8.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 8 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 8 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement PerfusionDone= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 outcol click'])[2]")));
			PerfusionDone.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close9 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close9.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 9 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 9 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement reject2= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[2]")));
			reject2.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close10 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close10.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 10 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 10 is not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement OrganOut= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click p-2'])[2]")));
			OrganOut.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close11 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close11.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 11 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 11 is not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement SubCompleted= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click p-2'])[3]")));
			SubCompleted.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close12 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close12.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 12 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 12 is not clicked ");
		}}
	@Test (priority=4, enabled=true)
	
	public void cryo_Protection() {
		System.out.println("--------------------------*******Cryo_Protection_Table**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value incol click'])[1]")));
			In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close13 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close13.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 13 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 13 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement waiting= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[3]")));
			waiting.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close14 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close14.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 14 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 14 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement StageI= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value inprgcol click'])[1]")));
			StageI.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close15 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close15.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 15 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 15 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement StageII= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value inprgcol click'])[2]")));
			StageII.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close16 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close16.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 16 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 16 is not clicked ");
		}


		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement StageIII= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value inprgcol click'])[3]")));
			StageIII.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close17 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close17.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 17 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 17 is not clicked ");
		}


		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Cryo_Out= wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click'])[1]")));
			Thread.sleep(3000);
			Cryo_Out.click();
			
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			Thread.sleep(3000);
			WebElement close18 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close18.click();			
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 18 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 18 is not clicked ");
		}
	}
	@Test(priority=5, enabled=true)
	public void Cryo_blocking() {
		System.out.println("--------------------------*******Cryo_Blocking_Table**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Cryoblock_In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='ADD'])[2]")));
			Cryoblock_In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close19 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close19.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 19 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 19 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Cryoblock_wait= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[4]")));
			Cryoblock_wait.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close20 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close20.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 20 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 20 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Frozen_InProgress= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[3]")));
			Frozen_InProgress.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close21 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close21.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 21 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 21 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Cryo_block_Out= wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[4]")));
			Cryo_block_Out.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close22 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close22.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 22 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 22 is not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Cryo_block_Organ_Out= wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='value outcol']")));
			Cryo_block_Organ_Out.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
		    WebDriverWait wait6 = new WebDriverWait(driver, 30);
		    WebElement close23 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
		    Thread.sleep(3000);
		    close23.click();
		    Thread.sleep(3000);
		    System.out.println("--------------------------*****************-----------------------");
		    System.out.println("The close button 23 is clicked Successfully");
		} catch (Exception e) {
		    System.out.println("--------------------------*****************-----------------------");
		    System.out.println("The close button 23 is not clicked ");
		    throw new AssertionError("Failed to click close button 23", e); // Failing explicitly
		}


	}

	@Test (priority=5,enabled=true)
	public void MRI_Skull_stripping() {
		System.out.println("--------------------------*******MRI_Skull_Stripping**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='ADD'])[3]")));
			MRI_In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close24 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close24.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 24 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 24 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_Upload= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[5]")));
			MRI_Upload.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close25 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close25.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 25 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 25 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_Automatic= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[6]")));
			MRI_Automatic.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close26 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close26.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 26 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 26 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Manual_Correct= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[7]")));
			Manual_Correct.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close27 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close27.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 27 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 27 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_QC= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[5]")));
			MRI_QC.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close28 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close28.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 28 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 28 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_Redo= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[6]")));
			MRI_Redo.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close29 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close29.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 29 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 29 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement MRI_Out= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click'])[2]")));
			Thread.sleep(3000);
			MRI_Out.click();
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close30 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			Thread.sleep(3000);	
			close30.click();
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 30 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 30 is not clicked ");
		}
	}
	@Test (priority=6,enabled=true)
	public void Imaging() {
		System.out.println("--------------------------*******Imaging**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Image_In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='ADD'])[4]")));
			Image_In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close31 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close31.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 31 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 31 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement To_Do= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='value outcol click pt-0']")));
			To_Do.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close32 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close32.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 32 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 32 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Scanning= wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[1]")));
			Scanning.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close32 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close32.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 33 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 33 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Img_QC= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[8]")));
			Img_QC.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close34 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close34.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 34 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 34 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Bio_QC= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[9]")));
			Bio_QC.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close35 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close35.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 35 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 35 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement publishing= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 outcol click'])[3]")));
			publishing.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close36 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close36.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 36 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 36 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Batch_failed= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[7]")));
			Batch_failed.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close37 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close37.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 37 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 37 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Image_out= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click'])[3]")));
			Image_out.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close38 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close38.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 38 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 38 is not clicked ");
		}}
	@Test (priority=7, enabled=true)
	public void Manual_Stacking() {
		System.out.println("--------------------------*******Manual_Stacking**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Brain_In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value incol click'])[2]")));
			Brain_In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close39 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close39.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 39 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 39 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement ManualStacking_InProgress= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[10]")));
			ManualStacking_InProgress.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close40 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close40.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 40 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 40 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement ManualStacking_Review= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[2]")));
			ManualStacking_Review.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close41 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close41.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 41 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 41 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement AutoStack_Review= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[3]")));
			AutoStack_Review.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close42 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close42.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 42 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 42 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement ManualReg_Review= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[4]")));
			ManualReg_Review.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close43 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close43.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 43 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 43 is not clicked ");
		}
		
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Manual_Rework= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[11]")));
			Manual_Rework.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close44 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close44.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 44 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 44 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Manual_Reject= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[9]")));
			Manual_Reject.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close45 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close45.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 45 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 45 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Manual_Out= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click'])[4]")));
			Manual_Out.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close46 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close46.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 46 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 46 is not clicked ");
		}
		 
	}
	@Test (priority=8, enabled=true)
	public void Atlas_Creation() {
		System.out.println("--------------------------*******Atlas_Creation**********-----------------------");
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Brain_In= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value incol click'])[3]")));
			Brain_In.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close47 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close47.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 47 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 47 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Brain_Wait= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[5]")));
			Brain_Wait.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close48 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close48.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 48 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 48 is not clicked ");
		}

		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Series_Wait= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 incol click'])[6]")));
			Series_Wait.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close49 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close49.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 49 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 49 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement InProgress= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[12]")));
			InProgress.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close50 = wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close50.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 50 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 50 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Review= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 waitcol click'])[13]")));
			Review.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close51= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close51.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 51 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 51 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Reject= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value w-50 rejcol click'])[9]")));
			Reject.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close52= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close52.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 52 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 523 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Out= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value outcol click'])[5]")));
			Out.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close53= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close53.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 53 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 53 is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement Stats= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='value incol click'])[4]")));
			Stats.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The number button is not clicked ");
		}
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, 30);
			WebElement close54= wait6
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-disabled='false'])[7]")));
			close54.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 54 is clicked Successfully");
		} catch (Exception e) {
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The close button 54 is not clicked ");
			System.out.println("--------------------------*****************-----------------------");
		}
	}		
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
