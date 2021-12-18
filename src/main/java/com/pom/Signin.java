package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public WebDriver driver;
	@FindBy(id="email")
	private WebElement email;

	public Signin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}
@FindBy(id="passwd")
private WebElement password;

public WebElement getPassword() {
	return password;
}
@FindBy(xpath="//div[@id='center_column']/div/div[2]/form/div/p[2]/button/span")
private WebElement signin;

public WebElement getSignin() {
	return signin;
}

}

