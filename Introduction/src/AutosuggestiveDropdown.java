//This Auto suggestive Drop down code didn't work for me.
// This is an incomplete code
//video : 49


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@class='sc-dEfkYy dXCOWT sc-EHOje iWFXyf']")).click();
		driver.findElement(By.id("flight-departure-airport")).sendKeys("SAN");
		driver.findElement(By.id("react-autowhatever-1")).sendKeys(Keys.ENTER);// this command will control the keyboard direction

	}

}
