package com.code.java.selenium;

import org.testng.annotations.Test;

import com.code.java.api.ButtonHelper;
import com.code.java.api.GenericHelper;
import com.code.java.api.StartWebDriver;
import com.code.java.api.TextBoxHelper;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class BuzzPointsUserPage extends StartWebDriver {
	
	@Test
	public void testBuzzPointsUserPage()  {

				
		try {
		Thread.sleep(6000);
		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
		Thread.sleep(6000);
		
		WebElement ele = driver.findElement(By.cssSelector("#enrollNewBPUserBtn"));
		if(ele == null)
			throw new Exception("Enroll New Buzz Points' User could not be located");
		else
			ele.click();
		
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=1]", "buzz");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=2]", "points");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=3]", "buz@points.com");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=4]", "4274");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=5]", "buz12");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[position()=6]", "buz12");
		ButtonHelper.clickButton("input[name='newAccountRadio'][value='true']");
		TextBoxHelper.typeInTextBox("//div[@id='fiUserAddFrm']/descendant::input[last()]", "buzz1234");
		ButtonHelper.clickButton("//button[@type='submit']");
		ButtonHelper.clickButton("//div[@id='fiUserAddFrm']/descendant::button[last()]");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ButtonHelper.clickButton("button.close");

		System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");

		//Take Screenshot
		GenericHelper.takeScreenShot(this.getClass().toString());
		} catch(Exception e) {
			System.out.println("Test Failed :++++++++++"+this.getClass()+"++++++++++");

			//Take Screenshot
			GenericHelper.takeScreenShot(this.getClass().toString());
			e.printStackTrace();
		}
		
		
	}

}
