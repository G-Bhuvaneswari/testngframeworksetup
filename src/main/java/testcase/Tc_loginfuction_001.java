package testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobject.addtocartfunction;
import pageobject.loginfunction;
import pageobject.sortitemfunction;

public class Tc_loginfuction_001 extends Baseclass {

	@Test
	    @Parameters("browser")
	public void browserlunch(String nameofbrowser) throws InterruptedException {
			if(nameofbrowser.equals("chrome")) {
				driver = new ChromeDriver();
				Thread.sleep(3500);			}
			if(nameofbrowser.equals("firefox")) {
				driver = new FirefoxDriver();
				
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get("https://www.saucedemo.com/");
					driver.manage().window().maximize();
	}
	
	@Test()
	public void login() throws InterruptedException {

		PageFactory.initElements(driver, loginfunction.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginfunction.username.sendKeys("standard_user");
		loginfunction.password.sendKeys("secret_sauce");
		Reporter.log("username and pasword entered succesfully");
		Thread.sleep(3000);

		loginfunction.submit.click();
		Reporter.log("loged  succesfully");
		Thread.sleep(3000);
	}

}
