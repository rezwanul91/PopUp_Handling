package step_Definitions;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Craigslist_Community_Field extends Base{
	
	@Given("I am in craigslist landing page")
	public void i_am_in_craigslist_landing_page() {
	    navigateUrl("https://newyork.craigslist.org");
	}

	@When("I click in my account")
	public void i_click_in_my_account() {
	    click(By.xpath("//a[text()='my account']"));
	}

	@Then("I enter email id")
	public void i_enter_email_id() {
	    sendkeys(By.id("inputEmailHandle"), "rezwanul0091@gmail.com");
	}

	@Then("I enter password")
	public void i_enter_password() {
	    sendkeys(By.id("inputPassword"), "Cr@igslist2023$");
	}

	@Then("I click in login button")
	public void i_click_in_login_button() {
	    click(By.id("login"));
	}

}//class
