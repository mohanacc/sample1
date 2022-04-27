package com.baseclasscrt;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junitbase {

	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	private void m1() {
		System.out.println("ni");

	}
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	@Test
	public void Login() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Mohankumar06");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("mohan@1234");
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
	}


	@Before
	public void Before() {
		long i = System.currentTimeMillis();
		System.out.println(i);
	}
	@After
	public void After() {
		long i = System.currentTimeMillis();
		System.out.println(i);
	}


}
