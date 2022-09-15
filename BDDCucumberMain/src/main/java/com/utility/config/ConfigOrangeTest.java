package com.utility.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageFactory.PageFact;

public class ConfigOrangeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				  "E:\\software/chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  
				  driver.get(ConfigOrange.getConfigOrange("URL"));
				  
				  PageFact orange=new PageFact(driver);
				  Thread.sleep(2000);
				  orange.getUsername().sendKeys(ConfigOrange.getConfigOrange("Username"));
				  Thread.sleep(2000);
				  orange.getPassword().sendKeys(ConfigOrange.getConfigOrange("Password"));
				  Thread.sleep(2000);
				  orange.getLogin().click();
				  
				  driver.close();
	}

}
