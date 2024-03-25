package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.OrgIDPage;

public class OrgIDTest extends BaseClass {
	
	@Test
	public void Login() {

		OrgIDPage Login = new OrgIDPage(driver);
		Login.Login1("NextPage");

	}

}
