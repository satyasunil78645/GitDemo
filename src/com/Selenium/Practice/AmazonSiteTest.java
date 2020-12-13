package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonSiteTest {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium-files\\geckodriver_win_32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get("http://webapps.tekstac.com/Cargo_Shipping_Cost/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("fast");
		Thread.sleep(3000);
		Actions a=new Actions(driver); 
		for(int i=1;i<4;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
		}	



	}
}

