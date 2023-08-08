package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import utils.SeleniumDriver;

public class CheckoutStepDefs {
	
	WebDriver driver;
	CheckoutPage checkoutPage = new CheckoutPage();

	public CheckoutStepDefs()
	{
		driver = SeleniumDriver.getDriver();
	}
	
	@Then("user should be navigated to Checkout page and fills in the form")
	public void user_should_be_navigated_to_checkout_page_and_fills_in_the_form() 
	{
		checkoutPage.fillCheckoutForm();
	}

	@When("user clicks the Continue button")
	public void user_clicks_the_continue_button() 
	{
	    checkoutPage.clickContinue();
	}

}
