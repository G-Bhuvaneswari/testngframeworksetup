package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addtocartfunction {
	
	WebDriver adriver;
	
public addtocartfunction(WebDriver bdriver) {
	
	adriver=bdriver;
}
	
@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
public static WebElement items;

@FindBy(xpath="//*[@id=\"add-to-cart\"]")
public static WebElement addtc;

@FindBy(xpath="//a[@class='shopping_cart_link']")
public static WebElement addicon;

	
	
	
}

