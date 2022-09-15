package com.StepDefenition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.PageFactory.PageFact;
import com.utility.config.ConfigOrange;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefOrange {
	WebDriver driver;
	PageFact orange;
	
	@Given("User Open Chrome Browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",
				  "E:\\software/chromedriver.exe");
				  driver=new ChromeDriver();
				  orange=new PageFact(driver);
				  
	    
	}

	@And("User put the Orange HRM url")
	public void user_put_the_orange_hrm_url() throws InterruptedException {
		driver.get(ConfigOrange.getConfigOrange("URL"));
		Thread.sleep(2000);
	}

	@When("User put the Username")
	public void user_put_the_username() throws InterruptedException {
		 orange.getUsername().sendKeys(ConfigOrange.getConfigOrange("Username"));  
		 Thread.sleep(2000);
	}

	@And("User put the Password")
	public void user_put_the_password() throws InterruptedException {
		 orange.getPassword().sendKeys(ConfigOrange.getConfigOrange("Password"));
		 Thread.sleep(2000);
	}

	@And("User click the Signin")
	public void user_click_the_signin_button() throws InterruptedException {
		 orange.getLogin().click();
		 Thread.sleep(2000);
	}

	@And("User get the Title")
	public void user_get_the_title() {
	   driver.getTitle();
	}

	@And("User get the URL")
	public void user_get_the_url() {
		driver.getCurrentUrl();
	    
	}

	@Then("User Successfully login")
	public void user_successfully_login() {
	   System.out.println("Logged in successfull");
	}

	@And("User close the browser")
	public void user_close_the_browser() {
	    driver.close();
	}

}
