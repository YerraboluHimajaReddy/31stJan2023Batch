package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;

public class ForgotYourPasswordMethods {

	WebDriver driver;

	public ForgotYourPasswordMethods(WebDriver driver) {

		this.driver = driver;
	}

	ForgotPasswordPage fp = new ForgotPasswordPage(driver);
	
	public void enterUserName() {
		driver.findElement(fp.userName_TextBox).sendKeys("testing");
	}
	
	public void clickCancel() {
		driver.findElement(fp.cancel_Button).click();
	}
	
	public void clickReset() {
		driver.findElement(fp.reset_Button).click();
	}
}
