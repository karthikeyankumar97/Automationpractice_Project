package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='columns']/div[3]/div/form/p/button/span")
	private WebElement btn2;

	

	public Address(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getBtn2() {
		return btn2;
	}
	

	
}
	
