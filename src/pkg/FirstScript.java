package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver108\\chromedriver.exe");		
		//1.open browser
		ChromeDriver driver=new ChromeDriver();
		
		//.launch application
		
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="google";
		
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
