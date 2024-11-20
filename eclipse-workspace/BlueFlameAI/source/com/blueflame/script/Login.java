package com.blueflame.script;

import java.io.IOException;

import org.testng.annotations.Test;

import com.blueflame.generic.BaseE;
import com.blueflame.generic.FileLib;
import com.blueflame.pom.AuditPom;
import com.blueflame.pom.DashboardPom;
import com.blueflame.pom.LoginPom;

public class Login extends BaseE {

	@Test(priority = 1)
	public void ValidLogin() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLib f = new FileLib();
		String emailname = f.getPropertyData("email");
		l.Emailfield().sendKeys(emailname);
		l.ArrowButton().click();
		String password = f.getPropertyData("pwd");
		l.pwd().sendKeys(password);
		l.lginbtn().click();
		DashboardPom d = new DashboardPom(driver);
		d.audtbtn().click();
		AuditPom a = new AuditPom(driver);
		a.EnterPpl.click();
		
	}
}
