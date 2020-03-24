package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/File-Upload/index.html";
	
	@FindBy(id="myFile")
	private WebElement fileUploader;
	
	@FindBy(id="submit-button")
	private WebElement submitButton;
	
	public FileUploadPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
