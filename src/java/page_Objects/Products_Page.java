package page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends Menu_Page{
	@FindBy(css = "#react-burger-menu-btn")
	private WebElement stripsButton;
	@FindBy(css = "#about_sidebar_link")
	private WebElement aboutButton;
	@FindBy(css = ".inventory_item_name")
	private WebElement listOfProducts;
	@FindBy(css = ".product_sort_container")
	private WebElement orderBtn;
	@FindBy(css = ".inventory_item_name")
	private WebElement productName;
	// constructor
	public Products_Page(WebDriver driver) {
		super(driver);

	}

	
// add product  to cart by his name 
	public void addToCart(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item"));
		for (WebElement el : list) {
			WebElement titleEl=el.findElement(By.cssSelector(".inventory_item_name"));
			
			if (getText(titleEl).equalsIgnoreCase(name)) {
				WebElement addBtn=el.findElement(By.cssSelector(".btn_inventory"));
				click(addBtn);
				break;

			}

		}
		
	}

	
// change the list of the products  from A to Z 
	public void changeOrderOfProductsA_to_Z() {
		selectByValue(orderBtn, "az");

	}
	// change the list of the products From low to High
	public void changeOrderOfProductsLow_to_High() {
		selectByValue(orderBtn, "lohi");

	}
	// change the list of the products from Z to A
	public void changeOrderOfProductsZ_to_A() {
		selectByValue(orderBtn, "za");

	}
	// change the list of the products From High to Low
	public void changeOrderOfProductsHigh_to_Low() {
		selectByValue(orderBtn, "hilo");

	}

}
