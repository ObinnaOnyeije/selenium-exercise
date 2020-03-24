package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablePage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Data-Table/index.html";
	
	@FindBy(id="t01")
	private WebElement table1;
	
	@FindBy(id="t02")
	private WebElement table2;
	
	@FindBy(xpath="//*[@id=\"form-textfield\"]/input[1]")
	private WebElement firstNameField;
	
	@FindBy(xpath="//*[@id=\"form-textfield\"]/input[2]")
	private WebElement lastNameField;
	
	@FindBy(xpath="//*[@id=\"form-textfield\"]/textarea")
	private WebElement textInputField;
	
	public DataTablePage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
