	package testcase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public String username = "standard_user";
	public String password = "secret_sauce";
	public static WebDriver driver;

	@BeforeSuite
	public void setup() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String curURL=driver.getCurrentUrl();
		Assert.assertEquals(curURL, "https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterMethod
public void screenshot(ITestResult result ) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			filescreenshot.takingscreenshot(driver,result.getName());
		}
	}
	@AfterSuite
	public void teardown() {

		driver.quit();

	}

}
