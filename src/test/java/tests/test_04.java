package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_04 extends Base_Test {
	@Test
	public	void tc_04(){
		Main_Page mp =new Main_Page(driver);
		mp.add_And_Remove_items();
		
		
		
		
	}

}
