package pages;

import com.microsoft.playwright.Page;

public class AuthPage {
	
	private Page page;
	
	public AuthPage(Page page) {
		this.page=page;
	}
	
	public boolean login(String email, String pass) {
		
		page.locator("#_R_32d9lplcldcpbn6b5ipamH1_").fill(email);
		page.locator("#_R_33d9lplcldcpbn6b5ipamH1_").fill(pass);
		
		page.getByLabel("Log In").click();
		//page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		
		page.waitForLoadState();
		return page.url().contains("Welcome");
		
	}
	
	//declared in seperate class
	/*
	 * public void forgotPwd() { //page.getByRole(AriaRole.LINK, new
	 * Page.GetByRoleOptions().setName("link")).click();
	 * page.getByText("Forgot password?").click(); assertThat(page).hasURL(
	 * "https://www.instagram.com/accounts/password/reset/?hl=en");
	 * page.locator("#_r_2_").fill("4567876567"); //page.getByRole(AriaRole.BUTTON,
	 * new Page.GetByRoleOptions().setName("button"));
	 * page.getByText("Continue").click(); }
	 */

}
