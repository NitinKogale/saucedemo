package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;
import utils.SeleniumDriver;

public class CheckoutCompleteStepDefs {

	WebDriver driver;
	CheckoutCompletePage CheckoutCompletePage = new CheckoutCompletePage();

	public CheckoutCompleteStepDefs()
	{
		driver = SeleniumDriver.getDriver();
	}
	
	@Then("user should be displayed with Thank you and order dispatch message")
	public void user_should_be_displayed_with_thank_you_and_order_dispatch_message() 
	{
		CheckoutCompletePage.veriryOrderSuccessful();
	}
	
}
