package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alertpgm {

ChromeDriver driver;
	
	@Before
	public void setup()
	{
	     driver=new ChromeDriver();
		driver.get("file:///E:/Rugma/selenium%20notes/alert.html");
	}
	
	@Test
	public void titleverification() throws Exception
	{
	
 driver.findElement(By.xpath("/html/body/input[1]")).click();
 Alert a=driver.switchTo().alert();
 System.out.println(a.getText());
 a.accept();
 //a.dismiss();
 driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
 driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc123");
	
		
		
		
	}
}
