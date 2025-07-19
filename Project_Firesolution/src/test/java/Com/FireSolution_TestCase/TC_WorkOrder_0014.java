package Com.FireSolution_TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.WorkOrder;

public class TC_WorkOrder_0014 extends BaseClass {

	@Test
	public void WorkOrdered() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		Thread.sleep(2000);

		WorkOrder WO = new WorkOrder(driver);

		WO.WorkOrders();

		logger.info("work order tab open");
		Thread.sleep(1000);
		WO.AddWorkOrder();
		logger.info("Workorder form  opened");

		Thread.sleep(2000);

		WO.WONumber();
		logger.info("Enter the work order number");

		WO.Estimateamount();
		logger.info("Enter the estimateamount");

		WO.Actualamount();
		logger.info("Enter the Actualamount");

		try {

			// Locate the search box and enter text
			WebElement searchBox = driver.findElement(By.xpath("//input[@id='site']")); // Change 'searchBoxID' as per
																						// your website
			searchBox.sendKeys("Site");

			// Wait for the dropdown list to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@class='autocomplete-suggestions']"))); // Adjust
																										// locator as
																										// needed

			// Get the list of displayed search results
			List<WebElement> results = driver.findElements(By.xpath("//div[@class='autocomplete-suggestions']"));

			// Iterate through results and select the desired item
			for (WebElement result : results) {
				if (result.getText().contains("NashikSite")) { // Modify with expected text
					result.click();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Thread.sleep(2000);

		WebElement searchBox = driver.findElement(By.id("SubproductName"));
		searchBox.click();
		searchBox.sendKeys("Key");

		// Wait for suggestions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestion']")));

		// Click the specific suggestion
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));
		for (WebElement result : results) {
			if (result.getText().contains("Keyboards")) {
				result.click();
				break;
			}
		}

		Thread.sleep(2000);
		WO.Quantity();
		logger.info("Enter the quantity");

		WO.AddButton();
		logger.info("Enter the Addbutton");

		WO.SaveButton1();

		logger.info("Save details");

	}

}
