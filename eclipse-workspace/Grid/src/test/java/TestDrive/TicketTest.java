package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.TicketPage;

public class TicketTest extends BaseClass {

	@Test
	public void Tick() {

		TicketPage Tick = new TicketPage(driver);
		Tick.Tick();

	}
}
