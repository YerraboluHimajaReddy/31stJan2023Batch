package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_Example {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		
	}

}
