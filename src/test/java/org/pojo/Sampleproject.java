package org.pojo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.scc.baseclass;

public class Sampleproject extends baseclass {
	public static void main(String[] args) {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	WindowMaximize();
	
	FbLoginPojo f=new FbLoginPojo();
	PassText("seleniuminmakes@gmail.com",f.getEmail());
	PassText("8438663078@", f.getPassword());
	clickBtn(f.getSignin());
	
	
	}

}
