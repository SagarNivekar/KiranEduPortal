package test_execution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import login_page.dashboardLoginfun;


public class testUserAddUserFunctionality extends dashboardLoginfun {
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
//			
	        
			dashLogin.demail(dashMail);
			dashLogin.dpass(dashPass);
			dashLogin.dbtn();
			dashLogin.userclick();
			dashLogin.UserAddUserBtn();
			dashLogin.AddUserUsename("sagar");
			dashLogin.AddUserMobileNo("7507570976");
			dashLogin.AddUserEmailAdd("Sgar12@gmail.com");
			dashLogin.AddCousreName("java");
			dashLogin.AddUserGender();
			dashLogin.AddUserCityDrop();
			dashLogin.AddUserCitySelect();
			dashLogin.AddUserPassword("sagar");
			dashLogin.AddUserSbmitbutton();
			
			Alert alert= driver1.switchTo().alert();
			alert.accept();
			System.out.println("Add User Is Successfully Done");
		}
		else {
		System.out.println("Add User is Not Working ");
		}}
	
	 

}
