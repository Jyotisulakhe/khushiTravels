package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest{ //this is my parent class
	
	protected WebDriver driver;
	protected String city;
	protected String location;
	protected String month1;
	protected String year1;
	protected String day1;
	protected String pickuptime;
	protected String month2;
	protected String year2;
	protected String day2;
	protected String droptime;
	
	@BeforeClass
	public void setup() throws IOException {
		driver=new ChromeDriver();
		Properties pr= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\khushitravelsProject\\src\\test\\resources\\basic.properties");
		pr.load(fis);
		String url=pr.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		
	 city = pr.getProperty("city");
		 location = pr.getProperty("locat");
		 month1 = pr.getProperty("m1");
		 year1 = pr.getProperty("yr1");
		 //day1 = pr.getProperty("d1");
		 pickuptime = pr.getProperty("picuptime");
		 month2 = pr.getProperty("m2");
		 year2 = pr.getProperty("yr2");
		// day2 = pr.getProperty("d2");
		 droptime = pr.getProperty("droptime");
		
		
	}
	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
////	
}