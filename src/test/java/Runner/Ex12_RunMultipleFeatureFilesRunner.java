package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex1_loginToSwagLabWithoutTD.feature",
//					"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex2_MultipleScenarioInSingleFeatureFile.feature"},
		
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles"},

		
		glue = {"Steps"},
		publish = true
				
		)

public class Ex12_RunMultipleFeatureFilesRunner extends AbstractTestNGCucumberTests
{

}
