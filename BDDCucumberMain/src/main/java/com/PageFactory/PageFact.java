package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFact {
	
	
	public PageFact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[contains(@name,'username')]")
	private WebElement UserName;
	
	@FindBy(xpath="//*[contains(@name,'password')]")
	private WebElement Password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	private WebElement Login;

	public WebElement getUsername() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public void get(String configOrange) {
		// TODO Auto-generated method stub
		
	}

}
