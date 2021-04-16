package com.App.TestCases;




import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;
import com.App.Utilities.DataReaderClass;
import com.App.Utilities.ScreenCapture;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import app.LoginPageObjects.Loginpage;



public class AppLoginTestCase {
	
	public static AppBrowserClass browser;
	public static WebDriver driver;
	public static DataReaderClass readdata;
	public static Loginpage loginpage;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ScreenCapture capture;
	
	
@BeforeSuite
public void setupsuite() {
	browser=new AppBrowserClass();
	readdata=new DataReaderClass();
	extent=new ExtentReports("./app.TestReports/myreport.html",true);
	capture=new ScreenCapture();
	
}


@BeforeTest
public void launchbrowser() {
	
	driver=AppBrowserClass.InvokeBrowser(readdata.getbrowsername(), readdata.getbrowserurl());
	Reporter.log("Launching browser");
	
}
	
 
    @Test(priority=1,description="valid login test")
    public void verifyvalidlogin() throws Exception
    {
    	
    	loginpage=new Loginpage(driver);
    	
    	test=extent.startTest("Login report");
    	
    	loginpage.verifyusername();
    	Reporter.log("verify username");
    	
    	test.log(LogStatus.INFO, "Verifying username");
    	//capture.capturescreen(driver, "username");
    	
    	//String usernamescreen = capture.capturescreen(driver, "username");
		//String unamescreen = test.addScreenCapture(usernamescreen);
		//test.log(LogStatus.INFO, "usernamescreenbelow"+unamescreen);
    	
    	
    	
    	loginpage.verifypassword();
    	Reporter.log("verify password");
    	test.log(LogStatus.INFO, "Verifying password");
    	
    	//capture.capturescreen(driver, "password");
    	
    	//String pwordscreen = capture.capturescreen(driver, "username");
		////String pwordscreen1 = test.addScreenCapture(pwordscreen);
		//test.log(LogStatus.INFO, "passwordscreenbelow"+pwordscreen1);
    	
    	
    	loginpage.verifyloginbutton();
    	Reporter.log("verify button");
    	test.log(LogStatus.INFO, "Verifying button");
    	//capture.capturescreen(driver, "Button");
    	
    	
    	try {
    		
    		loginpage.verifysignout();
    		Reporter.log("verify signout");
    		test.log(LogStatus.INFO, "Verifying signout");
    		
    		//capture.capturescreen(driver, "signout");
    		
    		//String logoutscreen = capture.capturescreen(driver, "username");
    		//String logoutscreen1 = test.addScreenCapture(logoutscreen);
    		//test.log(LogStatus.INFO, "passwordscreenbelow"+logoutscreen1);
    		
    		
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    		System.out.println("Login fail");
    		Reporter.log("login fail");
    	}
    	
    	
    }
    
    
    
    
    
    
    
    @AfterTest
    public void closebrowser() {
    	
    	browser.closebrowser();
    	extent.flush();
    	
    	
    }
    
    
    
    
}
