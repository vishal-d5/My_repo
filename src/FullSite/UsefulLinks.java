package FullSite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsefulLinks extends CommonMethods {

	// Check Table Headings	
	
	@Test(priority = 1)
	public void chkUsrLnkTbl(){
		ArrayList <String> expHd=new ArrayList<>();
		expHd.add("Sr");
		expHd.add("Content");
		expHd.add("Click");
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		List<WebElement> listElement = tagNm(driver,"th");
		ArrayList <String> actHd=new ArrayList<>();
		for(WebElement we:listElement)
		{
			actHd.add(we.getText());
		}
		Assert.assertEquals(actHd, expHd);
	}
	
	//Check Schedule Link
	
	
	@Test(priority=2)
	public void chkScheduleLnk()
	{
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		
		button(driver,"//a[@href='https://www.javabykiran.com/news']");
		ArrayList<String>newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/news");
		
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
		
	}
	
	//Check Video Lactures All Topics Link
	
	@Test(priority=3)
	public void chkVideo() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		button(driver,"//a[@href='https://www.javabykiran.com/java-by-kiran-videos']");
		
		ArrayList<String> newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/java-by-kiran-videos");
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
	}
	
	//Check Selenium Interview Questions Link
	
	@Test(priority=4)
	public void selInterQues() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		button(driver,"//a[@href='https://www.javabykiran.com/selenium-testing-interview-question-answer']");
		
		ArrayList <String> newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/selenium-testing-interview-question-answer");
		Assert.assertEquals(actUrl,expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
	}
	
	//Check Java Interview Questions Link
	
	@Test(priority=5)
	public void chkJavaIntQuesLink() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		
		button(driver,"//a[@href='https://www.javabykiran.com/core-java-interview-question-answer']");
		driver.switchTo().window(oldtab);
		ArrayList <String> newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/core-java-interview-question-answer");
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
		
	}
	
	// Check Courses Link
	
	@Test(priority=6)
	public void chkCoursesLink() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		
		button(driver,"//a[@href='https://www.javabykiran.com/courses']");
		
		ArrayList <String> newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/courses");
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
	}
	
	//Check Placement Link
	
	@Test(priority=7)
	public void chkPlacementLink() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='     Useful Links']");
		String oldtab=getWinHandle(driver);
		
		button(driver,"//a[@href='https://www.javabykiran.com/placement']");
		
		ArrayList <String>newtab=new ArrayList<>(getWinHandles(driver));
		newtab.remove(oldtab);
		driver.switchTo().window(newtab.get(0));
		String actUrl=getUrl(driver);
		String expUrl=expected("https://www.javabykiran.com/placement");
		Assert.assertEquals(actUrl, expUrl);
		driver.close();
		driver.switchTo().window(oldtab);
	}
}
