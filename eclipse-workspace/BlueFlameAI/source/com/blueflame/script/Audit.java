package com.blueflame.script;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.blueflame.generic.BaseE;
import com.blueflame.generic.FileLib;
import com.blueflame.pom.AuditPom;
import com.blueflame.pom.LoginPom;

public class Audit extends BaseE {

	@Test(priority = 0)

	public void Auditvalidation() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLib f = new FileLib();
		String emailname = f.getPropertyData("email");
		l.Emailfield().sendKeys(emailname);
		l.ArrowButton().click();
		String password = f.getPropertyData("pwd");
		l.pwd().sendKeys(password);
		l.lginbtn().click();
		AuditPom Adt = new AuditPom(driver);
		Adt.Auditbtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(Adt.EnterPpl()));
		Adt.EnterPpl().click();
		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElements(Adt.Pploptions()));
		int a = options.size();
		System.out.println("Size of the list " + a);
		System.out.println("Available dropdown options:");
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }
		for (int i = 0; i < a; i++) {
			System.out.println(options.get(i).getText());
		}
//		System.out.println("\nSelecting specific values:");
//		int[] indicesToSelect = { 0, 1, 2 };
//		for (int index : indicesToSelect) {
//			options.get(index).click();
//			System.out.println("Selected: " + options.get(index).getText());
//		}

	}

}
