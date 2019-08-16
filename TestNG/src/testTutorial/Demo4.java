package testTutorial;

import org.testng.annotations.Test;

public class Demo4 {
	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan()
	{
		//selenium code
		System.out.println("webLoginhome");
	}

	@Test
	public void mobileLoginHomeloan()
	{
		// appium code
		System.out.println("mobileLoginhome");
	}
	
	@Test
	public void mobileSigninHomeloan()
	{
		// appium code
		System.out.println("mobilesigninhome");
	}
	
	@Test
	public void mobilesignupHomeloan()
	{
		// appium code
		System.out.println("mobilesignuphome");
	}
	
	
	@Test
	public void mobiletestloan()
	{
		// appium code
		System.out.println("mobiletesthome");
	}
	
	@Test
	public void APILoginHomeloan()
	{
		//API automation
		System.out.println("APILoginhome");
	}
}