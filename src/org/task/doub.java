package org.task;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doub {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind\\eclipse-workspace\\task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp \r\n");
		
		driver.manage().window().maximize();

	WebElement element = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
	element.sendKeys("arvind");
	
	Thread.sleep(3000);
	
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
	
	
		
		
		
}
}