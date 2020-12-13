package com.Frames.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			driver.switchTo().frame("moneyiframe");
			WebElement search=driver.findElement(By.id("query"));
			Thread.sleep(10000);
			search.sendKeys("Infy");
			Thread.sleep(10000);
			WebElement click=driver.findElement(By.className("getqbtn"));
			click.click();
	}

}
