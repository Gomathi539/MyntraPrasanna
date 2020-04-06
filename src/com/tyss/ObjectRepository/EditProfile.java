package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfile {
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameTB;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameTB;

	@FindBy(xpath = "//input[@name='dob']")
	private WebElement dobTB;

	@FindBy(xpath = "//div[text()=' Confirm']")
	private WebElement confirmbtn;

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getDobTB() {
		return dobTB;
	}

	public WebElement getConfirmbtn() {
		return confirmbtn;
	}

}
