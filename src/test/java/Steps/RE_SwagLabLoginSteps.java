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

public class RE_SwagLabLoginSteps 
{
	SwagLabsLoginPage login=new SwagLabsLoginPage(DriverFactory.driver);
	SwagLabsHomePage home=new SwagLabsHomePage(DriverFactory.driver);
	
	@Given("user is on login")
	public void user_is_on_login() throws IOException, InterruptedException
	{
		DriverFactory.driver.get(UtilityClass.getPFData("URL"));
	}

	@When("user enter username on swaglab login page {string}")
	public void user_enter_username_on_swaglab_login_page(String UN) throws InterruptedException
	{
		login.inpSwagLabsLoginPageUsername(UN);
	}

	@When("user enter password on swaglab login page {string}")
	public void user_enter_password_on_swaglab_login_page(String PWD) throws InterruptedException 
	{
		login.inpSwagLabsLoginPagePaswword(PWD);
	}

	@When("user click on login btn swaglab login page")
	public void user_click_on_login_btn_swaglab_login_page() throws InterruptedException 
	{
		login.clickSwagLabsLoginPageLoginBtn();
	}

	@Then("user should be at SwagLab home page with logo {string}")
	public void user_should_be_at_swag_lab_home_page_with_logo(String expLogoText) 
	{
	   String actLogoText = home.getSwagLabsHomePageLogoText();
	   Assert.assertEquals(actLogoText, expLogoText, "Failed- Logo text mismatch");
	}

}
