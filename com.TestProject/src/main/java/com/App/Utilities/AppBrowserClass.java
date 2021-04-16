package com.App.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppBrowserClass
{
   
	public static  WebDriver driver;
	public ChromeDriver chromedriver;
	public FirefoxDriver firefoxdriver;
	
	public static WebDriver InvokeBrowser(String browsername,String appurl) {
		
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","./myDrivers/chromedriver.exe" );
			driver = new ChromeDriver();
		
		}else if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","./myDrivers/geckodriver.exe" );
			driver=new FirefoxDriver();
		
		}if(browsername.equals("edge")) {
			
			System.setProperty("webdriver.edge.driver","./myDrivers/msedgedriver.exe" );
			driver=new EdgeDriver();
		
		}
		
		
		driver.get(appurl);
		driver.manage().window().maximize();
		
		
		return driver;
		
				
		
		
		
		
		
		
	}
	
	
	public void closebrowser() {
		driver.close();
	}
	
}
