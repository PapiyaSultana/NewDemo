import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());// this command will print how many radio buttons we have. We have to select findElements instead of FindElement to get the size.
	}

}
