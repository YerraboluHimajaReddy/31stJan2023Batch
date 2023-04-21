package Methods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		} 
		else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
		}
	}
	
	public void launchURL(String url) {
		
		driver.get(url);
	}
	
	public void waitingTime() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	public void getScreenshot(String imageName) throws IOException {
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\himaj\\eclipse-workspace\\31stJan2023\\TestingProject\\src\\test\\java\\ScreenshotImages\\" + imageName));		
	}

}
