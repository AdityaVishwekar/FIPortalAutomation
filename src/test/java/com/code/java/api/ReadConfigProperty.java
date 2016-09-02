package com.code.java.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {

	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigProperty() {
		
		try {
			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("resource/config.properties");
			prop = new Properties();		
			prop.load(input);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		if(prop.getProperty("url")== null) 
			return "";
		return prop.getProperty("url");
	}
	
	public String getBrowser() {
		if(prop.getProperty("browser")== null) 
			return "";
		return prop.getProperty("browser");
	}
	
	public String getUsername() {
		if(prop.getProperty("Username")== null) 
			return "";
		return prop.getProperty("Username");
	}
	
	public String getPassword() {
		if(prop.getProperty("Password")== null) 
			return "";
		return prop.getProperty("Password");
	}
	
	public int getElementWait() {
		if(prop.getProperty("ElementWait")== null) 
			return 0;
		return Integer.parseInt(prop.getProperty("ElementWait"));
	}
		
	public int getPageLoadWait() {
		if(prop.getProperty("PageLoadWait")== null) 
			return 30;
		return Integer.parseInt(prop.getProperty("PageLoadWait"));
	}
	
	}