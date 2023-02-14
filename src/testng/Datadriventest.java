package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();

	}
	
	@Test
	public void upload() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);//workbook details
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
		int rowsize=sh.getLastRowNum();//rowcount
		for(int i=1;i<=rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username);
			System.out.println("password="+pswd);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			
			
			
			
			
		}
		
		
		
		
		
	}

}
