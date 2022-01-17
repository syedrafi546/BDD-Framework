package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserregisterPage {
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/div");
	By reg=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[2]/button[2]");
	By name=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[1]");
	By number=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[1]/input");
	By email=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[2]");
	By pass=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[3]");
	By repass=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[4]");
	By click=By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[2]/button[1]/div/span");
	public UserregisterPage(WebDriver driver2) {
		driver=driver2;
	}
  
	public WebElement getsiginbutton()
	{
		return driver.findElement(signin);
		
	}
	public WebElement getreg() {
		return driver.findElement(reg);
		
	}
	public WebElement getname() {
		return driver.findElement(name);
		
	}
	public WebElement getemail() {
		return driver.findElement(email);
		
	}
	public WebElement getnumber() {
		return driver.findElement(number);
		
	}
	public WebElement getpass() {
		return driver.findElement(pass);
		
	}
	public WebElement getrepass() {
		return driver.findElement(repass);
		
	}
	public WebElement getclick() {
		return driver.findElement(click);
		
	}


}
