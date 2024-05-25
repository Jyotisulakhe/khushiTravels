package airportServiceTest;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.AirportServices;
import generics.BaseTest;

public class airportserviceUser extends BaseTest{

	
		//this is where i am writing my test
		AirportServices lp;
		
		Properties pr ;
		
	@Test
	public void localtaxitest() throws IOException {
		pr=new Properties();
		lp=new AirportServices(driver);
		
   lp.airportService(city, month1, year1,pickuptime);
		
		
	}
	@Test
	public void localtaxitest2() {
		pr=new Properties();
		lp=new AirportServices(driver);
//		lp.LocalTaxi(null, null, null, null, null, null, null, null, null, null);
		
	}
	}


