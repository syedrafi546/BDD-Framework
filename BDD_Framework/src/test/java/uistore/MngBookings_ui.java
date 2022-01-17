package uistore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.MngBookingsPage;
import pageObjects.SignIn;
import resources.base;

public class MngBookings_ui extends base {
	public static Logger log = LogManager.getLogger(MngBookings_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void MngBookings() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("navigated to url");
		SignIn sg=new SignIn(driver);
		HashMap<String, String> data = sg.getTestData();
		sg.signin().click();
		for (Entry<String, String> entry : data.entrySet()) {
			sg.getEmail().sendKeys(entry.getKey());

			sg.getPassword().sendKeys(entry.getValue());
		}
		Thread.sleep(2000);
		sg.getSigninButton().click();
		Thread.sleep(3000);
		log.info("Login successfully");
		MngBookingsPage mb=new MngBookingsPage(driver);
		mb.getclick().click();
		mb.getbookings().click();
		Thread.sleep(2000);
		mb.getslt().click();
		Thread.sleep(5000);
		log.info("all bookings are diplayed");
	 
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}