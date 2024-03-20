package tests;

import org.testng.annotations.Test;

import page_Objects.Complete_Page;
import page_Objects.Login_Page;
import page_Objects.Overview_Page;
import page_Objects.Product_Page;
import page_Objects.Products_Page;
import page_Objects.Your_Cart_Page;
import page_Objects.Your_Information_Page;

public class Buy_Products_Test extends Base_Test {
	@Test
	public void tc_01() {
		Login_Page lp = new Login_Page(driver);
		lp.login("standard_user", "secret_sauce");

		Products_Page psp = new Products_Page(driver);
		psp.addToCart("Sauce Labs Bolt T-Shirt");
		psp.addToCart("Sauce Labs Bike Light");
		psp.addToCart("Sauce Labs Fleece Jacket");
		psp.addToCart("Sauce Labs Onesie");
		psp.addToCart("Test.allTheThings() T-Shirt (Red)");
		psp.addToCart("Sauce Labs Backpack");
		
		psp.openCart();
		
		Your_Cart_Page ycp = new Your_Cart_Page(driver);
		ycp.checkout();
		
		Your_Information_Page yrp = new Your_Information_Page(driver);
		yrp.fillYourInformation("Tomer", "Russo", "54231541");
		
		yrp.continueBtn();
		
		Overview_Page ov = new Overview_Page(driver);
		ov.finishBtn();
		
		Complete_Page cp = new Complete_Page(driver);
		cp.complete();

	}

}
