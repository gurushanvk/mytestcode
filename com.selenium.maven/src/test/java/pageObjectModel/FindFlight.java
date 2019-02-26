package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindFlight {
	WebDriver BrowserHandle;
	By type = By.xpath("//input[@name='tripType' and @value='oneway']");
	By airline = By.name("airline");
	By findFlight = By.name("findFlights");
	
	
	public FindFlight(WebDriver BrowserHandle) {
		this.BrowserHandle = BrowserHandle;
		System.out.println("Hi All");
	}
	
	public void findaflight() {
		BrowserHandle.findElement(type).click();
		WebElement airlinesel = BrowserHandle.findElement(airline);
		Select airlineSelect = new Select(airlinesel);
		airlineSelect.selectByVisibleText("Blue Skies Airlines");
		
		BrowserHandle.findElement(findFlight).click();
	}
	
}
