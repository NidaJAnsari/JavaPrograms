package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String args[])
	{
System.setProperty("webdriver.chrome.driver" , "C:\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.testyou.in/Login.aspx");
//driver.navigate().to("http://www.testyou.in/Login.aspx");
System.out.println(driver.getTitle());
System.out.println(driver.findElement(By.xpath("/html/body/form/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/div[3]/div[1]/span")).getText());
driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("xyz@gmail.com");
driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("1235");


driver.findElement(By.id("ctl00_CPHContainer_btnLoginn")).submit();
WebElement checkbox=driver.findElement(By.id("ctl00_CPHContainer_chkRememberMe"));
checkbox.click();

if(checkbox.isSelected())
{
	System.out.println("Stay Signed In-Selected ");
	
}
else
{
	System.out.println("Stay Signed In-Not Selected ");
}
}
}
