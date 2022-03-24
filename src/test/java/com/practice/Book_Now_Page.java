package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now_Page {

	
	
	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCard;

	@FindBy(id = "cc_type")
	private WebElement creditType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement creditcvv;

	@FindBy(id = "book_now")
	private WebElement book;

	public Book_Now_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);

	}

	public WebElement getFirstName() {
	return firstName;
	}

	public WebElement getLastName() {
	return lastName;
	}

	public WebElement getAddress() {
	return address;
	}

	public WebElement getCreditCard() {
	return creditCard;
	}

	public WebElement getCreditType() {
	return creditType;
	}

	public WebElement getExpMonth() {
	return expMonth;
	}

	public WebElement getExpYear() {
	return expYear;
	}

	public WebElement getCreditcvv() {
	return creditcvv;
	}

	public WebElement getBook() {
	return book;
	}






	}

	

