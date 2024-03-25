package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.OTPLoginPage;

public class OTPLoginTest extends BaseClass {
	
	@Test
	public void OTPLogin() {

		OTPLoginPage OTP = new OTPLoginPage(driver);
		OTP.OTPlg();

	}

}
