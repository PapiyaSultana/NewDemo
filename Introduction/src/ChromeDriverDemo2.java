import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();//Create Driver object for Chrome browser
		
		driver.get("https://login.salesforce.com");// opens the URL of the browser
		driver.findElement(By.id("username")).sendKeys("papiya sultana");
		driver.findElement(By.name("pw")).sendKeys("12345");
		//driver.findElement(By.className("button r4 wide primary")).click();// compound class shows error.
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());//For printing out the login error message.
		
		
		
		/*
	 	driver.get("http://facebook.com");// opens the URL of the browser
		driver.findElement(By.id("email")).sendKeys("papiya.uiu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.cssSelector("label#loginbutton.uiuButton.uiButtonConfirm")).click();// didn't work this css.
		
		*/
	}
	
	
	

	

	}


