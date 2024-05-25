package outstationTaxiTest;

import java.util.Properties;

import org.testng.annotations.Test;

import Pages.OutStationTaxi;
import generics.BaseTest;

public class outstationTaxiUser extends BaseTest{
	OutStationTaxi op;
	Properties pr;
	
	@Test
	public void outstationtest() throws InterruptedException {
		pr=new Properties();
		op=new OutStationTaxi(driver);
		op.OutStation(city, location, pickuptime, month1, year1, day1,  droptime, month2, year2, day2);
	}
}