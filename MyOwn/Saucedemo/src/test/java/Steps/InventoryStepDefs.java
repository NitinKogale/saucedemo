package Steps;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import testDataTypes.Users;
import utils.SeleniumDriver;
import utils.SharedData;
import utils.SharedDataManager;

public class InventoryStepDefs {

	WebDriver driver;
	SharedData sharedData;
	InventoryPage inventoryPage = new InventoryPage();
	
	public InventoryStepDefs()
	{
		sharedData = SharedDataManager.getSharedData();
		driver = SeleniumDriver.getDriver();
	}
	
	@When("user adds two most expensive products in cart")
	public void user_adds_two_most_expensive_products_in_cart() 
	{
		inventoryPage.addTopTwoExpensiveProductsToCart();
	}

	@When("clicks on cart button")
	public void clicks_on_cart_button() 
	{
	    inventoryPage.clickCart();
	}
	
}
