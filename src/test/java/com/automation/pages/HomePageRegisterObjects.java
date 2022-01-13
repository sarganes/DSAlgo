package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePageRegisterObjects {
	WebDriver driver;

	//Constructor
	public HomePageRegisterObjects(WebDriver driver)
	{
	this.driver = driver;
	}

	//First Step : Defining WebElements
	@FindBy(linkText = "Register" ) WebElement register;




	//Step 2: Perform actions
	public void registerLink() throws InterruptedException
	{
	register.click();
	Thread.sleep(3000);
	Reporter.log("Register link is clicked");
	Reporter.log("Navigated url : " + driver.getCurrentUrl());
	
	}
}
