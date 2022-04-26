package com.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class PojoClass2 extends Base {

	public PojoClass2() {

		PageFactory.initElements(driver, this);

	}
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	@CacheLookup
	private WebElement username;

	public WebElement getUsername() {
		return username;

	}
	
	
	
	

	

}
