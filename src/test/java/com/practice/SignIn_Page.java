package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement userPassword;

	@FindBy(id = "login")
	private WebElement loginButton;

	public SignIn_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);


	}

	public WebElement getUserName() {
	return userName;
	}

	public WebElement getUserPassword() {
	return userPassword;
	}

	public WebElement getLoginButton() {
	return loginButton;
	}



	}


	
	
	
	
	
	
	
	
	

