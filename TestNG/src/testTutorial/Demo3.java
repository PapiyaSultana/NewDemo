package testTutorial;

import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void webLoginCarLoan()
	{
		//selenium code
		System.out.println("webLoginCar");
	}

	@Test
	public void mobileLoginCarloan()
	{
		// appium code
		System.out.println("mobileLoginCar");
	}
	
	@Test(groups= {"Smoke"})
	public void APILoginCarloan()
	{
		//API automation
		System.out.println("APILoginCar");
	}
}
