package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver; // default

	public static void navigateUrl(String url) {
		driver.get(url);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void clear(By locator) {
		driver.findElement(locator).clear();
	}

	public static void sendkeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static String getElementText(By locator) {
		// Get the Text of that Element (H3) Online Access
		WebElement element = driver.findElement(locator);
		// get the text of that element
		String s = element.getText();
		return s;
	}

	// window handle

	public static void switchToTab(String tabHandle) {
		driver.switchTo().window(tabHandle);
	}

	public static String getTabHandle() {
		return driver.getWindowHandle();
	}

	public static void windowhandles() { // keep it for future use
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String childwindow : allWindowHandles) {
			if (!childwindow.equals(mainWindowHandle)) {
				driver.switchTo().window(childwindow);
			}
		}
	}
	
	public static void mouseHover(By by) {
		WebElement hovEle = driver.findElement(by);
		Actions act = new Actions(driver);
		act.moveToElement(hovEle).build().perform();
		//act.contextClick();
		
	}
	
	public static void windowHandles(){ 
		Set<String> windowhandles = driver.getWindowHandles();
	    Iterator <String> iterator= windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(parentwindow);
		driver.switchTo().window(childwindow);
	
		}

}// class
