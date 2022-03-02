package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement button1 = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(button1).build().perform();
		
		WebElement button2 = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(button2).build().perform();
		
		WebElement button3 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		ac.click(button3).build().perform();
		
		driver.navigate().to("https://www.smshorizon.in/");
		Thread.sleep(2000);
		
		WebElement images1 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		ac.moveToElement(images1).build().perform();
		ac.click(images1).build().perform();
		
		driver.navigate().to("http://www.leafground.com/");
		
		WebElement choose = driver.findElement(By.xpath("//img[@alt='drop']"));
		choose.click();
		
		WebElement dragg = driver.findElement(By.id("draggable"));
		WebElement dropp = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(dragg, dropp).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
