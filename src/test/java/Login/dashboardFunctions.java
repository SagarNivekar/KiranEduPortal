package Login;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dashboardFunctions {
	
public dashboardFunctions (WebDriver driver1)


	{
		PageFactory.initElements( driver1, this);
	}

	
	@FindBy (id="email")
	
	WebElement txtEmailDash;
	 
	@FindBy (id="password")
	WebElement txtPasswordDash;
	 
	@FindBy (xpath="//*[@id=\"form\"]/div[3]/div/button")
	WebElement btnSignInDash;

	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div[1]/div/a") 
	WebElement clickOnMoreInfo;
	
	@FindBy (xpath="/html/body/div[1]/aside/section/ul/li[3]/a")
	WebElement userClickOption; //Dashboard'a User Option
	
	@FindBy (xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span") 
	WebElement userDeleteBtn;  //Dashboard'a User Delete Option
	
	@FindBy (xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button") 
	WebElement userAddBtn;  //Dashboard'a User AddUser Option
	
	//Add User All Textbox's Locator
	@FindBy (xpath="//*[@id=\"username\"]") 
	WebElement userAddUsername; 
	
	@FindBy (xpath="//*[@id=\"email\"]") 
	WebElement userAddEmail; 
	
	@FindBy (xpath="//*[@id=\"mobile\"]") 
	WebElement userAddMobileNo; 
	
	@FindBy (xpath="//*[@id=\"course\"]") 
	WebElement userAddCourse; 
	
	@FindBy (xpath="//*[@id=\"Male\"]") 
	WebElement userAddGenederBtn; 
	
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select") 
	WebElement userAddCityDropdown; 
	
	@FindBy (xpath  = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select/option[3]") 
	WebElement userAddCity; 
	
	@FindBy (xpath="//*[@id=\"password\"]") 
	WebElement userAddPassword; 
	
	@FindBy (xpath="//*[@id=\"submit\"]") 
	WebElement userAddSubmitBtn; 
	
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[7]/a/span") 
	WebElement userLogOutBtn;
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[4]/a/span") WebElement clickOnOpertorList;
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[5]/a") WebElement clickOnUsefulLinks;
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]/a/span") WebElement clickOnUsefulLinksGo;
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[6]/a") WebElement clickOnDownloads;
	
	public void demail(String dashMail) {
		
		txtEmailDash.sendKeys("kiran@gmail.com");
	}
	
	public void dpass(String dashPass) {
		
		txtPasswordDash.sendKeys("123456");
	}
	
	public void dbtn() {
		btnSignInDash.click();
	}
	
	public void seleniumMoreInfo() {
		clickOnMoreInfo.click();
	}
	//Dashboard'a User Option
	public void userclick() {
		userClickOption.click();
		
	}	
	//Dashboard'a User Delete Option
	public void userDeleteBtnclick() {
		userDeleteBtn.click();
	}
    public void UserAddUserBtn() {
    	
    	userAddBtn.click();
    }
    
    //AddUserForm Class
    
    public void AddUserUsename(String AddUserName) {
    	userAddUsername.sendKeys("Sagar");
    }
    
  public void AddUserEmailAdd(String AddUserEmail) {
	  userAddEmail.sendKeys("sagarnivekar456@gmail.com");
    }
  public void AddUserMobileNo(String AddUserMobile) {
	  userAddMobileNo.sendKeys("7507570976");
  }
  public void AddCousreName(String addUserCoursName1) {
	  userAddCourse.sendKeys("java");
  }
  public void AddUserGender() {
	  userAddGenederBtn.click();
  }
  
  public void AddUserCityDrop() {
	  userAddCityDropdown.click();
  }
  public void AddUserCitySelect() {
	  userAddCity.click();
  }
  public void AddUserPassword (String UserAddPassword) {
	  userAddPassword.sendKeys("Sagar111");
  }
  
  public void AddUserSbmitbutton () {
	  userAddSubmitBtn.click();
  }
  public void UserLogOutButton () {
	  userLogOutBtn.click();
  }
	
	public void opertorListOption() {
		clickOnOpertorList.click();}	
		
	public void usefulLinksOption() {
		clickOnUsefulLinks.click();}
	public void usefulLinksGoOption() {
		clickOnUsefulLinksGo.click();}
	public void downloadsOption() {
		clickOnDownloads.click();	
}
}
