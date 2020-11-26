package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.findElement(.id("email")).sendKeys("selenium@gmail.com");
//        driver.findElement(By.name("pass1")).sendKeys("tyryvgytyuufjhu");
	  //  driver.findElement(By.linkText("Forgotten password?")).click();
	    driver.findElement(By.name("ghghgsjhj")).click();
	}

}
