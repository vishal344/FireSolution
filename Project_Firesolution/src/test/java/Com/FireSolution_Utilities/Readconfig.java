package Com.FireSolution_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;

	public Readconfig() {

		File src = new File("./Configuration/config.properties");

		try {

			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());

		}
	}

	public String getApplicationURL() {

		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserName() {

		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {

		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {

		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getGeckoPath() {

		String geckopath = pro.getProperty("geckopath");
		return geckopath;
	}

	public String getEdgePath() {

		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
	
	public String getcompanyName() {
		String companyname = pro.getProperty("CompanyName");
		return companyname;
	}
	
	public String getAddress() {
		String Address = pro.getProperty("Address");
		return Address;
	}

	public String getmobilenumber() {
		String mobileNumbers = pro.getProperty("mobileNumber");
		return mobileNumbers;
	}
	
	public String getemail() {
		String Email = pro.getProperty("email");
		return Email;
	}
	
}
