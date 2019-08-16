import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// This code is for validating if, UI element is disabled or enabled.

public class DisableEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());	// this is for to see false, before clicking the radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));// it will show disable element before clicking the round trip radio button. opacity 0.5
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// it will click on round trip radio button
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		/* sometimes selenium is unable to show actually the element is enabled / disabled with this .isEnable/ .isDisable method.*/
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));// it will show the enable element after clicking the radio button.opacity 0.1
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Its not Enabled");
			Assert.assertTrue(false);
		}

	}

}
