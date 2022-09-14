package com.aspire.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\vicky\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();   //Amazon
		Thread.sleep(2000);
		driver.navigate().back();   //Flipkart
		Thread.sleep(2000);
		driver.navigate().forward();  //amazon
		Thread.sleep(2000);
		driver.navigate().forward();  //facebook
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
