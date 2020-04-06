package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackAndJogger {
	@FindBy(xpath = "//h3[text()='Hubberholme']")
	private WebElement hubberLink;

	@FindBy(xpath = "//img[@title='Maniac Men Black Solid Slim-Fit Joggers']")
	private WebElement firstLink;

	@FindBy(xpath = "//span[text()='WISHLIST']")
	private WebElement wishlist;

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getHubberLink() {
		return hubberLink;
	}

	public WebElement getfirstLink() {
		return firstLink;
	}

}
