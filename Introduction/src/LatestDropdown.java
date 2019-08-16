// Example for Static Dropdowns
//This code Selects the number of passenger

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LatestDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Papiya\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
	
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}