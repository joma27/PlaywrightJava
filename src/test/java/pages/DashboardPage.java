package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class DashboardPage {
	
	// Locators
	private final Locator dashboardLink;
	private final Locator myInfoLink;
	private final Locator timeLink;
	
	// Constructor
	public DashboardPage (Page page) {
		this.dashboardLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard"));
		this.myInfoLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Info"));
		this.timeLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time"));
	}
	
	public void clickDashboardLink() {
		dashboardLink.click();
	}
	
	public void clickMyInfoLink() {
		myInfoLink.click();
	}
	
	public void clickTimeLink() {
		timeLink.click();
	}

}
