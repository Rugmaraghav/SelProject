package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Expediapage;

public class Expediatest {

	WebDriver driver;
	String baseurl="https://www.expedia.com/";
	@BeforeTest
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen() {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}	
	
	@Test
	public void main() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 Expediapage obj = new Expediapage(driver);
		 obj.setvalues("Brussels","Newyork");
		 obj.travellerdetails("3");
		 obj.economyselection();
		// obj.startdateselection();
		// obj.returndateselection();
		 //obj.searchclick();
	
	 }
	 @AfterTest
		public void browserclose() {
		//driver.quit();
		}



}
