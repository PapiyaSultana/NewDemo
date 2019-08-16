import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());// * mark after the attribute name is needed cause here i didn't put the whole value name like id="ctl00_mainContent_chk_IndArm". So the * mark will identify any id which matching with the IndArm.
		driver.findElement(By.cssSelector("input[id*=IndArm]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}
