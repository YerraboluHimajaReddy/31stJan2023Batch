package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginToOrangeHRM_Edge {

	public WebDriver driver;	

	@BeforeClass
	public void launchURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();

		System.out.println(" @BeforeClass method");

	}
	
	@BeforeMethod
	public void waitMethod() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		System.out.println(" @BeforeMethod method");
	}
	
	@AfterMethod
	public void waitMethod1() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		System.out.println(" @AfterMethod method");
	}
	
	@BeforeSuite
	public void launchBrowser() {

		driver = new EdgeDriver();

		System.out.println(" @BeforeSuite method");
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
	
	@Test(priority = 3)
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
