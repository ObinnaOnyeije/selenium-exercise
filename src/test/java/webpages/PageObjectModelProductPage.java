package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModelProductPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Page-Object-Model/index.html";	
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[1]")
	private WebElement navbarHomeLink;
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[2]")
	private WebElement navbarProductsLink;
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[3]")
	private WebElement navbarContactLink;
	
	@FindBy(id="special-offers")
	private WebElement specialOffersModal;
	
	@FindBy(id="cameras")
	private WebElement camerasModal;
	
	@FindBy(id="new-laptops")
	private WebElement newLaptopsModal;
	
	@FindBy(id="used-laptops")
	private WebElement usedLaptopsModal;
	
	@FindBy(id="game-consoles")
	private WebElement gameConsolesModal;
	
	@FindBy(id="components")
	private WebElement componentsModal;
	
	@FindBy(id="desktop-systems")
	private WebElement desktopSystemsModal;
	
	@FindBy(id="audio")
	private WebElement audioModal;
	
	public PageObjectModelProductPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
