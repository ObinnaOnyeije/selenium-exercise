package webpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ClickButtonsPage extends PageObject {
	
	private static String url = "http://webdriveruniversity.com/Click-Buttons/index.html";

	@FindBy(id="button1")
	private WebElement button1;
	
	@FindBy(id="button2")
	private WebElement button2;
	
	@FindBy(id="button3")
	private WebElement button3;
	
	@FindBy(id="myModalClick")
	private WebElement myModalClick;
	
	@FindBy(id="myModalJSClick")
	private WebElement myModalJSClick;
	
	@FindBy(id="myModalMoveClick")
	private WebElement myModalMoveClick;
	
	List<ModalObject> modalObjects = new ArrayList<ModalObject>();
	
	public ClickButtonsPage(WebDriver driver) {
		super(driver);
		List<WebElement> modalElements = new ArrayList<WebElement>();
		modalElements.add(myModalClick);
		modalElements.add(myModalJSClick);
		modalElements.add(myModalMoveClick);
		
		for(WebElement modal: modalElements) {
			WebElement closeButton = modal.findElement(By.xpath(".//div/div/div[1]/button"));
			WebElement header = modal.findElement(By.xpath(".//div/div/div[1]"));
			List<WebElement> headerElements = header.findElements(By.xpath(".//*"));
			WebElement body = modal.findElement(By.xpath(".//div/div/div[2]"));
			List<WebElement> bodyElements = header.findElements(By.xpath(".//*"));
			WebElement footer = modal.findElement(By.xpath(".//div/div/div[3]"));
			List<WebElement> footerElements = header.findElements(By.xpath(".//*"));
			modalObjects.add(new ModalObject(driver, modal, closeButton, header, headerElements, body, bodyElements, footer, footerElements));
		}
	}
	
	public static String getURL() {
		return url;
	}
	
	public void clickButton1( ) {
		button1.click();
	}
	
	public void clickButton2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", button2);
	}
	
	public void clickButton3() {
		Actions acts = new Actions(driver);
		Action act = acts.click(button3).build();
		act.perform();
	}
	
	public boolean getDisplayStatus() {
		return button1.isDisplayed();
	}
	
	public List<ModalObject> getAllModals() {
		return modalObjects;
	}
	
	public ModalObject getActiveModal() {
		for(ModalObject modal: modalObjects) {
			if(modal.isActive()) {
				return modal;
			}
		}
		return null;
	}
	
	public boolean closeActiveModal() {
		for(ModalObject modal: modalObjects) {
			if(modal.isActive()) {
				return modal.dismiss();
			}
		}
		return false;
	}

}
