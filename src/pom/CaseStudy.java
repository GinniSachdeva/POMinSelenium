package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CaseStudy {

	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://login.salesforce.com/?locale=in");
		SalesForce loginSForce = PageFactory.initElements(driver, SalesForce.class);
		loginSForce.LoginSF("Admin", "admin123");
	}
}
