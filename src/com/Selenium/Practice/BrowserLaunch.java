package com.Selenium.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.moneycontrol.com/");
		Actions actions = new Actions(driver);
//		action.sendKeys(keys)
	
		Thread.sleep(20);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		/*
		 * robot.keyRelease(KeyEvent.VK_L); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 */
		
//		  robot.keyRelease(KeyEvent.VK_CONTROL);
//		  actions.keyDown(Keys.CONTROL).sendKeys("L").keyUp(Keys.CONTROL).perform();
//		  actions.sendKeys(Keys.ENTER);
		 
//		driver.close();
		//	driver.get("https://www.moneycontrol.com/india/stockpricequote/computers-software/infosys/IT/");
/*		String Url = driver.getCurrentUrl();
		System.out.println("Url = "+Url);

		System.out.println("---------------------------------------------------------");

		String title=driver.getTitle();
		System.out.println("Title Name = "+title);
		System.out.println("---------------------------------------------------------");

		String ps=driver.getPageSource();
		System.out.println("page source = "+ps);

		System.out.println("---------------------------------------------------------");
*/
		/*
		  WebElement FindElement(); 
		  List<webElement> FindElement(); 
		  String getWindowHandle();
		  Set<String> getWindowHandle();
		 */
	}
}
