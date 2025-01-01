package REHooks;

import java.io.IOException;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SwagLabHooks 
{
	
	@Before
	public void openBrowser() throws IOException
	{
		DriverFactory.initializeBrowser(UtilityClass.getPFData("browserName"));
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(4000);
		DriverFactory.driver.quit();
	}

}
