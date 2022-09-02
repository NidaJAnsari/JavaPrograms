package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin\r\n"
				+ "");
		driver.findElement(By.id("username")).sendKeys("nidz1810@gmail.com");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.tagName("button")).click();
	}
}
