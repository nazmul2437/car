package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practiceDemo.Helper;

public class LoginPage {
	
	WebDriver dr;
	
	@FindBy(id="//*[@id='content']//img")WebElement element;
	@FindBy(id="")WebElement element1;
	
	
	LoginPage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	
	public void verifyFacebookLogo() {
		Helper.verifyLogo(element); 
	}
	public void inputData() {
		Helper.inputData(element1, value);
	}

}
