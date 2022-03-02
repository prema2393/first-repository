package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signup.click();
	
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("8754145432");
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Prema Saravanan");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("prema.smsp56@gmail.com");
		
		////a[@class='a-ayg']
		
		WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Prema@123");
        
        WebElement login = driver.findElement(By.xpath("//body[@class='overlay-enabled']"));
        login.click();

		
	}

}
