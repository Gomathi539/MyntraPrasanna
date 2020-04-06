package com.tyss.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.tyss.Fileutilis.Fileutil;
import com.tyss.ObjectRepository.AddAddressObj;
import com.tyss.ObjectRepository.EditAddressObj;
import com.tyss.ObjectRepository.EditProfile;
import com.tyss.ObjectRepository.Homepage;
import com.tyss.ObjectRepository.KidsWear;
import com.tyss.ObjectRepository.Login;
import com.tyss.ObjectRepository.Logout;
import com.tyss.ObjectRepository.TrackAndJogger;

public class Base {
	public Filelib fib = new Filelib();
	public WebDriver driver = null;
	public Homepage home = null;
	public TrackAndJogger track = null;
	public ChromeOptions co = new ChromeOptions();
	public FirefoxOptions fo = new FirefoxOptions();
	public Fileutil util = new Fileutil();
	public Login li = null;
	public Logout lo = null;
	public KidsWear kidswr = null;
	public EditProfile edit = null;
	public AddAddressObj addAddress = null;
	public EditAddressObj editAdd = null;

	@BeforeClass
	public void configBc() {
		if (fib.getValue("browser").equals("chrome")) {
			co.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(co);
		} else {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver(fo);
		}
		home = PageFactory.initElements(driver, Homepage.class);
		track = PageFactory.initElements(driver, TrackAndJogger.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(fib.getValue("url"));
		li = PageFactory.initElements(driver, Login.class);
		kidswr = PageFactory.initElements(driver, KidsWear.class);
		edit = PageFactory.initElements(driver, EditProfile.class);
		addAddress = PageFactory.initElements(driver, AddAddressObj.class);
		editAdd = PageFactory.initElements(driver, EditAddressObj.class);
	}

	@BeforeMethod
	public void configBm() {
		li.login(driver, util, fib);
	}

	@AfterMethod
	public void configAm() {
		lo = PageFactory.initElements(driver, Logout.class);
		lo.logout(util, driver);
	}

	@AfterClass
	public void configAc() {
		driver.close();
	}

}
