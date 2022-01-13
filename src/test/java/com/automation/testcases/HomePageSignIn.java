package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.HomePageRegisterObjects;
import com.automation.pages.HomePageSignInPageObjects;

public class HomePageSignIn extends BaseClass{
	
	public HomePageSignIn(WebDriver driver) {
        this.driver = driver;
	}
	@Test
	public void f()
	{
	Reporter.log("Welcome to DSAlgo Register link click Test Case");
	}

	@Test
	public void clickSignInLink() throws InterruptedException
	{
	//To get the page title
	Reporter.log("Page url : " +driver.getTitle());

	Thread.sleep(1000);
	//Abstraction is showing the essential features and hiding the background details

	//To create instance of the Login Page Objects class
	HomePageSignInPageObjects homeSignInPO = PageFactory.initElements(driver, HomePageSignInPageObjects.class);
	homeSignInPO.signInLink();

	Thread.sleep(1000);

	}
}
