package Com.FireSolution_TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.PurchaseOrder;

public class TC_PurchaseOrder_0015 extends BaseClass {

	@Test
	public void PurchaseOrder() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		Thread.sleep(2000);

		PurchaseOrder PO = new PurchaseOrder(driver);

		PO.PurchaseOrders();
		Thread.sleep(2000);

		PO.AddPO();

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='Suppliernames']"));
		searchBox.click();
		searchBox.sendKeys("Ran");

		// Wait for suggestions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//div[@class='col-span-12 sm:col-span-4']//div[@class='autocomplete-suggestions']")));

		// Click the specific suggestion
		List<WebElement> results = driver.findElements(
				By.xpath("//div[@class='col-span-12 sm:col-span-4']//div[@class='autocomplete-suggestions']"));
		for (WebElement result : results) {
			if (result.getText().contains("Ranveer")) {
				result.click();
				break;
			}
		}

		Thread.sleep(1000);

		WebElement SitesearchBox = driver.findElement(By.xpath("//input[@id='Sitenames']"));
		SitesearchBox.click();
		SitesearchBox.sendKeys("Ind");

		// Wait for suggestions
		WebDriverWait Sitewait = new WebDriverWait(driver, Duration.ofSeconds(50));
		Sitewait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestion']")));

		// Click the specific suggestion
		List<WebElement> results1 = driver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));
		for (WebElement result : results1) {
			if (result.getText().contains("IndoreSite")) {
				result.click();
				break;
			}
		}

		WebElement subsearchBox = driver.findElement(By.id("SubproductName"));
		subsearchBox.click();
		subsearchBox.sendKeys("web");

		// Wait for suggestions
		WebDriverWait subwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		subwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestion']")));

		// Click the specific suggestion
		List<WebElement> subresults = driver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));
		for (WebElement result : subresults) {
			if (result.getText().contains("webdevelopments")) {
				result.click();
				break;
			}
		}

		PO.Quantity();
		Thread.sleep(2000);

		PO.Addbutton();
		Thread.sleep(2000);
		PO.Discount();

		PO.SaveButton();

	}
}
