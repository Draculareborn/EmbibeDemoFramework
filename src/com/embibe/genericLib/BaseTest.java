package com.embibe.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


/**
 * This class contains reusable methods
 * @author Bhaskar Singh
 *
 */
public class BaseTest implements IAutoConsts {
	
	public static WebDriver driver;
	FileLib flib;
	
	
	/**
	 * This method is used to open the browser and enter the url
	 * @throws Throwable
	 */
	@BeforeMethod
	public void openBrowser() throws Throwable
	{
		flib = new FileLib();
		String browserValue = flib.getKeyPropValue(PROPERTY_PATH, "browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		
		driver.get(flib.getKeyPropValue(PROPERTY_PATH, "url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	/**
	 * This method is used to close the browser
	 */
//	@AfterMethod
//	public void closeBrowser()
//	{
//		driver.quit();
//	}

	
	

}
