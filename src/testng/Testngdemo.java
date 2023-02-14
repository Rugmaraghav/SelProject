package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	{
	
		driver.get("https://www.google.com");
	}
	@Test(priority = 3,invocationCount = 4,enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 1,dependsOnMethods = {"test1"})
	public void test2()
	{
		System.out.println("test2");
		
	}
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
	System.out.println("aftermethod code");
	}
	
	@AfterTest
	public void aftrtest() {
		System.out.println("aftertest");
		
	}
	
	

}
