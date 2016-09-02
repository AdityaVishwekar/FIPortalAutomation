package com.code.java.selenium;

import org.testng.annotations.Test;

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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class FilesfromTeamwork extends StartWebDriver {
	
	@Test
	public void testFilesfromTeamwork()  {

				
		try {
		Thread.sleep(6000);
		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
		Thread.sleep(6000);
		LinkHelper.clickLink("Files");Thread.sleep(6000);
		
		ComboBoxHelper.select("//select", "36508");Thread.sleep(6000);
		driver.findElement(By.xpath("(//div//button)[last()]")).click();Thread.sleep(6000);
		
		ComboBoxHelper.select("//select", "76983");Thread.sleep(6000);
		driver.findElement(By.xpath("(//div//button)[last()]")).click();
		
		ComboBoxHelper.select("//select", "42674");Thread.sleep(6000);
		driver.findElement(By.xpath("(//div//button)[last()]")).click();
		
		ComboBoxHelper.select("//select", "36147");Thread.sleep(6000);
		driver.findElement(By.xpath("(//div//button)[last()]")).click();
		

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
