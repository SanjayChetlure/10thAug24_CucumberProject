package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks 
{
	@Before
	public void beforeHook() 
	{
		System.out.println("--Running before Hook--");
	}
	
	
	@After
	public void afterHook() 
	{
		System.out.println("--Running after Hook--");
	}
	
	
//	@BeforeStep
//	public void beforeStepHook() 
//	{
//		System.out.println("--Running beforeStep  Hook--");
//	}
//	
//	
//	@AfterStep
//	public void afterStepHook() 
//	{
//		System.out.println("--Running afterStep Hook--");
//	}

}
