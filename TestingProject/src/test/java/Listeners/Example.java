package Listeners;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example extends Methods.BaseClass {
	
	ListenersExample le = new ListenersExample();

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		le.beforeNavigateTo("", driver);

		launchBrowser("edge");

		le.afterNavigateTo("", driver);
		
		System.out.println(" @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		launchURL("https://www.facebook.com/");

		driver.manage().window().maximize();

		System.out.println(" @BeforeClass method");

	}

	@BeforeMethod
	public void waitMethod() {

		waitingTime();

		System.out.println(" @BeforeMethod method");
	}

	@Test
	public void enterCredentials() throws IOException {

		driver.findElement(By.xpath("//input[@id='email']")).clear();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testing");

		getScreenshot("UserNameEntered.png");

		driver.findElement(By.xpath("//input[@id='pass']")).clear();

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tetsing123");

		getScreenshot("AfterEnteringPassword.png");

		driver.findElement(By.xpath("//input[@id='email']")).clear();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Java");

		getScreenshot("UserNameEntered1.png");

		driver.findElement(By.xpath("//input[@id='pass']")).clear();

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Javav123");

		getScreenshot("AfterEnteringPassword2.png");

		System.out.println(" enterCredentials method");
		// }

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();

		System.out.println(" @AfterSuite method");

	}

}
