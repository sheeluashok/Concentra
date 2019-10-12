package com.facebook.testscripts;

import com.facebook.generic.lib.BaseTest;

public class FbValidLogin extends BaseTest {
	public static void main(String[] args) throws Throwable {
		
		BaseTest bt= new BaseTest();
		//bt.openBrowser();
		//verify Loginpage
		String welcomeTitle=bt.openBrowser();
		System.out.println(welcomeTitle);
		if(welcomeTitle.equals("Facebook – log in or sign up"))
		{
			//verify homepage
		  bt.logintoApp();

		}
		  bt.closeBrowser();
		
	}

}
