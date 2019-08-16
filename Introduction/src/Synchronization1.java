import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// This code is for Implicit wait time is not working


public class Synchronization1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1563727377320&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-homepage-bookingformlet-hotelstab-Q12019-home-tr");
		driver.findElement(By.cssSelector("input[ng-model='$ctrl.location']")).click();
		driver.findElement(By.id("FH-origin")).sendKeys("nyc");
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
		driver.findElement(By.cssSelector("input[ng-model='$ctrl.checkInDate']")).sendKeys(Keys.ENTER);
		
	}

}
