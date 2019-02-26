package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PageClass {
	
	WebDriver BrowserHandle;
	
	public WebDriver pageClass() {
		System.setProperty("webdriver.chrome.driver","C:\\JAVA software-GFT\\chromedriver.exe");
		WebDriver BrowserHandle = new ChromeDriver();
		BrowserHandle.manage().window().maximize();
		BrowserHandle.get("http://newtours.demoaut.com/mercurywelcome.php");	
		
		return BrowserHandle;
	}	
	
	public PageClass(WebDriver BrowserHandle) {
		this.BrowserHandle = BrowserHandle;
	}
}
