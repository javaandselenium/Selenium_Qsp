package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("dgdg");
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(3000);
		ele.sendKeys("admin12345");
		Thread.sleep(3000);
		driver.close();
	}

}
