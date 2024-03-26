package tests;

import org.testng.annotations.Test;

import page_Objects.Login_Page;

public class Login_Test extends Base_Test {
	@Test
	public void tc_01_login_failed1() {
		Login_Page lp = new Login_Page(driver);
		lp.login("standard_user", "123456");
	}
	@Test
	public void tc_02_login_failed2() {
		Login_Page lp = new Login_Page(driver);
		lp.login("King Russo", "secret_sauce");
	}
	@Test
	public void tc_03_login_failed3() {
		Login_Page lp = new Login_Page(driver);
		lp.login("Tomer Russo", "123456");
	}
	@Test
	public void tc_04_login_suceed() {
		Login_Page lp = new Login_Page(driver);
		lp.login("standard_user", "secret_sauce");
	}
	

}
