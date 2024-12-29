package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps
{
	@Given("user should be at account opening page")
	public void user_should_be_at_account_opening_page() 
	{
		System.out.println("account opening page");
	}

//	@When("user enters following data")
//	public void user_enters_following_data(DataTable dt)
//	{
//		List<List<String>> data = dt.asLists();
//		String value = data.get(0).get(1);
//		System.out.println(value);
//		
//		System.out.println(data.get(2).get(0));
//		System.out.println(data.get(2).get(1));
//		System.out.println(data.get(2).get(2));
//		System.out.println(data.get(2).get(3));
//		
//		System.out.println(data.get(3).get(0));
//		System.out.println(data.get(3).get(1));
//		System.out.println(data.get(3).get(2));
//		System.out.println(data.get(3).get(3));
//	}
	
	
	@When("user enters following data")
	public void user_enters_following_data(DataTable dt)
	{
		List<Map<String, String>> data = dt.asMaps();
		
		System.out.println(data.get(1).get("FN"));
		System.out.println(data.get(1).get("LN"));
		System.out.println(data.get(1).get("Mail ID"));
		System.out.println(data.get(1).get("Mob Num"));
		
		System.out.println(data.get(2).get("FN"));
		System.out.println(data.get(2).get("LN"));
		System.out.println(data.get(2).get("Mail ID"));
		System.out.println(data.get(2).get("Mob Num"));
		
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() 
	{
		System.out.println("click on submit btn");
	}

	@Then("user get created")
	public void user_get_created() 
	{
		System.out.println("----user created-----");
	}


}
