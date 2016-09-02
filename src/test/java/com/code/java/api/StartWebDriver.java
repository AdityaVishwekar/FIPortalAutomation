package com.code.java.api;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class StartWebDriver {
	
	public static WebDriver driver=null;
//    public static final Logger logger = LogManager.getLogger();
	private static WebDriverWait wait;
	private DesiredCapabilities cap;
	@Parameters({"url","user","password"})
	@BeforeClass
	public void setUp(String url, String user, String password) throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "/Users/Aditya/Documents/chromedriver");
//	  driver = new ChromeDriver();
		cap = DesiredCapabilities.chrome();
////	cap = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),cap);
		wait = new WebDriverWait(driver,20);
		driver.get(url);

		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,20);
		TextBoxHelper.typeInTextBox("usernameSignIn", user);
		TextBoxHelper.typeInTextBox("//div[@id='content']/descendant::input[position()=2]", password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    		
	}

	
//	private static ReadConfigProperty file = new ReadConfigProperty();
//	
//	@BeforeSuite
//	public static void setUp() throws MalformedURLException {
//		cap = DesiredCapabilities.chrome();
////		cap = DesiredCapabilities.firefox();
//		driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),cap);
////		  System.setProperty("webdriver.chrome.driver", "/Users/Aditya/Applications/chromedriver");
////		  driver = new ChromeDriver();
////	    driver = new FirefoxDriver();
////		wait = new WebDriverWait(driver,20);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(file.getUrl());
//		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
//
//		
//	}
	
	public static void waitTillPageExists() throws Exception {
	   Thread.sleep(6000);
	}
	
	public static WebElement getElement(String locator) {
		boolean flag = false;
		if(locator.contains("/"))
			flag = true;
		if(driver.findElements(By.id(locator)).size() ==  1) {
			return driver.findElement(By.id(locator));
		} else if(driver.findElements(By.xpath(locator)).size() == 1) {
			return driver.findElement(By.xpath(locator)); 
		}  else if(driver.findElements(By.cssSelector(locator)).size() == 1) {
			return driver.findElement(By.cssSelector(locator));
		} else if(driver.findElements(By.className(locator)).size() == 1) {
			return driver.findElement(By.className(locator));
		} else if(driver.findElements(By.name(locator)).size() == 1) {
			return driver.findElement(By.name(locator));
		} 
		else
			throw new NoSuchElementException("No Such Element"+locator);
	}

	  /* Will wait until a certain element exists inside a WebDriver, searches using By selectors
	     * @param driver    the current WebDriver instance
	     * @param selector  the By selector we are searching for
	     * @param timeout   the number of seconds until this request times out
	     * @param sleep     the number of milliseconds between each poll
	     * @return the WebElement we have found
	     */
	    public static WebElement waitUntilExists(WebDriver driver, By selector, long timeout, long sleep){
	        try {
	        	Thread.sleep(sleep);
	            return (new WebDriverWait(driver, timeout, sleep)).until(ExpectedConditions.visibilityOfElementLocated(selector));
	        }
	        catch(TimeoutException e){
	            return null;
	        }
	        catch(Exception e){
//	            log().error("Unexpected error occurred while waiting for element to exist.");
	            return null;
	        }
	    }



	    
		@AfterClass(alwaysRun=true)
		public void tearDown() {
			try {
			    System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
				driver.close();
				driver.quit();
				if(driver != null)
					driver = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}