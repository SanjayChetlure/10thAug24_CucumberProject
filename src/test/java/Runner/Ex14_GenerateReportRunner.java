package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex2_MultipleScenarioInSingleFeatureFile.feature"},
		glue = {"Steps"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/Report.html"}
		
		)

public class Ex14_GenerateReportRunner extends AbstractTestNGCucumberTests
{

}
