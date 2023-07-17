package Testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featurefiles/empreg.feature", glue = "stepdefinitions",dryRun =false,tags =("@tag1"))
public class NewEmployeeRegistration extends AbstractTestNGCucumberTests {

}
