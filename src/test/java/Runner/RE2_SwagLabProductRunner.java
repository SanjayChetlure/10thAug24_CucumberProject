package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\RE2_SwagLabProduct.feature"},
		glue = {"Steps","REHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabProduct.html"}
		
		)

public class RE2_SwagLabProductRunner extends AbstractTestNGCucumberTests
{

}
