package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Expediapage {
WebDriver driver;
	
	By flightslink = By.xpath("//div[@id='wizardMainRegion']/div/div/div/div/ul/li[2]/a/span");
	By leavingcity = By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[2]/button");
	By destination = By.xpath("//div[@id='location-field-leg1-destination-menu']/div/div[2]/button");
	By traveller   = By.xpath("//div[@id='adaptive-menu']/button");
	By adults      = By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/section/div[1]/div[1]/div/button[2]/span");
	By child       = By.xpath("//*[@id='adaptive-menu']/div/div/div/section/div[1]/div[2]/div/button[2]/span");
	By economy     = By.xpath("//div[@id='preferred-class-input']/button");
	By firstclass  = By.xpath("//div[@id='preferred-class-input']/div/div/a[4]");
	By donebutton  = By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/button");
	//By startdate   = By.xpath("//*[@id=\"d1-btn\"]");
	//By enddate     = By.xpath("//*[@id=\"d2-btn\"]");
	By searchbutton= By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button");
	
	public Expediapage(WebDriver driver) {
	this.driver= driver;	
	}
	
	public void setvalues(String source ,String dest ) throws Exception {
		driver.findElement(flightslink).click();
		
		driver.findElement(leavingcity).click();
		driver.findElement(By.xpath("//*[@id='location-field-leg1-origin']")).sendKeys(source);
		Robot robo = new Robot();
		//robo.delay(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(destination).click();
		driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/div/div/input")).sendKeys(dest);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void travellerdetails(String value) {
		driver.findElement(traveller).click();
		driver.findElement(adults).click();
		driver.findElement(child).click();
		WebElement childages = driver.findElement(By.xpath("//select[@id='child-age-input-0-0']"));
		Select childage=new Select(childages);
		childage.selectByValue(value);
		driver.findElement(donebutton).click();
		
	}
	public void economyselection() {
		driver.findElement(economy).click();
		Actions act = new Actions(driver);
		WebElement firstclass1 = driver.findElement(firstclass);
		act.moveToElement(firstclass1).build().perform();
		firstclass1.click();
		
	}

	/*
	 * public void startdateselection() {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 * driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click(); while(true) {
	 * 
	 * WebElement start = driver.findElement(By.xpath(
	 * "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/h2[1]"
	 * )); String startdate1 = start.getText(); if(startdate1.equals("July 2022")) {
	 * System.out.println(startdate1); break; }else {
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]"
	 * )).click(); } }
	 * 
	 * List<WebElement> dates
	 * =driver.findElements(By.xpath("//*[contains(@aria-label,'Jul 2022')]"));
	 * System.out.println("All dates ..."+dates); for(WebElement dateselect:dates) {
	 * 
	 * String date = dateselect.getAttribute("data-day"); System.out.println(date);
	 * if(date.equals("25")) { System.out.println(date); dateselect.click();
	 * dateselect.click(); System.out.println("date selected"+dateselect); } }
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button"
	 * )).click(); } public void returndateselection() {
	 * driver.findElement(By.xpath("//*[@id=\"d2-btn\"]")).click();
	 * 
	 * while(true) {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	 * WebElement returnmonth = driver.findElement(By.xpath(
	 * "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/h2[1]"
	 * )); String returnmt= returnmonth.getText();
	 * if(returnmt.equals("September 2022")) { System.out.println(returnmt); break;
	 * }else {
	 * 
	 * driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).
	 * click(); } } List<WebElement> returndate =
	 * driver.findElements(By.xpath("//*[contains(@aria-label,'Sep 2022')]"));
	 * System.out.println("All dates ..."+returndate); for(WebElement returndt :
	 * returndate) {
	 * 
	 * String returndates1 = returndt.getAttribute("data-day");
	 * System.out.println(returndates1); if(returndates1.equals("10")) {
	 * returndt.click(); returndt.click();
	 * System.out.println("date selected"+returndt); } } driver.findElement(By.
	 * xpath("//*[@class='uitk-layout-flex uitk-date-picker-menu-footer']/button[1]"
	 * )).click(); }
	 */
	public void searchclick() {
		driver.findElement(searchbutton).click();
	}


}
