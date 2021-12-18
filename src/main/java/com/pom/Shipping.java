package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
	@FindBy(id="uniform-cgv")
	private WebElement agree;

	public Shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAgree() {
		return agree;
	}
	@FindBy(xpath="//form[@id='form']/p/button/span")
	private WebElement btn3;

	public WebElement getBtn3() {
		return btn3;
	}

}
