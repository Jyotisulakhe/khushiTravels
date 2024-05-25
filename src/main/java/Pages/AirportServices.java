package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AirportServices {
	WebDriver driver;

	public AirportServices(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//i want to initialize my driver(this - class driver)
		//All the elements in this class are being initialized
		
	}
	
	@FindBy(id = "optionsRadios3")
	private WebElement radiobtn3;
	
	@FindBy(id = "airport_pick_ip_city")
	private WebElement selectcity;
	
	
	@FindBy(id = "airport_pick_ip_city")
	private WebElement pickupcity;
	
	@FindBy(id="datepicker5")
	private WebElement pickupdate;
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement nextbtn;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	private WebElement month;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	private WebElement year;
	
	@FindBy(xpath = "(//td[@data-handler='selectDay'])[3]")
	private WebElement date;
	
	@FindBy(xpath = "(//select[@class='form-control'])[8]")
	private WebElement pickuptime;
	
	@FindBy(id="airport_search")
	private WebElement searchbutton;
	
	@FindBy(id="3")
	private WebElement bookbutton;
	
	
	// Getters Methods for all my Webelements
	public WebElement getRadiobtn3() {
		return radiobtn3;
	}
	

	public WebElement getCity() {
		return selectcity;
	}


	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	


	public WebElement getDate() {
		return date;
	}


	public WebElement getPickupcity() {
		return pickupcity;
	}

	public WebElement getPickupdate() {
		return pickupdate;
	}

	public WebElement getPickuptime() {
		return pickuptime;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	public WebElement getBookbutton() {
		return bookbutton;
	}

	Select s;
public void airportService(String city,String month1, String year1,String picuptime) {
		
		radiobtn3.click();
		
		s=new Select(selectcity);
		s.selectByVisibleText(city);
		
		
		
		pickupdate.click(); //pickup date
		
		String mon1 = month.getText();
		String y1 = year.getText();
		
		while(!(mon1.equals(month1)&&y1.equals(year1))){
			nextbtn.click();
			mon1=month.getText();
			y1=year.getText();
		}
		date.click();
		s=new Select(pickuptime);
		s.selectByVisibleText(picuptime);
		
		searchbutton.click();
		
		
		bookbutton.click();
		
}
}