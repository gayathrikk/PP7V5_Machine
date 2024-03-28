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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShortcutKey_add {
	private RemoteWebDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException 
	{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://172.12.20.99:4444/wd/hub");
		driver = new RemoteWebDriver(url, dc);
	}
	@Test(priority=1)
	public void Login() throws InterruptedException {
		driver.get("http://apollo2.humanbrain.in/");
		driver.manage().window().maximize();
		System.out.println("The server is Opened sucessfully");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement viewerSectionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'ng-tns-c93-3')]")));
		viewerSectionLink.click();
		System.out.println("The Viewer Icon is clicked");
		String parentWindow = driver.getWindowHandle();
		WebDriverWait wait1= new WebDriverWait(driver, 20);
		WebElement login = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
		login.click();
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
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		WebElement  emailInput = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		emailInput.sendKeys("softwareteam45@gmail.com");
		System.out.println("Mail I'd is entered");
		WebDriverWait wait3 = new WebDriverWait(driver,20);
		WebElement  Next = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		Next.click();
		System.out.println("The Next Button is clicked");
		WebDriverWait wait4 = new WebDriverWait(driver,20);
		WebElement  PasswordInput = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		PasswordInput.sendKeys("Health#123");
		System.out.println("Password is entered");
		WebDriverWait wait5 = new WebDriverWait(driver,20);
		WebElement  Next2 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		Next2.click();		
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
			WebElement table1 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search tags']")));
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
			WebElement table2 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"column\"]/ngx-series-set-comp/div/ngx-explore-comp/nb-layout/div[1]/div/div/div/div/nb-layout-column[2]/nb-card/nb-card-body/div[2]/div/nb-card/nb-card-footer/nb-icon[1]/img")));
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
			}}}
	@Test(priority = 3)
	public void NotesTest() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/viewer/assets/images/colorsvg/oldmenu.svg']")));
			edit.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Edit icon is clicked");
		} catch (Exception e) {
			System.out.println("The Edit icon is not clicked");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement draw = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/viewer/assets/images/colorsvg/paintbrush.svg']")));
			draw.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Draw icon is clicked");
		} catch (Exception e) {
			System.out.println("The Draw icon is not clicked");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
			search.sendKeys("brain");
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The keyword is Entered");
		} catch (Exception e) {
			System.out.println("The keyword is not Entered");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement selectoption= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='10155_anchor']")));
			selectoption.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Search option is selected");
		} catch (Exception e) {
			System.out.println("The Search option is selected");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement selectoption= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='10155_anchor']")));
			selectoption.click();
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The Search option is selected");
		} catch (Exception e) {
			System.out.println("The Search option is selected");
		}

		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement canvas = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"atlasEditorMap\"]/div/div[1]/div[2]/canvas")));
			canvas.click();
			canvas.sendKeys("a");
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The keyword is Entered");
		} catch (Exception e) {
			System.out.println("The keyword is not Entered");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement canvas2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("<nb-toast_nghost-wrj-c147 [@class='ng-tns-c148-51 ng -trigger ng-trigger-fadeIn status -primary destroy -by-click has-icon custom-icon ng-star-inserted'}")));
			canvas2.getText();
		 
			Thread.sleep(3000);
			System.out.println("--------------------------*****************-----------------------");
			System.out.println("The keyword is Entered");
		} catch (Exception e) {
			System.out.println("The keyword is not Entered");
		}
		
	}}
