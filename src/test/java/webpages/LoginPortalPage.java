package webpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPortalPage extends PageObject {

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
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public boolean getDisplayStatus() {
		return usernameField.isDisplayed();
	}

}
