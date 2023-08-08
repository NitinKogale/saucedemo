package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumDriver;

public class CheckoutCompletePage {
	
WebDriver driver;
	
	public CheckoutCompletePage()
	{
		driver = SeleniumDriver.getDriver();
		assertTrue(driver.getCurrentUrl().contains("checkout-complete"), "Expected to land on Checkout complete page");
	}

	By thankYouMessage = By.xpath("//h2[text()='Thank you for your order!']");
	By orderDispatchMessage = By.xpath("//div[@class='complete-text']");
	String expectedDispatchSuccessMessage = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	
	public void veriryOrderSuccessful()
	{
		assertTrue((driver.findElement(thankYouMessage).isDisplayed()), "Overview page: either thank you message not displayed "
				+ "or message text is incorrect. Expected text is - "
				+ "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
		String actualDispatchMessage = driver.findElement(orderDispatchMessage).getText();
		assertEquals(actualDispatchMessage, expectedDispatchSuccessMessage, "Overview page failed validation");
		
		//In ideal scenario thread sleep is not recommended. But, just to slow down view for a while, this has been added.
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
}
