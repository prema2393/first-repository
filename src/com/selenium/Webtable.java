package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		//List<WebElement> wholetable = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		//for (WebElement extracteach : wholetable) {
			
			//String savingtext = extracteach.getText();
			
			//System.out.println(savingtext);
			
		//}
		
		//List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
			//for (WebElement extractrow : row) {
				
				//String savingrow = extractrow.getText();
				
				//System.out.println(savingrow);
				
			//}	
		
		
		WebElement header = driver.findElement(By.tagName("th"));
		String head = header.getText();
		System.out.println(head);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
