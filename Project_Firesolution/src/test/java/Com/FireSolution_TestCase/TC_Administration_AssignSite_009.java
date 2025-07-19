package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.AdministrationDropdown;
import Com.FireSolution_PageObject.ClientSignPage;

public class TC_Administration_AssignSite_009 extends BaseClass {

	@Test
	public void AssignSite() throws InterruptedException {
		
		
		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();
		
		logger.info("login successful ");
		
		Thread.sleep(2000);
		WebElement AdministrationDropdown = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Administration']"));
		

		AdministrationDropdown.click();
		Thread.sleep(1000);
		
		WebElement dropdownElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Assign Site']"));
		
		
		dropdownElement.click();
		
		logger.info("Assign Site list opened");
		
		AdministrationDropdown AC = new AdministrationDropdown(driver);
		
		AC.AssignSiteToUser();
		
		logger.info("Assignsite to user form open");
		
		WebElement SelectUser = driver.findElement(By.id("selectuser"));
		
		Thread.sleep(1000);
		Select dropdown = new Select(SelectUser );
		
		dropdown.selectByVisibleText("lokeshsable");
		
		logger.info("select the user");
		
		Thread.sleep(1000);
		
     WebElement SelectSite = driver.findElement(By.id("selectsite"));
		
		Thread.sleep(1000);
		Select dropdown1 = new Select(SelectSite);
		
		dropdown1.selectByVisibleText("bhopalwarehouse");
		
		logger.info("select the site");
		
		
		AC.AssignSite_SaveButton();
		
		
		logger.info("Assignsite details are saved");
		
		

 
		
		
		
	}
}
