package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePageSignInPageObjects {
	WebDriver driver;

	//Constructor
	public HomePageSignInPageObjects(WebDriver driver)
	{
	this.driver = driver;
	}

	//First Step : Defining WebElements
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]" ) WebElement signIn;




	//Step 2: Perform actions
	public void signInLink() throws InterruptedException
	{
	signIn.click();
	Thread.sleep(1000);
	Reporter.log("Register link is clicked");
	Reporter.log("Navigated url : " + driver.getCurrentUrl());
	
	}
}
