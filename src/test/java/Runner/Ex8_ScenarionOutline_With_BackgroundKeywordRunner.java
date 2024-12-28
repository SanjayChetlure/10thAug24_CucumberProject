package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex8_ScenarionOutline_With_BackgroundKeyword.feature"},
		glue = {"Steps"},
		publish = true
		)

public class Ex8_ScenarionOutline_With_BackgroundKeywordRunner extends AbstractTestNGCucumberTests
{

}
