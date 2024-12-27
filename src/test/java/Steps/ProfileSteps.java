package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps
{
	
	@Then("get Title & verify")
	public void get_title_verify()
	{
		System.out.println("--title verified---");
	}

	@When("user click on profile tab")
	public void user_click_on_profile_tab() 
	{
		System.out.println("click on profile tab");
	}

	@Then("get profile name & validate")
	public void get_profile_name_validate()
	{
		System.out.println("--Profile name verified--");
	}

	@When("user click on logout btn")
	public void user_click_on_logout_btn()
	{
		System.out.println("click on logout btn");
	}

	@Then("logged out from app")
	public void logged_out_from_app()
	{
		System.out.println("--logged out from app--");
	}

}
