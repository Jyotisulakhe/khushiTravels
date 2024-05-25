package LocalTaxiTest;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.LocalTaxiPage;
import generics.BaseTest;


//this is my child class
public class localTaxiUser extends BaseTest{
	//this is where i am writing my test
	LocalTaxiPage lp;
	
	Properties pr ;
	
@Test
public void localtaxitest() throws IOException, InterruptedException {
	pr=new Properties();
	lp=new LocalTaxiPage(driver);
	
	lp.LocalTaxi(city, location, pickuptime, month1, year1, droptime, month2, year2);
	
	
}
@Test
public void localtaxitest1() throws InterruptedException {
	pr=new Properties();
	lp=new LocalTaxiPage(driver);
	lp.LocalTaxi(city, location, pickuptime, month1, year1, droptime, month2, year2);
	
	
}
}
