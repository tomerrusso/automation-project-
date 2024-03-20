package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Complete_Page extends Menu_Page {
	@FindBy(css = "#back-to-products")
	private WebElement backHomeBtn;
	public Complete_Page(WebDriver driver) {
		super(driver);
		
	}
	public void complete() {
		waiting(1500);
		click(backHomeBtn);
		
	}

}
