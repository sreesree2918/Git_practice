package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	
	
	// 1. Browser launch()
	public static WebDriver driver;

	public static WebDriver browserLaunch(String name) {
	if (name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	} else if (name.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	} else if (name.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	return driver;
	}

	// HotelURL
	public static void hotelUrl(String Url) {
	driver.get(Url);
	}

	// SendKeys
	public static void inputValues(WebElement element, String input) {
	element.sendKeys(input);
	}
	//Click
	public static void click(WebElement element) {
	element.click();
	}
	//SelectClass
	public static void selectByIndex(WebElement element, int index){
	Select s = new Select(element);
	s.selectByIndex(index);








	}

	}
	

