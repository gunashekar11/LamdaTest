package com.lamdatest.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest  implements Constants
{
	
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		
	}
	public static  WebDriver driver;
	public static void openBrowser(String browser)
	{
		if (browser.equals("Chrome"))
		{
			 driver=new ChromeDriver();	 
		}
		else 
		{
			 driver=new FirefoxDriver();
		}

		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(URL);
	}
	public static void closeBrowser()
	{
		driver.close();
	}

	}
