package com.code.java.selenium;

import org.testng.annotations.Test;

import com.code.java.api.*;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class MyProfile extends StartWebDriver {

	@Test
	  public void testMyProfile() throws Exception {
		
		try {
			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
			Thread.sleep(6000);
		
			driver.findElement(By.xpath("//a[@href='#']")).click();
//		    driver.findElement(By.linkText("My Profile")).click();
		    LinkHelper.clickLink("My Profile");
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("(//img)[2]")).click();
		    driver.findElement(By.xpath("(//img)[2]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.id("emailPencil")).click();
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("jmata+adminca@buzzpointsinc.co");
		    driver.findElement(By.id("submitButton")).click();Thread.sleep(6000);
		    System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");

			//Take Screenshot
			GenericHelper.takeScreenShot(this.getClass().toString());
			} catch(Exception e) {
				
				//Take Screenshot
				GenericHelper.takeScreenShot(this.getClass().toString());
				e.printStackTrace();
				System.out.println("Test Failed :++++++++++"+this.getClass()+"++++++++++");


			}
	  }
}
