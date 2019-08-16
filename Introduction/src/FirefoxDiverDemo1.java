import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDiverDemo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Papiya\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*webdriver.gecko.driver. this is key value for mozilla*/
		
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("http:facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("papiya sultana");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("12345");
		driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
		
		
	}

}
