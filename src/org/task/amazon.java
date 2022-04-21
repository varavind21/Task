package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind\\eclipse-workspace\\task\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			WebElement txtname = driver.findElement(By.xpath("//input[@type='text']"));
			txtname.sendKeys("iphone");
			WebElement btnclick = driver.findElement(By.xpath("//input[@value=\'Go\']"));
			btnclick.click();
	
	
	}
}
