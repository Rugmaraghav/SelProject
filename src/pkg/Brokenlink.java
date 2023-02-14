package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
ChromeDriver driver;
//public static final String ANSI_YELLOW="\u001B[32m";
	
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
			verify(linkdetails);
			
			
			
		}

}

	public void verify(String linkdetails) {
		try {
			URL u=new URL(linkdetails);
	HttpURLConnection con=(HttpURLConnection) u.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("successfull--"+linkdetails);
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("Brokenlink--"+linkdetails);	
	}
			                                                
	
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
