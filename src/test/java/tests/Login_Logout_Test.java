package tests;

import org.testng.annotations.Test;

import page_Objects.Login_Page;
import page_Objects.Menu_Page;

public class Login_Logout_Test extends Base_Test {
	@Test
	public void tc_01_() {
		Login_Page lp = new Login_Page(driver);
		lp.login("standard_user", "secret_sauce");
		Menu_Page mp = new Menu_Page(driver);
		mp.openMenu();
		mp.logout();
		
	}
}
