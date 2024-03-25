package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class EmailIdPage extends UtilClass {

	WebDriver driver;

	public EmailIdPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement EmailId;

	public void Login2(String EmID) {
		EmailId.sendKeys(EmID);

	}

}
