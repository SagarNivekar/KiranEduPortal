package test_execution;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import login_page.dashboardLoginfun;



public class testLogOutFunctonality extends dashboardLoginfun {
	// DataProvider to pass test data (email, password, and expected result)
    @DataProvider(name = "dashboardData")
    public Object[][] createTestData() {
        return new Object[][] {
            { "kiran@gmail.com", "123456", true , "JavaByKiran | Log in"},  // valid credentials
           // { "invalidEmail@example.com", "456789", false } // invalid credentials
        };
    }
    @Test(dataProvider = "dashboardData")
  public  void dashboardTestCases(String dashMail,String dashPass, boolean isSuccessful, String expectedTitle) {
		
		
    	
		
		if(isSuccessful) {
//			 // Step 3: Get the actual page title
	      
	        // Debugging: Print the actual title to understand what's happening
	       
	        
			dashLogin.demail(dashMail);
			dashLogin.dpass(dashPass);
			dashLogin.dbtn();
			dashLogin.UserLogOutButton();
			
			  String actualTitle = driver1.getTitle();
		        
			Assert.assertTrue(driver1.getTitle().equals("JavaByKiran | Log in"));
            System.out.println("LogOut SuccessFully");
			
		}
		else {
		System.out.println("LogOut Function is Not Working ");
		}}
	
	 

}
