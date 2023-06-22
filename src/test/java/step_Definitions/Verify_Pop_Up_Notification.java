package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pop_Up_Notification extends Base{
	
	@Given("I am in landing page")
	public void i_am_in_landing_page() throws InterruptedException {
		Thread.sleep(3000);
	    navigateUrl("https://nxtgenaiacademy.com");
	}

	@When("I hover my mouse on demo sites menu")
	public void i_hover_my_mouse_on_demo_sites_menu() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(By.xpath("//div[@class='collapse navbar-collapse pull-right']/ul/li[3]/a"));
	}

	@Then("I again hover my mouse on practice operation")
	public void i_again_hover_my_mouse_on_practice_operation() throws InterruptedException {
		Thread.sleep(3000);
	    mouseHover(By.xpath("//div[@class='collapse navbar-collapse pull-right']/ul/li[3]/ul/li/a"));
	}

	@Then("I click on demo site alert and pop up")
	public void i_click_on_demo_site_alert_and_pop_up() throws InterruptedException {
		Thread.sleep(3000);
	    click(By.xpath("//div[@class='collapse navbar-collapse pull-right']/ul/li[3]/ul/li/ul/li[2]/a"));
	}

	@Then("i click on confirm alert box menu")
	public void i_click_on_confirm_alert_box_menu() throws InterruptedException {
		Thread.sleep(3000);
	    click(By.name("confirmalertbox"));
	}

	@Then("I click on ok button")
	public void i_click_on_ok_button() throws InterruptedException {
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	}

	@Then("I verify the message")
	public void i_verify_the_message() throws InterruptedException {
		Thread.sleep(3000);
	    String actualMsg = getElementText(By.id("demo"));
	    assertEquals("You clicked on OK!", actualMsg);
	    System.out.println("I successfully comeplete the test case");
	}

}//class
