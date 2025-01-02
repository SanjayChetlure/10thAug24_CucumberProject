package REHooks;
import java.io.IOException;
import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class SwagLabHooks 
{	
	@Before
	public void openBrowser() throws IOException
	{
		DriverFactory.initializeBrowser(UtilityClass.getPFData("browserName"));
	}
	
	@BeforeStep
	public void waitForHalfSec() throws InterruptedException 
	{
		Thread.sleep(300);
	}
		
	@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(4000);
		DriverFactory.driver.quit();
	}
}
