package org.stepdefinition;
import org.pojo.FbLoginPojo;
import org.scc.baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positiveandnegativeclass extends baseclass{
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	    
	}

	@When("User has to hit the Gmail url")
	public void user_has_to_hit_the_Gmail_url() {
		launchUrl("https://mail.google.com/mail/");
	    
	}

	@When("User has to pass the data in email field")
	public void user_has_to_pass_the_data_in_email_field() {
		FbLoginPojo f=new FbLoginPojo();
		PassText("seleniuminmakes@gmail.com", f.getEmail());
		
	    
	}

	@When("User has to pass the data in password field")
	public void user_has_to_pass_the_data_in_password_field() {
		FbLoginPojo f=new FbLoginPojo();
		PassText("inmakes",f.getPassword());
		
		
	    
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		FbLoginPojo f=new FbLoginPojo();
		clickBtn(f.getSignin());
		
	    
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowse();
	    
	}



}
