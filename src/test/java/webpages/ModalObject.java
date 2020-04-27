package webpages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalObject extends PageObject {

	private WebElement outerLayer;
	private WebElement closeButton;
	
	private WebElement header;
	private List<WebElement> headerElements;
	
	private WebElement body;
	private List<WebElement> bodyElements;
	
	private WebElement footer;
	private List<WebElement> footerElements;
	
	public ModalObject(WebDriver driver, WebElement outerLayer) {
		super(driver);
		this.outerLayer = outerLayer;
	}
	
	public ModalObject(WebDriver driver, WebElement outerLayer, WebElement closeButton) {
		super(driver);
		this.outerLayer = outerLayer;
		this.closeButton = closeButton;
	}
	
	public ModalObject(WebDriver driver, WebElement outerLayer, WebElement closeButton, WebElement header, List<WebElement> headerElements, 
			WebElement body, List<WebElement> bodyElements, WebElement footer, List<WebElement> footerElements) {
		super(driver);
		this.outerLayer = outerLayer;
		this.closeButton = closeButton;
		this.header = header;
		this.headerElements = headerElements;
		this.body = body;
		this.bodyElements = bodyElements;
		this.footer = footer;
		this.footerElements = footerElements;
	}
	
	public boolean isActive() {
		WebDriverWait await = new WebDriverWait(driver, 1);
		try {
			await.until(ExpectedConditions.visibilityOf(outerLayer));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}
	
	public boolean dismiss() {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			if(isActive() && closeButton != null) {
				jse.executeScript("arguments[0].click();", closeButton);
			} else if (outerLayer != null) {
				jse.executeScript("arguments[0].click();", outerLayer);
			} else {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<WebElement> getHeaderElements() {
		return headerElements;
	}
	
	public List<WebElement> getBodyElements() {
		return bodyElements;
	}
	
	public List<WebElement> getFooterElements() {
		return footerElements;
	}
	
	public WebElement getHeader() {
		return header;
	}
	
	public WebElement getBody() {
		return body;
	}
	
	public WebElement getFooter() {
		return footer;
	}
	
	public WebElement getOuterLayer() {
		return outerLayer;
	}
	
	public WebElement getCloseButton() {
		return closeButton;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if (!(o instanceof ModalObject)) {
			return false;
		}
		WebElement otherOuterLayer = ((ModalObject) o).getOuterLayer();
		return outerLayer.equals(otherOuterLayer);
	}
	
	
}
