package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Contact-Us/contactus.html";
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@name='message']")
	private WebElement messageField;
	
	@FindBy(xpath="/html/body/div[1]/div/div/section/div/div[2]/form/div/input[1]")
	private WebElement resetButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div/section/div/div[2]/form/div/input[2]")
	private WebElement submitButton;
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
