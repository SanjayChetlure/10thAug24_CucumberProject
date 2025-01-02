package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\RE3_SwagLabOrder.feature"},
		glue = {"Steps","REHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabOrder.html"}
		
		)

public class RE3_SwagLabOrderRunner extends AbstractTestNGCucumberTests
{

}
