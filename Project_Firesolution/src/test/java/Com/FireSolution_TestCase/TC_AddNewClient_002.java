package Com.FireSolution_TestCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientMaster;
import Com.FireSolution_PageObject.SuperAdminSignPage;


public class TC_AddNewClient_002 extends BaseClass {

	@Test
	public void ClientMaster() throws IOException, InterruptedException {

		logger.info("URL is Opened");

	SuperAdminSignPage Sp = new SuperAdminSignPage (driver);
		Sp.setUserName(username);
		logger.info("Entered username");
		Sp.setpassword(password);
		logger.info("Entered password");

		Sp.clickSubmit();

		ClientMaster CM = new ClientMaster(driver);

		CM.ClientMasters();
		logger.info("Clientmaster panel is opened");

		CM.AddNewClients();
		logger.info("Add new client");

		Thread.sleep(2000);
		CM.setcompanyname();
		logger.info("enter the company name");

		CM.setAddress();
		logger.info("enter the address");

		CM.setmobilenumber();
		logger.info("enter the mobile number");

		CM.setEmail();
		logger.info("enter the email");

		CM.PermSub();

		logger.info("permanat subcription");

		CM.SaveButton();

		logger.info("Details save"); 
		
		
		 Thread.sleep(2000);
		try {
		    // Switch to the alert
		    Alert alert = driver.switchTo().alert();
		    // Print the alert message
		    System.out.println("Alert Text: " + alert.getText());
		    // Accept the alert (click OK)
		    alert.accept();
		} catch (NoAlertPresentException e) {
		    System.out.println("No alert is present.");
		}
		
		
		
         
		// <------ click on Assign Admin ------------>
		// List<String> allListData = new ArrayList<>();

		boolean hasNextPage = true;

		while (hasNextPage) {
			// Locate all buttons on the page using a common locator
			List<WebElement> buttons = driver.findElements(By.xpath(" //a[normalize-space()='Assign Admin']"));

			// Ensure buttons are found
			// Assert.assertTrue(buttons.size() > 0, "No buttons found on the page.");

			// Iterate through the buttons and click each in sequence
			for (int i = 0; i < buttons.size(); i++) {
				WebElement button = buttons.get(i);

				// Verify that the button is displayed and enabled
				Assert.assertTrue(button.isDisplayed(), "Button " + (i + 1) + " is not displayed.");
				Assert.assertTrue(button.isEnabled(), "Button " + (i + 1) + " is not enabled.");

				// Click the button
				button.click();

				logger.info("Assign Admin table is open");

			}

			// Check if the "Next" button is enabled or exists
			WebElement nextButton;
			try {
				nextButton = driver.findElement(By.xpath("//button[normalize-space()='»']"));
				if (nextButton.isEnabled()) {
					nextButton.click(); // Move to the next page
				} else {
					hasNextPage = false; // End of pagination
				}
			} catch (Exception e) {
				hasNextPage = false; // No "Next" button means end of pagination
			}

		}

		// --- Add new user (Assign Admin table is open)----

		Thread.sleep(2000);
		CM.setfirstname();
		logger.info("enter the first name");

		CM.lastname();
		logger.info("Enter the last name");

		CM.Adminaddress();
		logger.info("Enter the adminaddress");

		CM.AdminEmail();
		logger.info("Enter the email");

		// dropdown

		WebElement dropdownElement = driver.findElement(By.id("selectgender"));

		Thread.sleep(2000);
		// Create a Select object
		Select dropdown = new Select(dropdownElement);

		// Select an option by visible text
		dropdown.selectByVisibleText("FeMale");

		// Verify the selected option
		// WebElement selectedOption = dropdown.getFirstSelectedOption();
		// Assert.assertEquals(selectedOption.getText(), "FeMale", "Selected option is
		// incorrect.");

		logger.info("select the dropdown menu");

		CM.ContactNumber();

		logger.info("Enter the contact number");

		CM.Username();

		logger.info("Enter the username");

		CM.password();

		logger.info("Enter the password");

		CM.Adminsavebutton();

		logger.info("Added user is created"); 

		
		
	}

}
