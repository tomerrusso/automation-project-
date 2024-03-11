package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_06 extends Base_Test{
	@Test
	public	void tc_06(){
		Main_Page mp =new Main_Page(driver);
		mp.select_By_Filter();
		
		
		
		
	}
}
