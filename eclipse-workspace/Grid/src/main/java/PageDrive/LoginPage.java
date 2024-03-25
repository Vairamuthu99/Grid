package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class LoginPage extends UtilClass {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
