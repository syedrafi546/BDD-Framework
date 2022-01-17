package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripAdvisorPage {
	public WebDriver driver;
	By advisor=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[2]/a[1]/img");
	By install=By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div/main/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[2]/div/c-wiz/c-wiz/div/span/button");
	
	
	public TripAdvisorPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getadvisor()
	{
		return driver.findElement(advisor);
	}
	public WebElement getinstall() {
		return driver.findElement(install);
	}

}
