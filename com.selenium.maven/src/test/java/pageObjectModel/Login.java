package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	//Objects
	WebDriver BrowserHandle;
	By nameObj =  By.name("userName");
	By passObj = By.name("password");
	By signinObj = By.name("login");
	
	//Constructor to get Driver
	public Login(WebDriver BrowserHandle) {
		this.BrowserHandle = BrowserHandle;
	}
	
	//login Functionality
	public void loginfunc(String username, String passWord) {
		
		BrowserHandle.findElement(nameObj).sendKeys( username);
		BrowserHandle.findElement(passObj).sendKeys( passWord);
		BrowserHandle.findElement(signinObj).click();		
	}
	
	
}
