package testSelActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActionsFB {

	WebDriver BrowserHandle;
	@Test
	public void TestAction () {
		System.setProperty("webdriver.chrome.driver","C:\\JAVA software-GFT\\chromedriver.exe");
		BrowserHandle = new ChromeDriver();
		
		BrowserHandle.manage().window().maximize();
		BrowserHandle.get("https://google.com");
		
		WebElement searchField = BrowserHandle.findElement(By.name("q"));
		
		Actions selAction = new Actions(BrowserHandle);
		Action selectSecondOption = selAction
				.keyDown(searchField, Keys.SHIFT)
				.sendKeys(searchField, "hello")
				.sendKeys(searchField,Keys.ARROW_DOWN)
				.sendKeys(searchField,Keys.ARROW_DOWN)
				.sendKeys(searchField,Keys.ARROW_DOWN)
				.sendKeys(searchField,Keys.ARROW_DOWN)
				.build();
		
		selectSecondOption.perform();		
		searchField.sendKeys(Keys.ENTER);
	}
}
