package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CaseStudy2 {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		EasyCalculation loginEasyCalc = PageFactory.initElements(driver, EasyCalculation.class);
		loginEasyCalc.LoginEasyCalc("ginnisachdeva02@gmail.com", "Sanjeet2000");
	}

}
