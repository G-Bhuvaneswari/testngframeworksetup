package testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.addtocartfunction;
import pageobject.loginfunction;
import pageobject.sortitemfunction;

public class Tc_loginfuction_001 extends Baseclass {

	@Test(priority =1)
	public void login() throws InterruptedException {

		PageFactory.initElements(driver, loginfunction.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginfunction.username.sendKeys((username));
		loginfunction.password.sendKeys((password));
		Reporter.log("username and pasword entered succesfully");
		Thread.sleep(3000);

		loginfunction.submit.click();
		Reporter.log("loged  succesfully");
		Thread.sleep(3000);
	}

	
   
}

	


