package com.selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumActions {
	WebDriver BrowserHandle;
	
	public void setaction(String name, String password) {
		System.setProperty("webdriver.chrome.driver","C:\\JAVA software-GFT\\chromedriver.exe");
		BrowserHandle = new ChromeDriver();
		
		BrowserHandle.manage().window().maximize();
		BrowserHandle.get("http://demowebshop.tricentis.com/");
		
		BrowserHandle.findElement(By.linkText("Log in")).click();
		BrowserHandle.findElement(By.name("Email")).sendKeys(name);
		BrowserHandle.findElement(By.name("Password")).sendKeys(password);
		BrowserHandle.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		BrowserHandle.findElement(By.linkText("Log out")).click();
		
		BrowserHandle.close();
	}
}
