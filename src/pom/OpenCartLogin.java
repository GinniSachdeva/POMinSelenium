package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class OpenCartLogin {

	WebDriver driver;
	//created the constuctor
	public OpenCartLogin(WebDriver driver) {
		//called/passed the constructor
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "input-email")
	WebElement UserName;
	
	@FindBy(how = How.ID, using = "input-password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement LoginBtn;
	//passing the values in the string
	public void LoginOC(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}
}


