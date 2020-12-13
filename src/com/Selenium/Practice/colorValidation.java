package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class colorValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement eleSearch = driver.findElement(By.xpath("//*[@class='nav-searchbar']//div[2]//div"));
		String rgbFormat = eleSearch.getCssValue("background-color");
		System.out.println(rgbFormat); //In RGB Format the value will be print => rgba(254, 189, 105, 1)
		String hexcolor = Color.fromString(rgbFormat).asHex(); //converted Into HexFormat
		System.out.println(hexcolor);// Output of Hex code will be  => #febd69
						
	}

}
