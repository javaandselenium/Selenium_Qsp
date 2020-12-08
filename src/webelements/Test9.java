package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
         if(ele.isEnabled()) {
        	 ele.click();
        	 System.out.println("pass:element is clicked");
         }
         else
         {
        	 System.out.println("Fail:element is not clicked");
         }
	}

}
