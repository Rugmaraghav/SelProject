package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	     driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void textverification()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	
	@After
	public void b()
	{
		driver.quit();
	}
	
	
	
	

}
