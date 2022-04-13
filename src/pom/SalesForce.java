package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SalesForce {
	WebDriver driver;
	//created the constuctor
	public SalesForce(WebDriver driver) {
		//called/passed the constructor
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Login\"]")
	WebElement LoginBtn;
	//passing the values in the string
	public void LoginSF(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}

}
