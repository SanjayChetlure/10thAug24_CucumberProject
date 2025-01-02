package Steps;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import Module1_Login.SwagLabsHomePage;
import Module5_Order.SwagLabCheckoutCompletePage;
import Module5_Order.SwagLabCheckoutInfoPage;
import Module5_Order.SwagLabCheckoutOverviewPage;
import Module5_Order.SwagLabYourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RE_OrdersStep
{
	SwagLabsHomePage home=new SwagLabsHomePage(DriverFactory.driver);
	SwagLabYourCartPage yourCart=new SwagLabYourCartPage(DriverFactory.driver);
	SwagLabCheckoutInfoPage checkoutInfo=new SwagLabCheckoutInfoPage(DriverFactory.driver);
	SwagLabCheckoutOverviewPage overview=new SwagLabCheckoutOverviewPage(DriverFactory.driver);
	SwagLabCheckoutCompletePage complete =new SwagLabCheckoutCompletePage(DriverFactory.driver);
	
	@When("user click the AddToCart btn on HomePage")
	public void user_click_the_add_to_cart_btn_on_home_page()
	{
		home.clickSwagLabHomePageBackPackAddToCart();
	}

	@When("user click CartLink on HomePage")
	public void user_click_cart_link_on_home_page() 
	{
		home.clickSwagLabHomePageCartLink();
	}

	@When("user click Checkout btn on YourCartPage")
	public void user_click_checkout_btn_on_your_cart_page()
	{
		yourCart.clickSwagLabYourCartPageCheckout();
	}

	@When("user enter FN as {string} on CheckoutInfoPage")
	public void user_enter_fn_as_on_checkout_info_page(String firstName)
	{
		checkoutInfo.inpSwagLabCheckoutInfoPageFN(firstName);
	}

	@When("user enter LN as {string} on CheckoutInfoPage")
	public void user_enter_ln_as_on_checkout_info_page(String lastName) 
	{
		checkoutInfo.inpSwagLabCheckoutInfoPageLN(lastName);
	}

	@When("user enter Pin code as {string} on CheckoutInfoPage")
	public void user_enter_pin_code_as_on_checkout_info_page(String pinCode) 
	{
		checkoutInfo.inpSwagLabCheckoutInfoPagePC(pinCode);
	}

	@When("user click the continue btn on CheckoutInfoPage")
	public void user_click_the_continue_btn_on_checkout_info_page() 
	{
		checkoutInfo.clickSwagLabCheckoutInfoPageContinueBtn();
	}

	@When("user click FinishBtn on CheckoutOverviewPage")
	public void user_click_finish_btn_on_checkout_overview_page() 
	{
		overview.clickSwagLabCheckoutOverviewPageFinishBtn();
	}

	@Then("User should reach the OrderCompletePage with message {string}")
	public void user_should_reach_the_order_complete_page_with_message(String expMsg) 
	{
		String actMsg=complete.getSwagLabCheckoutCompletePageOrderDispatchMsg();
		Assert.assertEquals(actMsg, expMsg);
	}

}
