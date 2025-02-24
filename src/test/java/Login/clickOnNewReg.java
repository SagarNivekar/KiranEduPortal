package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickOnNewReg {
	
public clickOnNewReg (WebDriver driver)


	{
		PageFactory.initElements( driver, this);
	}

@FindBy (xpath ="/html/body/div/div[2]/a") WebElement RegisterNewMembership;
//@FindBy (linkText = "Register a new membership") WebElement RegisterNewMembership;
	
	@FindBy (id="name")
	
	WebElement txtName;
	
	@FindBy (id="mobile")
	WebElement txtMobile;

	@FindBy (id="email")
	
	WebElement txtEmail;
	
	@FindBy (id="password")
	WebElement txtPassword;
	 
	@FindBy (xpath="//*[@id=\"form\"]/div[5]/div/button")
	WebElement btnSignIn1;
	
	public void registerNewMembership() {
		RegisterNewMembership.click();
	}

	public void name1(String name12) {
		
		txtName.sendKeys(name12);
	}
	
	public void mobile1(String mobile12) {
		
		txtMobile.sendKeys(mobile12);}
		
		public void email2(String email22) {
			
			txtEmail.sendKeys(email22);
		}
		
		public void pass2(String pass22) {
			
			txtPassword.sendKeys(pass22);
	}
	
	public void btnReg() {
		btnSignIn1.click();
	}
	
	
	

}
