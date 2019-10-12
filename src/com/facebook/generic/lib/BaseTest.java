package com.facebook.generic.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.pages.Loginpage;

public class BaseTest implements AutoConsts{
	
	 public static WebDriver driver;
	 Filelib flib=new Filelib();
	 Loginpage lp;
	 
	 
	 public String openBrowser() throws Throwable
	 {
		String browservalue = flib.getPropertyKeyValue(PROP_PATH, "browser");
		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver =new ChromeDriver();
		}
		else if(browservalue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("enter correct Browser");
		}
		driver.get(flib.getPropertyKeyValue(PROP_PATH, "url"));
		return driver.getTitle();
	 }
	 
	 public void logintoApp() throws Throwable
	 {
		 lp=new Loginpage(driver);
		 Thread.sleep(2000);
		 lp.setemail(flib.getPropertyKeyValue(PROP_PATH, "username"));
		 lp.setpwd(flib.getPropertyKeyValue(PROP_PATH, "password"));
		 lp.clickloginbtn();
		 Thread.sleep(2000); 
	 }
	 
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
	 

}
