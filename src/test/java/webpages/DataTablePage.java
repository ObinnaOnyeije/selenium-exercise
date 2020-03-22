package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablePage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Data-Table/index.html";
	
	public DataTablePage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
