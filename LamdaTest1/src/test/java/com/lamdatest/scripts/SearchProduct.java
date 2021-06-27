package com.lamdatest.scripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.lamdatest.generics.BaseTest;
import com.lamdatest.pages.HomePage;

public class SearchProduct extends BaseTest
{
public static void main(String[] args) 
{
openBrowser("Chrome");
HomePage hm = new HomePage(driver);
hm.Click_Popup();
hm.Enter_Search("Boat Speakers");
hm.Click_Search();
Actions actions = new Actions(driver);
Action sendPageDown= actions.sendKeys(Keys.PAGE_DOWN).build();
sendPageDown.perform();

String xpathNoRows = "//*[@class='_1YokD2 _3Mn1Gg']/div";
List<WebElement> listTotal = driver.findElements(By.xpath(xpathNoRows));

System.out.println("Total no of rows : "+listTotal.size());

for(int i=1;i<=listTotal.size();i++)
{
	String xpathcolumns = "//*[@class='_1YokD2 _3Mn1Gg']/div["+i+"]/div";
	List<WebElement> listcolumns = driver.findElements(By.xpath(xpathcolumns));
//	System.out.println("No of columns are : "+listcolumns.size());
	
	for(int j=1;j<listcolumns.size();j++)
	{
		String xpathProductName = "//*[@class='_1YokD2 _3Mn1Gg']/div["+i+"]/div["+j+"]/div/a[2]";
		WebElement contentEle = driver.findElement(By.xpath(xpathProductName));
		System.out.println(contentEle.getText().toString());
	}
	System.out.println("============================================================================================");
}

closeBrowser();
}
}
