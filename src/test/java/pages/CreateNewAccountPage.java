package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CreateNewAccountPage {
	
	private Page page;
	
	public CreateNewAccountPage(Page page) {
		this.page=page;
	}
	
	public void createAccount() {
		page.getByLabel("Create new account").click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number or email")).fill("Ramanujam@gm.com");
		//page.getByPlaceholder("Mobile number or email").fill("Ramanujam");
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("Ramanujam@123");
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Month")).click();
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("May")).click();
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Day")).click();
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("25")).click();
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Year")).click();
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("1993")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full name")).fill("Anderson Ramanujam");
		//page.locator("_r_10_").fill("Anderson Ramanujam");
		page.getByLabel("Username").fill("Mr.ramanujam");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	}
	

}
