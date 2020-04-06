package com.tyss.myntraTestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.tyss.genericlib.Base;

public class AddAddressTest extends Base {
	@Test
	public void addAddressTest() throws Throwable {
		Thread.sleep(2000);
		util.moveToElement(driver, home.getProfile());
		home.getEditAddress().click();
		addAddress.getAddNewAddBtn().click();
		addAddress.getNameTB().sendKeys("Gomathi");
		addAddress.getMobileTB().sendKeys("9380087195");
		addAddress.getPincodeTB().sendKeys("560078");
		addAddress.getAreaTB().sendKeys("Rajiv Gandhi Road");
		addAddress.getHomeRadioBtn().click();
		addAddress.getLocalityTB().click();
		addAddress.getLocalityRadioBtn().click();
		addAddress.getSaveBtn().click();
	}

}
