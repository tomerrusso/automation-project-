package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	@FindBy(css = "#user-name")
	private WebElement userName;
	@FindBy(css = "#password")
	private WebElement password;
	@FindBy(css = "#login-button")
	private WebElement loginButton;
	

	// constructor
	public Login_Page(WebDriver driver) {
		super(driver);

	}

	public void login(String userText,String passwordText) {
		fillText(userName, userText);
		waiting(2500);
		fillText(password, passwordText);
		waiting(2500);
		click(loginButton);
		waiting(1500);

	}

	

}
