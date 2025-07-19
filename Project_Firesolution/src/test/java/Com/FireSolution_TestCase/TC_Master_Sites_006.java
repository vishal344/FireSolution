package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_Master_Sites_006 extends BaseClass {

	@Test
	public void Sitesdetails() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		WebElement MasterDropdown = driver
				.findElement(By.xpath("//a[@id='Master']//div[@class='side-menu__icon']//*[name()='svg']"));

		MasterDropdown.click();

		Thread.sleep(2000);
		WebElement SitesElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Sites']"));

		SitesElement.click();

		logger.info("select the sites dropdown menu");

		MasterDropdown MS = new MasterDropdown(driver);

		MS.AddSitesButton();

		logger.info("Enter the site details");

		WebElement SelectCompany = driver.findElement(By.id("selectedFirm"));

		Thread.sleep(2000);
		// Create a Select object
		Select companydropdown = new Select(SelectCompany);

		// Select an option by visible text
		companydropdown.selectByVisibleText("mitroz technology & software pvt Ltd ");

		logger.info("select the Comapnay");

		Thread.sleep(1000);

		MS.SiteName();
		logger.info("Enter the site name");

		MS.SiteAddress();
		logger.info("Enter the site address");

		MS.ProjectmanagerName();
		logger.info("Enter the project manger");

		MS.ProjectmanagermobileNo();

		logger.info("Enter the project manger mobile no");

		MS.AccountManagerName();

		logger.info("Enter the account manger name");

		MS.AccountManagerMobileNo();

		logger.info("Enter the account manger mobile number");

		// MS.PastLocationURL();

		// logger.info("Enter the url");

		Thread.sleep(2000);

		WebElement SelectCustomer = driver.findElement(By.id("selectcustomer"));

		Thread.sleep(2000);
		// Create a Select object
		Select customerdropdown = new Select(SelectCustomer);

		// Select an option by visible text
		customerdropdown.selectByVisibleText("VishalSites");

		logger.info("select the customer");

		Thread.sleep(1000);

		WebElement SelectSupervisor = driver.findElement(By.id("selectSupervior"));

		Thread.sleep(2000);
		// Create a Select object
		Select Supervisordropdown = new Select(SelectSupervisor);

		// Select an option by visible text
		Supervisordropdown.selectByVisibleText("sanketsable");

		logger.info("select the SelectSupervisor");

		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.id("IsWareHouse")); // Replace with actual locator

		// Check if the checkbox is selected
		if (!checkbox.isSelected()) {
			checkbox.click(); // Select the checkbox
		}

		// Verify that the checkbox is selected
		// Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected!");

		Thread.sleep(2000);
		MS.SiteSaveButton();

		logger.info("site details are saved");

	}

}
