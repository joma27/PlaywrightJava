package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {
	@Test
	public void tc001LoginSuccess() {

		LoginPage loginPage = new LoginPage(page);
		DashboardPage dashboardPage = new DashboardPage(page);

		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test.info("Login using valid credentials");
		loginPage.login("Admin", "admin123");
		dashboardPage.clickTimeLink();
		dashboardPage.clickMyInfoLink();
		dashboardPage.clickDashboardLink();
	}

	@Test
	public void tc002LoginSkipped() {

		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void tc003LoginFailed() {
		
		LoginPage loginPage = new LoginPage(page);
		DashboardPage dashboardPage = new DashboardPage(page);

		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test.info("Login using valid credentials");
		loginPage.addUsername("Admin");
		loginPage.clickLoginButton();
		dashboardPage.clickTimeLink();
	}
}
