package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		//(//h5[@class='wp-categories-title'])[9]
		
		Thread.sleep(2000);
		
		WebElement choose = driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[9]"));
		
		Thread.sleep(2000);
		choose.click();
		
		
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		button1.click();
		
		Thread.sleep(2000);
		
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		button2.click();
		
		Thread.sleep(2000);
		
		Alert Confirmalert = driver.switchTo().alert();
		//Confirmalert.accept();
		Confirmalert.dismiss();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		button3.click();
		Thread.sleep(2000);
		
		Alert promptalert = driver.switchTo().alert();
		//promptalert.sendKeys("prema");
		
		//Thread.sleep(2000);
		
		//String text = promptalert.getText();
		
		Thread.sleep(2000);
		
		//System.out.println(text);
		
		//promptalert.accept();
		
		promptalert.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
