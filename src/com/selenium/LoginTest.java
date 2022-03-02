package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smshorizon.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("Prema101");
        
        Thread.sleep(1000);
        
        
        
        WebElement login1 = driver.findElement(By.id("password"));
        login1.sendKeys("313501");    
        
        Thread.sleep(1000);
        
        WebElement sub = driver.findElement(By.name("Submit"));
        sub.click();
        
        Thread.sleep(2000);
        
        WebElement offers = driver.findElement(By.xpath("//a[contains(text(),'Recharge Offers')]"));
        offers.click();
        
        Thread.sleep(1000);
        
        WebElement log = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        log.click();
        
       // WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
       // home.click();
	}

}
