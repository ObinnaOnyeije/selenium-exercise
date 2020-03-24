package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModelPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Page-Object-Model/index.html";
	
	@FindBy(className="carousel slide")
	private WebElement carouselSlide;
	
	@FindBy(className="carousel-indicators")
	private WebElement carouselSlideIndicators;
	
	@FindBy(className="carousel-inner")
	private WebElement carouselSlideInner;
	
	@FindBy(className="left carousel-control")
	private WebElement carouselSlideLeftControl;
	
	@FindBy(className="right carousel-control")
	private WebElement carouselSlideRightControl;
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[1]")
	private WebElement navbarHomeLink;
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[2]")
	private WebElement navbarProductsLink;
	
	@FindBy(xpath="//*[@id=\"div-main-nav\"]/div/ul/li[3]")
	private WebElement navbarContactLink;
	
	@FindBy(id="button-find-out-more")
	private WebElement findOutMoreButton;
	
	public PageObjectModelPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
