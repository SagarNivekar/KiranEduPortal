package login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Login.clickOnNewReg;
import Login.signInLogin;



public class loginPage {
	public static	WebDriver driver;
	public static signInLogin lp;
	public static clickOnNewReg regPage;
		@BeforeMethod
		public void setUp() {
			
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/index.html");
			//driver.get("file:///C:/Users/Sagar/Downloads/Offline_Website_lyst1725882420679/Offline%20Website/pages/examples/register.html");
			//driver.get(");
			 lp = new signInLogin (driver);
			 regPage = new clickOnNewReg (driver);
		}
		
		@AfterMethod
		void tearDown() {
			//driver.quit();
			
		}
		
		
		
		 

	}


