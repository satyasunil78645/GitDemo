package com.TestNgTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingInTestNg {
WebDriver driver;
	@Test
	@Parameters({ "browser", "Url" })
	public void parameterPass(@Optional String browser, @Optional String Url) throws InterruptedException {
		System.out.println(browser);
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium-files\\chromedriver_win\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(Url);
		
	}
}
