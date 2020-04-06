package com.tyss.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tyss.Fileutilis.Fileutil;

public class Logout {
	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement profile;

	@FindBy(xpath = "//div[text()=' Logout ']")
	private WebElement logout;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void logout(Fileutil util, WebDriver driver) {
		util.moveToElement(driver, profile);
		logout.click();
	}
}
