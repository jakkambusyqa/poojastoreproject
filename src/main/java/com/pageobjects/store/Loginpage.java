package com.pageobjects.store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.poojastore.BaseClass;

public class Loginpage extends BaseClass{
    
	@FindBy (xpath="(//a[text()='Log In'])[1]")
	WebElement login;
	
	@FindBy (name="emailid")
    WebElement user;
	
	@FindBy (name="pword")
	WebElement password;
	
	@FindBy (xpath="(//button[@class='btn btn-dark btn-md w-100'])[1]")
	WebElement loginbtn;
	
	@FindBy (xpath="//a[@class='header-icon d-inline-block']//i[@class='icon-user-2']")
	WebElement pro;
	
	@FindBy (xpath="//i[@class='fas fa-sign-out-alt']")
	WebElement logout;
	
	
	
	
	public Loginpage() throws Throwable    {		
	PageFactory.initElements(driver, this);
		
	}
	
	
	public String Titletest(){	
	return driver.getTitle();
	}
	
	
	  public Homepage Validatelogin(){	
		login.click();
		user.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
				
	  return new Homepage();
	}
    
	  public CutomerLOginpage Validatelogout(){
		  
		    login.click();
			user.sendKeys(prop.getProperty("username"));
			password.sendKeys(prop.getProperty("password"));
			loginbtn.click();  
		    pro.click();
		    logout.click();
		
		return new CutomerLOginpage();
		  
	  }

	
}
