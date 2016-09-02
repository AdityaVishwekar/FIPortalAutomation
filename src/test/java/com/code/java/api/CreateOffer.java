package com.code.java.api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateOffer extends StartWebDriver {

	@Test
	public static void testCreateOffer() throws Exception {
		driver.get("https://devqa.fisoc.com/business/dashboard/#/signin");
		TextBoxHelper.typeInTextBox("signinEmail", " jmata+merchauto@buzzpointsinc.com");
		TextBoxHelper.typeInTextBox("signinPassword", "aaaaaa");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);

		
		driver.findElement(By.xpath("//a[position()=2]/h4")).click();Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Skip']")).click();Thread.sleep(8000);
		driver.findElement(By.xpath("//a//i[@class='icon-chart-up']")).click();Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href='#/portal/campaigns/offers']")).click();Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Create an Offer']")).click();Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//button")).click();Thread.sleep(8000);
		driver.findElement(By.xpath("//select/option[@value='5% Off']")).click();Thread.sleep(8000);
		WebElement offerText = waitUntilExists(driver, By.xpath("//input[@type='text']"), 5, 150);Thread.sleep(8000);
		if (offerText == null)
			throw new Exception("Could not find text field.");
		offerText.sendKeys("Reality");Thread.sleep(8000);

		WebElement nextButton = waitUntilExists(driver, By.xpath("//button//span[text()=01]"), 5, 150);
		if (nextButton == null)
			throw new Exception("Could not find next button.");
		nextButton.click();Thread.sleep(8000);

		WebElement pickDate = waitUntilExists(driver, By.xpath("//button//span[text()=22]"), 5, 150);
		if (pickDate == null)
			throw new Exception("Could not pick a date.");
		pickDate.click();Thread.sleep(8000);

		WebElement nextButton2 = waitUntilExists(driver, By.xpath("//button[contains(.,'Next')]"), 5, 150);
		if (nextButton2 == null)
			throw new Exception("Could not find next button2.");
		nextButton2.click();Thread.sleep(8000);

		WebElement nextButton3 = waitUntilExists(driver, By.xpath("//button[contains(.,'Next')]"), 5, 150);
		if (nextButton3 == null)
			throw new Exception("Could not find next button3.");
		nextButton3.click();Thread.sleep(8000);

//		WebElement createButton = waitUntilExists(driver, By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div[2]/button[2]"), 10, 150);
		WebElement createButton = waitUntilExists(driver, By.xpath("//*[contains(.,'Create')]"), 10, 150);
		if (createButton == null)
			throw new Exception("Could not find create button.");
		createButton.click();
	}
}
