package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EasyCalculation {
	WebDriver driver;

	// created the constuctor
	public EasyCalculation(WebDriver driver) {
		// called/passed the constructor
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "log_email")
	WebElement UserName;

	@FindBy(how = How.ID, using = "log_password")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"log_frm\"]/div[4]/input[1]")
	WebElement LoginBtn;

	// passing the values in the string
	public void LoginEasyCalc(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}

}
