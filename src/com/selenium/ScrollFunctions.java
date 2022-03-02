package com.selenium;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunctions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.smshorizon.in//");
		driver.manage().window().maximize();
		
		WebElement scroll1 = driver.findElement(By.xpath("//img[@width='382']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll1);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,3000);");
		
		
		
		
		//js.executeScript("window.scrollBy(0,1000);");
		
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
       // js.executeScript("window.scrollTo(1,document.body.scrollHeight)");
	}

}
