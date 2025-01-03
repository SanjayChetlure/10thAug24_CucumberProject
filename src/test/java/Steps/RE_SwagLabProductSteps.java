package Steps;

import org.testng.Assert;
import LibraryFiles.DriverFactory;
import Module1_Login.SwagLabsHomePage;
import io.cucumber.java.en.Then;

public class RE_SwagLabProductSteps
{
	SwagLabsHomePage home=new SwagLabsHomePage(DriverFactory.driver);
	
	@Then("product name {string} should be visible on home page")
	public void product_name_should_be_visible_on_home_page(String expProductName) 
	{
		String actProductName = home.getSwagLabsHomePageOneSieProductName();
		Assert.assertEquals(expProductName, actProductName,"Act & Exp product name mismatch");
	}
	
	
	@Then("OneSie Product Price should be {double}")
	public void one_sie_product_price_should_be(double expProductName)
	{
		double actProductPrice = home.getSwagLabsHomePageOneSieProductPrice();
		Assert.assertEquals(expProductName, actProductPrice,"Act & Exp product price mismatch");
	}
	
	
	@Then("Home Product Size should be {int}")
	public void home_product_size_should_be(Integer expProductSize) 
	{
	  int actProductSize = home.getSwagLabsHomePageProductSize();
	  Assert.assertEquals(actProductSize, expProductSize,"Act & Exp product size mismatch");
	}
	
	@Then("Product price should be {double}")
	public void product_price_should_be(Double expTotalProductPrice)
	{
		double actTotalProductPrice= home.getSwagLabsHomePageProductSum();
		  Assert.assertEquals(actTotalProductPrice, expTotalProductPrice, "Act & Exp Total product price mismatch");
	}
	

}
