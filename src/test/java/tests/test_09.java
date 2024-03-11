package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_09 extends Base_Test{
	@Test
	public	void tc_09(){
		Main_Page mp =new Main_Page(driver);
		mp.add_Item_by_photo_With_Checkout();
		
		
		
		
	}
}
