package TestNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNG.BaseClass;

public class Attribute_Enabled extends BaseClass{
	
	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("chrome");

		System.out.println(" @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		System.out.println(" @BeforeClass method");

	}
	
	@BeforeMethod
	public void waitMethod() {
	
		waitingTime();
		
		System.out.println(" @BeforeMethod method");
	}
	
	
	@Test(priority = 1)
	public void enterUserName() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		System.out.println(" enterUserName method");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		System.out.println(" enterPassword method");

	}
	
	@Test(priority = 3, enabled = false)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(" clickLogin method");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();

		System.out.println(" @AfterSuite method");

	}

}
