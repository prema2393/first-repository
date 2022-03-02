package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.smshorizon.in/");

		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File shot1 = ts.getScreenshotAs(OutputType.FILE);

		File Location = new File("C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Screenshot\\sms.png");

		FileUtils.copyFile(shot1, Location);

	}

}
