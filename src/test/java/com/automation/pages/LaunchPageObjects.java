package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LaunchPageObjects {
	WebDriver driver;

	//Constructor
	public LaunchPageObjects(WebDriver driver)
	{
	this.driver = driver;
	}

	//First Step : Defining WebElements
	@FindBy(className = "btn" ) WebElement getStarted;



//	driver.findElement(By.className("txtbox ng-valid ng-dirty ng-valid-parse ng-touched"));

	//Step 2: Perform actions
	public void getStartedClick() throws InterruptedException
	{
	getStarted.click();
	Thread.sleep(3000);
	Reporter.log("Register link is clicked");
	Reporter.log("Navigated url : " + driver.getCurrentUrl());
	
	}
}
