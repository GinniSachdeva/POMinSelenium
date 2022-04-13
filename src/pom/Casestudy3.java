package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Casestudy3 {

	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://demo.opencart.com/index.php?route=account/login");
		OpenCartLogin loginOC = PageFactory.initElements(driver, OpenCartLogin.class);
		loginOC.LoginOC("ginnisachdeva02@gmail.com", "CG40kD@1");
	}
}
