package com.org.MyFirstRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClassDemo {
	
	public static void main(String[] args ) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium" );
		driver = new ChromeDriver();
 System.out.println("Hi there");
	}
}
