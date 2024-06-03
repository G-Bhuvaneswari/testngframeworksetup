package testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobject.addtocartfunction;

public class Tc_addtocart_003 extends Baseclass{
		
	    @Test(priority =5)
		public void cart() throws InterruptedException {
			PageFactory.initElements(driver,addtocartfunction.class);

			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView();",addtocartfunction.items);
			Reporter.log("moved to that element");
			addtocartfunction.items.click();
			Reporter.log("element clicked");
	        Thread.sleep(2000);
	   //  String enter=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//addtocartfunction.addtc.sendKeys(enter);
			addtocartfunction.addtc.click();

			addtocartfunction.addicon.click();
		}
}
