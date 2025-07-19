package Com.FireSolution_TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.AdministrationDropdown;
import Com.FireSolution_PageObject.ClientSignPage;

public class TC_Administration_UserList_005 extends BaseClass {

	@Test
	public void Userdetails() throws InterruptedException {

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

		WebElement dropdownElement = driver
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='User']"));

		dropdownElement.click();

		logger.info("select the User dropdown menu");

		AdministrationDropdown AC = new AdministrationDropdown(driver);

		AC.AddNewUserButton();

		logger.info("User panal is open");

		Thread.sleep(2000);
		AC.UserFirstName();

		logger.info("enter the user first name");

		AC.UserLastName();

		logger.info("enter the user last name");

		WebElement UserRoledropdownElement = driver.findElement(By.id("selectrole"));

		Thread.sleep(2000);

		// Create a Select object
		Select dropdown = new Select(UserRoledropdownElement);

		// Select an option by visible text
		dropdown.selectByVisibleText("DeliveryBoy");

		// Verify the selected option
		// WebElement selectedOption = dropdown.getFirstSelectedOption();
		// Assert.assertEquals(selectedOption.getText(), "FeMale", "Selected option is
		// incorrect.");

		logger.info("select the dropdown menu");

		AC.UserAddress();
		logger.info("enter the  user address");

		AC.UserEmail();
		logger.info("enter the user email");

		WebElement UserGender = driver.findElement(By.id("selectgender"));

		Thread.sleep(2000);
		// Create a Select object
		Select userdropdown = new Select(UserGender);

		// Select an option by visible text
		userdropdown.selectByVisibleText("Male");

		logger.info("select the gender");

		AC.UserContactNo();

		logger.info("enter the contact number");

		AC.UserUsername();
		logger.info("enter the username");

		AC.UserPassword();
		logger.info("enter the user passwords");

		AC.UserSavebutton();

		logger.info("Successfull the save details");

	}
}
