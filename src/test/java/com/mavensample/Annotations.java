package com.mavensample;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Annotations {
	

	    @Test
		public void Login() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement user = driver.findElement(By.id("email"));
			user.sendKeys("Mohan");
	String attribute = user.getAttribute("value");
	
			System.out.println(attribute);
			Assert.assertFalse(attribute.equals("tinku"));
			
		driver.quit();
		}
		@Test
		public void test() {

			System.out.println("tsest1");
			
		}
		
	


}
