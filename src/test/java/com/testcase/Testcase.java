package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase {
	
	@Test
	public static void launchBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
	}

}
