package Testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featurefiles/errmsg.feature", glue = "stepdefinitions",dryRun =false,tags =("@tag2"))
public class ErrmsgTest extends AbstractTestNGCucumberTests{

}
