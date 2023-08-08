package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.SeleniumDriver;
import utils.SharedData;
import utils.SharedDataManager;

public class CheckoutPage {

	WebDriver driver;
	SharedData sharedData;
	
	public CheckoutPage()
	{
		sharedData = SharedDataManager.getSharedData();
		driver = SeleniumDriver.getDriver();
		Assert.assertTrue((driver.getCurrentUrl().contains("checkout-step-one.html")), "User is not landed on expected page. Should be on checkout one page");
	}
	
	By fisrtNameInput = By.id("first-name");
	By lastNameInput = By.id("last-name");
	By postalCodeInput = By.id("postal-code");
	By continueButton = By.id("continue");
	
	public void fillCheckoutForm()
	{
		driver.findElement(fisrtNameInput).sendKeys(sharedData.getFirstName());
		driver.findElement(lastNameInput).sendKeys(sharedData.getLastName());
		driver.findElement(postalCodeInput).sendKeys(sharedData.getPostalCode());
	}
	
	public void clickContinue()
	{
		driver.findElement(continueButton).click();
	}
	
}
