package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.pages.LoginPageObjects;
import org.testng.annotations.Test;
import com.automation.utility.BrowserFactory;
import com.automation.pages.BaseClass;
import com.automation.pages.HomePageRegisterObjects;
import com.automation.pages.LoginPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePageRegister extends BaseClass{
	
	public HomePageRegister(WebDriver driver) {
        this.driver = driver;
	}
	@Test
	public void f()
	{
	Reporter.log("Welcome to DSAlgo Register link click Test Case");
	}

	@Test
	public void clickRegisterLink() throws InterruptedException
	{
	//To get the page title
	Reporter.log("Page url : " +driver.getTitle());

	Thread.sleep(5000);
	//Abstraction is showing the essential features and hiding the background details

	//To create instance of the Login Page Objects class
	HomePageRegisterObjects homePO = PageFactory.initElements(driver, HomePageRegisterObjects.class);
	homePO.registerLink();

	Thread.sleep(5000);

	}
}
