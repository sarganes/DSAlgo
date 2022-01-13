package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.HomePageRegisterObjects;
import com.automation.pages.LaunchPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class LaunchPage extends BaseClass{
	
	public LaunchPage(WebDriver driver) {
        this.driver = driver;
	}
	
  @Test
  public void f() {
	  Reporter.log("Welcome to DSAlgo Launch page Test Case");
  }
  
  @Test
	public void clickGetStarted() throws InterruptedException
	{
	//To get the page title
	Reporter.log("Page url : " +driver.getTitle());

	Thread.sleep(1000);
	//Abstraction is showing the essential features and hiding the background details

	//To create instance of the Login Page Objects class
	LaunchPageObjects launchPO = PageFactory.initElements(driver, LaunchPageObjects.class);
	launchPO.getStartedClick();

	Thread.sleep(1000);
	}
}
