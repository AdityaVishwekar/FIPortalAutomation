package com.code.java.api;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GenericHelper extends StartWebDriver {
	
	public static void takeScreenShot(String fileName) {
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("output/reports/images/" + fileName + ".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static boolean isElementPresent(String locator) {
		boolean status = false;
		boolean flag = false;
		if(locator.contains("/"))
			flag = true;
		if(driver.findElements(By.id(locator)).size() >=  1) {
			status = true;
		} else if(driver.findElements(By.xpath(locator)).size() >= 1) {
			status = true;
		} else if(driver.findElements(By.xpath(locator)).size() >= 1) {
			status = true;
		} else if(driver.findElements(By.cssSelector(locator)).size() >= 1) {
			status = true;
		} else if(driver.findElements(By.className(locator)).size() >= 1) {
			status = true;
		} else if(driver.findElements(By.name(locator)).size() >= 1) {
			status = true;
		} 
		else
			status = false;
		
		return status;
	}
}
