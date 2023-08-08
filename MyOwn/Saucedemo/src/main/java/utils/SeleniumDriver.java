package utils;

import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	//initialize the driver
	private static WebDriver driver;	
	
	public SeleniumDriver()
	{

	}

	
	public static void openpage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void setDriver(WebDriver driverHook)
	{
		driver = driverHook;
	}
	
	public static void setUpDriver()
	{
		if(seleniumDriver == null)
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	/*@After
	public static void tearDown()
	{
		if(driver != null)
		{
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}*/
	

}
