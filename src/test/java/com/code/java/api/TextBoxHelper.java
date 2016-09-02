package com.code.java.api;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxHelper extends StartWebDriver{
	
	public static void typeInTextBox(String locator, String value) throws Exception{
	
	WebElement ele = getElement(locator);
	if(ele == null)
		throw new Exception("Could not locate"+ele);
	ele.sendKeys(value);
	System.out.println(value+" typed in textbox");
	}

}