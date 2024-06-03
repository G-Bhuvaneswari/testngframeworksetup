package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutfunction {
	
	
	WebDriver adriver;
	
public  checkoutfunction(WebDriver bdriver) {
	
	adriver=bdriver;
	
}	
@FindBy(xpath="//button[@id='checkout']")
public static WebElement checlk;

@FindBy(id="first-name")
public static WebElement name;


@FindBy(id="last-name")
public static WebElement lname;

@FindBy(id="postal-code")
public static WebElement pcode;

@FindBy(id="continue")
public static WebElement continu;








	
}


