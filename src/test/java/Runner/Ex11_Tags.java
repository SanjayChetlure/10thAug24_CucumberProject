package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\10th Aug 2024\\Workspace\\10thAug24_CucumberProject\\src\\test\\resources\\FeatureFiles\\Ex11_Tags.feature"},
		glue = {"Steps"},
		publish = true,
		//tags = "@Smoke"
		//tags = "@Smoke or @Sanity"
//		tags = "@Smoke and @Positive"
		tags = "not @Smoke"
		
		)

public class Ex11_Tags extends AbstractTestNGCucumberTests
{

}
