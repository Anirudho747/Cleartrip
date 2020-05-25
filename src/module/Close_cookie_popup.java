package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Constant;

public class Close_cookie_popup {

	public static void execute(WebDriver driver)
	{
		driver.findElement(By.xpath("//script[@src='//ui.cltpstatic.com/javascripts/search/air.home.min.v891787.js']//following::div[@class='closeit'][2]")).click();
	}                                    
	
}
