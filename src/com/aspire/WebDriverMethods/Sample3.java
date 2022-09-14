package com.aspire.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\vicky\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe";
		String url="https://www.flipkart.com/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		//Dimnesion defdim=driver.manage().window().getSize();
		//System.out.println(defdim);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension d1=new Dimension(600,200);
		driver.manage().window().setSize(d1);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension d2=new Dimension(100,100);
		driver.manage().window().setSize(d2);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension d3=new Dimension(900,400);
		driver.manage().window().setSize(d3);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		Dimension d4=new Dimension(700,700);
		driver.manage().window().setSize(d4);
		Thread.sleep(2000);
		driver.close();
	}

}
