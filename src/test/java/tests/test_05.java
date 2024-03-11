package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_05 extends Base_Test {
	@Test
	public	void tc_05(){
		Main_Page mp =new Main_Page(driver);
		mp.add_And_Remove_items_From_Cart();
		
		
		
		
	}
}
