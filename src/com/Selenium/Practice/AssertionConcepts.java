package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionConcepts {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement Amazonlogo=driver.findElement(By.xpath("//*[@id='nav-logo']/a[1]"));
	Amazonlogo.click();	
	boolean as=true;
boolean logostatus=Amazonlogo.isEnabled();
System.out.println(logostatus);
Assert.assertEquals(as,logostatus);

}
}