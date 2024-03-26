package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu_Page extends Base_Page {
	@FindBy(css = "#shopping_cart_container")
	private WebElement openCart;
	@FindBy(css = "#react-burger-menu-btn")
	private WebElement openMenu;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logoutBtn;
	// constructor
	public Menu_Page(WebDriver driver) {
		super(driver);

	}
	// click on the open cart button
	public void openCart() {
		click(openCart);
	}
	// click on the open menu button
	public void openMenu() {
		waiting(1500);
		click(openMenu);
	}
	// click on the logout button
	public void logout() {
		waiting(1500);
		click(logoutBtn);
	}

}
