package com.aspire.browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\vicky\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://www.flipkart.com/";
		System.setProperty(key,value );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}

}
