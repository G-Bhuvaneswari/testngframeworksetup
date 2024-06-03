package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.pricefunction;
@Test
public class Tc_priceview_005 extends Baseclass {
	
	public void price() {
	PageFactory.initElements(driver,pricefunction.class);
     pricefunction.fnclk.click();


	
	}

}
