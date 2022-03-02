package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

		Select s = new Select(multiple);

		boolean mul = s.isMultiple();

		System.out.println("is multiple:" + mul);

		s.selectByValue("3");
		s.selectByVisibleText("Selenium");
		s.selectByIndex(2);

		// s.deselectByIndex(2);

		System.out.println("All Options");

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement allselected : allSelectedOptions) {

			String text = allselected.getText();

			System.out.println(text);
		}

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		System.out.println(text2);

	}

}
