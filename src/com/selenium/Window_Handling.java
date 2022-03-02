package com.selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement mobiles1 = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		Actions ac = new Actions(driver);

		ac.contextClick(mobiles1).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement rel = driver.findElement(By.xpath("//a[text()='New Releases']"));
		ac.contextClick(rel).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> allwindowsid = driver.getWindowHandles();
		
		for (String extractallid : allwindowsid) {
			
			String extractprocess = driver.switchTo().window(extractallid).getTitle();
			
			if (extractprocess.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")) 
				
				break;
				
			
			System.out.println(extractprocess);
			
		}
		
		
		
		

        
		
	}

}
