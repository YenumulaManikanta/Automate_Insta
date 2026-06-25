package pages;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Page;

public class ForgotPasswordPage {

	private Page page;

	public ForgotPasswordPage(Page page) {
		this.page = page;
	}

	public void forgotPwd() {
		// page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("link")).click();
		page.getByText("Forgot password?").click();
		assertThat(page).hasURL("https://www.instagram.com/accounts/password/reset/?hl=en");
		page.locator("#_r_2_").fill("4567876567");
		// page.getByRole(AriaRole.BUTTON, new
		// Page.GetByRoleOptions().setName("button"));
		page.getByText("Continue").click();
	}

}
