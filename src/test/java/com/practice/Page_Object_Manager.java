package com.practice;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public WebDriver driver;

	private SignIn_Page sip;

	private Booking_Details_Page book;

	private Select_Hotel_Page snp;

	private Book_Now_Page bnp;

	public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	}

	public SignIn_Page getInstancesip() {
	if (sip == null) {
	sip = new SignIn_Page(driver);
	}
	return sip;
	}

	public Booking_Details_Page getInstancebook() {
	if (book == null) {
	book = new Booking_Details_Page(driver);
	}
	return book;
	}

	public Select_Hotel_Page getInstancesnp() {
	if (snp == null) {
	snp = new Select_Hotel_Page(driver);
	}
	return snp;
	}

	public Book_Now_Page getInstancebnp() {
	if (bnp == null) {
	bnp = new Book_Now_Page(driver);
	}
	return bnp;
	}

	}

