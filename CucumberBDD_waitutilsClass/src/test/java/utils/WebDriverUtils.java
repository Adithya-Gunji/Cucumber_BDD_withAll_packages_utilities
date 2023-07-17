package utils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverUtils{
	
	 public static WebDriver driver;
		
     public static void initializeWebDriver() {
	    	//System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	//WebDriverManager.edgedriver().setup();// To Avoid version control problem(Browser update)
	    	//driver=new EdgeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	
	    	 // Set the driver for the wait utility class
	    	SeleniumWaitUtils.setDriver(driver);
	    	
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

}
