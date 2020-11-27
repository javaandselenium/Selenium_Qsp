package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoapp.skillrary.com/");
driver.findElement(By.cssSelector("a[href='login.php?type=login']")).click();
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("user");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("user");
driver.findElement(By.cssSelector("button[id='last']")).click();
	}

}
