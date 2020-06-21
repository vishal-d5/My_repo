package FullSite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardHomePage extends CommonMethods {

	// Check DashBoardLink

	@Test(priority = 1)
	public void chkDashBoardPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='Dashboard']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/dashboard.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check Users Link

	@Test(priority = 2)
	public void chkUsrPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='Users']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/users.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check OperatorLink

	@Test(priority = 3)
	public void chkOperatorPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='Operators']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/operators.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check UserfulLink

	@Test(priority = 4)
	public void chkUserLinkPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='     Useful Links']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/links.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check Downloads Link

	@Test(priority = 5)
	public void chkDownPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='Downloads']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/downloads.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check LogOut Link

	@Test(priority = 6)
	public void chkLogoutPage() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		button(driver, "//span[text()='Logout']");
		String actTitle = getUrl(driver);
		String expTitle = expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/logout.html");
		Assert.assertEquals(actTitle, expTitle);
	}

	// Check JavaByKiran Link

	@Test(priority = 7)
	public void chkLinkJbk() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		String oldtab = getWinHandle(driver);
		LinkClick(driver, "JavaByKiran");
		ArrayList<String> newtab = new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl = getUrl(driver);
		String expUrl = expected("https://www.javabykiran.com/");
		driver.close();
		driver.switchTo().window(oldtab);
		Assert.assertEquals(actUrl, expUrl);
	}

	// Check Headings

	@Test(priority = 8)
	public void chkHeadings() {
		
		ArrayList<String> expHeadings = new ArrayList<>();
		expHeadings.add("Selenium");
		expHeadings.add("Java / J2EE");
		expHeadings.add("Python");
		expHeadings.add("Php");
		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		List<WebElement> listElements = tagNm(driver, "h3");
		ArrayList<String> actHeadings = new ArrayList<>();
		for (WebElement we : listElements) {
			// System.out.println(we.getText());
			actHeadings.add(we.getText());
		}
		Assert.assertEquals(actHeadings, expHeadings);
	}
	
	//Check All Span
	
	@Test(priority = 9)
	public void chkSpanHomePage() {
		ArrayList<String> expSpan = new ArrayList<>();
		expSpan.add("");
		expSpan.add("Java By Kiran");
		expSpan.add("Dashboard");
		expSpan.add("Users");
		expSpan.add("Operators");
		expSpan.add("Useful Links");
		expSpan.add("Downloads");
		expSpan.add("Logout");
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		List<WebElement> listElements = tagNm(driver,"span");
		ArrayList<String> actSpan = new ArrayList<>();
		for (WebElement we : listElements) {
			actSpan.add(we.getText());
		}
		Assert.assertEquals(actSpan, expSpan);
	}
	

	// Check Selenium LinkUrl PDF

	@Test(priority = 10)
	public void chkSeleniumLinkUrl() {

		enterTextID(driver, "email", "kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver, "//button");
		String oldtab = getWinHandle(driver);
		button(driver, "//a[text()='More info ']");
		ArrayList<String> newTab = new ArrayList<>(getWinHandles(driver));
		newTab.remove(oldtab);
		driver.switchTo().window(newTab.get(0));

		String actUrl = getUrl(driver);
		String expUrl = "file:///E:/JAVABYKIRAN/AdminLTE/pages/pdf/selenium-testing-syllabus-jbk.pdf";
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
	}
	
	//Check Java / J2EE Link PDF
	
	@Test(priority=11)
	public void chkLnkJavaj2ee()
	{
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		String oldtab=getWinHandle(driver);
		button(driver,"//a[@href='../pdf/java-j2ee-syllabus-jbk.pdf']");
		ArrayList <String>newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String acturl=getUrl(driver);
		String expurl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		Assert.assertEquals(acturl, expurl);
		driver.close();
		driver.switchTo().window(oldtab);
	
	}
	
	//Check Python Link PDF
	
	@Test(priority=12)
	public void chkPython() {
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		String oldtab=getWinHandle(driver);
		button(driver,"//a[@href='../pdf/python-syllabus.pdf']");
		ArrayList<String>newtab=new  ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String acturl=getUrl(driver);
		String expurl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/pdf/python-syllabus.pdf");
		Assert.assertEquals(acturl,expurl);
		driver.close();
		driver.switchTo().window(oldtab);
		
	}
	
	//Check Php Link
	
	@Test(priority=13)
	public void chkPhpLink() {

		 enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
		driver.findElement(By.xpath("//a[@href='#' and @class='small-box-footer']")).click();
		button(driver,"//a[@href='#' and @class='small-box-footer']");
		String oldtab=getWinHandle(driver);
		ArrayList <String> newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String  expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/examples/dashboard.html#");
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
		driver.close();
		
		
		
	}
	
	
}
