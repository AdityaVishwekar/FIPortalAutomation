package com.code.java.selenium;


import org.testng.annotations.Test;

import com.code.java.api.ComboBoxHelper;
import com.code.java.api.GenericHelper;
import com.code.java.api.StartWebDriver;
import com.code.java.api.TextBoxHelper;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeProfileEdit extends StartWebDriver {

	@Test
	  public void testEmployeeProfileEdit() throws Exception {
		
		try {
			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
		Thread.sleep(6000);
		
	    driver.findElement(By.xpath("//li[@id='nav-institution-mgmt-link']/a/span[2]")).click();
	    Thread.sleep(6000);
	    ComboBoxHelper.select("fi-form-role", "SR_LEVEL_1");Thread.sleep(6000);
		driver.findElement(By.id("userSearchBtn")).click();Thread.sleep(6000);
	
	    driver.findElement(By.xpath("(//button[@class='searchDataDetail'])[1]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div//span[@id='rolePencil']")).click();
	    driver.findElement(By.xpath("//div//span[@id='branchPencil']")).click();
	    ComboBoxHelper.selectByVisibleText("(//select[@id='branchId'])[2]", "ALBERTVILLE BRANCH");
	    driver.findElement(By.xpath("//div//span[@id='emailPencil']")).click();
	    driver.findElement(By.id("email")).clear();
	    TextBoxHelper.typeInTextBox("email", "tbrown+sr1b@buzzoinptinc.com");
	    driver.findElement(By.cssSelector("button.close")).click();
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
