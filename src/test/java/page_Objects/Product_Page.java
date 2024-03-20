package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product_Page extends Menu_Page {
	@FindBy(css = "#back-to-products")
	private WebElement backBtn;
	
	public Product_Page(WebDriver driver) {
		super(driver);

	}
	
	
	public void back() {
		click(backBtn);
	}

}
