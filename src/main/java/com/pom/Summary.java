package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	@FindBy(xpath="//div[@id='page']/div[2]/div/div[3]/div/p[2]/a/span")
	private WebElement btn1;

	public Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn1() {
		return btn1;
	}

}
