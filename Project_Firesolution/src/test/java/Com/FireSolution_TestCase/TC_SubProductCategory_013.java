package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_SubProductCategory_013 extends BaseClass {

	@Test
	public void SubProductCategory() throws InterruptedException {

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

		WebElement SubProductElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Sub-Product']"));

		SubProductElement.click();

		MasterDropdown MC = new MasterDropdown(driver);

		MC.SubProductbutton();

		WebElement SelectType = driver.findElement(By.xpath("//select[@id='product']"));

		Thread.sleep(2000);
		// Create a Select object
		Select subproductdropdown = new Select(SelectType);

		// Select an option by visible text
		Thread.sleep(2000);
		subproductdropdown.selectByVisibleText("Software");

		MC.SubProductName();
		logger.info("enter the sub product");

		MC.SubProductrate();
		logger.info("enter the subproductrate");

		Thread.sleep(2000);

		WebElement SelectTypeunit = driver.findElement(By.xpath("//select[@id='unit']"));

		Thread.sleep(2000);
		// Create a Select object
		Select unitdropdown = new Select(SelectTypeunit);

		// Select an option by visible text

		unitdropdown.selectByVisibleText("ML");

		MC.HSNNumber();
		logger.info("enter the hsn number");

		MC.ProductDescription();
		logger.info("enter the description");

		MC.Savesubproductdetail();

		logger.info("enter the savesubproductdetails");

	}
}
