package com.tyss.myntraTestScript;

import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class EditProfileTest extends Base {
	@Test
	public void editProfile() throws InterruptedException {
		Thread.sleep(2000);
		util.moveToElement(driver, home.getProfile());
		home.getEditProfile().click();
		Thread.sleep(2000);
		edit.getFirstNameTB().sendKeys("Gomathi");
		edit.getLastNameTB().sendKeys("K");
		edit.getDobTB().sendKeys("27/2/1999");
		edit.getConfirmbtn().click();

	}
}
