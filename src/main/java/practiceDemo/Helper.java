package practiceDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Helper {
	
	
	public static Properties readPropertyFile(String path) throws IOException {
		
		FileInputStream f=new FileInputStream(path);
		Properties p=new Properties();
		p.load(f);
		return p;

	}
	public static void click(WebElement element) {
		
		element.click();
	}
	public static void inputData(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void verifyLogo(WebElement element) {
		
		element.isDisplayed();
	}
}
