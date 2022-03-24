package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Details_Page {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room;

	@FindBy(id = "room_nos")
	private WebElement roomNo;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "child_room")
	private WebElement childRoom;

	@FindBy(id = "Submit")
	private WebElement search;

	public Booking_Details_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}


	public WebElement getLocation() {
	return location;
	}

	public WebElement getHotels() {
	return hotels;
	}

	public WebElement getRoom() {
	return room;
	}

	public WebElement getRoomNo() {
	return roomNo;
	}

	public WebElement getCheckInDate() {
	return checkInDate;
	}

	public WebElement getCheckOutDate() {
	return checkOutDate;
	}

	public WebElement getAdultRoom() {
	return adultRoom;
	}

	public WebElement getChildRoom() {
	return childRoom;
	}

	public WebElement getSearch() {
	return search;
	}






















	}


