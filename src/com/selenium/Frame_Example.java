package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("singleframe");
		WebElement box1 = driver.findElement(By.xpath("//input[@type='text']"));
		box1.sendKeys("Prema");

		driver.switchTo().defaultContent();

		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multi.click();

		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);

		WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(inner);

		WebElement box2 = driver.findElement(By.xpath("(//input[@type='text'])"));
		box2.sendKeys("suhail");

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		// driver.get("http://demo.automationtesting.in/Index.html");
		// driver.manage().window().maximize();

		// WebElement choosebox = driver.findElement(By.id("btn2"));
		// choosebox.click();

		// WebElement swto =
		// driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		// swto.click();

		// Select s = new Select(swto);
		// s.selectByVisibleText("Frames");

		// WebElement drop = driver.findElement(By.xpath("(//i[@class='fa
		// fa-angle-down'])[1]"));
		// drop.click();

		// driver.switchTo().frame("single frame");
		// WebElement textbox1 =
		// driver.findElement(By.xpath("//section[@class='innerblock']"));
		// WebElement text1 = driver.findElement(By.id("wrapframe"));
		// text1.sendKeys("prema");

	}

}
