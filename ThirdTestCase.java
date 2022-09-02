package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThirdTestCase {
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.linkedin.com/signup/cold-join?source=guest_homepage-basic_nav-header-signin");
	System.out.print(driver.getTitle());
	//System.out.print(driver.getPageSource());
	System.out.print(driver.getCurrentUrl());
	System.out.print(driver.findElement(By.tagName("h1")).getText());
	driver.findElement(By.name("email-or-phone")).sendKeys("nidaansari1811@gmail.com");
	driver.findElement(By.name("password")).sendKeys("N11223");
	driver.findElement(By.id("join-form-submit")).click();
	driver.get("https://www.google.co.in");
	//driver.navigate().back();	
	driver.navigate().forward();
	driver.close();
	driver.quit();
	}
}
