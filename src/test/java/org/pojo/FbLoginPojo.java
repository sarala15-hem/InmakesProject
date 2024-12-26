package org.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.scc.baseclass;

public class FbLoginPojo extends baseclass  {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//a[@aria-label='Sign into Gmail'])[2]")
	private WebElement signin;
	
	@FindBy(xpath=("//input[@aria-label='Email or phone']"))
	private WebElement email;
	
	@FindBy(name="Passwd")
	private WebElement password;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		
		return email;
	}
	public WebElement getPassword() {
		return password;
	}

	
	
	
	}

	
	
	
	

	

