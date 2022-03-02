package com.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		// setting the browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		// browser launch

		WebDriver driver = new ChromeDriver();

		// get method

		driver.get("http://greenstech.in/selenium-course-content.html");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		
		
		for (Cookie cookie : cookies) {
			
			System.out.println(cookie);
			
		}
		
		driver.manage().deleteAllCookies();
		
		//System.out.println("got webpage:"+driver);

		// maximize method

		//driver.manage().window().maximize();

		// get title method

		//String title = driver.getTitle();
		//System.out.println("current title is:" + title);

		// get current url

		//String currentUrl = driver.getCurrentUrl();
		//System.out.println("current URL is:" + currentUrl);
		
		//String windowHandle = driver.getWindowHandle();
		//System.out.println("window handle:"+windowHandle);
		
		
		
		//String pageSource = driver.getPageSource();
		//System.out.println("page source:"+pageSource);

		// navigation to another webpage

		//driver.navigate().to("https://www.youtube.com/");
		
		//Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println("window habdles:"+windowHandles);

		// back webpage

		//driver.navigate().back();

		// forward webpage

		//driver.navigate().forward();

		// to hold the webpage and then refresh

		//Thread.sleep(3000);

		// refresh

		//driver.navigate().refresh();

		// close the particular webpage
		
		//Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println("window habdles:"+windowHandles);

		//driver.close();

	}

}
