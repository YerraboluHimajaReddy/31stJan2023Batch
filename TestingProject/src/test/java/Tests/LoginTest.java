package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends Methods.BaseClass {
	
	LoginPage lp;

	@BeforeClass
	public void launchURL() {
		
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new LoginPage(driver);
		
		driver.manage().window().maximize();

		System.out.println(" @BeforeClass method");

	}
	
	@BeforeMethod
	public void waitMethod() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		System.out.println(" @BeforeMethod method");
	}
	
	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("edge");

		System.out.println(" @BeforeSuite method");
	}
	
	@Test(priority = 1)
	public void enterUserName() {
		
		lp.enterUserName();
		
		System.out.println(" enterUserName method");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		lp.enterPassword();
		
		System.out.println(" enterPassword method");

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println(" clickLogin method");

	}

	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();

		System.out.println(" @AfterSuite method");

	}

}
