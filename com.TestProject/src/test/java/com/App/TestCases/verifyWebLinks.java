package com.App.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;
import com.App.Utilities.DataReaderClass;

public class verifyWebLinks {
	
	public static WebDriver driver;
	public static DataReaderClass readdata=new DataReaderClass();;
	
	
	
	@BeforeTest
	public void launchbrowser() {
		
		driver=AppBrowserClass.InvokeBrowser(readdata.getbrowsername(), readdata.getbrowserurl());
		Reporter.log("Launching browser");
		
	}
	
	
  @Test
  public void verifyweblinks() {
	  
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  int count=links.size();
	  System.out.println(count);
	  for(WebElement link:links)
	  {
		  System.out.println(link.getText());
		  System.out.println(link.getAttribute("href"));
	  }
	  
	  
	  
	 
	  
  }
}
