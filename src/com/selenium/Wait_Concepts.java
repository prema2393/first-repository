package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Prema.smsp56@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		WebDriverWait exp = new WebDriverWait(driver, 10);
		exp.until(ExpectedConditions.visibilityOf(pass));
		
		
		pass.sendKeys("1234567890");
		
		
		
		
	}

}
