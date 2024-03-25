package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.ForgetPassPage;

public class ForgetPassTest extends BaseClass {

	@Test
	public void Forget() {

		ForgetPassPage Forgetpass = new ForgetPassPage(driver);
		Forgetpass.ForgetPass();

	}

}
