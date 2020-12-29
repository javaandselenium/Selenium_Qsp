package pom;

import org.testng.annotations.Test;

public class Testcase3 extends BaseClass{

	@Test
	public void testcase2(){
		Loginpage l = new Loginpage(driver);
		l.serachbtn();
		Homepage h=new Homepage(driver);
		h.dreeBtn();

	}

}
