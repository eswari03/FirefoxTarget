package com.target.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Target {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.firefox.driver","./eswari/Downloads/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Successfully Launch FireFox broswer");
		
		
		driver.manage().window().maximize();
		System.out.println("Maximizing window");
		
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Implicitly waiting for driver control for 30 secs");
		
		driver.get("http://www.Target.com");
		System.out.println("Enterning URL ==> http://www.Target.com");
		
		String title = driver.getTitle();
		System.out.println("Title of the Web Page==>" +title);
		
		
		
		
		driver.quit();
	}

}
