package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/demo.html");
		WebElement ele = driver.findElement(By.cssSelector("input[value='username']"));
         if(ele.isEnabled()) {
        	 ele.click();
        	 System.out.println("Pass:element is enabled");
         }
         else
         {
        	 System.out.println("Fail:element is not enabled");
         }
	}

}
