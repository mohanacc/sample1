package com.mavensample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenSample {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.id("pass")).sendKeys("hello@1234");
	driver.findElement(By.xpath("//button[@value='1']")).click();
		
	
		
		
		
		
		
	}
	
	
	
	

}
