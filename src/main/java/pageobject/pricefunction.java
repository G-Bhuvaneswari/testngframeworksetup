package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pricefunction {
	
	
	WebDriver adriver;
	
public  pricefunction(WebDriver bdriver) {
	
	adriver=bdriver;

}

@FindBy(xpath="//a[@class='shopping_cart_link']")
public static WebElement icon;

@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
public static WebElement cartitem;

@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
public static WebElement delitem;

@FindBy(id="finish")
public static WebElement fnclk;



}