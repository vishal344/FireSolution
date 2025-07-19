package Com.FireSolution_TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;
import Com.FireSolution_PageObject.DeliveryChallan;

public class TC_DeliveryChallan_0017_1 extends BaseClass {

	@Test
	public void Deliverychallan() throws InterruptedException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		logger.info("login successful ");

		Thread.sleep(2000);

		DeliveryChallan DC = new DeliveryChallan(driver);

		DC.DeliveryChallen();

		logger.info("Clicks on delivery Challen");

		Thread.sleep(1000);

		
		DC.AddDC();
		logger.info("Added DC");

		WebElement option1 = driver.findElement(By.xpath("//input[@id='option1']"));

		if (option1.isSelected()) {

			WebElement searchBox = driver.findElement(By.xpath("//input[@id='PO']"));
			searchBox.click();
			searchBox.sendKeys("25");

			// Wait for suggestions
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestions']")));

			// Click the specific suggestion
			List<WebElement> results = driver.findElements(By.xpath("//div[@class='autocomplete-suggestions']"));
			for (WebElement result : results) {
				if (result.getText().contains("in/PO/1/2024-25")) {
					result.click();
					break;
				}
			}

			Thread.sleep(3000);

			DC.Quantity();

			logger.info("enter the quanty");

			// ---- receiver signature

			// Locate the signature pad (usually a canvas element)
			WebElement signaturePad = driver.findElement(By.xpath("//canvas[@id='signatureCanvas1']"));

			// Create an action chain
			Actions actions = new Actions(driver);

			// Click and hold to start drawing
			actions.moveToElement(signaturePad).clickAndHold();

			// Simulate a signature by moving the mouse in a pattern
			int[][] movements = { { 10, 10 }, { 20, -5 }, { 30, 10 }, { -10, -5 }, { -20, 10 }, { 10, -10 } };

			for (int[] move : movements) {
				actions.moveByOffset(move[0], move[1]);
				Thread.sleep(100); // Small delay for realistic movement
			}

			// Release the mouse button to stop drawing
			actions.release().perform();

			Thread.sleep(2000);

			// -----Authorised Sign

			// Locate the signature pad (usually a canvas element)
			WebElement signaturePad1 = driver.findElement(By.xpath("//canvas[@id='signatureCanvas2']"));

			// Create an action chain
			Actions actions1 = new Actions(driver);

			// Click and hold to start drawing
			actions1.moveToElement(signaturePad1).clickAndHold();

			// Simulate a signature by moving the mouse in a pattern
			int[][] movements1 = { { 10, 10 }, { 20, -5 }, { 30, 10 }, { -10, -5 }, { -20, 10 }, { 10, -10 } };

			for (int[] move : movements1) {
				actions1.moveByOffset(move[0], move[1]);
				Thread.sleep(100); // Small delay for realistic movement
			}

			// Release the mouse button to stop drawing
			actions1.release().perform();

			Thread.sleep(2000);

			WebElement recievername = driver.findElement(By.xpath("//input[@id='recievername']"));
			recievername.click();
			recievername.sendKeys("jish");

			// Wait for suggestions
			WebDriverWait recieverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
			recieverwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//div[@class='autocomplete-suggestion' and @data-key='78']")));

			// Click the specific suggestion
			List<WebElement> reciverresults = driver
					.findElements(By.xpath("//div[@class='autocomplete-suggestion' and @data-key='78']"));
			for (WebElement result : reciverresults) {
				if (result.getText().contains("jishanvarma")) {
					result.click();
					break;
				}
			}

			logger.info("search the recevier name");

			Thread.sleep(2000);

			DC.SaveButton();
			logger.info("details are saved");

		}

	}

}
