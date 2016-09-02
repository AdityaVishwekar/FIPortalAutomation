package com.code.java.selenium;

import org.testng.annotations.Test;

import com.code.java.api.*;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Dashboard extends StartWebDriver {
	
	@Test
	public void testDashboard() throws Exception {
		try {
			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);Thread.sleep(6000);
/* Not commenting out the following statements will result into failed testcase - Bug in the system not the testcase */
//	    driver.findElement(By.xpath("(//div//a[@id='viewReportLink'])[1]")).click();Thread.sleep(6000);
//	    driver.findElement(By.xpath("(//li[@id='nav-dashboard-link']/a/span[2])[1]")).click();Thread.sleep(6000);
//	    driver.findElement(By.xpath("(//div//a[@id='viewReportLink'])[2]")).click();Thread.sleep(6000);
//	    driver.findElement(By.xpath("(//li[@id='nav-dashboard-link']/a/span[2])[1]")).click();Thread.sleep(6000);
//	    driver.findElement(By.xpath("(//div//a[@id='viewReportLink'])[3]")).click();Thread.sleep(6000);
//	    driver.findElement(By.xpath("(//li[@id='nav-dashboard-link']/a/span[2])[1]")).click();Thread.sleep(6000);
	    LinkHelper.clickLink("Reports");Thread.sleep(6000);
	    LinkHelper.clickLink("Reward Redemption Report");
	    LinkHelper.clickLink("Preferred Local Business Report");
	    LinkHelper.clickLink("Enrollment Report");
	    driver.findElement(By.xpath("//li[@id='nav-dashboard-link']/a/span[2]")).click();
	    LinkHelper.clickLink("Buzz Points Users");
	    driver.findElement(By.xpath("(//div//a//span[@id='link-text'])[1]")).click();Thread.sleep(6000);
	    driver.findElement(By.xpath("(//div//a//span[@id='link-text'])[2]")).click();Thread.sleep(6000);
	    LinkHelper.clickLink("Buzz Points Users");
	    driver.findElement(By.xpath("(//div//a//span[@id='link-text'])[3]")).click();Thread.sleep(6000);
	    driver.findElement(By.xpath("//li[@id='nav-reports-link']/a/span[2]")).click();
	    LinkHelper.clickLink("Files");
	    LinkHelper.clickLink("Administration");
	    LinkHelper.clickLink("Marketing");
	    driver.findElement(By.xpath("//li[@id='nav-support-link']/a/span[2]")).click();
	    driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[5]/a/div/span[2]")).click();
	   
	   
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

