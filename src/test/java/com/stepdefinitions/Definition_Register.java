package com.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library_opencart;
import com.pages.Registerpage_opencart;
import com.seleniumutility.Utility_opencart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition_Register extends Library_opencart{

	Utility_opencart utility;
	Registerpage_opencart registration;
	final static Logger logger = LogManager.getLogger(Definition_Register.class.getName());
	
	@Given("^launch the Browser  and enter the url$")
	public void launch_the_Browser_and_enter_the_url() throws Throwable 
	{
		to_launch_browser();
		logger.info("Browser is launched");
	}

	@When("^url is enterd$")
	public void url_is_enterd() throws Throwable 
	{
	   utility = new Utility_opencart(driver);
	   utility.to_take_screenshot("F:\\APPU\\eclipse\\Eclipse_projects\\Opencart_project\\src\\test\\resources\\Screenshots\\Urlopened.png");  //screenshot path
	}

	@Then("^click on myaccount and register$")
	public void click_on_myaccount_and_register() throws Throwable 
	{
		registration = new Registerpage_opencart(driver);
		registration.navigate_to_registerpage();
	}

	@Then("^enter <userfname>$")
	public void enter_userfname() throws Throwable 
	{
		registration = new Registerpage_opencart(driver);
	    registration.enter_fname("Sreehari");
	}   

	@Then("^enter <userlname>$")
	public void enter_userlname() throws Throwable 
	{
		registration = new Registerpage_opencart(driver);
		registration.enter_lname("krishnan");
	}

	@Then("^enter <useremail>$")
	public void enter_useremail() throws Throwable 
	{
		registration = new Registerpage_opencart(driver);
		registration.enter_email("demoopencart801@gmail.com");
	}

	@Then("^enter <telenumber>$")
	public void enter_telenumber() throws Throwable 
	{
		registration = new Registerpage_opencart(driver);
		registration.enter_phonenumer("9876543210");
	}

	@Then("^enter <pass>$")
	public void enter_pass() throws Throwable
	{
		registration = new Registerpage_opencart(driver);
		registration.enter_password("demoopencart123");
	}

	@Then("^enter <confirm>$")
	public void enter_confirm() throws Throwable
	{
		registration = new Registerpage_opencart(driver);
		registration.confirm_password("demoopencart123");
	}

	@Then("^complete the registration$")
	public void complete_the_registration() throws Throwable
	{
		registration = new Registerpage_opencart(driver);
		registration.register_completion();
		
		utility = new Utility_opencart(driver);
		utility.to_take_screenshot("F:\\APPU\\eclipse\\Eclipse_projects\\Opencart_project\\src\\test\\resources\\Screenshots\\RegisterSuccess.png");
		
		to_close_browser();
	}


	
	
}
