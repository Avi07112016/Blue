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
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	
	@BeforeTest
	public void OpenBrowsder() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
	}
//	@AfterTest
//	public void closeBrowser() {
//	Reporter.log("closeBrowser",true);	
//	driver.quit();
//	}

	@BeforeMethod
	public void Login() throws IOException {
		FileLib f=new FileLib();
		LoginPom l=new LoginPom(driver);
		String email = f.getPropertyData("email");
		l.Emailfield().sendKeys(email);
		String printemail = l.Emailfield().getAttribute("value");
		System.out.println(printemail);
		
		l.ArrowButton().click();
		String pswrd=f.getPropertyData("pwd");
		l.pwd().sendKeys(pswrd);
		String printpwd=l.pwd().getAttribute("value");
		System.out.println(printpwd);
		org.testng.Assert.assertEquals(pswrd, printpwd);
		org.testng.Assert.assertEquals(email, printemail);
	
		
	}
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

//		@AfterClass
//		public void CloseBrowser() {
//			driver.quit();
//		}
	

//	}
}
