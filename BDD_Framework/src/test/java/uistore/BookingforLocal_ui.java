package uistore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.BookingforLocal;
import pageObjects.SignIn;
import resources.base;

public class BookingforLocal_ui extends base {
	public static Logger log = LogManager.getLogger(BookingforLocal_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void BookingLocal() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
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
		BookingforLocal bo=new BookingforLocal(driver);
		bo.getlocal().click();
		bo.getfrom().sendKeys("Bangalore"+Keys.ENTER);
		Thread.sleep(3000);
		bo.getsearch().click();
		log.info("navigated to car selection successfully");
		//bo.getcar().click();
		
		Thread.sleep(3000);
		 
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}