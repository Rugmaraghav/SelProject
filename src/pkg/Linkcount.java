package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
	     driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void linkcount()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+l.size());
		for(WebElement link:l)
		{
			String linkdetails =link.getAttribute("href");
			String text=link.getText();
			System.out.println(text+"----"+linkdetails);
			
			
		}
		
		
		
		
		
	}

}
