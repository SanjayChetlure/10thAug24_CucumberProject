package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"@target/ReRunFiles/reRun.txt"},
		glue = {"Steps"},
		publish = true
		
		)

public class Ex15_RerunFailedScenariosRunner extends AbstractTestNGCucumberTests
{

}
