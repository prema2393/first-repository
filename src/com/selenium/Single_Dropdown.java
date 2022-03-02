package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		createbutton.click();
		
		Thread.sleep(2000);
		
		WebElement firstname1 = driver.findElement(By.name("firstname"));
		firstname1.sendKeys("Prema");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Saravanan");
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobile.sendKeys("8754145432");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("Suhail@134567");
		
		
		
	
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	
	s.selectByValue("9");
	
	WebElement month = driver.findElement(By.id("month"));
	 Select s1 = new Select(month);
	 
	 s1.selectByIndex(4);
	 
	 WebElement year = driver.findElement(By.id("year"));
	 
	 Select s2 = new Select(year);
	 s2.selectByVisibleText("2015");
	 
	 
	 
	 
		
		
	}

}
