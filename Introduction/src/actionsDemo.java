import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();// THIS COMMAND WILL MAXIMIZE THE WINDOW
		
		
		Actions a = new Actions(driver);// creating actions class object, and passing the driver object
		
		// To avoid the repetition of same command we can write this way :
		
		//WebElement move= (driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
		//a.moveToElement(move).build().perform();// this action moves to specific element.
		
		//below command will write hello in caps letter in search box
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		// below command will select the hello
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		
		// this action moves to specific element. And with the help of contextClick we can perform right click of the mouse.
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		
		
		
		

	}

}
