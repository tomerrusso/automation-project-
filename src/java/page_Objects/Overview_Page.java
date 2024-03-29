package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview_Page extends Menu_Page {
	@FindBy(css = "#finish")
	private WebElement finish;
	@FindBy(css = "#cancel")
	private WebElement cancel;
	// constructor
	public Overview_Page(WebDriver driver) {
		super(driver);
		
	}
	// scoroll down and click on the finish button
	public void finishBtn() {
		waiting(2500);
		scrollDown(finish);
		click(finish);
		
	}
	// click on the cancel button 
	public void cancelBtn() {
		click(cancel);
		
	}

}
