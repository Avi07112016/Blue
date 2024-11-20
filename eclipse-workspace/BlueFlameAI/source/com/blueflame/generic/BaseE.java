package com.blueflame.generic;

import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.blueflame.pom.LoginPom;

import dev.failsafe.internal.util.Assert;

public class BaseE {

	public WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@BeforeClass
	public void OpenBrowsder() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
	}

//	@BeforeClass
//	public void ValidLogin() throws IOException {
//		LoginPom l = new LoginPom(driver);
//		FileLib f = new FileLib();
//		String emailname = f.getPropertyData("email");
//		l.Emailfield().sendKeys(emailname);
//		String password = f.getPropertyData("pwd");
//		l.pwd().sendKeys(password);
//		l.ArrowButton().click();
//	}
//	@AfterMethod
//	public void logOut(){
//	}

//	@BeforeClass
//	public void OpenBrowser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		FileLib f=new FileLib();
//		driver.get(f);
//		LoginPom l = new LoginPom(driver);
//		l.Emailfield().sendKeys("dev+webskitters@blueflame.ai");
//		l.ArrowButton().click();

		@AfterClass
		public void CloseBrowser() {
			driver.quit();
		}
}
