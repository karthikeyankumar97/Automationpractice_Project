package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public My_Store(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
@FindBy(xpath="//a[@title='T-shirts']")
private WebElement Tshirt;

public WebElement getTshirt() {
	return Tshirt;
}
}
