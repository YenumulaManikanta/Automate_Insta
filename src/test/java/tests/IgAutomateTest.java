package tests;
import org.testng.annotations.Test;

import base.IgBaseTest;
import pages.AuthPage;
import pages.CreateNewAccountPage;

public class IgAutomateTest extends IgBaseTest{

	@Test
	public void browserLaunch() {
		
		AuthPage auth=new AuthPage(page);
		boolean loginSuccess=auth.login("ramanujam999@gmail.com", "Raaam@1234");
		
		if(!loginSuccess) {
			CreateNewAccountPage newAccount=new CreateNewAccountPage(page);
			newAccount.createAccount();
		}
		
		//ignoring this class because this is asking I am not ROBOT puzzle confirmation
		//ForgotPasswordPage forgotssword=new ForgotPasswordPage(page);
		//forgotssword.forgotPwd();
		
		
		
	}
}
