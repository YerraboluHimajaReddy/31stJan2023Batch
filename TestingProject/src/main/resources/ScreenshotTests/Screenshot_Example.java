package ScreenshotTests;

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

import TestNG.BaseClass;

public class Screenshot_Example extends BaseClass {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		launchBrowser("edge");

		getScreenshot("browserlaunched.png");

		System.out.println(" @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		launchURL("https://www.facebook.com/");

		driver.manage().window().maximize();

		getScreenshot("URLLaunched.png");

		System.out.println(" @BeforeClass method");

	}

	@BeforeMethod
	public void waitMethod() {

		waitingTime();

		System.out.println(" @BeforeMethod method");
	}

	@DataProvider(name = "FacebookData")
	public Object[][] getData() {

		Object[][] values = new Object[3][2];

		values[0][0] = "Testing";
		values[0][1] = "Testing@gamil.com";

		values[1][0] = "Java";
		values[1][1] = "Java@gamil.com";

		values[2][0] = "Selenium";
		values[2][1] = "Selenium@gamil.com";

		return values;

	}

	// @Test(dataProvider = "FacebookData")

	@Test
	public void enterCredentials() throws IOException {

		// for (int i = 0; i < 3; i++) {

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
