package tests;

import org.testng.annotations.Test;

import page_Objects.Login_Page;
import page_Objects.Main_Page;

public class test_07 extends Base_Test {
	@Test
	public	void tc_07(){
		Login_Page lp =new Login_Page(driver);
		lp.login_Logout();
		
		
		
		
	}

}
