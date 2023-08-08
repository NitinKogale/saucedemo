package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utils.SeleniumDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage()
	{
		driver = SeleniumDriver.getDriver();
	}
	
	By userName = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By lockedUserError = By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");
	
	public void login() 
	{
		
		driver.findElement(userName).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();
	}
	
	public void login(String userNameParam, String passwordParam) 
	{		
		driver.findElement(userName).sendKeys(userNameParam);
		driver.findElement(password).sendKeys(passwordParam);
		driver.findElement(loginButton).click();
	}

	public void verifyErrorMessage()
	{
		assertTrue(driver.findElement(lockedUserError).isDisplayed(), "error - "
				+ "Epic sadface: Sorry, this user has been locked out. expected for locked user type");
	}
	
}
