package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		int x1 = username.getLocation().getX();
		System.out.println(x1);
        WebElement password = driver.findElement(By.name("pwd"));
        int x2 = password.getLocation().getX();
        System.out.println(x2);
        if(x1==x2) {
        	System.out.println("Pass");
        }
        else
        {
        	System.out.println("Fail");
        }
        
        driver.close();
	}
	

}
