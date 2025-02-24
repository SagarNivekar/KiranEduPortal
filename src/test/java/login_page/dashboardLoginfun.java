  package login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.clickOnNewReg;
import Login.dashboardFunctions;
import Login.signInLogin;



public class dashboardLoginfun {
	 public static	WebDriver driver1;

	 public dashboardFunctions dashLogin;
	
	
		@BeforeMethod
		public void setUp() {
			
			driver1 = new ChromeDriver();
			driver1.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");
			
			 dashLogin = new dashboardFunctions (driver1);
		}
		
		@AfterMethod
		void tearDown() {
			
		}
}