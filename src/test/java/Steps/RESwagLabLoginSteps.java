package Steps;

import java.io.IOException;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabsHomePage;
import Module1_Login.SwagLabsLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RESwagLabLoginSteps 
{
	SwagLabsLoginPage login=new SwagLabsLoginPage(DriverFactory.driver);
	SwagLabsHomePage home=new SwagLabsHomePage(DriverFactory.driver);
	
	@Given("user is on login")
	public void user_is_on_login() throws IOException, InterruptedException
	{
		DriverFactory.driver.get(UtilityClass.getPFData("URL"));
		Thread.sleep(1000);
	}

	@When("user enter username on swaglab login page {string}")
	public void user_enter_username_on_swaglab_login_page(String string) throws InterruptedException
	{
		login.inpSwagLabsLoginPageUsername(string);
		Thread.sleep(1000);
	}

	@When("user enter password on swaglab login page {string}")
	public void user_enter_password_on_swaglab_login_page(String string) throws InterruptedException 
	{
		login.inpSwagLabsLoginPagePaswword(string);
		Thread.sleep(1000);
	}

	@When("user click on login btn swaglab login page")
	public void user_click_on_login_btn_swaglab_login_page() throws InterruptedException 
	{
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(1000);
	}

	@Then("user should be at SwagLab home page with logo {string}")
	public void user_should_be_at_swag_lab_home_page_with_logo(String string) 
	{
	   String actLogoText = home.getSwagLabsHomePageLogoText();
	   Assert.assertEquals(actLogoText, string, "Failed- Logo text mismatch");
	}

}
