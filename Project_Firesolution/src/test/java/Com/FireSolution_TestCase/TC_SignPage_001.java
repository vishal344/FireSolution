package Com.FireSolution_TestCase;

import java.io.IOException;

import org.testng.annotations.Test;


import Com.FireSolution_PageObject.SuperAdminSignPage;

import org.testng.Assert;

public class TC_SignPage_001 extends BaseClass {

	@Test
	public void SignTest() throws IOException, InterruptedException {

		logger.info("URL is Opened");
		
		SuperAdminSignPage Sp = new SuperAdminSignPage(driver);
		Sp.setUserName(username);
		logger.info("Entered username");
		Sp.setpassword(password);
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
