package com.lamdatest.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.lamdatest.generics.BaseTest;

public class Slider extends BaseTest
{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		
	}
public static void main(String[] args) 
{
	
    WebDriver driver;
	driver=new ChromeDriver();	 	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/horizontal_slider");
	
	Dragslider(driver, 2);
	
//    driver.quit();
}

public static void Dragslider(WebDriver driver, int number)
{
	if(number==1)
	{
		System.out.println("Nothing!!!");
	}
	else
	{
	
	WebElement Slider = driver.findElement(By.xpath("//input[@type='range']"));
	WebElement Output = driver.findElement(By.id("range"));
	
	Actions act = new Actions(driver);
	act.dragAndDropBy(Slider, 3, 0).perform();
	
	System.out.println("Output after dragging-->"+Output.getText());
	}
}

}
