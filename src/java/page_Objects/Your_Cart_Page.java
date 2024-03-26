package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Your_Cart_Page extends Menu_Page {
	@FindBy(css = "#checkout")
	private WebElement checkout;
	@FindBy(css = "#continue-shopping")
	private WebElement continueShopping;
	// constructor
	public Your_Cart_Page(WebDriver driver) {
		super(driver);

	}
// click on the checkout button
	public void checkout() {
		click(checkout);
	}
//click on the continue shopping button
	public void continueShopping() {
		click(continueShopping);
	}

}
