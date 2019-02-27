package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectAFlight {
	
	WebDriver BrowserHandle;
	By FromFlight = By.xpath("//input[@name='outFlight' and @value='Blue Skies Airlines$361$271$7:10']");
	By ContinueFlight = By.name("reserveFlights");
	
	
	public selectAFlight(WebDriver BrowserHandle) {
		this.BrowserHandle = BrowserHandle;
	}
	
	public void selectflightandContinue() {
		BrowserHandle.findElement(FromFlight).click();
		BrowserHandle.findElement(ContinueFlight).click();
	}
	
	
}
