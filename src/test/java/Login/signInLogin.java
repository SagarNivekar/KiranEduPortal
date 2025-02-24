package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signInLogin {
	
public signInLogin (WebDriver driver)


	{
		PageFactory.initElements( driver, this);
	}
	
	@FindBy (id="email")
	
	WebElement txtEmail;
	
	@FindBy (id="password")
	WebElement txtPassword;
	 
	@FindBy (xpath="//*[@id=\"form\"]/div[3]/div/button")
	WebElement btnSignIn;

	@FindBy (linkText = "Register a new membership") WebElement RegisterNewMembership;
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div[1]/div/a") WebElement clickOnMoreInfo;
	
	public void email(String mail1) {
		
		txtEmail.sendKeys(mail1);
	}
	
	public void pass(String pass1) {
		
		txtPassword.sendKeys(pass1);
	}
	
	public void btn() {
		btnSignIn.click();
	}
	
	public void registerNewMembership() {
		RegisterNewMembership.click();
	}
	
	public void seleniumMoreInfo() {
		clickOnMoreInfo.click();}
	
}