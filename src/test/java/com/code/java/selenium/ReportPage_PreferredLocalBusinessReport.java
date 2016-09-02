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
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportPage_PreferredLocalBusinessReport extends StartWebDriver {

	@Test
	public void testPreferredLocalBusinessReport() throws Exception {

		try {

			Thread.sleep(6000);

		AssertJUnit.assertTrue(driver.getTitle().contains("Buzz Insight™")); 
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    LinkHelper.clickLink("Reports");
	    LinkHelper.clickLink("Preferred Local Business Report");
	    Thread.sleep(6000);
	    WebElement iframe = driver.findElement(By.xpath("(//iframe[@id='test'])[2]"));
	    driver.switchTo().frame(iframe);
	    ComboBoxHelper.select("//div[@id='fromMonthCol']//select[@id='render_fromMonthCo']", "2015-01");Thread.sleep(6000);
	    ButtonHelper.clickButton("span[class='exportButton']");

 	
 		WebElement button = waitUntilExists(driver, By.cssSelector("span[class='exportButto']"), 10l, 600l);
 		driver.switchTo().defaultContent();
 		System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");

		//Take Screenshot
		GenericHelper.takeScreenShot(this.getClass().toString());
		} catch(Exception e) {
			
			//Take Screenshot
			GenericHelper.takeScreenShot(this.getClass().toString());
			System.out.println("Test Failed :++++++++++"+this.getClass()+"++++++++++");
			e.printStackTrace();
		}
	    

		
	}
}