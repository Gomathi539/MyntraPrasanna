package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressObj {
	@FindBy(xpath = "//div[text()=' + Add New Address ']")
	private WebElement addNewAddBtn;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement nameTB;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobileTB;

	@FindBy(xpath = "//input[@name='pincode']")
	private WebElement pincodeTB;

	@FindBy(xpath = "//input[@name='state']")
	private WebElement stateTB;

	@FindBy(xpath = "//input[@name='address']")
	private WebElement areaTB;

	@FindBy(xpath = "//input[@name='locality']")
	private WebElement localityTB;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityTB;

	@FindBy(xpath = "//div[@id='J P Nagar']/span[contains(@class,'icon-radio')]")
	private WebElement localityRadioBtn;

	@FindBy(xpath="//div[text()='Confirm']")
	private WebElement locConfirmBtn;
	
	
	public WebElement getLocConfirmBtn() {
		return locConfirmBtn;
	}

	public WebElement getLocalityRadioBtn() {
		return localityRadioBtn;
	}

	@FindBy(xpath = "//label[@id='Home']/span[contains(@class,'icon')]")
	private WebElement homeRadioBtn;

	@FindBy(xpath = "//div[text()='Save']")
	private WebElement saveBtn;

	public WebElement getAddNewAddBtn() {
		return addNewAddBtn;
	}

	public WebElement getNameTB() {
		return nameTB;
	}

	public WebElement getMobileTB() {
		return mobileTB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getStateTB() {
		return stateTB;
	}

	public WebElement getAreaTB() {
		return areaTB;
	}

	public WebElement getLocalityTB() {
		return localityTB;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getHomeRadioBtn() {
		return homeRadioBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
