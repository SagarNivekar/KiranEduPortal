package test_execution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import login_page.dashboardLoginfun;


public class testUsefulLinks extends dashboardLoginfun {
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
//			
	       
	        
			dashLogin.demail(dashMail);
			dashLogin.dpass(dashPass);
			dashLogin.dbtn();
			

            // Store the current window handle before opening new tabs
            String originalWindow = driver1.getWindowHandle();
			 // Verify the title of the useful links page
			dashLogin.downloadsOption();
			 

			String actualTitle1 = driver1.getTitle();
			 System.out.println("Actual Page Title: " + actualTitle1);
			 Assert.assertEquals(actualTitle1, "JavaByKiran | Downloads");

			
		}
		else {
		System.out.println("Downloads Failed");
		}
    }
    
    
    }
	
	 
