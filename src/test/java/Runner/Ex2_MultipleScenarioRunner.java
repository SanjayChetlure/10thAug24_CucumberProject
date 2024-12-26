package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex2_MultipleScenarioInSingleFeatureFile.feature"},
		glue = {"Steps"}
		)

public class Ex2_MultipleScenarioRunner extends AbstractTestNGCucumberTests
{
	

}
