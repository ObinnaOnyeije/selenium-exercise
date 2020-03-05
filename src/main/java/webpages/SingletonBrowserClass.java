package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonBrowserClass {

	private static SingletonBrowserClass instanceOfSingletonBrowserClass = null;
	private WebDriver driver;
	
	private SingletonBrowserClass() {
		driver = new ChromeDriver();
	}
	
	public static SingletonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new SingletonBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
