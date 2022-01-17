package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AppDwndPage;
import resources.base;

public class AppDwnd_ui extends base {
	public static Logger log = LogManager.getLogger(AppDwnd_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void Appdownload() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		log.info("navigated to url ");
		AppDwndPage app=new AppDwndPage(driver);
		app.getapp().click();
		//app.getinstall().click();
		log.info("Savaari app downloading page navigated successfully");
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}