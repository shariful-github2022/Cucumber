package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactTest {

	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver;
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize(); 
		
		PageFact orange=new PageFact(driver);
		Thread.sleep(2000);
		orange.getUsername().sendKeys("Admin");
		Thread.sleep(2000);
		orange.getPassword().sendKeys("admin123");
		Thread.sleep(2000);
		orange.getLogin().click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
