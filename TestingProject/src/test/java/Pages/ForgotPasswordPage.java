package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public By userName_TextBox = By.xpath("//input[@name='username']");
		
	public By cancel_Button = By.xpath("//button[@type='button']");
	
	public By reset_Button = By.xpath("//button[@type='submit']");
	

}
