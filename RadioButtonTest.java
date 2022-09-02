package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonTest {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
	WebElement radioButton=driver.findElement(By.id("exp-4"));
	radioButton.click();
	Select dropdown=new Select(driver.findElement(By.id("continents")));
	//dropdown.selectByIndex(4);
	dropdown.selectByVisibleText("North America");
	if(radioButton.isSelected())
	{
		System.out.println("Selected");
	}
	else
	{
		System.out.println("Not Selected");
	}
}
}
