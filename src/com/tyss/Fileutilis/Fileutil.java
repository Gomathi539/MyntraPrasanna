package com.tyss.Fileutilis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Fileutil {
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public String switchToWindow(WebDriver driver) {
		Set<String> sids = driver.getWindowHandles();
		Iterator<String> it = sids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		return pid;
	}

}
