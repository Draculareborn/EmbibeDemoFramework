package com.embibe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains method to handle "JEE Main Questions | Practice JEE Main Problems Online – Embibe.com" page
 * @author Bhaskar Singh
 *
 */
public class EmbibeJEEMain {
	
	@FindBy(xpath="//span[.='All Questions in JEE Main']/ancestor::div//button[.='PRACTICE']") private WebElement practiceBtn;

	
	public EmbibeJEEMain(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * This method is used to click on Practice button
	 */
	public void clickPracticeBtn()
	{
		practiceBtn.click();
	}

}
