package test_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import login_page.dashboardLoginfun;


public class testOpertorList extends dashboardLoginfun {
	// DataProvider to pass test data (email, password, and expected result)
    @DataProvider(name = "dashboardData")
    public Object[][] createTestData() {
        return new Object[][] {
            { "kiran@gmail.com", "123456", true  },  // valid credentials
           // { "invalidEmail@example.com", "456789", false } // invalid credentials
        };
    }

    @Test(dataProvider = "dashboardData")

void dashboardTestCases(String dashMail,String dashPass, boolean isSuccessful) {
		
		
		
		if(isSuccessful) {

	        
			dashLogin.demail(dashMail);
			dashLogin.dpass(dashPass);
			dashLogin.dbtn();
			dashLogin.opertorListOption();
			String actualTitle = driver1.getTitle();
			 System.out.println("Actual Page Title: " + actualTitle);
				Assert.assertTrue(driver1.getTitle().equals("JavaByKiran | Operators"));
		}
		else {
		System.out.println(" Useful Links  Failed");
		}
    }}
	
	 
