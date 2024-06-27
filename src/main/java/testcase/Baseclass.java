package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Baseclass {
		public static WebDriver driver;


	@AfterMethod
	public void screenshot(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			filescreenshot.takingscreenshot(driver, result.getName());
		}
	}

	@AfterSuite
	public void teardown() {

		driver.quit();

	}

}
