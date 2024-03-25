package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class TicketPage extends UtilClass {

	WebDriver driver;

	public TicketPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://support.workongrid.com/support/tickets/new']")
	WebElement Ticket;

	public void Tick() {
		Ticket.click();

	}

}