package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignoutPage {

	WebDriver driver;
	
	public SignoutPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	@FindBy(xpath ="//a[text()='About']")
	public WebElement clickAbout;
	
	@FindBy(xpath ="//a[text()='Support']")
	public WebElement clickSupport;
	
	@FindBy(xpath ="//a[text()='Change Password']")
	public WebElement clickChangePassword;
	
	@CacheLookup
	@FindBy(xpath ="//a[text()='Logout']")
	public WebElement clickLogout;
	
	public void clickLogout() {
		clickLogout.click();
	}
	
	public void clickChangePassword() {
		clickChangePassword.click();
	}
	
	public void clickSupport() {
		clickSupport.click();
	}
	
	public void clickAbout() {
		clickAbout.click();
	}
	

}
