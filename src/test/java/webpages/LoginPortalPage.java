package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPortalPage extends PageObject implements AlertHandler {

	private static String url = "http://webdriveruniversity.com/Login-Portal/index.html";
	
	@FindBy(id="text")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public LoginPortalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String getURL() {
		return url;
	}
	
	public LoginPortalSuccessPage enterValidCredentials(String username, String password) {
		enterCredentials(username, password);
		return new LoginPortalSuccessPage(driver);
	}
	
	public LoginPortalFailurePage enterInvalidCredentials(String username, String password) {
		enterCredentials(username, password);
		return new LoginPortalFailurePage(driver);
	}
	
	private void enterCredentials(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		acceptAlert(driver);
	}
	
	public boolean getDisplayStatus() {
		return usernameField.isDisplayed();
	}

}
