package tests;

import org.testng.annotations.Test;

import page_Objects.Main_Page;

public class test_02 extends Base_Test {
	@Test
public	void tc_02(){
		Main_Page mp =new Main_Page(driver);
		mp.getToAbout();
		
		
		
		
	}
	
	

}
