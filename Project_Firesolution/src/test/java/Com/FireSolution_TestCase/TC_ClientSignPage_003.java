package Com.FireSolution_TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.FireSolution_PageObject.ClientSignPage;

public class TC_ClientSignPage_003 extends BaseClass {

	@Test
	public void SignTest() throws IOException {

		logger.info("URL is Opened");

		ClientSignPage Sp = new ClientSignPage(driver);
		Sp.setUserName();
		logger.info("Entered username");
		Sp.setpassword();
		logger.info("Entered password");

		Sp.clickSubmit();

		if (driver.getTitle().equals("Fire Solution")) {

			Assert.assertTrue(true);
			logger.info("Login test passes");
		} else {

			captureScreen(driver, "SignTest");

			Assert.assertTrue(false);
			logger.info("Login test failed ");
		}

	}
	
}
