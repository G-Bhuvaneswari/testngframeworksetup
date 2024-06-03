package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class filescreenshot {
	
	public static void takingscreenshot(WebDriver driver,String screenname) throws IOException {
		
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File(".//screenshot/"+screenname+".png"));
		
	}

}
