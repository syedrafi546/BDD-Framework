package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActUpdatePage {
	public WebDriver driver;
	By acclk=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/img");
	By actstg=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav/div/app-menu/div/ul/li[2]");
	By slt=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav/div/app-menu/div/ul/li[2]/a");
	By alt_no=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-account-setting/div[3]/div[2]/form/div/div[4]/div[2]/input");
	By frm=By.className("float-left");
	By upd=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-account-setting/div[3]/div[2]/form/div/div[5]/div[1]/button");
	public ActUpdatePage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getclick()
	{
		return driver.findElement(acclk);
	}
	public WebElement getactstg() {
		
		return driver.findElement(actstg);
	}
	public WebElement getslt() {
		return driver.findElement(slt);
	}
	public WebElement getalt_no()
	{
		return driver.findElement(alt_no);
	}
	public WebElement getupd()
	{
		return driver.findElement(upd);
	}
	public WebElement getupd_frm()
	{
		return driver.findElement(frm);
	}

}
