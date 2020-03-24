package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Actions/index.html";
	
	@FindBy(id="draggable")
	private WebElement draggableElement;
	
	@FindBy(id="droppable")
	private WebElement droppableElement;
	
	@FindBy(id="double-click")
	private WebElement doubleClickableElement;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[1]/button")
	private WebElement hoverButton1;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[1]/div")
	private WebElement hoverLink1;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[2]/button")
	private WebElement hoverButton2;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[2]/div")
	private WebElement hoverLink2;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[3]/button")
	private WebElement hoverButton3;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[3]/div")
	private WebElement hoverLink3;
	
	@FindBy(id="click-box")
	private WebElement holdableElement;
	
	public ActionsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
