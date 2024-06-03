package testcase;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobject.sortitemfunction;

public class Tc_sortitem_002 extends Baseclass {
	@Test(priority =2)
	public void sort1() {
		
		PageFactory.initElements(driver,sortitemfunction.class);
		
	Select sc = new Select(sortitemfunction.sorticon);
	sc.selectByIndex(1);
	sortitemfunction.proslct.click();
	sortitemfunction.back.click();
	
	}
	@Test(priority =3)
	public void sort2() {
		
		PageFactory.initElements(driver,sortitemfunction.class);
	
	Select sc1 = new Select(sortitemfunction.sorticon);
	sc1.selectByVisibleText("Price (low to high)");
	sortitemfunction.proslct.click();
	sortitemfunction.back.click();
		
		
	}@Test(priority =4)
    public void sort3() {
		PageFactory.initElements(driver,sortitemfunction.class);

    Select sc2 = new Select(sortitemfunction.sorticon);
    sc2.selectByValue("hilo");
    sortitemfunction.proslct.click();
    sortitemfunction.back.click();
    }
}