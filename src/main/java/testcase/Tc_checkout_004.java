package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.checkoutfunction;
@Test
public class Tc_checkout_004 extends Baseclass {

	public void checkout() {

		PageFactory.initElements(driver, checkoutfunction.class);

		checkoutfunction.checlk.click();
		checkoutfunction.name.sendKeys("bhuvana");
		checkoutfunction.lname.sendKeys("g");
		checkoutfunction.pcode.sendKeys("641006");
		checkoutfunction.continu.click();
	}

}
