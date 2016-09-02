package com.code.java.api;

import org.openqa.selenium.WebElement;

public class ButtonHelper extends StartWebDriver {
	
	public static void clickButton(String locator) throws Exception {
		WebElement ele = getElement(locator);
		if( ele == null) {
			throw new Exception("Could not locate the button");
		}
		ele.click();
		System.out.println("Button Clicked");
	}

}