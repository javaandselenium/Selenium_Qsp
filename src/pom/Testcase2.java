package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 extends BaseClass {

	@Test
	public void testcase2(){
		Loginpage l = new Loginpage(driver);
		l.serachtxtbox("dress");
		l.serachbtn();
		Homepage h=new Homepage(driver);
		h.dreeBtn();

	}

}
