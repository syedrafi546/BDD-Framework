package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	public WebDriver driver;
	By acclk=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/img");
	By logout=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav/div/app-menu/div/ul/li[3]");
	By slt=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav/div/app-menu/div/ul/li[3]/a");
	public LogoutPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getclick()
	{
		return driver.findElement(acclk);
	}
	public WebElement getlogout() {
		return driver.findElement(logout);
	}
	public WebElement getslt() {
		return driver.findElement(slt);
	}

}
