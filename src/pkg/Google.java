package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
WebDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void google()
	{
		//driver.findElement(By.name("q")).sendKeys("Luminar",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		//2nd method
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("luminar");
		search.submit();
		
		
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vsj");
	}

}




//tagname[@attributename='value']






