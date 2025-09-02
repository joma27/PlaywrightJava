package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
	
	private final Page page;

	// Locators
	private final Locator usernameTextbox;
    private final Locator passwordTextbox;
    private final Locator loginButton;

	// Constructor
	public LoginPage(Page page) {
		this.page = page;
		this.usernameTextbox = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username"));
        this.passwordTextbox = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password"));
        this.loginButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
	}

	public void addUsername(String username) {
		usernameTextbox.fill(username);
	}

	public void addPassword(String password) {
		passwordTextbox.fill(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void login(String username, String password) {
		usernameTextbox.fill(username);
		passwordTextbox.fill(password);
		loginButton.click();
	}

}
