package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientMaster {

	WebDriver ldriver;

	public ClientMaster(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@id='client']")
	@CacheLookup
	WebElement ClientMaster;

	@FindBy(xpath = "//button[@onclick='addclienttextboxclear();']")
	@CacheLookup
	WebElement AddNewClient;

	@FindBy(xpath = "//input[@id='Clientname']")
	@CacheLookup
	WebElement txtCompanyName;

	@FindBy(xpath = "//input[@id='Address']")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(xpath = "//input[@id='mobileno']")
	@CacheLookup
	WebElement txtMobileNumber;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(xpath = "(//input[@id='testSub'])[2]")
	@CacheLookup
	WebElement TestRadioButton;

	@FindBy(xpath = "//input[@id='yearlySub']")
	@CacheLookup
	WebElement SubscriptionRadioButton;

	@FindBy(xpath = "//input[@id='permSub']")
	@CacheLookup
	WebElement permSub;

	@FindBy(xpath = "//input[@id='ed']")
	@CacheLookup
	WebElement EndDate;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Save']")
	@CacheLookup
	WebElement SaveButton;
	
	

	@FindBy(xpath = "//tbody/tr[2]/td[6]/div[1]/a[3]")
	@CacheLookup
	WebElement AssignAdmin;
	
	@FindBy(xpath = "//button[normalize-space()='»']")
	@CacheLookup
	WebElement Nextpage;
	
	@FindBy(xpath = "//input[@name='userfirstnamme']")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='userlastname']")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath = "//input[@name='AdminAddress']")
	@CacheLookup
	WebElement AdminAddress;
	
	@FindBy(xpath = "//input[@name='emailaddress']")
	@CacheLookup
	WebElement AdminEmail;
	
	@FindBy(xpath = "//input[@placeholder='enter mobile no']")
	@CacheLookup
	WebElement ContactNo;
	
	

	@FindBy(xpath = "//input[@placeholder='enter username']")
	@CacheLookup
	WebElement UserName;
	
	

	@FindBy(xpath = "//input[@placeholder='enter password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminSaveButton;
	

	public void ClientMasters() {
		ClientMaster.click();
	}

	public void AddNewClients() {

		AddNewClient.click();
	}

	public void setcompanyname() {

		txtCompanyName.sendKeys("vivek building material suppliers");
	}

	public void setAddress() {

		txtAddress.sendKeys("plot no.123, H12 sector2, shivaji park, pune");
	}

	public void setmobilenumber() {

		txtMobileNumber.sendKeys("9307027331");
	}

	public void setEmail() { 

		txtEmail.sendKeys("vivek@gmail.com");
	}

	public void TestradioButton() {

		TestRadioButton.click();
	}

	public void subscriptionRadioButton() {

		SubscriptionRadioButton.click();
	}

	public void PermSub() {

		permSub.click();
	}

	public void endDate() {

		EndDate.click();
	}

	public void SaveButton() {

		SaveButton.click();
	}
	
	
	public void AssignAdmin() {
		AssignAdmin.click();
	
	}

	public void Nextpage() {
		
		Nextpage.click();
	}
	
	
	public void setfirstname() {
		FirstName.sendKeys("jishan");
	}
	
	public void lastname() {
	  LastName.sendKeys("varma");
	}
	
	public void Adminaddress() {
		AdminAddress.sendKeys("Mpeb teegaon pandhurna chhindwara");
		}
	
	public void AdminEmail() {
		AdminEmail.sendKeys("jishan@gmail.com");
	}
	
	public void ContactNumber() {
		ContactNo.sendKeys("9407027331");
		}
	
	public void Username() {
		UserName.sendKeys("jishanvarma");
		}
	
	public void password() {
		
		Password.sendKeys("12345");
	}
	
	public void Adminsavebutton() {
		
		AdminSaveButton.click();
	}
		
	
	
}
