package module;

import org.openqa.selenium.WebDriver;
import page_Objects.Landing_Page;
import utilities.Constant;

public class Book_Chennai_Colombo {
	
	public static void execute(WebDriver driver)
	{
		driver.get(Constant.URL);
		Landing_Page lp = new Landing_Page(driver);
		lp.flight_From("Chennai");
		lp.flight_To("Colombo");
		lp.set_Depart_Date(Constant.Traveldate);
		Close_cookie_popup.execute(driver);
		lp.Srch_flight();
	}

}
