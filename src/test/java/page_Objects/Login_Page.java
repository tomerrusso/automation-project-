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
	@FindBy(css = "#about_sidebar_link")
	private WebElement aboutButton;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logOutButton;
	@FindBy(css = "#react-burger-menu-btn")
	private WebElement stripsButton;

	// constructor
	public Login_Page(WebDriver driver) {
		super(driver);

	}

	public void login() {
		fillText(userName, "standard_user");
		waiting(2500);
		fillText(password, "secret_sauce");
		waiting(2500);
		click(loginButton);
		waiting(1500);

	}

	public void wrongPasswordLogin() {
		fillText(userName, "standard_user");
		waiting(2500);
		fillText(password, "123456");
		waiting(2500);
		click(loginButton);
		waiting(1500);
		validationTitleTab(getTitle());

		

	}

	public void wrongUserLogin() {
		fillText(userName, "tomer russo");
		waiting(2500);
		fillText(password, "secret_sauce");
		waiting(2500);
		click(loginButton);
		waiting(1500);
		validationTitleTab(getTitle());

	}

	public void noPasswordLogin() {
		fillText(userName, "standard_user");
		waiting(2500);
		fillText(password, "");
		waiting(2500);
		click(loginButton);
		waiting(1500);
		validationTitleTab(getTitle());

	}

	public void noUserLogin() {
		fillText(userName, " ");
		waiting(2500);
		fillText(password, "123456");
		waiting(2500);
		click(loginButton);
		waiting(1500);
		validationTitleTab(getTitle());

	}
	public void clear() {
		fillText(userName, "");
		fillText(password, "");
		waiting(500);
	}
	public void login_Logout() {
		fillText(userName, "standard_user");
		waiting(2500);
		fillText(password, "secret_sauce");
		waiting(2500);
		click(loginButton);
		waiting(1500);
		click(stripsButton);
		waiting(1500);
		click(logOutButton);
	}

}
