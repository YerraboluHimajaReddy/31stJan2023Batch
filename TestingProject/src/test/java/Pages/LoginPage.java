package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	private By userName_TextBox = By.xpath("//input[@name='username']");
	
	private By password_TextBox = By.xpath("//input[@name='password']");
	
	private By login_Button = By.xpath("//button[@type='submit']");
	
	private By forgotYourPassword_Link = By.xpath("//p[text()='Forgot your password? ']");
	
	
	public void enterUserName() {
		driver.findElement(userName_TextBox).sendKeys("Admin");
	}
	
	public void enterPassword() {
		driver.findElement(password_TextBox).sendKeys("admin123");
	}
	
	public void clickLogin() {
		driver.findElement(login_Button).click();
	}
	
	public void clickForgotYourPasswordLink() {
		driver.findElement(forgotYourPassword_Link).click();
	}

}
