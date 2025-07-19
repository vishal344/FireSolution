package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_Master_Vendor_011 extends BaseClass {

	@Test
	public void VendorList() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		Thread.sleep(2000);
		WebElement MasterDropdown = driver
				.findElement(By.xpath("//a[@id='Master']//div[@class='side-menu__icon']//*[name()='svg']"));

		MasterDropdown.click();
		logger.info("Master dropdown opened");

		Thread.sleep(2000);

		WebElement dropdownElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Vendor']"));

		dropdownElement.click();

		logger.info(" vedor dropdown opened");

		MasterDropdown MC = new MasterDropdown(driver);

		MC.vendorButton();
		logger.info("vendor from opened");

		MC.vendorFirstName();
		logger.info("enter the first name");

		MC.vendorAddress();
		logger.info("enter the address");

		MC.vendorCity();

		logger.info("enter the city");
		MC.pincode();

		logger.info("enter the pin code");

		MC.mobileno();
		logger.info("enter the mobile no");

		MC.email();
		logger.info("Enter the email address");

		MC.vendorsavebutton();

		logger.info("details are saved");

	}

}
