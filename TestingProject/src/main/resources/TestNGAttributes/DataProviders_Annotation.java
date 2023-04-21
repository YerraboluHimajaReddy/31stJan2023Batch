package TestNGAttributes;

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

public class DataProviders_Annotation extends BaseClass{
	
	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("edge");

		System.out.println(" @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchURL("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(" @BeforeClass method");

	}
	
	@BeforeMethod
	public void waitMethod() {
	
		waitingTime();
		
		System.out.println(" @BeforeMethod method");
	}
	
	@DataProvider(name = "FacebookData")
	public Object[][] getData(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0] = "Testing";
		values[0][1] = "Testing@gmail.com";
		
		values[1][0] = "Java";
		values[1][1] = "Java@gmail.com";
		
		values[2][0] = "Selenium";
		values[2][1] = "Selenium@gmail.com";
		
		return values;
		
	}
	
	@Test(dataProvider  = "FacebookData")
	public void enterCredentials(String username, String password) {
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
		System.out.println(" enterCredentials method");

	}
	
	@AfterSuite
	public void closeBrowser() {
		//driver.quit();

		System.out.println(" @AfterSuite method");

	}

}
