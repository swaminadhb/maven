package app.LoginPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.App.Utilities.DataReaderClass;

public class Loginpage extends DataReaderClass{
	
	public static WebDriver driver;
	public static WebElement logout,lbutton,invalid;
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyusername() {
		
		
		driver.findElement(By.name(getusernameelement())).sendKeys(getusername());
		
		
	}
	
	
	
	public void verifypassword() {
		
		driver.findElement(By.name(getpasswordelement())).sendKeys(getpassword());
		
	}
	
	
	
	public void verifyloginbutton() {
		
		lbutton = driver.findElement(By.name(getbuttonelement()));
		if(lbutton.isEnabled()) {
			lbutton.click();
			System.out.println("Button performed successfully");
		}
		else
		{
			System.out.println("Does not performed");
		}
		
		
	}
	
	
	
	
	public void verifysignout() {
		
		

		logout = driver.findElement( By.xpath(getsignoutelement()));
		if(logout.isEnabled()) {
			logout.click();
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login fail");
		}
		
		
	}
	
	
	
	
	
	

}
