package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefintion {
	
	WebDriver Driver;
	@Given("User have to opne chrome browser and facebook application")
	public void user_have_to_opne_chrome_browser_and_facebook_application() {
	   Driver = new ChromeDriver();
	  Driver.get("https://www.facebook.com/");
	}

	@When("To pass the valid email and invalid password to corresponding fields")
	public void to_pass_the_valid_email_and_invalid_password_to_corresponding_fields() throws InterruptedException {
		WebElement log = Driver.findElement(By.id("email"));
		log.sendKeys("joasir5#mail");
		
		WebElement pass = Driver.findElement(By.id("pass"));
		pass.sendKeys("7418526");
		Thread.sleep(3000);
	}
   

	@Then("To close Browser")
	public void to_close_Browser() {
	  Driver.close();
	}

}
