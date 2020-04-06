package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsWear {
	@FindBy(xpath = "//input[@value='boys,boys girls']")
	private WebElement boysRadioBtn;

	public WebElement getBoysRadioBtn() {
		return boysRadioBtn;
	}

	@FindBy(xpath = "//h4[text()='Age']/following-sibling::span[@class='atsa-downArrow sprites-arrowDownBold myntraweb-sprite']")
	private WebElement ageDD;

	public WebElement getageDD() {
		return ageDD;
	}

	@FindBy(xpath = "//input[@value='6M-1Y']")
	private WebElement ageFilter;

	public WebElement getageFilter() {
		return ageFilter;
	}

	@FindBy(xpath = "//span[contains(@class,'atsa-upArrow')]")
	private WebElement ageCollapse;

	public WebElement getageCollapse() {
		return ageCollapse;
	}

	@FindBy(xpath = "//span[contains(@class,'summary-removeIcon')]")
	private WebElement removeFilter;

	public WebElement getRemoveFilter() {
		return removeFilter;
	}

	@FindBy(xpath = "//span[text()='CLEAR ALL']")
	private WebElement clearFilter;

	public WebElement getClearFilter() {
		return clearFilter;
	}
	
	
	@FindBy(xpath="//h3[text()='H&M']")
	private WebElement kidsWearText;
	
	public WebElement getkidsWearText() {
		return kidsWearText;
	}
	
	@FindBy(xpath="//span[text()='wishlist now']")
	private WebElement wishlist;
	
	public WebElement getwishlist() {
		return wishlist;
	}

}
