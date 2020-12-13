package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	private static List<WebElement> li=null;
	public static String mytext="Merchandise;Park Tickets;Express Passes;Deals & Specials;Hotels;Annual Passes;Vacation Packages;Merchandise1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.universalorlando.com/web/en/us");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.xpath("//*[contains(@link-title,'Utility Links')]"));
		for(WebElement ele:li) {
			String s=ele.getText();
		System.out.println(s);
		}

	}
}
