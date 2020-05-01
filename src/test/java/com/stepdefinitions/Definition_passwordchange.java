package com.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library_opencart;
import com.pages.Loginpage_opencart;
import com.pages.Passwordchange_opencart;
import com.seleniumutility.Utility_opencart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_passwordchange extends Library_opencart {
	
	Loginpage_opencart login;
	Passwordchange_opencart passwordchange;
	Utility_opencart utility;
	final static Logger logger = LogManager.getLogger(Definition_passwordchange.class.getName());
	
	@Given("^Launch the Browser and enter the opencart url$")
	public void launch_the_Browser_and_enter_the_opencart_url() throws Throwable
	{
	   to_launch_browser();
	   logger.info("Browseer is launched ");
	}

	@Then("^after login navigate to my accounts$")
	public void after_login_navigate_to_my_accounts() throws Throwable 
	{
	    login = new Loginpage_opencart(driver);
	    login.navigate_to_login();
	    login.enter_email("sreehari2808@gmail.com");
	    login.enter_password("sreehari1234");
	    login.login_button();
	    logger.info("Login is clicked");
	    
	    passwordchange = new Passwordchange_opencart(driver);
	    passwordchange.navigate_myacc();
	    
	    
	}

	@Then("^change the password$")
	public void change_the_password() throws Throwable 
	{
		passwordchange = new Passwordchange_opencart(driver);   
		passwordchange.password_change("sreehari1234", "sreehari1234");
		logger.info("password is changed");
		
		utility = new Utility_opencart(driver);
		utility.to_take_screenshot("F:\\APPU\\eclipse\\Eclipse_projects\\Opencart_project\\src\\test\\resources\\Screenshots\\Passwordchange_Success.png");
		logger.info("Screenshot is taken");
		
		to_close_browser();
	}



}
