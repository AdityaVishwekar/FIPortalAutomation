package com.code.java.selenium;

import org.testng.annotations.Test;

import com.code.java.api.StartWebDriver;
import com.code.java.api.TextBoxHelper;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/*
 * Sign in the page using valid username and
 * password
 */

public class SignInPageandForgetPasswordTest extends StartWebDriver {
	
	@Test
	public void testsignInPage() throws Exception{
		
		try {
			driver.get("https://insightstg.buzzpoints.com");
			driver.findElement(By.xpath("//a")).click();

			TextBoxHelper.typeInTextBox("//div[@id='step1Div']/descendant::input", "admincadauto");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//			WebElement ele = driver.findElement(By.xpath("//span[text()='What was your childhood nickname?']"));
			try {
			if(driver.findElement(By.xpath("//span[text()='What was the name of the hospital where you were born?']")) != null)
				TextBoxHelper.typeInTextBox("//div[@id='step2Div']/descendant::input", "lucifer");
			} catch(Exception e) {
				TextBoxHelper.typeInTextBox("//div[@id='step2Div']/descendant::input", "satan");
			}


		    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='password']")).clear();
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aaaaaaa1");
		    driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
		    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Aaaaaaa1");
		    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();Thread.sleep(2000);

			
			TextBoxHelper.typeInTextBox("usernameSignIn", "admincadence");
			TextBoxHelper.typeInTextBox("//div[@id='content']/descendant::input[position()=2]", "Aaaaaaa1");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			AssertJUnit.assertTrue(driver.getTitle().contains("Sign In"));
			System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");
			
		} catch(NoSuchElementException e) {
			System.out.println("Test Failed :++++++++++"+this.getClass()+"++++++++++");

			e.printStackTrace();
		} catch(ElementNotVisibleException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean securityQuestion() {
		if(driver.findElement(By.xpath("//span[text()='What was your childhood nickname?']")) != null) 
			return true;
		else
			return false;
	}

}