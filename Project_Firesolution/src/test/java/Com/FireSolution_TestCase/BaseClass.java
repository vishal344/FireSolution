package Com.FireSolution_TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Com.FireSolution_Utilities.Readconfig;

public class BaseClass {

	Readconfig readconfig = new Readconfig();

	// login data
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();

	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeClass

	public void setup(String br) {

		logger = Logger.getLogger("FireSolution");
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		}

		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getGeckoPath());
			driver = new FirefoxDriver();
		}

		else if (br.equals("edge")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getEdgePath());
			driver = new EdgeDriver();
		}
		driver.get(baseURL);

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	/*
	 * @AfterClass
	 * 
	 * 
	 * public void tearDown() {
	 * 
	 * driver.quit(); }
	 * 
	 */
	public void captureScreen(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");

		FileUtils.copyFile(source, target);

		System.out.println("Screenshot taken");
	}
	
	

	public String radomestring() {

		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	
	
	public String radomeNum() {

		String generatedstring2 = RandomStringUtils.randomNumeric(4);
		return (generatedstring2);
	}

}
