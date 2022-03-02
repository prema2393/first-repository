package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Horizon\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Web page launching

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// login

		WebElement fir = driver.findElement(By.xpath("//a[@class='login']"));
		fir.click();

		// Entering user id

		WebElement sign1 = driver.findElement(By.id("email"));
		sign1.sendKeys("prema.smsp56@gmail.com");

		// Entering password

		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Vijaya@1");

		// Clicking login

		WebElement sub = driver.findElement(By.name("SubmitLogin"));
		sub.click();

		// Choosing Womens section

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		// Choosing dress image

		WebElement dressimage = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[2]"));
		dressimage.click();

		// switching to frame

		WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@id,'fancybox')]"));
		driver.switchTo().frame(frame1);

		// quantity

		WebElement quan = driver.findElement(By.className("icon-plus"));
		quan.click();

		WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart.click();

		// add to cart and switching to default content

		driver.switchTo().defaultContent();
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();

		// clicking proceed

		WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed1.click();

		// clicking proceed

		WebElement proceed2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceed2.click();

		// clicking proceed

		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();

		// clicking proceed

		WebElement proceed3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceed3.click();

		// pay by check

		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		paybycheck.click();

		// confirm

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();

	}

}
