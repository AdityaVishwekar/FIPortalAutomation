package com.code.java.selenium;

import org.testng.annotations.Test;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeManagementpage extends StartWebDriver {
	
	@Test
	public void testEmployeeManagementpage() throws Exception {

		try {
			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//li[@id='nav-institution-mgmt-link']/a/span[2]")).click();
	    LinkHelper.clickLink("Administration");Thread.sleep(6000);
		driver.findElement(By.id("link-text")).click();

		Thread.sleep(6000);
		ComboBoxHelper.selectByVisibleText("userType", "Service Representative Manager");

		TextBoxHelper.typeInTextBox("enrollFirstNameInput", "a");
		TextBoxHelper.typeInTextBox("enrollLastNameInput", "v");


	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		TextBoxHelper.typeInTextBox("(//input[@type='text'])[3]", "avishwekar@buzzpoints.com");


	    ComboBoxHelper.selectByVisibleText("branchId", "ABERDEEN 45 NORTH");
	    driver.findElement(By.id("createUserBtn")).click();
	    Thread.sleep(7000);
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
