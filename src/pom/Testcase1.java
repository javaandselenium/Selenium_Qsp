package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 extends BaseClass{

	@Test
	public void testcase1(){
		Loginpage l = new Loginpage(driver);
		l.serachtxtbox("dress");
		l.serachbtn();
		Homepage h=new Homepage(driver);
		h.dreeBtn();
		CartPage c=new CartPage(driver);
		c.addingtocart();

	}

}
