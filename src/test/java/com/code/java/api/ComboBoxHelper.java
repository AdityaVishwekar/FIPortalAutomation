package com.code.java.api;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComboBoxHelper extends StartWebDriver {

	private static Select sel = null;
	/*
	 * Method select overloaded
	 */
	public static void select(String locator, int index) {
		sel = new Select(getElement(locator));
		sel.selectByIndex(index);
		System.out.println(index+" Selected");
	}
	
	public static void select(String locator, String value) {
		sel = new Select(getElement(locator));
		sel.selectByValue(value);
		System.out.println(value+" Selected");
	}
	
	public static void selectByVisibleText(String locator, String text) {
		sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
		System.out.println(text+" Selected");
	}
	
}
