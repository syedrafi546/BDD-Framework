package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingforLocal {
	public WebDriver driver;
	By from=By.xpath("//*[@id=\"fromCityList\"]");
	By local=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[2]/a/span");
	By car=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[3]/div/div[4]/div/button");
	By search=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div/button");
	public BookingforLocal(WebDriver driver2) {
		driver=driver2;
	}

  
	public WebElement getfrom()
	{
		return driver.findElement(from);
	}
	public WebElement getlocal()
	{
		return driver.findElement(local);
	}
	public WebElement getsearch()
	{
		return driver.findElement(search);
	}
	public WebElement getcar()
	{
		return driver.findElement(car);
	}
	 

}
