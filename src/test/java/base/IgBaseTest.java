package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class IgBaseTest {
	
	protected Playwright playwright;
	protected Browser browser;

	protected BrowserContext context;
	protected Page page;
	
	@BeforeMethod
	public void setUp() {
		playwright = Playwright.create();
		browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
		context=browser.newContext();
		page=context.newPage();
		page.navigate("https://www.instagram.com/?hl=en");
		
	}
	
	@AfterMethod
	public void tearDown() {
		browser.close();
		playwright.close();
	}

}
