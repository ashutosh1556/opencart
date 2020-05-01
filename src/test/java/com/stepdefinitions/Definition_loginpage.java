package com.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library_opencart;
import com.excelutility.Excel_Datadriven;
import com.pages.Loginpage_opencart;
import com.seleniumutility.Utility_opencart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_loginpage  extends Library_opencart
{
	Loginpage_opencart login;
	Utility_opencart utility;
	Excel_Datadriven excel;
	final static Logger logger = LogManager.getLogger(Definition_loginpage.class.getName());
	
	@Given("^Launch the browser and enter url$")
	public void launch_the_browser_and_enter_url() throws Throwable 
	{
		to_launch_browser();
	}

	@Then("^navigate to login page$")
	public void navigate_to_login_page() throws Throwable 
	{
	    login = new Loginpage_opencart(driver);
	    login.navigate_to_login();
	    logger.info("login buttion is clicked");
	}
	
	@Then("^enter <email>$")
	public void enter_email() throws Throwable 
	{
				
		login = new Loginpage_opencart(driver);
		excel = new Excel_Datadriven();
		login.enter_email(excel.excel_username(1));
		logger.info("User name is enterd");
	}	
	

	@Then("^enter <password>$")
	public void enter_password() throws Throwable
	{
	
		excel = new Excel_Datadriven();
		login = new Loginpage_opencart(driver);
		login.enter_password(excel.excel_password(1));
		logger.info("password is entered");
	}


	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable 
	{
		login = new Loginpage_opencart(driver);
		login.login_button();
		logger.info("Login button is clicked");
		
		utility = new Utility_opencart(driver);
		utility.to_take_screenshot("F:\\APPU\\eclipse\\Eclipse_projects\\Opencart_project\\src\\test\\resources\\Screenshots\\LoginSuccess.png");
		logger.info("Screenshot is taken");
		
		to_close_browser();
	}

}
