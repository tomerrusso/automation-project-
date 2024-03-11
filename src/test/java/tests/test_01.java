package tests;

import org.testng.annotations.Test;

import page_Objects.Login_Page;
import page_Objects.Main_Page;

public class test_01 extends Base_Test {
	@Test
public void tc_01() {
	Login_Page lg = new Login_Page(driver);
	lg.wrongPasswordLogin();
	lg.clear();
	lg.wrongUserLogin();
	lg.clear();
	lg.noUserLogin();
	lg.clear();
	lg.noPasswordLogin();
	lg.clear();
	lg.login();
	
	
	
}
	
}
