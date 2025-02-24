package test_execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Login.signInLogin;
import exceldata.excelData;
import exceldata.excelDataForNewReg;
import login_page.loginPage;
import login_page.loginPage2;

public class testExecutionForNewReg extends loginPage2 {
	@Test(dataProvider = "newRegistration")
	void loginTestCases(String name12,String mobile12, String email22,String pass22, boolean isSuccessful) {
		
		String nameErrorMessageForReg = "Please enter Name.";
				String mobileErrorMessageForReg ="Please enter Mobile.";
				String emailErrorMessageForReg = "Please enter Email.";
				String passwordErrorMessageForReg ="Please enter Password.";
				
				WebElement errorName= driver.findElement(By.xpath("//*[@id=\"name_error\"]"));
				WebElement errorMobile= driver.findElement(By.id("mobile_error"));
				WebElement errorMail= driver.findElement(By.id("email_error"));
				WebElement errorPass= driver.findElement(By.id("password_error"));
		
		if(isSuccessful) {
			
			//regPage.registerNewMembership();
			regPage.name1(name12);
			regPage.mobile1(mobile12);
			regPage.email2(email22);
			regPage.pass2(pass22);
			regPage.btnReg();
			
			//Assert.assertTrue(driver.getTitle().equals("JavaByKiran | Dashboard"));
		}
		else
		{
			regPage.registerNewMembership();
			regPage.name1(name12);
			regPage.mobile1(mobile12);
			regPage.email2(email22);
			regPage.pass2(pass22);
			regPage.btnReg();
			
			
			Assert.assertTrue(errorName.isDisplayed());
			Assert.assertTrue(errorMobile.isDisplayed());
			Assert.assertTrue(errorName.isDisplayed());
			Assert.assertTrue( errorPass.isDisplayed());
		}}
@DataProvider(name= "newRegistration" )
	
	public Object [][] getRegData() throws IOException{
		Object data [][]  = excelDataForNewReg.readDataFromExcel1("Registration");
		return data;
}
		

}