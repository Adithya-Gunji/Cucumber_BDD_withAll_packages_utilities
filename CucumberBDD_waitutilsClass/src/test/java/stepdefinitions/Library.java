package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.SeleniumWaitUtils;
import utils.WebDriverUtils;

public class Library extends WebDriverUtils{
	
	private LoginPage loginPage;
	
	
	String expempno;
	
	@Given("I open browser with the url {string}")
	public void i_open_browser_with_the_url(String url) {
      WebDriverUtils.initializeWebDriver();
      driver.get(url);
      
      Assert.assertEquals("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login", driver.getCurrentUrl());
      
      loginPage = new LoginPage(driver);
      
     
	}
	@Then("i should see login page")
	public void i_should_see_login_page() {
	    if(driver.findElement(By.id("btnLogin")).isDisplayed())
	    {
	    	System.out.println("system displayed login page");
	    }else {
			System.out.println("check the login page error");
		}
	}
	@When("I enter user_name as {string}")
	public void i_enter_user_name_as(String user_name) {
		//driver.findElement(By.id("txtUsername")).sendKeys(user_name);
		loginPage.enterUsername(user_name);
	
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		//driver.findElement(By.id("txtPassword")).sendKeys(password);
		loginPage.enterPassword(password);
       
	}
	@When("I click submit")
	public void i_click_submit() {
		//driver.findElement(By.id("btnLogin")).click();
		loginPage.clickLoginButton();
		
		Assert.assertEquals("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard", driver.getCurrentUrl());
	}
	@Then("I should see Admin module")
	public void i_should_see_admin_module() {
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			System.out.println("System Displays Admin Module");
		}else {
			System.out.println("System is not Displays the Admin Module");
		}
	}
	@When("i close the browser")
	public void i_close_the_browser() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		By elementLocator = By.linkText("Logout");
        SeleniumWaitUtils.waitForElementClickable(elementLocator).click();
        
		//driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}
	@Then("I should see error msg")
	public void i_should_see_error_msg() {
		String errmsg= driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		if(errmsg.contains("invalid"))
		{
			System.out.println("System Displayed error message");
		}else {
			System.out.println("Please check the code");
		}
		
		driver.close();
	}
	@When("I enter f_name as {string}")
	public void i_enter_f_name_as(String f_name) {
	      driver.findElement(By.linkText("PIM")).click();
	      driver.findElement(By.linkText("Add Employee")).click();
	      driver.findElement(By.id("firstName")).sendKeys(f_name);
	}
	@When("I enter l_name as {string}")
	public void i_enter_l_name_as(String l_name) {
		driver.findElement(By.id("lastName")).sendKeys(l_name);
	}
	@When("I click save")
	public void i_click_save() {
		String expempno;
		expempno  = driver.findElement(By.id("employeeId")).getAttribute("value");
	    driver.findElement(By.id("btnSave")).click();
	    System.out.println("Expected employee number is : "+expempno);
	}
	@Then("I should see empreg Successfully")
	public void i_should_see_empreg_successfully() {
		String actempno = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	    
	    
		if(expempno==actempno)
		{
			System.out.println("New employee Successfully registred.........!");
		}
	}
}
