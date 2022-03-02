package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("prema.smsp56@gmail.com");

		String attribute = emailId.getAttribute("name");
		System.out.println(attribute);

		String attribute2 = emailId.getAttribute("value");
		System.out.println(attribute2);

		boolean displayed = emailId.isDisplayed();
		System.out.println("Displayed:" + displayed);

		boolean enabled = emailId.isEnabled();
		System.out.println("Enabled:" + enabled);


		emailId.clear();

		//WebElement p1 = driver.findElement(By.name("pass"));
		//p1.sendKeys("1234567890");

		// WebElement login button = driver.findElement(By.name("login"));
		// loginbutton.click();

		// driver.close();

	}

}
