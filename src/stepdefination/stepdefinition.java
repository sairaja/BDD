package stepdefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends Util {

	WebDriver driver =new FirefoxDriver();
	
	@Given("^user navigates to Amazon$")
	public void user_navigates_to_Amazon() throws Throwable {
		
		driver.get(getproperty("url"));
	}

	@When("^I enter correct username and password$")
	public void i_enter_correct_username_and_password() throws Throwable {
	    
		driver.findElement(By.id(getproperty("Go_to_Amazon_btn"))).click();
		wait(3);
		
		driver.findElement(By.id(getproperty("AmazonSigin_InitialPage"))).click();
		wait(3);
		
		driver.findElement(By.id(getproperty("Amazon_Username"))).sendKeys(getproperty("EmailId"));
		wait(3);
		
		driver.findElement(By.id(getproperty("Amazon_Password"))).sendKeys(getproperty("password"));
		wait(3);
		
		driver.findElement(By.id(getproperty("Amazon_login"))).click();
		wait(3);
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		
		driver.close();
		driver.quit();
	}

	
}
