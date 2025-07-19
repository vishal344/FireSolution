package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterDropdown {

	WebDriver ldriver;

	public MasterDropdown(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// ------ Sites details ----------

	@FindBy(xpath = "//button[normalize-space()='Add Site']")
	@CacheLookup
	WebElement AddSitesButton;

	@FindBy(xpath = "//input[@id='siteName']")

	@CacheLookup
	WebElement SiteName;

	@FindBy(xpath = "//input[@id='Address']")

	@CacheLookup
	WebElement SiteAddress;

	@FindBy(xpath = "//input[@id='ProjectManager']")

	@CacheLookup
	WebElement ProjectmanagerName;

	@FindBy(xpath = "//input[@id='ProjectMobileNo']")

	@CacheLookup
	WebElement ProjectmanagermobileNo;

	@FindBy(xpath = "//input[@id='AccountanManager']")

	@CacheLookup
	WebElement AccountManagerName;

	@FindBy(xpath = "//input[@id='AccountantMobileNo']")

	@CacheLookup
	WebElement AccountManagerMobileNo;

	@FindBy(xpath = "//input[@id='locationurl']")

	@CacheLookup
	WebElement PastLocationURL;

	@FindBy(xpath = "//button[normalize-space()='Save']")

	@CacheLookup
	WebElement SiteSaveButton;

	public void AddSitesButton() {

		AddSitesButton.click();
	}

	public void SiteName() {

		SiteName.sendKeys("bhopalwarehouse");
	}

	public void SiteAddress() {

		SiteAddress.sendKeys("plot no.89, santoshi nagar nearest water tank pune");
	}

	public void ProjectmanagerName() {

		ProjectmanagerName.sendKeys("shubhamManager");
	}

	public void ProjectmanagermobileNo() {

		ProjectmanagermobileNo.sendKeys("9876345632");
	}

	public void AccountManagerName() {

		AccountManagerName.sendKeys("ritik sule");
	}

	public void AccountManagerMobileNo() {

		AccountManagerMobileNo.sendKeys("9876512345");
	}

	public void PastLocationURL() {

		PastLocationURL.sendKeys(
				"https://www.google.com/maps/dir/Pune,+Maharashtra/Nagpur,+Maharashtra/@19.8210717,73.8133167,7z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!2m2!1d73.8567437!2d18.5204303!1m5!1m1!1s0x3bd4c0a5a31faf13:0x19b37d06d0bb3e2b!2m2!1d79.0881546!2d21.1458004!5m1!1e1?entry=ttu&g_ep=EgoyMDI0MTIwOS4wIKXMDSoASAFQAw%3D%3D");
	}

	public void SiteSaveButton() {

		SiteSaveButton.click();
	}

	// --- Customer details -----

	@FindBy(xpath = "//button[@onclick='customermodal()']")
	@CacheLookup
	WebElement AddCustomerButton;

	@FindBy(xpath = "//input[@id='customername']")
	@CacheLookup
	WebElement SiteCustomer;

	@FindBy(xpath = "//input[@id='mobile']")
	@CacheLookup
	WebElement CustomerMobileNo;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement CustomerEmail;

	@FindBy(xpath = "//input[@id='gstn']")
	@CacheLookup
	WebElement CustomerGSTNO;

	@FindBy(xpath = "//input[@id='address']")
	@CacheLookup
	WebElement CustomerAddress;

	@FindBy(xpath = "//input[@id='pn']")
	@CacheLookup
	WebElement CustomerPin;

	@FindBy(xpath = "//button[@onclick='SaveCustomerDetail();']")
	@CacheLookup
	WebElement CustomerSavebutton;

	public void AddCustomerButton() {
		AddCustomerButton.click();
	}

	public void SiteCustomer() {
		SiteCustomer.sendKeys("VishalSites");
	}

	public void CustomerMobileNo() {
		CustomerMobileNo.sendKeys("8846342378");
	}

	public void CustomerEmail() {
		CustomerEmail.sendKeys("vishal@gmail.com");
	}

	public void CustomerGSTNO() {
		CustomerGSTNO.sendKeys("GST98444773837");
	}

	public void CustomerAddress() {
		CustomerAddress.sendKeys("MPEB akurdi railwaystation pune");
	}

	public void CustomerPin() {
		CustomerPin.sendKeys("887647");
	}

	public void CustomerSavebutton() {
		CustomerSavebutton.click();
	}

	// ------ Unites -------

	@FindBy(xpath = "//button[normalize-space()='Add Unit']")
	@CacheLookup
	WebElement AddUnitbutton;

	@FindBy(xpath = "//input[contains(@placeholder, 'Unit Name')]")
	@CacheLookup
	WebElement UnitName;

	@FindBy(xpath = "//input[@name='unitQty']")
	@CacheLookup
	WebElement Quantity;

	@FindBy(xpath = "//button[@onclick='Savetaxdetails();']")
	@CacheLookup
	WebElement UnitSaveButton;

	public void AddUnitbutton() {
		AddUnitbutton.click();
	}

	public void UnitName() {
		UnitName.sendKeys("MM");
	}

	public void Quantity() {
		Quantity.sendKeys("560");
	}

	public void UnitSaveButton() {
		UnitSaveButton.click();
	}

	// --------- Suppliers ---------

	@FindBy(xpath = "//button[normalize-space()='Add Supplier']")
	@CacheLookup
	WebElement AddSupplierButton;

	@FindBy(xpath = "//input[@id='SupplierName']")
	@CacheLookup
	WebElement SupplierName;

	@FindBy(xpath = "//input[@id='SupplierContact']")
	@CacheLookup
	WebElement SupplierContact;

	@FindBy(xpath = "//input[@id='FirmName']")
	@CacheLookup
	WebElement CompanayName;

	@FindBy(xpath = "//input[@id='FirmContact']")
	@CacheLookup
	WebElement CompanayContact;

	@FindBy(xpath = "//input[@id='Address']")
	@CacheLookup
	WebElement SuppliersAddress;

	@FindBy(xpath = "//input[@id='Email']")
	@CacheLookup
	WebElement SuppliersEmail;

	@FindBy(xpath = "//input[@id='GstNumber']")
	@CacheLookup
	WebElement GSTNumber;

	@FindBy(xpath = "//input[@id='textbox']")
	@CacheLookup
	WebElement TermandConditions;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement SaveButton;

	public void AddSupplierButton() {
		AddSupplierButton.click();
	}

	public void SupplierName() {
		SupplierName.sendKeys("Ranveer");
	}

	public void SupplierContact() {
		SupplierContact.sendKeys("8967543489");
	}

	public void CompanayName() {
		CompanayName.sendKeys("shivansh infotech tecnology pune");
	}

	public void CompanayContact() {
		CompanayContact.sendKeys("7867563298");
	}

	public void SuppliersAddress() {
		SuppliersAddress.sendKeys("H12, building number 112, ghansoli nai mumbai");
	}

	public void SuppliersEmail() {
		SuppliersEmail.sendKeys("vaibhav@gmail.com");
	}

	public void GSTNumber() {
		GSTNumber.sendKeys("987675463");
	}

	public void TermandConditions() {
		TermandConditions.sendKeys("1. good quality  2. product should on time deliver");
	}

	public void SaveButton() {
		SaveButton.click();
	}

	// ------- Vendor --------------------

	@FindBy(xpath = "//button[@onclick='clearAlltextbox();']")
	@CacheLookup
	WebElement vendorButton;

	@FindBy(xpath = "//input[@id='firmname']")
	@CacheLookup
	WebElement vendorFirstName;

	@FindBy(xpath = "//input[@id='Address']")
	@CacheLookup
	WebElement vendorAddress;

	@FindBy(xpath = "//input[@id='city']")
	@CacheLookup
	WebElement vendorCity;

	@FindBy(xpath = "//input[@id='pincode']")
	@CacheLookup
	WebElement pincode;

	@FindBy(xpath = "//input[@id='mobileno']")
	@CacheLookup
	WebElement mobileno;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//button[@onclick='Saveuserdetail();']")
	@CacheLookup
	WebElement vendorsavebutton;

	public void vendorButton() {
		vendorButton.click();
	}

	public void vendorFirstName() {
		vendorFirstName.sendKeys("gurmit");
	}

	public void vendorAddress() {
		vendorAddress.sendKeys("plot no 132 , akurdi railway station pune");
	}

	public void vendorCity() {

		vendorCity.sendKeys("pune");
	}

	public void pincode() {
		pincode.sendKeys("77856");
	}

	public void mobileno() {
		mobileno.sendKeys("9893992307");
	}

	public void email() {

		email.sendKeys("gurmit@gmail.com");
	}

	public void vendorsavebutton() {
		vendorsavebutton.click();
	}

	// ------------Product category------------

	@FindBy(xpath = "//button[normalize-space()='Add New Product Category']")
	@CacheLookup
	WebElement Productbutton;

	@FindBy(xpath = "//input[@id='productName']")
	@CacheLookup
	WebElement ProductName;

	@FindBy(xpath = "//button[@onclick='saveProduct()']")
	@CacheLookup
	WebElement SaveProduct;

	public void Productbutton() {

		Productbutton.click();
	}

	public void ProductName() {

		ProductName.sendKeys("Hardware");
	}

	public void SaveProduct() {

		SaveProduct.click();
	}

	// ------- SubProduct --------

	@FindBy(xpath = "//button[@onclick='addsubproduct()']")
	@CacheLookup
	WebElement SubProductbutton;

	@FindBy(xpath = "//input[@id='subproductname']")
	@CacheLookup
	WebElement SubProductName;

	@FindBy(xpath = "//input[@id='productrate']")
	@CacheLookup
	WebElement SubProductrate;

	@FindBy(xpath = "//input[@id='hsn']")
	@CacheLookup
	WebElement HSNNumber;

	@FindBy(xpath = "//input[@id='comment']")
	@CacheLookup
	WebElement ProductDescription;

	@FindBy(xpath = "//button[@onclick='Savesubproductdetail();']")
	@CacheLookup
	WebElement Savesubproductdetail;

	public void SubProductbutton() {
		SubProductbutton.click();
	}

	public void SubProductName() {
		SubProductName.sendKeys("webdevelopments");
	}

	public void SubProductrate() {
		SubProductrate.sendKeys("5500");
	}

	public void HSNNumber() {

		HSNNumber.sendKeys("HSN897673");
	}

	public void ProductDescription() {

		ProductDescription.sendKeys("Product quality is good");
	}

	public void Savesubproductdetail() {
		Savesubproductdetail.click();
	}

}
