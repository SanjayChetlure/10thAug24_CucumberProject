package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles"},
		glue = {"Steps"},
		publish = true,
		dryRun = true
				
		)

public class Ex13_dryRunRunner extends AbstractTestNGCucumberTests
{

}
