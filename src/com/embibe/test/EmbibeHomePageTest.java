package com.embibe.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.embibe.genericLib.BaseTest;
import com.embibe.genericLib.FileLib;
import com.embibe.genericLib.WebDriverCommonLib;
import com.embibe.pages.EmbibeHomePage;
import com.embibe.pages.EmbibeJEEMain;
import com.embibe.pages.EmbibeJEEMainSession;

@Listeners(com.embibe.genericLib.MyListener.class)
public class EmbibeHomePageTest extends BaseTest{
	
	
	@Test(priority=1 , description="Flow for Pass")
	public void checkPerformTestPass() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		EmbibeHomePage ehp = new EmbibeHomePage(driver);
		EmbibeJEEMain ejm = new EmbibeJEEMain(driver);
		EmbibeJEEMainSession ejms = new EmbibeJEEMainSession(driver);
		
		
		//Click Start now
		ehp.clickStartNow();
		
		//Validate HomePage
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home", 1, 0), wlib.getPageTitle(), "Home Page");
		
		//Check ASK link displayed
		if(ehp.getAskLink().isDisplayed())
		{
			Reporter.log("Ask link is present", true);
		}
		
		//Check Study option displayed
		if(ehp.getStudyOption().isDisplayed())
		{
			Reporter.log("Study option is present", true);
		}
		
		//Check Rankup option displayed
		if(ehp.getRankupOption().isDisplayed())
		{
			Reporter.log("Rankup option is present", true);
		}
		
		//Check AI option displayed
		if(ehp.getAIOption().isDisplayed())
		{
			Reporter.log("AI option is present", true);
		}
		
		//Check Institute option displayed
		if(ehp.getInstituteOption().isDisplayed())
		{
			Reporter.log("Institute option is present", true);
		}
		
		//Check Login button displayed
		if(ehp.getLoginBtn().isDisplayed())
		{
			Reporter.log("Login button is present", true);
		}
		
		//Check Start Practice button displayed
		if(ehp.getStartPracticeBtn().isDisplayed())
		{
			Reporter.log("Start Practice button is present", true);
		}
		
		//Check Take test button displayed
		if(ehp.getTakeTestBtn().isDisplayed())
		{
			Reporter.log("Take test button is present", true);
		}
		
		//Check Presence of What would you like to study today  text on home page
		if(ehp.getSearchSlogen().isDisplayed())
		{
			Reporter.log("What would you like to study today text is present", true);
		}
		
		//Click on Start practice
		ehp.clickStartPracticeBtn();
		
		wlib.waitForPageTitle("JEE Main Questions");
		
		//Click on Practice button
		ejm.clickPracticeBtn();
		
		
		//Switch to popup tab
		String wh = driver.getWindowHandle();
		
		Set<String> allwhs = driver.getWindowHandles();
		for(String x: allwhs)
		{
			if(!x.equals(wh))
			{
				driver.switchTo().window(x);
				break;
			}
		}
		System.out.println(driver.getTitle());
		
		
		//Validate Popup having options  of "Login" and "Continue" Buttons .
		if(ejms.getLoginBtn().isDisplayed()) 
		{
			Reporter.log("Login button is present", true);
		}
		
		if(ejms.getContinueBtn().isDisplayed())
		{
			Reporter.log("Continue button is present", true);
		}
		
		
		//Validate the text “We recommend you to login, 
		//to save your practice details in your account else you will lose your data” On pop up.
		if(ejms.getPopupText().isDisplayed())
		{
			Reporter.log("Popup text is present", true);
		}
		
		//Click continue button
		ejms.clickContinueBtn();
		
		//Attempt first question
		ejms.selectOptionA();
		
		//Click check button
		ejms.clickCheckButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Attempt second question
		ejms.selectOptionA();
		
		//Click check button
		ejms.clickCheckButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Attempt third question
		ejms.selectOptionA();
				
		//Click check button
		ejms.clickCheckButton();
				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Skip one question
		ejms.clickSkipButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click End Session of page
		ejms.selectEndSession();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click End Session of Test
		ejms.clickEndSessionBtn();
		
	}
	
	
	
	@Test(priority=2 , description="Flow for fail")
	public void checkPerformTestFail() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		EmbibeHomePage ehp = new EmbibeHomePage(driver);
		EmbibeJEEMain ejm = new EmbibeJEEMain(driver);
		EmbibeJEEMainSession ejms = new EmbibeJEEMainSession(driver);
		
		
		//Click Start now
		ehp.clickStartNow();
		
		//Validate HomePage
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home", 1, 0), wlib.getPageTitle(), "Home Page");
		
		//Check ASK link displayed
		if(ehp.getAskLink().isDisplayed())
		{
			Reporter.log("Ask link is present", true);
		}
		
		//Check Study option displayed
		if(ehp.getStudyOption().isDisplayed())
		{
			Reporter.log("Study option is present", true);
		}
		
		//Check Rankup option displayed
		if(ehp.getRankupOption().isDisplayed())
		{
			Reporter.log("Rankup option is present", true);
		}
		
		//Check AI option displayed
		if(ehp.getAIOption().isDisplayed())
		{
			Reporter.log("AI option is present", true);
		}
		
		//Check Institute option displayed
		if(ehp.getInstituteOption().isDisplayed())
		{
			Reporter.log("Institute option is present", true);
		}
		
		//Check Login button displayed
		if(ehp.getLoginBtn().isDisplayed())
		{
			Reporter.log("Login button is present", true);
		}
		
		//Check Start Practice button displayed
		if(ehp.getStartPracticeBtn().isDisplayed())
		{
			Reporter.log("Start Practice button is present", true);
		}
		
		//Check Take test button displayed
		if(ehp.getTakeTestBtn().isDisplayed())
		{
			Reporter.log("Take test button is present", true);
		}
		
		//Check Presence of What would you like to study today  text on home page
		if(ehp.getSearchSlogen().isDisplayed())
		{
			Reporter.log("What would you like to study today text is present", true);
		}
		
		//Click on Start practice
		ehp.clickStartPracticeBtn();
		
		wlib.waitForPageTitle("JEE Main Questions");
		
		//Click on Practice button
		ejm.clickPracticeBtn();
		
		//Switch to popup tab
		String wh = driver.getWindowHandle();
		
		Set<String> allwhs = driver.getWindowHandles();
		for(String x: allwhs)
		{
			if(!x.equals(wh))
			{
				driver.switchTo().window(x);
				break;
			}
		}
		System.out.println(driver.getTitle());
		
		
		//Validate Popup having options  of "Login" and "Continue" Buttons .
		if(ejms.getLoginBtn().isDisplayed()) 
		{
			Reporter.log("Login button is present", true);
		}
		
		if(ejms.getContinueBtn().isDisplayed())
		{
			Reporter.log("Continue button is present", true);
		}
		
		
		//Validate the text “We recommend you to login, 
		//to save your practice details in your account else you will lose your data” On pop up.
		if(ejms.getPopupText().isDisplayed())
		{
			Reporter.log("Popup text is present", true);
		}
		
		//Click continue button
		ejms.clickContinueBtn();
		
		//Attempt first question
		ejms.selectOptionA();
		
		//Click check button
		ejms.clickCheckButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Attempt second question
		ejms.selectOptionA();
		
		//Click check button
		ejms.clickCheckButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Attempt third question
		ejms.selectOptionA();
				
		//Click check button
		ejms.clickCheckButton();
				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click continue button
		ejms.clickContinueNext();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Skip one question
		ejms.clickSkipButton();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click End Session of page
		ejms.selectEndSession();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click End Session of Test
		ejms.clickEndSessionBtn();
		
		Assert.fail();
	}

}
