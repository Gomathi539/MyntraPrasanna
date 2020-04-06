package com.tyss.myntraTestScript;

import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class EditAddressTest extends Base {
	@Test
	public void test() throws Throwable {
		Thread.sleep(2000);
		util.moveToElement(driver, home.getProfile());
		home.getEditAddress().click();
		editAdd.getEditBtn().click();
		addAddress.getNameTB().clear();
		addAddress.getNameTB().sendKeys("Gomathi K");
		addAddress.getSaveBtn().click();
	}
}
