package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_ProductCategory_0012 extends BaseClass {

	@Test
	public void ProductCategory() throws InterruptedException {

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

		WebElement ProductElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Product Category']"));

		ProductElement.click();

		MasterDropdown MC = new MasterDropdown(driver);

		MC.Productbutton();
		logger.info("product from opened");
		Thread.sleep(1000);
		MC.ProductName();
		logger.info("enter the product name");

		WebElement SelectType = driver.findElement(By.xpath("//select[@id='Type']"));

		Thread.sleep(2000);
		// Create a Select object
		Select productdropdown = new Select(SelectType);

		// Select an option by visible text
		Thread.sleep(2000);
		productdropdown.selectByVisibleText("Material");

		MC.SaveProduct();

		logger.info("product details are saved");

	}
}
