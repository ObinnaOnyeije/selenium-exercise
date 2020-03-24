package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends PageObject {

	private static String url = "http://webdriveruniversity.com/IFrame/index.html";
	
	@FindBy(id="frame")
	private WebElement frame;
	
	public IFramePage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
