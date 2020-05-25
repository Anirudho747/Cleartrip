package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Landing_Page {
	
	WebDriver driver;
	
	By One_way           = By.id("OneWay");
	By Round_Trip        = By.id("RoundTrip");
	By Multi_City        = By.id("MultiCity");
	By From_Tag          = By.id("FromTag");
	By To_Tag            = By.id("ToTag");
	By Depart_Date       = By.id("DepartDate");
	By Adults            = By.id("Adults");
	By Kids              = By.id("Childrens");
	By Infants           = By.id("Infants");
	By Classs             = By.id("Class");
	By Airline           = By.id("AirlineAutocomplete");
	By Search            = By.id("SearchBtn");
	
	public Landing_Page (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_One_Way()
	{
		driver.findElement(One_way).click();
	}
	
	public void click_Round_Trip()
	{
		driver.findElement(Round_Trip).click();
	}
	
	public void click_Multi_City()
	{
		driver.findElement(Multi_City).click();
	}
	
	public void flight_From(String from)
	{
		driver.findElement(From_Tag).sendKeys(from);
	}
	
	public void flight_To(String to)
	{
		driver.findElement(To_Tag).sendKeys(to);
	}
	
	public void set_Depart_Date(String ddate)
	{
		driver.findElement(Depart_Date).sendKeys(ddate);
	}
	
	public void select_AdultCount(int adlt)
	{
		Select adult = new Select(driver.findElement(Adults));
		adult.selectByIndex(adlt);
	}
	
	public void select_KidCount(int kd)
	{
		Select kid = new Select(driver.findElement(Kids));
		kid.selectByIndex(kd);
	}
	
	public void select_InfantCount(int infnt)
	{
		Select infant = new Select(driver.findElement(Infants));
		infant.selectByIndex(infnt);
	}
	
	public void select_TravelClass(int clss)
	{
		Select Cass = new Select(driver.findElement(Classs));
		Cass.selectByIndex(clss);
	}

	public void set_Airline(String aline)
	{
		driver.findElement(Airline).sendKeys(aline);
	}
	
	public void Srch_flight()
	{
		driver.findElement(Search).click();
	}
}
