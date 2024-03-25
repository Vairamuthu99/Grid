package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.PasswordPage;

public class PasswordTest extends BaseClass {
	
	@Test
	public void Pass() {

		PasswordPage pass = new PasswordPage(driver);
		pass.Password("123456");

	}

}
