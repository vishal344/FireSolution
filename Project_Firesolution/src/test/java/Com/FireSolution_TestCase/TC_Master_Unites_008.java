package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_Master_Unites_008 extends BaseClass  {

	@Test
	public void UnitDetails() throws InterruptedException {
		
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
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Unit']"));

		SitesElement.click();

		logger.info("select the Unites dropdown menu");
		
		MasterDropdown MU = new MasterDropdown(driver);
		
		MU.AddUnitbutton();
		
		logger.info("UNit details are opened");
		
		Thread.sleep(2000);
		MU.UnitName();
		logger.info("enter the unites");
		
		Thread.sleep(2000);
		MU.Quantity();
		
		logger.info("enter the Quantity");
		
		MU.UnitSaveButton(); 
		logger.info("Save the units");
		
		
		
	}
	
}
