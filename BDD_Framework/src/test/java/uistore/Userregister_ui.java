package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.UserregisterPage;
//import pageObjects.rentalcheckPage;
import resources.base;

public class Userregister_ui extends base {
	public static Logger log = LogManager.getLogger(Userregister_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void userregister() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("navigated to url ");
		UserregisterPage ur=new UserregisterPage(driver);
		ur.getsiginbutton().click();
		Thread.sleep(3000);
		ur.getreg().click();
		ur.getname().sendKeys("syed");
		ur.getnumber().sendKeys("8106423357");
		ur.getemail().sendKeys("syedrafi34@gmail.com");
		ur.getpass().sendKeys("123456");
		ur.getrepass().sendKeys("123456");
		ur.getclick().click();
		Thread.sleep(3000);
		log.info("successfully account created for savaari.com");
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}