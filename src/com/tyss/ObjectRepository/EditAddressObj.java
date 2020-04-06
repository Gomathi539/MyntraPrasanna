package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddressObj {
	@FindBy(xpath = "//div[text()=' EDIT ']")
	private WebElement editBtn;

	public WebElement getEditBtn() {
		return editBtn;
	}
	
	
}
