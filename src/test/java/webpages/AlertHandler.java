package webpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface AlertHandler {

	default boolean isAlertActive(WebDriver driver) {
		boolean active = false;
		if (getAlert(driver) != null) {
			active = true;
		}
		return active;
	}
	
	default boolean acceptAlert(WebDriver driver) {
		boolean active = false;
		Alert alert;
		if (isAlertActive(driver)) {
			alert = getAlert(driver);
			alert.accept();
			active = true;
		}
		return active;
	}
	
	default boolean dismissAlert(WebDriver driver) {
		boolean active = false;
		Alert alert;
		if (isAlertActive(driver)) {
			alert = getAlert(driver);
			alert.dismiss();
			active = true;
		}
		return active;
	}
	
	default String getTextFromAlert(WebDriver driver) {
		String text = null;
		Alert alert;
		if (isAlertActive(driver)) {
			alert = getAlert(driver);
			text = alert.getText();
		}
		return text;
	}
	
	default boolean sendKeysToAlert(WebDriver driver, String keys) {
		boolean active = false;
		Alert alert;
		if (isAlertActive(driver)) {
			alert = getAlert(driver);
			alert.sendKeys(keys);
			active = true;
		}
		return active;
	}
	
	default Alert getAlert(WebDriver driver) {
		Alert alert;
		WebDriverWait await = new WebDriverWait(driver, 1);
		try {
			alert = await.until(ExpectedConditions.alertIsPresent());
			return alert;
		} catch (TimeoutException e) {
			return null;
		}
	}
}
