package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SignIn {
public static HashMap<String,String> getTestData() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SyedRafi\\eclipse-workspace\\final\\ExcelReading\\Excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		
		String data=null;
		String data1=null;
		HashMap<String,String> loginArray = new HashMap<String,String>();
		for(int i =0;i<rows;i++) {
			data=sheet.getRow(i).getCell(0).getStringCellValue();
			data1=sheet.getRow(i).getCell(1).getStringCellValue();
			
			loginArray.put(data, data1);
			
		}
		workbook.close();
		
		return loginArray;
	}
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/div");
	By email = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[1]");
	By password = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[2]");
	By signButton = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[2]/button[1]/div/span");

	public SignIn(WebDriver driver2) {
		driver=driver2;
	}


	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	  
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSigninButton() {
		return driver.findElement(signButton);
	}


	 
	
	

}

