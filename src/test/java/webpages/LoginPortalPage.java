package webpages;

import org.openqa.selenium.WebDriver;

public class LoginPortalPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Login-Portal/index.html";
	
	public LoginPortalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String getURL() {
		return url;
	}

}
