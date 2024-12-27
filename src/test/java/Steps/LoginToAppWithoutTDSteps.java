package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToAppWithoutTDSteps 
{
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("login page");
	}

	@When("user enter username")
	public void user_enter_username()
	{
		System.out.println("Enter UN");
	}

	@When("user enter password")
	public void user_enter_password() 
	{
		System.out.println("Enter PWD");
	}

	@When("user click on login btn")
	public void user_click_on_login_btn() 
	{
		System.out.println("click on login btn");
	}

	@Then("user should be on home page")
	public void user_should_be_on_home_page() 
	{
		System.out.println("----Home Page visible---");
	}
	
	@Then("title of the app should be visible")
	public void title_of_the_app_should_be_visible() 
	{
		System.out.println("---titile visible---");
	}
	
	@When("user click on forgotten pwd link")
	public void user_click_on_forgotten_pwd_link()
	{
		System.out.println("click on forgotten pwd link");
	}

	@Then("title of the forgotten pwd page should be visible")
	public void title_of_the_forgotten_pwd_page_should_be_visible() 
	{
		System.out.println("----forgotten pwd page visible----");
	}
	
	
	@When("user enter username {string}")
	public void user_enter_username(String string) 
	{
		System.out.println("Enter username: "+string);
	}

	@When("user enter password {string}")
	public void user_enter_password(String string) 
	{
		System.out.println("Enter password: "+string);
	}

	@When("user enter pin {int}")
	public void user_enter_pin(Integer int1) 
	{
		System.out.println("Enter Pin: "+ int1);
	}

	
}
