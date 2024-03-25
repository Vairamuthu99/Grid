package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class PasswordPage extends UtilClass {
	
	WebDriver driver;

	public PasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	public void Password(String Pass) {
		Password.sendKeys(Pass);

	}

}
