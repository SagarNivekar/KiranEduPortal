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


public class testDownloadFunctionInDash extends dashboardLoginfun {
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
			dashLogin.usefulLinksOption();
			  Set<String> allWindows = driver1.getWindowHandles();
	            for (String windowHandle : allWindows) {
	                if (!windowHandle.equals(originalWindow)) {
	                    driver1.switchTo().window(windowHandle); // Switch to the new window
	                    break;
	                }
	            }

			String actualTitle1 = driver1.getTitle();
			 System.out.println("Actual Page Title: " + actualTitle1);
			 Assert.assertEquals(actualTitle1, "JavaByKiran | Useful Links");
			Assert.assertTrue(driver1.getTitle().equals("JavaByKiran | Useful Links"));
			 // Navigate to the classroom videos page and verify the title
	//		dashLogin.usefulLinksGoOption();
			 // Wait for the classroom videos page to load
//         
//			String actualUrl2 = driver1.getCurrentUrl();
//			 System.out.println("Actual URL: " + actualUrl2);
//			// Assert.assertEquals(actualTitle2, "Our Classroom Videos | Java By Kiran");
//			Assert.assertTrue(driver1.getCurrentUrl().equals("https://javabykiran.com/java-by-kiran-videos/"));
			
		}
		else {
		System.out.println("Useful Links Failed");
		}
    }
    
    
    }
	
	 
