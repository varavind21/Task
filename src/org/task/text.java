package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind\\eclipse-workspace\\task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtbooking = driver.findElement(By.xpath("//p[contains(@style,'text-align:center')]"));
		String text = txtbooking.getText();
		System.out.println(text);
		
	
	
	}
}
