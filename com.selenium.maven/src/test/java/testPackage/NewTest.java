package testPackage;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import pageObjectModel.*;

public class NewTest {
  
	WebDriver BrowserHandle;
	static ExtentReports extent;
	static ExtentTest logger;
	
	@Test
  public void test1() {		
		
		Login logintest = new Login(BrowserHandle);
		logintest.loginfunc("mercury", "mercury");
		logger.log(LogStatus.PASS, "Wonderfully passed");
		
		FindFlight findflight1 = new FindFlight(BrowserHandle);
		findflight1.findaflight();	
		logger.log(LogStatus.PASS, "Wonderfully passed");
  }
  
  @BeforeClass
  public void beforeClass() {
	  PageClass invokebrowser = new PageClass(BrowserHandle);
	  BrowserHandle = invokebrowser.pageClass();  
  }

  @BeforeClass
  public void extentReporter() {
	  extent = new ExtentReports("C:\\JAVA software-GFT\\Excel\\MyReport.html",false);
	  extent.assignProject("MercT Login");
	  extent.addSystemInfo("Environment", "Demo")
	  		.addSystemInfo("User Name", "GV5037");
	  
	  extent.loadConfig(new File("C:\\Users\\g.shankar.venkatesan\\eclipse-workspace\\com.selenium.maven\\extent-config.xml"));
	  logger = extent.startTest("Training","Recording is in progress");
	  
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Done with my Test");
  }

  @AfterClass
  public void closeExtentReport() {
	  extent.endTest(logger);
	  extent.flush();
  }

  
}
