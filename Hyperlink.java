package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("file:H:\\Selenium project\\Hyperlink.html");
		//driver.manage().window().maximize();
		
		//Using linkText locator
		driver.findElement(By.linkText("Click here!")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("me")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
