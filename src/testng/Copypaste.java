package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	{
	
		driver.get("https://app.keka.com/Account/Login?ReturnUrl=%2F");
	}
	
	@Test
	public void main()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("febin@techversantinfotech.com");
		driver.findElement(By.xpath("//*[@id=\"login-container-center\"]/div/div/form/div/div[2]/div/button")).click();
		
		String text=driver.findElement(By.xpath("//*[@id=\"login-container-center\"]/div/div/div[1]")).getAttribute("class");
		System.out.println(text);
		
		
		//String actualurl=driver.getCurrentUrl();
		//String exp="https://app.keka.com/Account/Login?ReturnUrl=%2F";
		if(text.contentEquals("org-logo-container"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void test() throws IOException
//	{
//	
//		WebElement fulname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
//		fulname.sendKeys("abc");
//		WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
//		
//		Actions act=new Actions(driver);
//		
//		act.keyDown(fulname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
//		act.keyDown(fulname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
//		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
//		act.perform();
//	}

}
