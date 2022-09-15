package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	@Given("user open browser")
	public void user_open_browser() {
	  
		System.setProperty("webdriver.chrome.driver", "E:\\software/chromedriver.exe");
		 driver=new ChromeDriver();
			
		driver.manage().window().maximize(); 
		 System.out.println(" Step 1 = User opened browser");
	}

	@Given("user put the url")
	public void user_put_the_url() {
		
		driver.get("http://automationpractice.com/index.php");
	   
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();
	    
	}

	@When("user put username")
	public void user_put_username() {
	    driver.findElement(By.xpath("(//*[contains(@id,'email')])[2]")).sendKeys("sharifulislam.usa@gmail.com");
	}

	@When("user put password")
	public void user_put_password() {
		driver.findElement(By.xpath("//*[contains(@id,'passwd')]")).sendKeys("@Simra2020");
	    
	}

	@Then("successfully login")
	public void successfully_login() {
	   driver.findElement(By.xpath("//*[contains(@class,'icon-lock left')]")).click();
	}

	@Then("close the driver")
	public void close_the_driver() {
		 System.out.println(" Step 2 = User closed browser");
		driver.close();
	    
	}

}
