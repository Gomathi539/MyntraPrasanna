package com.tyss.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.tyss.Fileutilis.Fileutil;
import com.tyss.genericlib.Filelib;

public class Login {
	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement profile;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//a[text()='log in']")
	private WebElement logIn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextBox;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTB;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;

	public void login(WebDriver driver, Fileutil util, Filelib fib) {
		util.moveToElement(driver, profile);
		logIn.click();
		emailTextBox.sendKeys(fib.getValue("email"));
		passwordTB.sendKeys(fib.getValue("password"));
		loginButton.click();
	}

}
