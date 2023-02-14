package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expediapgm {
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
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("Brussels",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("Boston",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")).click();
	}

}
