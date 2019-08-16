package testTutorial;

import org.testng.annotations.Test;

public class Demo1 {
	@Test  // test annotation for running each test cases
	
	//method calling
	public void Case()
	{
		System.out.println("Hello");
	}
	@Test
	public void SecondCase()
	{
		System.out.println("bye");
	}

}
