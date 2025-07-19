package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminSignPage {

	
	WebDriver ldriver;

	public  SuperAdminSignPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@placeholder='UserName']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setpassword(String pwd) {

		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {

		btnLogin.click();
	}

	
	
}
