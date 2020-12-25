package test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import practiceDemo.Helper;

public class BaseTest {
	
	static Properties pro;
	WebDriver dr;
	
@BeforeClass	
	public static void readPropertyFile() throws IOException {
		// /Users/nazmulsheikh/eclipse-workspace/projectDemo
		
		 pro=Helper.readPropertyFile(System.getProperty("user.dir")+"/src/test/resources/config.Propeties");
	}

	
@Before
	public void driverConfiguration() {
		
		String S=pro.getProperty("browser");
		
		
		
		if (S.equals("chrome")){
			 
			
			 
			 System.setProperty("webdriver.chrome.driver", "/Users/nazmulsheikh/Downloads/chromedriver");
			 dr=new ChromeDriver();
		 }else if(S.equals("Firefox")){
			 
			 System.setProperty("webdriver.gecko.driver", "/Users/nazmulsheikh/Downloads/geckodriver");
			 dr=new FirefoxDriver();
		 }
		
		
		dr.get(pro.getProperty("url"));
		
		
	}
	
}
