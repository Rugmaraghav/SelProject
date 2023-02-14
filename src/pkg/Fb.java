package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	
	
WebDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.name("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("1233");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
