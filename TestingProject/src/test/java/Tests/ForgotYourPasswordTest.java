package Tests;

import java.time.Duration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class ForgotYourPasswordTest extends Methods.BaseClass {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm; 

	@BeforeClass
	public void launchURL() {
		
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);
		
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
	public void clickLogin() {
		
		lp.clickForgotYourPasswordLink();
		
		System.out.println(" clickLogin method");

	}
	
	@Test(priority = 2)
	public void enterUserName() {
		
		fpm.enterUserName();
		
		System.out.println(" enterUserName method");

	}
	
	@Test(priority = 3)
	public void clickCancel() {
		
		fpm.clickCancel();
		
		System.out.println(" enterPassword method");

	}
	
	

	@AfterSuite
	public void closeBrowser() {
		driver.quit();

		System.out.println(" @AfterSuite method");

	}

}
