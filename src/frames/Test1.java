package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		WebElement ele = driver.findElement(By.xpath("//iframe[@scrolling='no']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
	
	}

}
