import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();//Create Driver object for Chrome browser
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//used css regualar expression.
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sultana papiya");
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div[style*='float']")).getText());
		
	}

}
