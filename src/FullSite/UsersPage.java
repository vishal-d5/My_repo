package FullSite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersPage extends CommonMethods {
	
	//Check AddUser->Cancel-Button
	
	@Test(priority = 1)
	public void ADDUsrCancelbtn() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		button(driver,"//button[text()='Add User']");
		button(driver,"//span[text()='Cancel']");
		String actUrl = getUrl(driver);
		String expUrl = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/users.html");
		AssertJUnit.assertEquals(actUrl, expUrl);
	}
	
	//Check AddUser->JBK Link
	
	@Test(priority = 2)
	public void chkadduserJbkLink() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		button(driver,"//button[text()='Add User']");
		LinkClick(driver,"JBK");
		String actUrl = getUrl(driver);
		String expUrl = expected("http://jbk.com/");
		AssertJUnit.assertEquals(actUrl, expUrl);
	}
	
	//Check Table Headings
	
	@Test(priority = 3)
	public void chkTblHeading() {
		
		ArrayList<String> exptblHd = new ArrayList<>();
		exptblHd.add("#");
		exptblHd.add("Username");
		exptblHd.add("Email");
		exptblHd.add("Mobile");
		exptblHd.add("Course");
		exptblHd.add("Gender");
		exptblHd.add("State");
		exptblHd.add("Action");
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		List<WebElement> listElement = tagNm(driver,"th");
		ArrayList<String> acttblHd = new ArrayList<>();
		for (WebElement we : listElement) {
			acttblHd.add(we.getText());
		}
		AssertJUnit.assertEquals(acttblHd, exptblHd);
	}
	
	//Check Lables Clicking on AddUser
	
	@Test(priority = 4)
	public void chkLable() {
		ArrayList<String> expLble = new ArrayList<>();
		expLble.add("Username");
		expLble.add("Mobile");
		expLble.add("Email");
		expLble.add("Courss");
		expLble.add("Gender");
		expLble.add("State");
		expLble.add("Password");
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		button(driver,"//button[text()='Add User']");
		List<WebElement> listElement = tagNm(driver,"label");
		ArrayList<String> actLble = new ArrayList<>();
		for (WebElement we : listElement)
			

		{
			System.out.println(we.getText());
			if (!we.getText().equals("")) {
				actLble.add(we.getText());
			}
			
		}
		AssertJUnit.assertEquals(actLble, expLble);
	}
	
	//Check HomeLink UserPage
	
	@Test(priority = 5)
	public void chkHomeLnkUsrPage() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		button(driver,"//a[@href='#']");
		String actUrl = getUrl(driver);
		String expUrl =expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/users.html#");
		Assert.assertEquals(actUrl, expUrl);
	}
	
	//Check AlertSubmit on textbox
	
	
	@Test(priority = 6)
	public void chkAlertSubmit() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Users']");
		button(driver,"//button[text()='Add User']");
		button(driver,"//button");
		String alt = altCatch(driver);
		String alt1 = expected("Please fill out this field");
		Assert.assertEquals(alt, alt1);
	}
	
	
	//Check Operators Link
	
	
	@Test(priority = 7)
	public void chkOprtrTbl() {
		ArrayList<String> expHead = new ArrayList<>();
		expHead.add("ID");
		expHead.add("Person");
		expHead.add("For");
		expHead.add("Prefered Way to Connect");
		expHead.add("Contact");
		expHead.add("Timings");
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Operators']");
		List<WebElement> ListElement = tagNm(driver,"th");
		ArrayList<String> actHead = new ArrayList<>();
		for (WebElement we : ListElement) {
			actHead.add(we.getText());
		}
		Assert.assertEquals(actHead, expHead);
	}
	

	
	
	
	

}
