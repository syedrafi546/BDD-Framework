package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppDwndPage {
	public WebDriver driver;
	By app=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[1]");
	By install=By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div/main/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[2]/div/c-wiz/c-wiz/div/span/button");
	
	
	public AppDwndPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getapp()
	{
		return driver.findElement(app);
	}
	public WebElement getinstall() {
		return driver.findElement(install);
	}

}
