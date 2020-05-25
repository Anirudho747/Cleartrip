package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

	WebDriver driver;
	
	By ClearTrip           =  By.xpath("//span[@title=\'Cleartrip \']");
	By Flights             =  By.xpath("//a[@title=\'Flights\']");
	By Hotels              =  By.xpath("//a[@title=\'Hotels\']");
	By Trains              =  By.xpath("//a[@title=\'Trains\']");
	By SearchSummary       =  By.xpath("//div[@class='searchSummary']");
	By Currency            =  By.xpath("//a[@class='listMenuLink currencyLink']");
	By UsDollar            =  By.xpath("//a[@data-currency='USD']");
	By INRupees            =  By.xpath("//a[@data-currency='INR']");
	By Country             =  By.className("listMenuLink countryLink");
	By Saudi_Arabia        =  By.xpath("//a[@ctvalue='SA']");
	By India               =  By.xpath("//a[@ctvalue='IN']");
	By UserAccount         =  By.id("userAccountLink");
	By SignIn              =  By.id("SignIn");
	By Register            =  By.linkText("Register");
	
public void Header(WebDriver driver)
{
	this.driver = driver;
}


	
}
