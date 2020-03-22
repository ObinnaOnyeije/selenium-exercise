package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AjaxLoaderPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Ajax-Loader/index.html";
	
	public AjaxLoaderPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
