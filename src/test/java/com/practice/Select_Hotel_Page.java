package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio1;

	@FindBy(id = "continue")
	private WebElement next;


	public Select_Hotel_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);

	}

	public WebElement getRadio1() {
	return radio1;
	}

	public WebElement getNext() {
	return next;
	}




















	}

	
	
	
	
	
	
	
	

