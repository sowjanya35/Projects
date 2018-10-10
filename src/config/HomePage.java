package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	WebDriver driver;

	public WebDriver getDriver(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D://testingPy//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://testingPy//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		} else {
			System.setProperty("webdriver.chrome.driver", "D://testingPy//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}

	}

	public void openBrowser() {

		driver.manage().window().maximize();
		driver.get("https://phptravels.org/clientarea.php");
		
	}


}
