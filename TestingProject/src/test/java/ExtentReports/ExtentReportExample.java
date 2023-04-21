package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExample {

	public WebDriver driver;

	public static ExtentReports report;

	public static ExtentTest test;

	@BeforeSuite
	public void startTest() {

		report = new ExtentReports(System.getProperty("user.dir") + "\\Saag1.html");

		test = report.startTest("OrangeHRM");

	}

	@BeforeClass
	public void launchBrowser() {

		System.out.println("In before Suite");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getTitle());
	}

	@BeforeMethod
	public void getTitle() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	@Test(priority = 0)
	public void loginToOrangeHRM() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("OrangeHRM")) {

			test.log(LogStatus.PASS, "Title is same");

		} else {

			test.log(LogStatus.FAIL, "Title is not same");

		}

	}

	@Test(priority = 1)
	public void clickLogout() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		System.out.println(driver.getTitle());

		String expected = "SAAG";

		String actual = driver.getTitle();

		if (actual.equalsIgnoreCase(expected)) {

			test.log(LogStatus.PASS, "Title is same : " + actual);

		} else {

			test.log(LogStatus.FAIL, "Title is not same" + expected + " and " + actual);

		}
	}

	@AfterMethod
	public void getTitle1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	@AfterClass
	public void endTest() {

		report.endTest(test);

		report.flush();
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();
	}

}
