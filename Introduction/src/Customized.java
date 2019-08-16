import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();//Create Driver object for Chrome browser
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("[class='inputtext'")).sendKeys("papiya sultana");
		driver.findElement(By.cssSelector("[type='password'")).sendKeys("6777");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		

	}

}
