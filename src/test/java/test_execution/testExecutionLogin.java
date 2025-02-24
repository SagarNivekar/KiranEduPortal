package test_execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Login.signInLogin;
import exceldata.excelData;
import login_page.loginPage;

public class testExecutionLogin extends loginPage {
	@Test(dataProvider = "signIn")
	void loginTestCases(String mail1,String Pass1, boolean isSuccessful) {
		
		String emailErrorMessage = "Please enter email as kiran@gmail.com";
				String passwordErrorMessage ="Please enter password 123456";
				
				WebElement errorMail= driver.findElement(By.id("email_error"));
				WebElement errorpass= driver.findElement(By.id("password_error"));
		
		if(isSuccessful) {
			lp.email(mail1);
			lp.pass(Pass1);
			lp.btn();
			lp.registerNewMembership();
			Assert.assertTrue(driver.getTitle().equals("JavaByKiran | Dashboard"));
		}
		else
		{
			lp.email(mail1);
			lp.pass(Pass1);
			lp.btn();
			
			Assert.assertTrue(errorMail.isDisplayed());
			Assert.assertTrue(errorpass.isDisplayed());
		}}
@DataProvider(name= "signIn" )
	
	public Object [][] getSignInData() throws IOException{
		Object data [][]  = excelData.readDataFromExcel1("sheet1");
		return data;
}
		

}