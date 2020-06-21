package FullSite;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CommonMethods {

	WebDriver driver;
	WebDriverWait wait;
	
	public void enterTextID(WebDriver	driver,String id,String data) {
		driver.findElement(By.id(id)).sendKeys(data);
	}
	
	
	public void enterTextXPATH(WebDriver	driver,String xpath,String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}
	public String expected(String index )
	{
		
		return index;
	}
	public String expected1(String index )
	{
		
		return index;
	}
	public void LaunchUrl(WebDriver driver,String index) {
		driver.get(index);
		}
	public String getUrl(WebDriver	driver) {
		return  driver.getCurrentUrl();
	}
	public String geTitle(WebDriver driver) {
		return driver.getTitle();
	}
	public void button(WebDriver driver,String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	public String chkTextXpath(WebDriver diver,String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public String chkTextId(WebDriver driver,String id) {
		return driver.findElement(By.id(id)).getText();
	}
	public String altCatch(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public void LinkClick(WebDriver driver,String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public List<WebElement> tagNm(WebDriver driver,String tagName) {
		return driver.findElements(By.tagName(tagName));
	}
	public String getWinHandle(WebDriver driver) {
		
		return driver.getWindowHandle();
		
	} 
	public Set<String> getWinHandles(WebDriver driver) {
		
		return driver.getWindowHandles();
		
	}
	public String WaterMark(WebDriver driver,String id,String Attribute) {
		 return driver.findElement(By.id(id)).getAttribute(Attribute);
	}
	/*public List<WebElement> WaterMark1(WebDriver driver,String id,String Attribute) {
		 return driver.findElements(By.id(id)).getAttribute(Attribute);
	}*/
	

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LaunchUrl(driver,"file:///E:/JAVABYKIRAN/AdminLTE/index.html");
		//wait=new WebDriverWait(driver,30);
		
	}
	
	public void waitDriver(WebDriverWait wait,String Xpath) {
		
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath))).click();
	}
	/*public void waitDriverArray(WebDriverWait wait,ArrayList<String> Xpath) {
		
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath))).click();
		}*/

}
