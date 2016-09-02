package com.code.java.selenium;


import org.testng.annotations.Test;

import com.code.java.api.AlertHelper;
import com.code.java.api.ButtonHelper;
import com.code.java.api.ComboBoxHelper;
import com.code.java.api.GenericHelper;
import com.code.java.api.LinkHelper;
import com.code.java.api.StartWebDriver;
import com.code.java.api.TextBoxHelper;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeProfile extends StartWebDriver {

	@Test
	  public void testEmployeeProfile() throws Exception {
		
		try {
			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    LinkHelper.clickLink("Administration");
	    ComboBoxHelper.selectByVisibleText("(//select[@type='select'])[3]", "Active");
	    ButtonHelper.clickButton("userSearchBtn");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.pollingEvery(1, TimeUnit.SECONDS);	

	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button.searchDataDetail"))));		
		driver.findElement(By.cssSelector("button.searchDataDetail")).click();
	    GenericHelper.takeScreenShot(this.getClass().toString()+"ActiveUser");

	    ButtonHelper.clickButton("button.close");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);	  
	    
	    ComboBoxHelper.selectByVisibleText("(//select[@type='select'])[3]", "Pending");
	    ButtonHelper.clickButton("userSearchBtn");
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button.searchDataDetail"))));		
	    driver.findElement(By.cssSelector("button.searchDataDetail")).click();
	    GenericHelper.takeScreenShot(this.getClass().toString()+"PendingUser");

	    ButtonHelper.clickButton("button.close");

	    
	    System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");

		} catch(Exception e) {
			System.out.println("Test Failed :++++++++++"+this.getClass()+"++++++++++");

			//Take Screenshot
			GenericHelper.takeScreenShot(this.getClass().toString());
			e.printStackTrace();
		}
	   
	  }
}
