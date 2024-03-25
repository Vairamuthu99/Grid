package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.EmailIdPage;

public class EmailIDTest extends BaseClass {

	@Test
	public void Login() {

		EmailIdPage Login = new EmailIdPage(driver);
		Login.Login2("Vairam@Grid.com");

	}

}
