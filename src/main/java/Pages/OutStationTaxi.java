package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OutStationTaxi {
	

	WebDriver driver;

	public OutStationTaxi(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//i want to initialize my driver(this)
		//All the elements in this class are being initialized
		
	}
	
	//defining my OutStationTaxi page objects
	@FindBy(id = "optionsRadios1")
	private WebElement radiobtn1;
	
	@FindBy(id = "optionsRadios2")
	private WebElement radiobtn2;
	
	@FindBy(id = "optionsRadios3")
	private WebElement radiobtn3;
	
	@FindBy(id = "outstation_pick_up_city")
	private WebElement selectcity;
	
	@FindBy(xpath = "(//select[@class='form-control su'])[2]")
	private WebElement selectlocation;
	
	@FindBy(id = "datepicker3")
	private WebElement pickupdate;
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement nextbtn3;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	private WebElement month;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	private WebElement year;
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement nextbtn;
	
	@FindBy(xpath = "(//td[@data-handler='selectDay'])[5]")
	private WebElement date;
	
	@FindBy (xpath = "//span[@class='ui-datepicker-month']")
	private WebElement month2;
	
	@FindBy (xpath = "//span[@class='ui-datepicker-year']")
	private WebElement year2;
	
	@FindBy(xpath = "(//td[@data-handler='selectDay'])[4]")
	private WebElement date2;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	private WebElement pickuptime;
	
	
	@FindBy(id = "datepicker4")
	private WebElement dropoffdate;
	
	@FindBy(xpath = "(//select[@class='form-control'])[6]")
	private WebElement dropofftime;
	
	@FindBy(id = "out_station_search")
	private WebElement searchbutton;
	
	// Getters Methods for all my Webelements
	
	
	public WebElement getSelectcity() {
		return selectcity;
	}

	

	public WebElement getLselectlocation() {
		return selectlocation;
	}



	public WebElement getPickupdate() {
		return pickupdate;
	}

	public WebElement getPickuptime() {
		return pickuptime;
	}
	
	
public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	//
	public WebElement getRadiobtn1() {
		return radiobtn1;
	}

	public WebElement getRadiobtn2() {
		return radiobtn2;
	}

	public WebElement getRadiobtn3() {
		return radiobtn3;
	}

	public WebElement getNextbtn3() {
		return nextbtn3;
	}

	

	public WebElement getDropoffdate() {
		return dropoffdate;
	}
	


	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth2() {
		return month2;
	}

	public WebElement getYear2() {
		return year2;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getDropofftime() {
		return dropofftime;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	
	
	Select s;
	public void OutStation(String city, String location, String picuptime, String month1, String year1,String day1, String droptime, String month2, String year2, String day2) throws InterruptedException {
		
		radiobtn2.click();
		
		s=new Select(selectcity);
		s.selectByVisibleText(city);
		
		s=new Select(selectlocation);
		s.selectByVisibleText(location);
		
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
		
		Thread.sleep(2000);
		dropoffdate.click();
		String mon2 = month.getText();
		String y2 = year.getText();
while(!(mon2.equals(month2)&&y2.equals(year2))){ //this logic for select Drop off date from calendar
			
			nextbtn.click();
			mon2=month.getText();
			y2=year.getText();
			
		}
		
date2.click();

s=new Select(dropofftime);
s.selectByVisibleText(droptime);
Thread.sleep(2000);

searchbutton.click();
Thread.sleep(2000);
	}
}
