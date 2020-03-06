package com.embibe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class contain methods to handle test session page
 * @author Bhaskar Singh
 *
 */
public class EmbibeJEEMainSession {
	
	@FindBy(xpath="//div[@class='modal-wrap']/descendant::div[.='Continue']") private WebElement continueBtn;
	@FindBy(xpath="//div[.='Login']") private WebElement loginBtn;
	@FindBy(xpath="//div[.='We recommend you to login, to save your practice details in your account else you will lose your data.']") private WebElement popupText;
	@FindBy(xpath="//div[.='A']") private WebElement selectOptionA;	
	@FindBy(xpath="//button[@id='checkBtnId']") private WebElement checkButton;
	@FindBy(xpath="//button[.='Continue']") private WebElement continueNext;
	@FindBy(xpath="//button[.='Skip']") private WebElement skipButton;
	@FindBy(xpath="//div[@class='session-snippet--heading-text--end']") private WebElement endSession;
	@FindBy(xpath="//a[.='End Session']") private WebElement endSessionBtn;
	
	public EmbibeJEEMainSession(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * This method is used to get continue button link on popup
	 * @return
	 */
	public WebElement getContinueBtn()
	{
		return continueBtn;
	}
	
	/**
	 * This method is used to get login button link on popup
	 * @return
	 */
	public WebElement getLoginBtn()
	{
		return loginBtn;
		
	}
	
	
	/**
	 * This method is used to get text on popup 
	 * @return
	 */
	public WebElement getPopupText()
	{
		return popupText;
	}
	
	/**
	 * This method is used to click continue button
	 */
	public void clickContinueBtn()
	{
		continueBtn.click();
	}
	
	/**
	 * This method is used to select option A
	 */
	public void selectOptionA()
	{
		selectOptionA.click();
	}
	
	
	/**
	 * This method is used to click check button
	 */
	public void clickCheckButton()
	{
		checkButton.click();
	}
	
	
	/**
	 * This method is used to click continue button to go to next question
	 */
	public void clickContinueNext()
	{
		continueNext.click();
	}
	
	/**
	 * This method is used to click skip button
	 */
	public void clickSkipButton()
	{
		skipButton.click();
	}
	
	
	/**
	 * This method is used to click end session of current page
	 */
	public void selectEndSession()
	{
		endSession.click();
	}
	
	
	/**
	 * This method is used to end the test
	 */
	public void clickEndSessionBtn()
	{
		endSessionBtn.click();
	}

}
