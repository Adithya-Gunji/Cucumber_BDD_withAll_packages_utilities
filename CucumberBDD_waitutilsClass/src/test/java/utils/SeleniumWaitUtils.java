package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitUtils {
	
	 private static WebDriver driver;

	 private static final int DEFAULT_TIMEOUT = 10;

	 public static void setDriver(WebDriver webDriver) {

	        driver = webDriver;
     }

	 public static WebElement waitForElementVisible(By locator) {

	        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);

	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	    }

	 public static WebElement waitForElementClickable(By locator) {

	        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);

	        return wait.until(ExpectedConditions.elementToBeClickable(locator));

	    }

	 public static void waitForElementToBeSelected(By locator) {

	        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);

	        wait.until(ExpectedConditions.elementToBeSelected(locator));

	    }

	 public static void waitForTextToBePresentInElement(By locator, String text) {

	        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);

	        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));

	    }

	 public static void waitForPageTitle(String title) {

	        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);

	        wait.until(ExpectedConditions.titleIs(title));

	    }
	 public static void waitForAlert() {
           
	    	WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
	        wait.until(ExpectedConditions.alertIsPresent());
	        /*  String alrt = driver.switchTo().alert().getText();
                System.out.print(alrt);
                driver.switchTo().alert().accept();
                we have to write comment lines of code in library class for usage 
                driver.switchTo().alert().sendKeys("Text");*/
	        }
	 
}
