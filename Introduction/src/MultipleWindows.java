import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to handle Multiple windows: parent to child AND child to parent windows. video: 79,80


public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Papiya\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		//will navigate to parent window
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		// will navigate to the child(help) page
		driver.findElement(By.cssSelector("a[href='https://support.google.com/accounts?hl=en']")).click();
		
		System.out.println("Before Switching:");
		System.out.println(driver.getTitle());// till this step we can see selenium is always showing the title of parent page
		
		
		/*Below are the steps to navigate from parent to child and work on child page and display the title of child page.
		 * at first we need to give our selenium all the windows id
		 * there could be total three kinds of windows: parent->child->sub child
		 */
		
		
		Set<String>id=driver.getWindowHandles();// to get all the windows id
		Iterator<String> it=id.iterator();// this will traverse between parent to child
		String parentid= it.next();// iterator will go to the next step means parent id.
		String childid= it.next();// will go down the next step.
		driver.switchTo().window(childid);
		System.out.println("After Switching:");
		System.out.println(driver.getTitle());
		
		
		//This is for going back to parent window again
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent:");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
