package com.TestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
 WebDriver driver;
 
 @BeforeMethod
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 @Test
 public void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping", "Title matching has failed.");
 }
 @Test
 public void signIn() {
	 WebElement signButton= driver.findElement(By.xpath("//p[@id='signin_info']//a[text()='Sign in']"));
	 boolean status=signButton.isDisplayed();
	 Assert.assertTrue(status,"It is not diplaing");
 }
 @AfterMethod
 public void quit() {
	 driver.quit();
 }

}
