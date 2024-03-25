package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class OrgIDPage extends UtilClass {
	
	WebDriver driver;

	public OrgIDPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autocomplete='off']")
	WebElement OrganizationID;

	public void Login1(String OrgID) {
		OrganizationID.sendKeys(OrgID);

	}

}
