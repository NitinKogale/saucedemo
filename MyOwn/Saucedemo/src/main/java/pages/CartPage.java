package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.SeleniumDriver;
import utils.SharedData;
import utils.SharedDataManager;

public class CartPage {
	
	WebDriver driver;
	SharedData sharedData;
	String pageTitile = "Swag Labs";
	
	public CartPage()
	{
		sharedData = SharedDataManager.getSharedData();
		driver = SeleniumDriver.getDriver();
		Assert.assertTrue((driver.getCurrentUrl().contains("cart.html")), "User is not landed on expected page. Should be on Cart page");
	}
	
	By productNamesOnCartPage = By.xpath("//div[@class='inventory_item_name']");
	By productPricesOnCartPage = By.xpath("//div[@class='inventory_item_price']");
	By checkoutButton = By.id("checkout");
	
	public void clickCheckout()
	{
		driver.findElement(checkoutButton).click();
	}
	
	public void verifyAddedProducts()
	{
		assertTrue(driver.findElements(productNamesOnCartPage).size() == 2, "Cart page: Exactly two products were expected to be shown");
		
		List<WebElement> prodNames = driver.findElements(productNamesOnCartPage);
		String firstProdName = prodNames.get(0).getText();

		assertEquals(firstProdName, sharedData.getFirstProduct(), "Cart page: Selected first product is incorrect/not matching with selection");
		
		String secondProdName = (driver.findElements(productNamesOnCartPage).get(1)).getText();
		assertEquals(secondProdName, sharedData.getSecondProduct(), "Cart page: Selected second product is incorrect/not matching with selection");
	}
	
}
