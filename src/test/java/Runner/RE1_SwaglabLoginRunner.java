package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\RE1_SwagLabLogin.feature"},
		glue = {"Steps","REHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabLogin.html"}
		
		)

public class RE1_SwaglabLoginRunner extends AbstractTestNGCucumberTests
{

}
