import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo1 {

	public static void main(String[] args) {

		//selenium code{
		
	// We will strictly implement methods of webdriver	
		
	
		//Class name = ChromeDriver;
		// invoke.exe file first;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();//Create Driver object for Chrome browser
		
		//webdriver.chrome.driver.This is key value for chrome.
		
		/*{Basic methods of chrome driver:
		
		driver.get("https://google.com");// Hit URL on the browser
		System.out.println(driver.getTitle());// Validate the page title
		System.out.println(driver.getCurrentUrl());// Validate if it landed on the current URL
		System.out.println(driver.getPageSource());// Print page source.
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.close();// closes current browser
		driver.quit();// closes all the browsers open by the Selenium.
		
		Basic methods of chrome driver}*/
		
		/* Use of Locators*/
		
		driver.get("http://facebook.com");// opens the URL of the browser
		driver.findElement(By.id("email")).sendKeys("papiya.uiu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}
	
	

	

	}


