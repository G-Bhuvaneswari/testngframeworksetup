package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class sortitemfunction {
	
	WebDriver adriver;
	
public sortitemfunction(WebDriver bdriver)	{
	
	
	adriver=bdriver;
	
}
@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/span/select")
public static WebElement sorticon;

@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
public static WebElement proslct;

@FindBy(xpath="//button[text()='Back to products']")
public static WebElement back;
}
