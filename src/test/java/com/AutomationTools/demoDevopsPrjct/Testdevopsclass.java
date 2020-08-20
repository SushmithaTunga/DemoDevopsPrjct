package com.AutomationTools.demoDevopsPrjct;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import acRequest.driver;

public class Testdevopsclass {
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver","E:\\Backup From UL\\SeleniumDriverNew\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
		public void Test1()
		{
		driver.navigate().to("www.Automationtalks.com");	
		

}}