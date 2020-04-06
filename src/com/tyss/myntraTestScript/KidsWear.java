package com.tyss.myntraTestScript;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class KidsWear extends Base {
	@Test
	public void addToWishlist() throws InterruptedException {
		Thread.sleep(3000);
		home.getSearchBar().sendKeys("kids wear", Keys.ENTER);
		kidswr.getBoysRadioBtn().click();
		kidswr.getageDD().click();
		kidswr.getageFilter().click();
		kidswr.getageCollapse().click();
		util.moveToElement(driver, kidswr.getkidsWearText());
		kidswr.getwishlist().click();
	}

}
