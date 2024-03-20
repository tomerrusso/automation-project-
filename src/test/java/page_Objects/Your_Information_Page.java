package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Your_Information_Page extends Menu_Page {
	@FindBy(css = "#continue")
	private WebElement continueBtn;
	@FindBy(css = "#first-name")
	private WebElement firstName;
	@FindBy(css = "#last-name")
	private WebElement lastName;
	@FindBy(css = "#postal-code")
	private WebElement postalNum;
	@FindBy(css = "#cancel")
	private WebElement cancelBtn;

	public Your_Information_Page(WebDriver driver) {
		super(driver);

	}

	public void continueBtn() {
		click(continueBtn);

	}

	public void fillYourInformation(String privatename,String familyName, String postal) {
		fillText(firstName, privatename);
		waiting(2500);
		fillText(lastName, familyName);
		waiting(2500);
		fillText(postalNum, postal);
	}

}