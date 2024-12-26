package org.stepdefinition;

import org.base.baseclass;
import org.pojo.FbLoginPojo1;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A extends baseclass{
	@When("User has to hit the facebook Url")
	public void user_has_to_hit_the_facebook_Url() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	    FbLoginPojo1 f=new FbLoginPojo1();
	    PassText("seleniuminmakes@gmail.com", f.getEmail());
	}

	@When("User has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		FbLoginPojo1 f=new FbLoginPojo1();
	    PassText("inmakes", f.getPassword());
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	    FbLoginPojo1 f=new FbLoginPojo1();
	    clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowse();
	}




}
