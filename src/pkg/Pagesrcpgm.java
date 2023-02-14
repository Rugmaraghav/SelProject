package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagesrcpgm {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
	 driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.com");
		String src= driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}

	}

}
