package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException   
	{
		prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\SyedRafi\\eclipse-workspace\\E2E_Project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println("Chrome");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\webDriver\\chromedriver.exe");
			driver=new ChromeDriver(); 
		}
		else if(browserName.equals("firefox"))
		{
			//driver=new firefoxDriver(); 
		}
		else if(browserName.equals("IE"))
		{
			//driver=new ieDriver(); 
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://SS//"+result+"Screenshot.png"));
	}
	
 
}
