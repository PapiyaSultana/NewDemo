import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();

driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

driver.findElement(By.xpath("//div[@class='display']//form//input")).click();

System.out.println(driver.switchTo().alert().getText());// Alert message will pop up.

//driver.switchTo().alert().sendKeys("fesfe");// To use the edit box

driver.switchTo().alert().accept(); //Accept = click on ok/ done/ yes buttons.

//driver.switchTo().alert().dismiss();// when we have cancel button in the pop up message box

}

}