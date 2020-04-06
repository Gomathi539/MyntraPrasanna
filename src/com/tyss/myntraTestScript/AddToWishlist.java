package com.tyss.myntraTestScript;

import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class AddToWishlist extends Base {
	@Test
	public void AddToWishlist() throws InterruptedException {

		Thread.sleep(5000);
		util.moveToElement(driver, home.getMenLink());
		Thread.sleep(2000);
		home.getTrackPantLink().click();
		Thread.sleep(2000);
		track.getHubberLink().click();
		track.getfirstLink().click();
		String pid = util.switchToWindow(driver);
		track.getWishlist().click();
	}
}
