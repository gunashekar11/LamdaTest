package com.lamdatest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
		@FindBy(xpath="//button[contains(text(),'✕')]") private WebElement popupcancel;
		@FindBy(xpath="//input[@name=\"q\"]") private WebElement searchbox;
		@FindBy(xpath="//button[@type='submit']") private WebElement search;
	
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public void Click_Popup()
		{
			popupcancel.click();
		}
		public void Enter_Search(String productname)
		{
			searchbox.sendKeys(productname);
		}
		public void Click_Search()
		{
			search.click();
		}
		

	}

