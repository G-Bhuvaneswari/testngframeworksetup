package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginfunction {
	
	
WebDriver adriver;

public loginfunction(WebDriver bdriver) {
	
	adriver=bdriver;	

	
}


@FindBy(xpath="//input[@id='user-name']")
public static WebElement username;

@FindBy(xpath="//input[@id='password']")
public static WebElement password;

@FindBy(xpath="//input[@id='login-button']")
public static WebElement submit;


}
