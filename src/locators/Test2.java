package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=order");
	driver.findElement(By.id("search_query_top")).sendKeys("dress");
	driver.findElement(By.name("submit_search")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("i[class='icon-plus']")).click();
	driver.findElement(By.id("color_14")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	Thread.sleep(3000);
	driver.close();
	}

}
