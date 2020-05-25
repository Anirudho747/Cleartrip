/**
 * 
 */
package page_Objects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author anir2070
 *
 */
public class Avlbl_Flghts {
	WebDriver driver;
	
	By Modify_Search           = By.id("modifySearchLink");
	By Result_Count            = By.xpath("//a[@id='modifySearchLink']//following::*[@class='resultsCount'][2]");
	By Fare_Alert              = By.cssSelector("#ResultContainer_1_2 > section.container.viewContainer > section > aside.left.colZero.col4.filters > div > div.stickyFilters > p.fareAlertCTA > a > strong");
	By Stop_0                  = By.xpath("//label[contains(text(),\'0 stop\')]");	
	By Stop1_1                 = By.xpath("//input[@name='stops' and @value='1']/following-sibling::label");  
	By Stop1_2                 = By.xpath("//p[text() = 'Stops']/parent::div/following-sibling::div//label//p[text() = '1 stop']");
	By Stop_2                  = By.xpath("//p[text()='Stops']//following::p[text()='2 stops'][1]");
	By Early_Morning           = By.xpath("//label[@for='1_2_0_8_departureTime']");
	By Evening                 = By.xpath("//label[@for='1_2_16_20_departureTime']");
	By Show_Multi_airline      = By.xpath("//label[@for='1_2_1']//following::input[@value='MULTI' and @name='airlines']");
	By Show_All_airline        = By.xpath("//label[@for='1_2_1']//following::a[@class='showAll weak fRight']");	
	By first_Airline           = By.xpath("//label[@for='1_2_1']//following::input[@value='MULTI' and @name='airlines']//following::input[@type='checkbox'][1]");
	By second_Airline          = By.xpath("//label[@for='1_2_1']//following::input[@value='MULTI' and @name='airlines']//following::input[@type='checkbox'][2]");
	By third_Airline           = By.xpath("//label[@for='1_2_1']//following::input[@value='MULTI' and @name='airlines']//following::input[@type='checkbox'][3]");
	By only_first_airline      = By.xpath("//label[@for='1_2_1']//following::a[@class='showOnly weak'][1]");
	By only_second_airline     = By.xpath("//label[@for='1_2_1']//following::a[@class='showOnly weak'][2]");
	By only_third_airline      = By.xpath("//label[@for='1_2_1']//following::a[@class='showOnly weak'][3]");
	By Trip_duration           = By.xpath("//div[@id='ResultContainer_1_2']//div[8]//h5[1]");
	By Layover_Duration        = By.xpath("//div[@id='ResultContainer_1_2']//div[9]//h5[1]");
	By Airline                 = By.xpath("//a[@data-sort='airline' and text()='Airline']");
	By Depart                  = By.xpath("//a[@data-sort='dep' and text()='Depart']");
	By Arrive                  = By.xpath("//a[@data-sort='arr' and text()='Arrive']");
	By Duration                = By.xpath("//a[@data-sort='dur' and text()='Duration']");
	By Price                   = By.xpath("//div[@class='sticky__parent']//following::span[contains(text(),'Price')]");
	By First_Flight            = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::img[1]");
	By First_Flight_Itinerary  = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"itinerary\"][1]");
	By First_Flight_Fare_Rules = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"fare\"][1]");
	By First_Flight_Baggage    = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"baggage\"][1]");
	By First_Flight_Booking    = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::button[@class=\"booking\"][1]");
	By Second_Flight            = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::img[2]");
	By Second_Flight_Itinerary  = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"itinerary\"][2]");
	By Second_Flight_Fare_Rules = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"fare\"][2]");
	By Second_Flight_Baggage    = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::a[@linkidentifier=\"baggage\"][2]");
	By Second_Flight_Booking    = By.xpath("//a[@data-sort='airline' and text()='Airline']//following::button[@class=\"booking\"][2]");
	

	public Avlbl_Flghts(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_Mdfy_Srch()
	{
		driver.findElement(Modify_Search).click();
	}
	
	public void click_FareAlert()
	{
		driver.findElement(Fare_Alert);
	}
	
	public void click_0Stop()
	{
		driver.findElement(Stop_0).click();
	}
	
	public void click_1Stop()
	{
		/*
		WebDriverWait wait = new WebDriverWait(driver,70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[3]/div[2]/section[2]/section[1]/aside[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[2]/label[1]")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(Stop_1));
		*/
		
	   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);     
	   	List<WebElement> stops= driver.findElements(Stop1_1);
	   	if(stops.size()>0) {
	   	stops.get(0).click();
	   	}
	   	else {
	   	driver.findElement(Stop1_2).click();
	   	} 
	}
	
	public void click_2Stop()
	{
		driver.findElement(Stop_2).click();
	}
	
	public void click_Early_Morning()
	{
		driver.findElement(Early_Morning).click();
	}
	
	public void click_Evening()
	{
		driver.findElement(Evening).click();
	}
	
	public void click_Multi_Airline()
	{
		driver.findElement(Show_Multi_airline).click();
	}

	public void click_All_Airline()
	{
		driver.findElement(Show_All_airline).click();
	}

	public void click_First_Airline()
	{
		driver.findElement(first_Airline).click();
	}
	
	public void click_Third_Airline()
	{
		driver.findElement(third_Airline).click();
	}
	
	public void click_Second_Airline()
	{
		driver.findElement(second_Airline).click();
	}
	
	public void select_Only_First_Airline()
	{
		Actions actn = new Actions(driver);
		actn.moveToElement(driver.findElement(first_Airline)).perform();;
		driver.findElement(only_first_airline).click();
	}
	
	public void select_Only_Third_Airline()
	{
		Actions actn = new Actions(driver);
		actn.moveToElement(driver.findElement(third_Airline)).perform();;
		driver.findElement(only_third_airline).click();
	}

	public void click_Trip_Duration() 
	{
		driver.findElement(Trip_duration).click();
	}
	
	public void click_Layover_Duration()
	{
		driver.findElement(Layover_Duration).click();
	}

	public void click_Airline()
	{
		driver.findElement(Airline).click();
	}

	public void click_Depart()
	{
		driver.findElement(Depart).click();
	}

	public void click_Arrive()
	{
		driver.findElement(Arrive).click();
	}

    public void click_Duration()
    {
    	driver.findElement(Duration).click();
    }

    public void click_Price()
    {
    	
    	WebDriverWait wait = new WebDriverWait(driver,1000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sticky__parent']//following::span[contains(text(),'Price')]")));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", driver.findElement(Price));
    }

    public void click_First_Flight()
    {
    	driver.findElement(First_Flight).click();
    }

    public void click_First_Flight_Itinerary()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(First_Flight)).perform();
    	driver.findElement(First_Flight_Itinerary).click();
    }
    
    public void click_First_Flight_Fare_Rules()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(First_Flight)).perform();
    	driver.findElement(First_Flight_Fare_Rules).click();
    }
    
    public void click_First_Flight_Baggage()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(First_Flight)).perform();
    	driver.findElement(First_Flight_Baggage).click();
    }
    
    public void Book_First_Flight() 
    {
    	driver.findElement(First_Flight_Booking).click();
    }
    
    public void click_Second_Flight()
    {
    	driver.findElement(Second_Flight).click();
    }

    public void click_Second_Flight_Itinerary()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(Second_Flight)).perform();
    	driver.findElement(Second_Flight_Itinerary).click();
    }
    
    public void click_Second_Flight_Fare_Rules()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(Second_Flight)).perform();
    	driver.findElement(Second_Flight_Fare_Rules).click();
    }
    
    public void click_Second_Flight_Baggage()
    {
    	Actions actn = new Actions(driver);
    	actn.moveToElement(driver.findElement(Second_Flight)).perform();
    	driver.findElement(Second_Flight_Baggage).click();
    }
    
    public void Book_Second_Flight() 
    {
    	driver.findElement(Second_Flight_Booking).click();
    }
}
