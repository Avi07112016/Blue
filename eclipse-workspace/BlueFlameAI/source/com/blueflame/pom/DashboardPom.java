package com.blueflame.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPom {
	@FindBy(xpath = "//span[contains(text(),'Audit')]")
	public WebElement audtbtn;

	public DashboardPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement audtbtn() {
		return audtbtn;
	}
}
