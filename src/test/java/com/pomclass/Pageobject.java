package com.pomclass;

import org.openqa.selenium.WebElement;

import com.baseclasscrt.Baseclass;

public class Pageobject extends Base {
	public static void main(String[] args) {

		Browserlaunch();
		loadurl("https://www.facebook.com/");
		Base b=new Base();

		PojoClass2 p=new PojoClass2();
		WebElement username = p.getUsername();
		username.sendKeys("mohan");
	     	b.refresh();
		username.sendKeys("mohan@1234");
		
	
	}


}
