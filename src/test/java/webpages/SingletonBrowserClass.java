package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SingletonBrowserClass {

	private static SingletonBrowserClass instanceOfSingletonBrowserClass = null;
	private WebDriver driver;
	private ChromeOptions options;
	
	private SingletonBrowserClass() {
		options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
	}
	
	public static SingletonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new SingletonBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}
	
	public WebDriver getDriver() {
		if(((RemoteWebDriver)driver).getSessionId() == null) {
			driver = new ChromeDriver(options);
		}
		return driver;
	}
}
