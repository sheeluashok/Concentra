package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="email") private WebElement emTB;
	public void setemail(String em)
	{
		emTB.sendKeys(em);
		
	}
	@FindBy(id="pass") private WebElement pwdTB;
	public void setpwd(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}

	@FindBy(id="u_0_b")private WebElement loginBtn;
	public void clickloginbtn()
	{
		loginBtn.click();
	}
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
		
	}

