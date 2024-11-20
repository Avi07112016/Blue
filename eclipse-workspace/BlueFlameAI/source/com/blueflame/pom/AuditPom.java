package com.blueflame.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuditPom {

	@FindBy(xpath = "//*[@Placeholder='Enter people']")
	public WebElement EnterPpl;
	@FindBy(xpath = "//*[@class='list_box_main css-qiwyhr']")
	public WebElement Pploptions;
	@FindBy(xpath = "//span[contains(text(),'Audit')]")
	public WebElement Auditbtn;

	public AuditPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement Pploptions() {
		return Pploptions;
	}

	public WebElement EnterPpl() {
		return EnterPpl;
	}
	public WebElement Auditbtn() {
		return Auditbtn;
	}

}
