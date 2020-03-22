package webpages;

import org.openqa.selenium.WebDriver;

public class ClickButtonsPage extends PageObject {
	
	private static String url = "http://webdriveruniversity.com/Click-Buttons/index.html";

	public ClickButtonsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}

}
