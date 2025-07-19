package Com.FireSolution_TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.AdministrationDropdown;
import Com.FireSolution_PageObject.ClientSignPage;

public class TC_Administration_Companylist_004 extends BaseClass {

	@Test
	public void Companydetails() throws InterruptedException {

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
				.findElement(By.xpath("//div[@class='side-menu__title'][normalize-space()='Company']"));
		
		
		dropdownElement.click();
		

		logger.info("select the company dropdown menu");
		Thread.sleep(2000);
		AdministrationDropdown AC = new AdministrationDropdown(driver);

		AC.AddCompany();

		logger.info("Addcompany panal is opened");
		
		Thread.sleep(2000);

		AC.Companyname();

		logger.info("Enter the company name");

		AC.Address();

		logger.info("Enter the Address");

		AC.City();

		logger.info("Enter the city name");

		AC.Pincode();

		logger.info("Enter the pincode number");

		AC.GSTNO();

		logger.info("Enter the gst no");

		AC.MobileNo();

		logger.info("Enter the mobile number");

		AC.Email();

		logger.info("Enter the email--");

	//	Thread.sleep(2000);
		
		
/*
		// Use JavaScript to make the hidden file input visible
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('logoupload').style.display='block';");

		// Now send the file path to the input
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='logoupload']"));
		String filePath = "D:\\Users\\Hp\\Pictures\\abdul kalam.save";
		uploadElement.sendKeys(filePath);
		
		*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='logoupload']")));

      String filePath = "D:\\Users\\Hp\\Pictures\\abdul kalam.jpg";
         element.sendKeys(filePath);
		// Execute JavaScript to make the element visible
		String script = "var elem = arguments[0]; if (elem) { elem.style.display = 'block'; }";
		((JavascriptExecutor) driver).executeScript(script, element);
		

		logger.info("Logo uploaded");

	
		AC.SaveButtons();
		
		logger.info("Save details");

	}
}
