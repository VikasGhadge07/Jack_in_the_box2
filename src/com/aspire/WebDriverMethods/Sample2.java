package com.aspire.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\vicky\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://www.facebook.com/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
	}

}
