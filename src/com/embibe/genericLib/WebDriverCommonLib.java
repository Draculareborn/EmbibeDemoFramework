package com.embibe.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest {
	
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
	public void waitForPageTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void selectOptions(WebElement address, String text)
	{
		Select sel = new Select(address);
		sel.selectByVisibleText(text);
	}
	
	public void selectOptions(String value , WebElement address)
	{
		Select sel = new Select(address);
		sel.selectByValue(value);
	}
	
	public void selectOptions(WebElement address , int index)
	{
		Select sel = new Select(address);
		sel.selectByIndex(index);
	}
	
	public void verify(String expected , String actual, String message)
	{
		if(expected.equals(actual))
		{
			System.out.println(message+" is Verified ==> TEST PASSED");
		}
		else
		{
			System.out.println(message+" is not Verified ==> TEST FAILED");
		}
	}

}
