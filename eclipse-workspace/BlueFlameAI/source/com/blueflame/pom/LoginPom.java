package com.blueflame.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
		public WebElement Emailfield;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement ArrowButton;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement pwd;
	
	public LoginPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Emailfield() {
		return Emailfield;
	}
	public WebElement ArrowButton() {
		return ArrowButton;
	}
	public WebElement pwd() {
		return pwd;
	}
	

}
