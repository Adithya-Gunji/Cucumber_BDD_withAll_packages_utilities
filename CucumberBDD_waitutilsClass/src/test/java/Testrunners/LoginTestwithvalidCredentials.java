package Testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featurefiles/login.feature", glue = "stepdefinitions",dryRun =false,tags =("@tag1"))
public class LoginTestwithvalidCredentials extends AbstractTestNGCucumberTests {

}
