package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		Loginpage l = new Loginpage(driver);
		l.serachtxtbox("dress");
		l.serachbtn();
		Homepage h=new Homepage(driver);
		h.dreeBtn();
		CartPage c=new CartPage(driver);
		c.addingtocart();

	}

}
