package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LocatorsTest extends BaseTest {
	
	@Test
	public void testAllLocators() {
		
		page.navigate("https://trytestingthis.netlify.app/");
		
		page.locator("#fname").fill("Jomz"); //Find by ID
		page.locator("input[name='lname']").fill("Clemente"); // Find by Name
		page.locator("input[value='male']").check(); // Find by Value
		page.locator("input[type='radio']").nth(1).check(); // Find by Nth Element
		page.locator("select#option").selectOption("option 3"); // Dropdown using ID
		page.locator("#option").selectOption("option 2"); // Dropdown using ID
		page.locator("input[type='checkbox'][value='Option 3']").check(); // Checkbox using type
		page.getByLabel("Option 1").check(); // Get by Label
		page.locator("//input[@type='date']").fill("2024-09-02"); // Find by XPath
		page.getByText("Click Me").click(); // Get by Text
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		
	}
}
