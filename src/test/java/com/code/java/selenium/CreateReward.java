package com.code.java.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.code.java.api.StartWebDriver;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateReward {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
    baseUrl = "https://devqa.fisoc.com/business/dashboard/#/signin";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateOffer() throws Exception {
    driver.get("https://devqa.fisoc.com/business/dashboard/");
    driver.findElement(By.id("signinEmail")).clear();
    driver.findElement(By.id("signinEmail")).sendKeys("jmata+merch@buzzpointsinc.com");
    driver.findElement(By.id("signinPassword")).clear();
    driver.findElement(By.id("signinPassword")).sendKeys("aaaaaa");
    driver.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(9000);
    driver.findElement(By.xpath("//a[position()=1]/h4")).click();Thread.sleep(8000);
	driver.findElement(By.xpath("//button[text()='Skip']")).click();Thread.sleep(8000);
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.linkText("Rewards")).click();

	driver.findElement(By.xpath("//button[text()='Create a Reward']")).click();Thread.sleep(10000);
	driver.findElement(By.xpath("//div//label//input[@value='10']")).click();Thread.sleep(8000);
	driver.findElement(By.xpath("//div//button[text()='Next']")).click();Thread.sleep(8000);
    driver.findElement(By.xpath("//div//button[text()='Create']")).click();Thread.sleep(8000);
    driver.findElement(By.xpath("//div//button[text()='Done']")).click();
    System.out.println("Test Passed :++++++++++"+this.getClass()+"++++++++++");
    Thread.sleep(7000);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
