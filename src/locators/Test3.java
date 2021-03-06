package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin200");
		driver.findElement(By.name("pwd")).sendKeys("manager");driver.findElement(By.xpath("//div[text()='Login ']")).click();String actTitle = driver.getTitle();
		System.out.println(actTitle);
	    String url = driver.getCurrentUrl();
		System.out.println(url);
		// validation
		if (actTitle.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Pass:Home page is dispalyed");
		} else {
			System.out.println("Fail:Home page is not dispalyed");
		}
		driver.close();
	}

}
