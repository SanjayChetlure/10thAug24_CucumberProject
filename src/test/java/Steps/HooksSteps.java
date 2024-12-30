package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps 
{
	
	@Given("user should get logged in")
	public void user_should_get_logged_in()
	{
		System.out.println("At Login page");
	}

	@Given("user should be at orders page")
	public void user_should_be_at_orders_page() 
	{
		System.out.println("At orders page");
	}

	@When("user click on current orders")
	public void user_click_on_current_orders() 
	{
		System.out.println("At Current Order");
	}

	@Then("user should see currently placed order")
	public void user_should_see_currently_placed_order()
	{
		System.out.println("display currently_placed_order");
	}

	@When("user click on past orders")
	public void user_click_on_past_orders()
	{
		System.out.println("At past order");
	}

	@Then("user should see previously placed order")
	public void user_should_see_previously_placed_order()
	{
		System.out.println("display previously_placed_order");
	}

	@When("user click on cancel orders")
	public void user_click_on_cancel_orders()
	{
		System.out.println("At cancel order");
	}

	@Then("user should see canceled order info")
	public void user_should_see_canceled_order_info()
	{
		System.out.println("display cancel orders");
	}

}
