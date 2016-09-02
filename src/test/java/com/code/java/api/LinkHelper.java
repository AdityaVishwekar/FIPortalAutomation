package com.code.java.api;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkHelper extends StartWebDriver {

public static void clickLink(String linkText) {
		
		if(driver.findElements(By.linkText(linkText)).size() == 1){
			driver.findElement(By.linkText(linkText)).click();
			System.out.println(linkText+" Clicked");
		}else if(driver.findElements(By.partialLinkText(linkText)).size() == 1){
			driver.findElement(By.partialLinkText(linkText)).click();
		}else
			throw new NoSuchElementException("Link Text Not Found : " + linkText);
		
	}
}
