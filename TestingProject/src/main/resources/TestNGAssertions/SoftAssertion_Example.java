package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNG.BaseClass;

public class SoftAssertion_Example extends BaseClass {

	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("edge");

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

	@Test(priority = 2)
	public void enterUserName() {
		
		SoftAssert ass = new SoftAssert();

		String actualTitle = driver.getTitle();

		String expectedTitle = "OrangeHRM";

		ass.assertEquals(actualTitle, expectedTitle);

		System.out.println("=========================");
		
		ass.assertAll();

	}

	@Test(priority = 1)
	public void enterPassword() {
		
		SoftAssert ass = new SoftAssert();

		String actualTitle = driver.getTitle();

		String expectedTitle = "Testing";

		ass.assertEquals(actualTitle, expectedTitle, "Both the values are not same");

		System.out.println("=========================");
		
		ass.assertAll();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();

		System.out.println(" @AfterSuite method");

	}
}
