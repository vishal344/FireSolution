package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.MasterDropdown;

public class TC_Master_Customer_007 extends BaseClass {

	WebDriverWait wait;

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

		Thread.sleep(2000);
		WebElement MasterDropdown = driver
				.findElement(By.xpath("//a[@id='Master']//div[@class='side-menu__icon']//*[name()='svg']"));

		MasterDropdown.click();

		Thread.sleep(2000);

		WebElement SitesElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Customer']"));

		SitesElement.click();

		logger.info("select the customer dropdown menu");

		MasterDropdown MC = new MasterDropdown(driver);

		MC.AddCustomerButton();

		logger.info("Customers details opened");

		Thread.sleep(2000);

		MC.SiteCustomer();

		logger.info("Enter the site customer");

		MC.CustomerMobileNo();

		logger.info("Enter the  customer mobile no");

		MC.CustomerEmail();

		logger.info("Enter the  customer email");

		MC.CustomerGSTNO();

		logger.info("Enter the  customer GST No");

		MC.CustomerAddress();

		logger.info("Enter the  customer Address");

		MC.CustomerPin();

		logger.info("Enter the  customer pin No");

		Thread.sleep(2000);

		/*
		 * // Locate the search bar and enter text WebElement searchBar =
		 * driver.findElement(By.id("cnames")); // Replace with the actual locator
		 * searchBar.sendKeys("maha");
		 * 
		 * // Wait for suggestions to appear WebElement suggestionsLocator
		 * =driver.findElement(By.xpath("//input[@id='cnamesid']")); // Replace with the
		 * actual locator
		 * wait.until(ExpectedConditions.visibilityOf(suggestionsLocator));
		 * 
		 * suggestionsLocator.click();
		 * 
		 * // Get the list of suggestions /* List<WebElement> suggestions =
		 * driver.findElements(suggestionsLocator);
		 * 
		 * // Select the desired value String expectedValue = "Maharashtra"; // Replace
		 * with the desired value boolean isValueSelected = false; for (WebElement
		 * suggestion : suggestions) { if (suggestion.getText().equals(expectedValue)) {
		 * suggestion.click(); isValueSelected = true; break; } }
		 * 
		 * // Assert if the value was selected Assert.assertTrue(isValueSelected,
		 * "The desired value was not found in the suggestions");
		 * 
		 * // Optional: Validate the selected value in the search bar String actualValue
		 * = searchBar.getAttribute("value");
		 * 
		 * Assert.assertEquals(actualValue, expectedValue,
		 * "The selected value is not as expected");
		 */
		MC.CustomerSavebutton();

		logger.info("Save customer details");
	}

}