
/*package com.Selenium.Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor{                    //DO NOT Change the class name
    public static WebDriver driver;
    public static String result1;       //Store the message displayed on the page after submit
    public static String result2;
    public static String Url = "http://webapps.tekstac.com/Cargo_Shipping_Cost/";
    public static String weight = "200";
    public static String mode = "road";
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Url);
        Thread.sleep(2000);
        WebElement eleWeight = driver.findElement(By.id("weight"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='200'", eleWeight); 
        //js.executeScript("document.getElementById('weight').value='"+weight+"';");
        js.executeScript("document.getElementById(\'" + mode  + "\').click();");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('calculate').click();");
        // String result1 = js.executeScript("return document.getElementById('result').innerHTML;").toString();
        driver.close();
  
    }
   
}*/
/*
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("satyasunil78645");
		driver.findElement(By.id("password")).sendKeys("Sunil@123");
		driver.findElement(By.xpath("//*[@class='floatL']/input[1]")).click();
		Thread.sleep(3000);
		List<WebElement> mailcount=driver.findElements(By.xpath("//*[@class='rd_ml']/li"));
		int value=mailcount.size();
		System.out.println(value);
		for(WebElement mail:mailcount) {
			String s1=mail.getText();
			System.out.println(s1);
			WebElement selectmail=mail.findElement(By.xpath("//*[contains(text(),'Rediff Shopping')]"));
			selectmail.click();
		}
	}
*/

