// Example for Static Dropdowns
// This code selects the currency

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));// in this select class argument we need to pass the web element of the drop down button
		//s.selectByValue("USD");
		//s.selectByIndex(2);
		s.selectByVisibleText("AED");
	}

}
