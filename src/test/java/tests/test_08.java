package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_08 extends Base_Test{
	@Test
	public	void tc_08(){
		Main_Page mp =new Main_Page(driver);
		mp.checkout_With_Nothing();
		
		
		
		
	}

}
