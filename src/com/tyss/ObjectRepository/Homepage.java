package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

public class Homepage {
	@FindBy(xpath = "//a[@href='/shop/men' and @class='desktop-main']")
	private WebElement menLink;

	@FindBy(xpath = "//a[@href='/shop/women' and @class='desktop-main']")
	private WebElement womenLink;

	@FindBy(linkText = "/shop/kids")
	private WebElement kidsLink;

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement searchBar;

	@FindBy(xpath = "//a[text()='Track Pants & Joggers']")
	private WebElement trackPantLink;

	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement profile;

	@FindBy(xpath="//div[text()=' Edit Profile ']")
	private WebElement editProfile;
	
	@FindBy(xpath="//div[text()='Saved Addresses']")
	private WebElement editAddress;
	
	public WebElement getEditAddress() {
		return editAddress;
	}
	
	public WebElement getEditProfile() {
		return editProfile;
	}
	
	public WebElement getProfile() {
		return profile;
	}
	
	public WebElement getTrackPantLink() {
		return trackPantLink;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

}
