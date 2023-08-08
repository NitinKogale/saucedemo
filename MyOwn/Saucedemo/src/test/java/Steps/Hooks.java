package Steps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumDriver;
import utils.SharedDataManager;

public class Hooks {
	
	WebDriver driver;
	WebDriverWait webDriverWait;
	ConfigFileReader configFileReader;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 30;

	@Before
	public void startBrowser()
	{
		System.out.println("**Nitin in before method **");
		
		configFileReader = new ConfigFileReader();
		
		if((configFileReader.getBrowser()).equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if((configFileReader.getBrowser()).equals("firefox"))
		{
			driver = new FirefoxDriver();
		}		
		
		driver.manage().window().maximize();		
		webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIMEOUT));
		
		System.out.println("** Launched browser in before method **");		
		SeleniumDriver.setDriver(driver);
		SharedDataManager.setSharedData();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("** In team teardown method to close and quit the browser **");
		driver.close();
		driver.quit();
	}
}
