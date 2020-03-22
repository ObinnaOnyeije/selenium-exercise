package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Contact-Us/contactus.html";
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/input[1]")
	private WebElement firstNameField;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/input[2]")
	private WebElement lastNameField;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/input[3]")
	private WebElement emailField;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/textarea")
	private WebElement messageField;
	
	@FindBy(xpath="//*[@id=\"form_buttons\"]/input[1]")
	private WebElement resetButton;
	
	@FindBy(xpath="//*[@id=\"form_buttons\"]/input[2]")
	private WebElement submitButton;
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	public ContactFormThankYouPage fillForm(String first, String last, String email, String message) {
		firstNameField.sendKeys(first);
		lastNameField.sendKeys(last);
		emailField.sendKeys(email);
		messageField.sendKeys(message);
		submitButton.click();
		
		return new ContactFormThankYouPage(driver);
	}

}
