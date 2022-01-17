package uistore;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.TripAdvisorPage;
import resources.base;

public class TripAdvisor_ui extends base {
	public static Logger log = LogManager.getLogger(TripAdvisor_ui.class.getName());
	@BeforeTest
	public void initial() throws IOException
	{
		driver =initializeDriver();
	}
	@Test
	public void Tripadvisor() throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		log.info("navigated to url");
		TripAdvisorPage tr=new TripAdvisorPage(driver);
		tr.getadvisor().click();
		log.info("Trip Advisor page navigated successfully");
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	 
}