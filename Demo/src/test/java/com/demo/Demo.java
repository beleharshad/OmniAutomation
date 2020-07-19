package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://portal.corsearch-test.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id='CV91_name']")).sendKeys("navjeetfr");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"cv96_displayPass\"]")).click();
			Thread.sleep(3000);

			String password = "Welcome1";

			driver.findElement(By.xpath("//*[@id='CV91_text']")).click();
			driver.findElement(By.xpath("//*[@id='CV91_pass']")).sendKeys(password);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='CV91_btnLogin']")).click();

			Thread.sleep(3000);
	}
}
