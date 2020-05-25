package test_Cases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import module.Book_Chennai_Colombo;
import utilities.Constant;
import page_Objects.Avlbl_Flghts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Gnrl {
	
	public static WebDriver driver;
	Avlbl_Flghts af = new Avlbl_Flghts(driver);
	
	 @BeforeClass
	  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\new Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	  }

	 @BeforeMethod
	  public void beforeMethod() {
	  }
	
     @Test(enabled=false)
     public void click_Price() throws InterruptedException {
    	
   	     Book_Chennai_Colombo.execute(driver);
    	 driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    	 Avlbl_Flghts af = new Avlbl_Flghts(driver);
    	 af.click_Price();
      }
 
     @Test(enabled=true)
     public void click_1_Stop() throws InterruptedException {
    	
   	     Book_Chennai_Colombo.execute(driver);
   	     /*driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
 	     Avlbl_Flghts af = new Avlbl_Flghts(driver);
 	     af.click_1Stop();
 	     */
   	  /*  driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
 	    WebElement Stop_1 = driver.findElement(By.xpath(""));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Stop_1);
	*/	
   	 /*    
   	  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
   	if(driver.findElement(By.xpath("//input[@name='stops' and @value='1']/following-sibling::label")).isDisplayed()) {
   		driver.findElement(By.xpath("//input[@name='stops' and @value='1']/following-sibling::label")).click();
   	}
   	else {
   	driver.findElement(By.xpath("//p[text() = 'Stops']/parent::div/following-sibling::div//label//p[text() = '1 stop']")).click();
   	}
  */
   	/*
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);     
   	List<WebElement> stops= driver.findElements(By.xpath("//input[@name='stops' and @value='1']/following-sibling::label"));
   	if(stops.size()>0) {
   	stops.get(0).click();
   	}
   	else {
   	driver.findElement(By.xpath("//p[text() = 'Stops']/parent::div/following-sibling::div//label//p[text() = '1 stop']")).click();
   	}   
   	*/
   	  Avlbl_Flghts af = new Avlbl_Flghts(driver);   
   	  af.click_1Stop();
      }
     
     @AfterMethod
    public void afterMethod() {
     }

 
     @AfterClass
    public void afterClass() {
    }

}
