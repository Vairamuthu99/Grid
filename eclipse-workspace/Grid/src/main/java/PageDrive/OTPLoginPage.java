package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class OTPLoginPage extends UtilClass {
	
	WebDriver driver;

	public OTPLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[@href='/account/otp']")
	WebElement OTPLogin;

	public void OTPlg() {
		OTPLogin.click();

	}

}
