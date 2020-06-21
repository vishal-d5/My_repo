package FullSite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadsPage extends CommonMethods{
	
	//Check Main Navigation
	
	
	@Test(priority=0)
	public void chkMainNavigationTxt() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		String actTxt=chkTextXpath(driver,"//li[text()='MAIN NAVIGATION']");
		//String actTxt=driver.findElement(By.xpath("")).getText();
		String expTxt=expected("MAIN NAVIGATION");
		Assert.assertEquals(actTxt, expTxt);
	}

	
	//Check on Downloads table Heading
	
	@Test(priority=1)
	public void chkDwnTbl()
	{
		ArrayList<String> expHd=new ArrayList<>();
		expHd.add("Sr");
		expHd.add("Name");
		expHd.add("vendor");
		expHd.add("Version");
		expHd.add("32bit");
		expHd.add("64bit");
		expHd.add("Common");
		//expHd.add("*For prevoius and latest releases");
		
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		List <WebElement> listElements=tagNm(driver,"th");
		ArrayList<String> actHd=new ArrayList<>();
		for(WebElement we:listElements)
		{
			System.out.println(we);
			actHd.add(we.getText());
		}
		Assert.assertEquals(actHd, expHd);
		
	}
	
	//check JDK 32bit Link
	
	@Test(priority=2)
	public void Jdk32bitLnk() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		button(driver,"//a[@href='../downloads/jdk-8u45-windows-i586.exe']");
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/jdk-8u45-windows-i586.exe");
		Assert.assertEquals(actUrl,expUrl);
	}
	
	//Check Google Chrome Link
	
	@Test(priority=3)
	public void chkGChromeLink() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		button(driver,"//a[@href='../downloads/GoogleChromeStandaloneEnterprise.exe']");
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/GoogleChromeStandaloneEnterprise.exe");
		Assert.assertEquals(actUrl, expUrl);
		
	}
	
	//Check Mozilla Firefox Link
	
	@Test(priority=4)
	public void chkMozFirefoxLnk() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		button(driver,"//a[@href='../downloads/Firefox Setup 69.0b14 32bit.exe']");
		
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/Firefox%20Setup%2069.0b14%2032bit.exe");
		Assert.assertEquals(actUrl, expUrl);
		
	}
	
	//Check Gecko driver Link
	
	@Test(priority=5)
	public void chkGeckoLnk() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		button(driver,"//a[@href='../downloads/geckodriver32bit.exe']");
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/geckodriver32bit.exe");
		Assert.assertEquals(actUrl, expUrl);
			
	}
	
	//Check JDK 64 bit Link
	
	@Test(priority=6)
	public void chkJdk64bitLnk() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		button(driver,"//a[@href='../downloads/jdk-8u211-windows-x64.exe']");
		
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/jdk-8u211-windows-x64.exe");
		Assert.assertEquals(actUrl, expUrl);
		
	}
	
	
	//Check Googlechrome 64bit Link
	
	@Test(priority=7)
	public void chkChrome64Lnk() {
		enterTextID(driver,"email","kiran@gmail.com");
		enterTextID(driver, "password", "123456");
		button(driver,"//button");
		button(driver,"//span[text()='Downloads']");
		
		button(driver,"//a[@href='../downloads/GoogleChromeStandaloneEnterprise64.exe']");
		
		String actUrl=getUrl(driver);
		String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/GoogleChromeStandaloneEnterprise64.exe");
		Assert.assertEquals(actUrl, expUrl);	
	}
	
	//Check Mozilla firefox 64bit link
	
	 @Test(priority=8)
	 public void chkFirefox64Lnk() {
		 	enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
			
			button(driver,"//a[@href='../downloads/Firefox Setup 69.0b14 64bit.exe']");
			
			String actUrl=getUrl(driver);
			String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/Firefox%20Setup%2069.0b14%2064bit.exe");
			Assert.assertEquals(actUrl, expUrl);
			
	 }
	 
	 //check Gecko 64bit Link
	 
	 @Test(priority=9)
	 public void chkGecko64Lnk() {
		 enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");		
			button(driver,"//a[@href='../downloads/geckodriver64bit.exe']");			
			String actUrl=getUrl(driver);
			String expUrl=expected("file:///E:/JAVABYKIRAN/AdminLTE/pages/downloads/geckodriver64bit.exe");
			Assert.assertEquals(actUrl, expUrl);
			
	 }
	 
	 //check JDK Official Link
	 
	 @Test(priority=10)
	 public void chkJdkOfficialLnk() {
		 	enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
	 		button(driver,"//a[@href='https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html']");
	 		//waitDriver(wait,"https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html");
	 		ArrayList <String>newtab=new ArrayList<>(getWinHandles(driver));
	 		newtab.remove(oldtab);
	 		driver.switchTo().window(newtab.get(0));
	 		String actUrl=getUrl(driver);
	 		String expUrl=expected("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
	 		Assert.assertEquals(actUrl, expUrl);
	 		driver.close();
	 		driver.switchTo().window(oldtab);
	 }
	 
	 //Check Standalone Jar Link
	 
	 @Test(priority=11)
		public void chkStandalonJarLnk() {
		 	enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
	 		button(driver,"//a[@href='http://selenium-release.storage.googleapis.com/index.html']");
			ArrayList<String>newtab=new ArrayList<>(getWinHandles(driver));
			newtab.remove(oldtab);
			driver.switchTo().window(newtab.get(0));
			String actUrl=getUrl(driver);
			String expUrl=expected("http://selenium-release.storage.googleapis.com/index.html");
			Assert.assertEquals(actUrl, expUrl);
			driver.close();
			driver.switchTo().window(oldtab);
			
		}
	 
	 //Check Source jar Official Link
	 
	 @Test(priority=12)
	 public void chkSourceJarOfficialLnk(){
		 	enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
	 		button(driver,"//a[@href='https://seleniumhq.github.io/selenium/docs/api/java/index.html']");
			ArrayList<String>newtab=new ArrayList<>(getWinHandles(driver));
			newtab.remove(oldtab);
			driver.switchTo().window(newtab.get(0));
			String actUrl=getUrl(driver);
			String expUrl=expected("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
			Assert.assertEquals(actUrl, expUrl);
			driver.close();
			driver.switchTo().window(oldtab);
	 }
	 
	 //Check ChromeBrowser Official Link
	 
	 @Test(priority=13)
		public void chkChromeBrowserOfficialLnk() {
			enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
	 		button(driver,"//a[@href='https://cloud.google.com/chrome-enterprise/browser/download/']");
			ArrayList<String> newtab=new ArrayList<>(getWinHandles(driver));
			newtab.remove(oldtab);
			driver.switchTo().window(newtab.get(0));
			String actUrl=getUrl(driver);
			String expUrl=expected("https://cloud.google.com/chrome-enterprise/browser/download/");
			Assert.assertEquals(actUrl, expUrl);
			driver.close();
			driver.switchTo().window(oldtab);
			
		}
	 
	 //Check chromeBrowser Official Link
	 
	 @Test(priority=14)
		public void chkChromedriverOfficial() {
		 	enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
			
	 		button(driver,"//a[@href='https://chromedriver.chromium.org/downloads']");
			ArrayList<String> newtab=new ArrayList<>(getWinHandles(driver));
			newtab.remove(oldtab);
			driver.switchTo().window(newtab.get(0));
			String actUrl=getUrl(driver);
			String expUrl=expected("https://chromedriver.chromium.org/downloads");
			Assert.assertEquals(actUrl, expUrl);
			driver.close();
			driver.switchTo().window(oldtab);
		}
	 
	 //Check Mozilla Browser Official Link
	 
	 @Test(priority=15)
	 public void chkMozilaBrowserOfficial() {
		 enterTextID(driver,"email","kiran@gmail.com");
			enterTextID(driver, "password", "123456");
			button(driver,"//button");
			button(driver,"//span[text()='Downloads']");
	 		String oldtab=getWinHandle(driver);
			button(driver,"//a[@href='https://ftp.mozilla.org/pub/firefox/releases/']");	
	 	ArrayList<String> newtab=new ArrayList<>(getWinHandles(driver));
	 	newtab.remove(oldtab);
	 	driver.switchTo().window(newtab.get(0));
	 	String actUrl=getUrl(driver);
	 	String expUrl=expected("https://ftp.mozilla.org/pub/firefox/releases/");
	 	Assert.assertEquals(actUrl, expUrl);
	 	driver.close();
	 	driver.switchTo().window(oldtab);
	 	
	 }
}
