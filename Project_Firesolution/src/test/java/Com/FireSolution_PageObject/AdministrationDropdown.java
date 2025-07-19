package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationDropdown {

	WebDriver ldriver;
	
	public AdministrationDropdown(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//------------ Company details ----------

	@FindBy(xpath = "//a[@id='Administration']//div[@class='side-menu__icon']//*[name()='svg']")
	@CacheLookup
	WebElement AdministrationDropdown;

	// Add Company

	@FindBy(xpath = "//button[normalize-space()='Add New Company']")
	@CacheLookup
	WebElement AddCompanyname;

	@FindBy(xpath = "//input[@id='firmname']")
	@CacheLookup
	WebElement Companyname;

	@FindBy(xpath = "//input[@id='Address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//input[@id='city']")
	@CacheLookup
	WebElement City;

	@FindBy(xpath = "//input[@id='pincode']")
	@CacheLookup
	WebElement Pincode;

	@FindBy(xpath = "//input[@id='gstno']")
	@CacheLookup
	WebElement GSTNO;

	@FindBy(xpath = "//input[@id='mobileno']")
	@CacheLookup
	WebElement MobileNo;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//button[@onclick='Saveuserdetail();']")
	@CacheLookup
	WebElement SaveButton;

	public void AddCompany() {
		AddCompanyname.click();
	}

	public void Companyname() {

		Companyname.sendKeys("infotech technology & software pvt Ltd ");
	}

	public void Address() {

		Address.sendKeys("h12 water tank nearest railway station hadapsar");
	}

	public void City() {

		City.sendKeys("pune");
	}

	public void Pincode() {

		Pincode.sendKeys("480383");
	}

	public void GSTNO() {
		GSTNO.sendKeys("GST1267984562143");
	}

	public void MobileNo() {

		MobileNo.sendKeys("6738327836");

	}

	public void Email() {

		Email.sendKeys("infotech@gmail.com");
	}

	public void SaveButtons() {

		SaveButton.click();
	}
	
	
	
	// --------User details ----------

	@FindBy(xpath = "//button[@onclick='openaddnewusermodel();']")
	@CacheLookup
	WebElement AddNewUserButton;
	
	

	
	@FindBy(xpath = "//input[@placeholder='enter first name']")
	@CacheLookup
	WebElement UserFirstName;
	
	@FindBy(xpath = "//input[@placeholder='enter last name']")
	@CacheLookup
	WebElement UserLastName;
	

	@FindBy(xpath = "//input[@placeholder='enter address']")
	@CacheLookup
	WebElement UserAddress;
	
	@FindBy(xpath = "//input[@placeholder='enter Email']")
	@CacheLookup
	WebElement UserEmail;
	
	@FindBy(xpath = "//input[@placeholder='enter mobile no']")
	@CacheLookup
	WebElement UserContactNo;
	
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement UserUsername;
	
	@FindBy(xpath = "//input[@placeholder='enter password']")
	@CacheLookup
	WebElement UserPassword;
	
	
	@FindBy(xpath = "//button[@id='savebtn']")
	@CacheLookup
	WebElement UserSavebutton;
	
	
	
	
	public void AddNewUserButton() {
		
		AddNewUserButton.click();
	}
	
	public void UserFirstName() {
		UserFirstName.sendKeys("lokesh");
	}
	
	public void UserLastName() {
		UserLastName.sendKeys("sable");
	}
	
	
	public void UserAddress() {
		UserAddress.sendKeys("shivaji water tank pandhurna");
	}
	
	public void UserEmail() {
		UserEmail.sendKeys("lokesh@gmail.com");
	}
	
	public void  UserContactNo() {
		 UserContactNo.sendKeys("9856345678");
	}
	
	
	public void  UserUsername() {
		UserUsername.sendKeys("lokeshsable");
	}
	
	public void UserPassword() {
		UserPassword.sendKeys("12345");
	}
	
	public void UserSavebutton() {
		UserSavebutton.click();
	}
	
	
	
	// Assign Site -- User wise site list
	
	@FindBy(xpath = "//button[text()='Assign Site To User']")
	@CacheLookup
	WebElement AssignSiteToUser;
	
	
	@FindBy(xpath = "//button[@onclick='SaveUserWiseSitedetail();']")
	@CacheLookup
	WebElement AssignSite_SaveButton;
	
	
	
	
	public void AssignSiteToUser() {
		AssignSiteToUser.click();
	}
 
	public void AssignSite_SaveButton() {
		AssignSite_SaveButton.click();
	}
	
}