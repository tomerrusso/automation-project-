package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main_Page extends Base_Page {
	@FindBy(css = "#react-burger-menu-btn")
	private WebElement stripsButton;
	@FindBy(css = "#about_sidebar_link")
	private WebElement aboutButton;
	@FindBy(css = "#add-to-cart-sauce-labs-backpack")
	private WebElement addBackPack;
	@FindBy(css = "#add-to-cart-sauce-labs-bike-light")
	private WebElement addBikeLight;
	@FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addBoltTshirt;
	@FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addJaket;
	@FindBy(css = "#add-to-cart-sauce-labs-onesie")
	private WebElement addOnesie;
	@FindBy(css = "[name='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addTshirtRed;
	@FindBy(css = "#shopping_cart_container")
	private WebElement shoppingCart;
	@FindBy(css = "#checkout")
	private WebElement chekoutBtn;
	@FindBy(css = "#first-name")
	private WebElement firstNameFiled;
	@FindBy(css = "#last-name")
	private WebElement lastNameFiled;
	@FindBy(css = "#postal-code")
	private WebElement postalCodeField ;
	@FindBy(css = "#continue")
	private WebElement continueBtn ;
	@FindBy(css = "#finish")
	private WebElement finishBtn ;
	@FindBy(css = "#remove-sauce-labs-backpack")
	private WebElement removeBackPack ;
	@FindBy(css = "#remove-sauce-labs-bike-light")
	private WebElement removeBikeLight ;
	@FindBy(css = "#remove-sauce-labs-bolt-t-shirt")
	private WebElement removeBoltTshirt ;
	@FindBy(css = "#remove-sauce-labs-fleece-jacket")
	private WebElement removeJaket ;
	@FindBy(css = "#remove-sauce-labs-onesie")
	private WebElement removeOnesie ;
	@FindBy(css = "[name='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement removeTshirtRed ;
	@FindBy(css = "#continue-shopping")
	private WebElement continueShopping ;	
	@FindBy(css = ".product_sort_container")
	private WebElement filterBtn ;
	@FindBy(css = "#back-to-products")
	private WebElement backToProductsBtn ;
	@FindBy(css = "[alt='Sauce Labs Backpack']")
	private WebElement photoBackpack ;	
	@FindBy(css = "[alt='Sauce Labs Bike Light']")
	private WebElement photoBikeLight ;	
	@FindBy(css = "[alt='Sauce Labs Bolt T-Shirt']")
	private WebElement photoBoltTshirt ;	
	@FindBy(css = "[alt='Sauce Labs Fleece Jacket']")
	private WebElement photoJaket ;	
	@FindBy(css = "[alt='Sauce Labs Onesie']")
	private WebElement photoOnesie ;	
	@FindBy(css = "[alt='Test.allTheThings() T-Shirt (Red)']")
	private WebElement photoTshirtRed ;	
	
		

	public Main_Page(WebDriver driver) {
		super(driver);

	}

	public void getToAbout() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		click(stripsButton);
		click(aboutButton);
	}

	public void addItems_toCartWith_Checkout() {
		Login_Page lp = new Login_Page(driver);
	lp.login();
		click(addBackPack);
		waiting(1500);
		click(addBikeLight);
		waiting(1500);
		click(addBoltTshirt);
		waiting(1500);
		click(addJaket);
		waiting(1500);
		click(addOnesie);
		waiting(1500);
		click(addTshirtRed);
		waiting(500);
		click(shoppingCart);
		waiting(2500);
		scrollDown(chekoutBtn);
		click(chekoutBtn);
		waiting(500);
		fillText(firstNameFiled, "Tomer");
		waiting(1000);
		fillText(lastNameFiled, "Russo");
		waiting(1000);
		fillText(postalCodeField, "123456");
		waiting(1000);
		click(continueBtn);
		waiting(1000);
		scrollDown(finishBtn);
		click(finishBtn);

	}
	public void add_And_Remove_items() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		click(addBackPack);
		waiting(1500);
		click(addBikeLight);
		waiting(1500);
		click(addBoltTshirt);
		waiting(1500);
		click(addJaket);
		waiting(1500);
		click(addOnesie);
		waiting(1500);
		click(addTshirtRed);
		waiting(1500);
		click(removeBackPack);
		waiting(1500);
		click(removeBikeLight);
		waiting(1500);
		click(removeBoltTshirt);
		waiting(1500);
		click(removeJaket);
		waiting(1500);
		click(removeOnesie);
		waiting(1500);
		click(removeTshirtRed);
		
	}
	public void add_And_Remove_items_From_Cart() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		click(addBackPack);
		waiting(1500);
		click(addBikeLight);
		waiting(1500);
		click(addBoltTshirt);
		waiting(1500);
		click(addJaket);
		waiting(1500);
		click(addOnesie);
		waiting(1500);
		click(addTshirtRed);
		waiting(1500);
		click(shoppingCart);
		waiting(1000);
		click(removeBackPack);
		waiting(1500);
		click(removeBikeLight);
		waiting(1500);
		click(removeBoltTshirt);
		waiting(1500);
		click(removeJaket);
		waiting(1500);
		click(removeOnesie);
		waiting(1500);
		click(removeTshirtRed);
		waiting(1000);
		click(continueShopping);
		
	}
	public void select_By_Filter() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		waiting(1000);
		selectByValue(filterBtn,"az" );
		waiting(2500);
		selectByValue(filterBtn, "za");
		waiting(2500);
		selectByValue(filterBtn,"lohi" );
		waiting(2500);
		selectByValue(filterBtn, "hilo");
		
	}
	public void checkout_With_Nothing() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		waiting(1500);
		click(shoppingCart);
		waiting(2500);
		scrollDown(chekoutBtn);
		click(chekoutBtn);
		waiting(500);
		fillText(firstNameFiled, "Tomer");
		waiting(1000);
		fillText(lastNameFiled, "Russo");
		waiting(1000);
		fillText(postalCodeField, "123456");
		waiting(1000);
		click(continueBtn);
		waiting(1000);
		scrollDown(finishBtn);
		click(finishBtn);
		
		
	}
	public void add_Item_by_photo_With_Checkout() {
		Login_Page lp = new Login_Page(driver);
		lp.login();
		click(photoBackpack);
		waiting(1000);
		click(addBackPack);
		click(backToProductsBtn);
		waiting(1000);
		click(photoBikeLight);
		waiting(1000);
		click(addBikeLight);
		click(backToProductsBtn);
		waiting(1500);
		click(photoBoltTshirt);
		waiting(1000);
		click(addBoltTshirt);
		click(backToProductsBtn);
		waiting(1500);
		click(photoJaket);
		waiting(1000);
		click(addJaket);
		click(backToProductsBtn);
		waiting(1500);
		click(photoOnesie);
		waiting(1000);
		click(addOnesie);
		click(backToProductsBtn);
		waiting(1500);
		click(photoTshirtRed);
		waiting(1000);
		click(addTshirtRed);
		click(backToProductsBtn);
		waiting(500);
		click(shoppingCart);
		waiting(2500);
		scrollDown(chekoutBtn);
		click(chekoutBtn);
		waiting(500);
		fillText(firstNameFiled, "Tomer");
		waiting(1000);
		fillText(lastNameFiled, "Russo");
		waiting(1000);
		fillText(postalCodeField, "123456");
		waiting(1000);
		click(continueBtn);
		waiting(1000);
		scrollDown(finishBtn);
		click(finishBtn);
	}

}
