import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight")).click();// This command will only for selecting current date
		

	}

}
