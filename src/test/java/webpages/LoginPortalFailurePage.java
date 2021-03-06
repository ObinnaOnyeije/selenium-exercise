package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPortalFailurePage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Login-Portal/fail.html";
	
	@FindBy(id="text")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public LoginPortalFailurePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String getURL() {
		return url;
	}
	
	public boolean getDisplayStatus() {
		return usernameField.isDisplayed();
	}

}
