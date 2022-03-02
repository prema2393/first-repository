package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Small_Miniproject {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		sign.click();
		
		Thread.sleep(2000);
		
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("prema.smsp56@gmail.com");
		
		WebElement create = driver.findElement(By.name("SubmitCreate"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement sal = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		sal.click();
		
		WebElement name = driver.findElement(By.id("customer_firstname"));
		name.sendKeys("Prema");
		
		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		last.sendKeys("S");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Vijaya@1");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("23");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1993");
		
		WebElement check1 = driver.findElement(By.id("newsletter"));
		check1.click();
		
		WebElement check2 = driver.findElement(By.id("optin"));
		check2.click();
		
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Prema");
		
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("15,Kanagasabapathi st, Ammapet");
		
		
		WebElement city1 = driver.findElement(By.id("city"));
		city1.sendKeys("Salem");
		
		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select s3 = new Select(state);
		s3.selectByValue("9");
		
		
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("32218");
		
				
		WebElement addi = driver.findElement(By.id("other"));
		addi.sendKeys("Mini Project, 9791966227");
		
		
		WebElement pho = driver.findElement(By.id("phone"));
		pho.sendKeys("8056646580");
		
		
		WebElement mo = driver.findElement(By.id("phone_mobile"));
		mo.sendKeys("8754145432");
		
		WebElement reg = driver.findElement(By.id("submitAccount"));
		reg.click();
		
        TakesScreenshot ts = (TakesScreenshot) driver;
        
        File source = ts.getScreenshotAs(OutputType.FILE);
        
       File desti = new File("C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Screenshot\\demo.png");
       
       FileUtils.copyFile(source, desti);
       
       
        
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
