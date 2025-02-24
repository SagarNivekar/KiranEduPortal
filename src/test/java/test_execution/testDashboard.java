package test_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import login_page.dashboardLoginfun;


public class testDashboard extends dashboardLoginfun {
	// DataProvider to pass test data (email, password, and expected result)
    @DataProvider(name = "dashboardData")
    public Object[][] createTestData() {
        return new Object[][] {
            { "kiran@gmail.com", "123456", true , "JavaByKiran | Dashboard"},  // valid credentials
           // { "invalidEmail@example.com", "456789", false } // invalid credentials
        };
    }

    @Test(dataProvider = "dashboardData")

void dashboardTestCases(String dashMail,String dashPass, boolean isSuccessful, String expectedTitle) {
		
		
		
		if(isSuccessful) {
//			 // Step 3: Get the actual page title
//	        String actualTitle = driver1.getTitle();
	        
	        // Debugging: Print the actual title to understand what's happening
	       
	        
			dashLogin.demail(dashMail);
			dashLogin.dpass(dashPass);
			dashLogin.dbtn();
			dashLogin.seleniumMoreInfo();
			String actualTitle = driver1.getTitle();
			 System.out.println("Actual Page Title: " + actualTitle);
			Assert.assertTrue(driver1.getTitle().equals("JavaByKiran | Dashboard"));
		}
		else {
		System.out.println("Dashboard Failed");
		}}
	
	 

}
