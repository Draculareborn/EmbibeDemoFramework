package com.embibe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class contains method to handle the HomePage
 * @author Bhaskar Singh
 *
 */
public class EmbibeHomePage {
	
	
	@FindBy(xpath="//a[.='START NOW']") private WebElement startNowBtn;
	@FindBy(xpath="//a[.='Ask']") private WebElement asklink;
	@FindBy(xpath="//a[.='STUDY']") private WebElement studyOption;
	@FindBy(xpath="//a[.='RANKUP']") private WebElement rankupOption;
	@FindBy(xpath="//a[.='AI']") private WebElement aiOption;
	@FindBy(xpath="//a[.='INSTITUTE']") private WebElement instituteOption;
	@FindBy(xpath="//button[.='Login']") private WebElement loginBtn;
	@FindBy(xpath="//a[.='Start Practice']") private WebElement startPracticeBtn;
	@FindBy(xpath="//a[@class='test-btn btn']") private WebElement takeTestBtn;
	@FindBy(xpath="//h1[.='What would you like to STUDY today?']") private WebElement searchSlogen;
	
	
	public EmbibeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is used to click on start now button on landing page
	 */
	public void clickStartNow()
	{
		startNowBtn.click();
	}
	
	/**
	 * This method is used to get ASK link
	 * @return
	 */
	public WebElement getAskLink()
	{
		return asklink;
	}
	
	/**
	 * This method is used to get STUDY link
	 * @return
	 */
	public WebElement getStudyOption()
	{
		return studyOption;
	}
	
	
	/**
	 * This method is used to get RANKUP link
	 * @return
	 */
	public WebElement getRankupOption()
	{
		return rankupOption;
	}
	
	
	/**
	 * This method is used to get RANKUP link
	 * @return
	 */
	public WebElement getAIOption()
	{
		return aiOption;
	}
	
	
	/**
	 * This method is used to get INSTITUTE link
	 * @return
	 */
	public WebElement getInstituteOption()
	{
		return instituteOption;
	}
	
	
	/**
	 * This method is used to get LOGIN button
	 * @return
	 */
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	
	/**
	 * This method is used to get START PRACTICE link
	 * @return
	 */
	public WebElement getStartPracticeBtn()
	{
		return startPracticeBtn;
	}
	
	
	/**
	 * This method is used to get TAKE TEST link
	 * @return
	 */
	public WebElement getTakeTestBtn()
	{
		return takeTestBtn;
	}
	
	
	/**
	 * This method is used to get SEARCH SLOGEN link
	 * @return
	 */
	public WebElement getSearchSlogen()
	{
		return searchSlogen;
	}
	
	
	/**
	 * This method is used to get START PRACTICE button
	 */
	public void clickStartPracticeBtn()
	{
		startPracticeBtn.click();
	}
	

}
