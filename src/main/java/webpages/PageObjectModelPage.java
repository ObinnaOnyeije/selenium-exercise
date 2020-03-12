package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModelPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Page-Object-Model/index.html";
	
	public PageObjectModelPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
