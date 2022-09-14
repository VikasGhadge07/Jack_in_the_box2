package com.aspire.WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\vicky\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe";
		String url="https://www.flipkart.com/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(5000);
		Point p=new Point(800,700);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		for(int i=0;i<1382;i=i+50)
		{
			for(int j=0;j<=744;j=j+50)
			{
				Point p1=new Point(i,j);
				driver.manage().window().setPosition(p1);
				System.out.println(driver.manage().window().getPosition());
				Thread.sleep(1000);
			}
		}
		Thread.sleep(5000);
		driver.close();

	}

}
