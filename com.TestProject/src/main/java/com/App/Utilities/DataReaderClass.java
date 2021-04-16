package com.App.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReaderClass {
	
	
	public static Properties prop;
	
	
	public DataReaderClass() {
		
		try {
			
			File file = new File("./app.Project.Files/login.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			prop.load(fis);
			
			
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}
	
	
	//Create methods for Repositories
	public String getusernameelement() {
		return prop.getProperty("username");
	}
	
	
	public String getpasswordelement() {
		return prop.getProperty("password");
	}
	
	public String getbuttonelement() {
		return prop.getProperty("loginbutton");
	}
	
	public String getsignoutelement() {
		return prop.getProperty("signoutbutton");
	}
	
	
	
	//Properties
	public String getbrowsername() {
		
		return prop.getProperty("browsername");
		
	}
	
	public String getbrowserurl() {
		return prop.getProperty("browserurl");
	}
	
	
	public String getusername() {
		return prop.getProperty("uname");
	}
	
	public String getpassword() {
		return prop.getProperty("pword");
	}
	
	public String getinvalidusername() {
		return prop.getProperty("invalidusername");
	}
	
	
	

}
