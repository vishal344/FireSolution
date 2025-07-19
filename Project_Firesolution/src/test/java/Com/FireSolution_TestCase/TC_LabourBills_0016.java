package Com.FireSolution_TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;

import Com.FireSolution_PageObject.LabourBills;

public class TC_LabourBills_0016 extends BaseClass {

	@Test
	public void LabourBills() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		Thread.sleep(2000);

		LabourBills LB = new LabourBills(driver);

		LB.LabourBill();

		logger.info("Labour bills opened");

		LB.AddLabourBills();

		logger.info("labour bills panal opened ");

		Thread.sleep(2000);

		WebElement VendorsearchBox = driver.findElement(By.xpath("//input[@id='vnames']"));
		VendorsearchBox.click();
		VendorsearchBox.sendKeys("amo");

		// Wait for suggestions
		WebDriverWait vendorwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		vendorwait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestion']")));

		// Click the specific suggestion
		List<WebElement> vendorresults = driver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));
		for (WebElement result : vendorresults) {
			if (result.getText().contains("amol")) {
				result.click();
				break;
			}
		}

		logger.info("entered the vendor  ");

		Thread.sleep(2000);

		WebElement SitesearchBox = driver.findElement(By.xpath("//input[@id='Sitenames']"));
		SitesearchBox.click();
		SitesearchBox.sendKeys("Nash");

		// Wait for suggestions
		WebDriverWait Sitewait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Sitewait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[contains(@class, 'autocomplete-suggestions')]")));

		// Click the specific suggestion
		List<WebElement> results1 = driver.findElements(By.xpath(
				"//div[contains(@class, 'autocomplete-suggestions')]//div[contains(@class, 'autocomplete-suggestion')]"));
		for (WebElement result : results1) {
			if (result.getText().contains("NashikSite")) {
				result.click();
				break;
			}
		}

		logger.info("enter the site name");
		Thread.sleep(2000);

		LB.Billsnumber();
		logger.info("enter the bills number");

		LB.Billsamount();

		logger.info("enter the bills amount");

		LB.SaveButton();

		logger.info("Details are saved");
		
	}

}
