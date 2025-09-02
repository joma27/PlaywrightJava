package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.BaseTest;

public class FirstTest extends BaseTest {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			Page page = browser.newPage();
			page.navigate("https://www.google.com");

			System.out.println("Page Title: " + page.title());
			browser.close();
		}
	}

	@Test
	public void verifyTitle() {
		page.navigate("https://www.google.com");
		
		System.out.println("Page Title: " + page.title());
	}

}
