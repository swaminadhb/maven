package com.App.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenCapture {

	
	public String capturescreen(WebDriver driver,String screenname) throws IOException {
		
		
		TakesScreenshot elementscreenshot = (TakesScreenshot)driver;
		File file = elementscreenshot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./app.Screens/"+screenname+".png");
		String filepath = destination.getAbsolutePath();
		FileUtils.copyFile(file, destination);
			
		return filepath;
			
	}
	
	
}
