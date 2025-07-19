package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_Master_SupplierList_010 extends BaseClass{

	@Test
	public void Supplierlist() throws InterruptedException {
		
		
		

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

		Thread.sleep(2000);
		
		
		WebElement dropdownElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Supplier']"));
		
		
		dropdownElement.click();
		
		logger.info("Suppliers list opened");
		
		Thread.sleep(2000);
		
		MasterDropdown MC = new MasterDropdown(driver);
		
		MC.AddSupplierButton();
		
		logger.info("suppliers form details opened");
		
		MC.SupplierName();
		
	logger.info("enter the suppliername");
	
	MC.SupplierContact();
	
	logger.info("Enter the supplier contact");
	
	MC.CompanayName();
	
	logger.info("Enter the Company name");
	
	MC.CompanayContact();
	
	logger.info("Enter the Companay contact");
	
	MC.SuppliersAddress();
	
	logger.info("Enter the suppliers Address");
	
	MC.SuppliersEmail();
	logger.info("enter the email address");
	
	MC.GSTNumber();
	
	logger.info("enter the GST number");
	
		MC.TermandConditions();
		
		logger.info("Enter the terms condition");
		
		MC.SaveButton();
		
		logger.info("Save details-------");
		
		
		
		
	}
}
