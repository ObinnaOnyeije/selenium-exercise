package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ToDoListPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/To-Do-List/index.html";
	
	@FindAll({
		@FindBy(xpath="//*[@id=\"container\"]/ul/li")
	})
	private List<WebElement> toDoListElements;
	
	@FindBy(id="plus-icon")
	private WebElement addItemButton;
	
	@FindBy(xpath="//*[@id=\"container\"]/input")
	private WebElement addItemTextField;
	
	public ToDoListPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
