package FullSite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_RegistrationPage extends CommonMethods {

	// Check Title of LoginPage

	@Test(priority = 0)
	public void chkTitle() {

		String actTitle = geTitle(driver);
		String expTitle = expected("JavaByKiran | Log in");
		//System.out.println(expTitle);
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check Text on LoginBox
	
	@Test(priority=1)
	public void chkWaterMarkLoginPage() {
		
		String data=WaterMark(driver,"email","placeholder");
		String data1=WaterMark(driver,"password","placeholder");
		Assert.assertEquals(data+data1,"Email"+"Password");
		
	}

	

	@Test(priority = 2)
	public void chkLoginBoxTxt() {

		String actMsg = chkTextXpath(driver, "//p[text()='Sign in to start your session']");
		String expMsg = expected("Sign in to start your session");
		Assert.assertEquals(actMsg, expMsg);
	}

	// Check Register Link Available or not

	@Test(priority = 3)
	public void chklinkRegister() {

		String getActLink = chkTextXpath(driver, "//a[text()='Register a new membership']");
		String getExpLink = expected("Register a new membership");
		Assert.assertEquals(getActLink, getExpLink);
	}

	// Check Empty Username Password

	@Test(priority = 4)
	public void emptyUsrPass() {

		enterTextID(driver, "email", "");
		enterTextID(driver, "password", "");
		button(driver, "//button");
		String UsrErrMsg = chkTextId(driver, "email_error");
		String PasErrMsg = chkTextId(driver, "password_error");
		String ErrorEmMsg = expected("Please enter email.");
		String ErrorPwdMsg = expected1("Please enter password.");
		Assert.assertEquals(UsrErrMsg + PasErrMsg, ErrorEmMsg + ErrorPwdMsg);
	}

	// Check InValid Username Password

	@Test(priority = 5)
	public void chkInVldUsr() throws InterruptedException {

		enterTextID(driver, "email", "K@gmail.com");
		enterTextID(driver, "password", "123");
		button(driver, "//button");
		String UsrErrMsg = chkTextId(driver, "email_error");
		String PasErrMsg = chkTextId(driver, "password_error");
		String ErrorEmMsg = expected("Please enter email as kiran@gmail.com");
		String ErrorPwdMsg = expected1("Please enter password 123456");
		Assert.assertEquals(UsrErrMsg + PasErrMsg, ErrorEmMsg + ErrorPwdMsg);
	}

	// Check Valid Username Password
	@Test(priority = 6)
	public void chkVldUsrPas() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		String actTitle = geTitle(driver);
		String ExpTitle = expected("JavaByKiran | Dashboard");
		Assert.assertEquals(actTitle, ExpTitle);
	}

	// Check Registration Page available or not

	@Test(priority = 7)
	public void chkRegistrPage() {

		button(driver, "//a[text()='Register a new membership']");
		String actTitle = geTitle(driver);
		String ExpTitle = expected("JavaByKiran | Registration Page");
		Assert.assertEquals(actTitle, ExpTitle);

	}

	// Check Registration

	@Test(priority = 8)
	public void chkRegistration() {

		button(driver, "//a[text()='Register a new membership']");
		enterTextID(driver, "name", "Vishal");
		enterTextID(driver, "mobile", "9730979757");
		enterTextID(driver, "email", "vishal@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");

		String alt = altCatch(driver);
		String alt1 = expected("User registered successfully.");
		Assert.assertEquals(alt, alt1);

	}
	
	//Registration Page Message
	
	@Test(priority = 9)
	public void RgstrPgeMsg() {
		
		button(driver,"//a[text()='Register a new membership']");
		String str=chkTextXpath(driver,"//a[text()='I already have a membership']");
		String str1 =expected( "I already have a membership");
		Assert.assertEquals(str, str1);
	}
	
	
	//Check LogOut Button

	@Test(priority = 10)
	public void chkLogOutMsg() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver,"password","123456");
		
		button(driver,"//button");
		button(driver,"//a[text()='LOGOUT']");
		String str=	chkTextXpath(driver,"//p[text()='Logout successfully']");
		
		String str2 =expected("Logout successfully");
		Assert.assertEquals(str, str2);
	}
}
