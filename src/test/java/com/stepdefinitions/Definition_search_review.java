package com.stepdefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library_opencart;
import com.pages.Loginpage_opencart;
import com.pages.Search_Review_opencart;
import com.seleniumutility.Utility_opencart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_search_review extends Library_opencart
{

	Search_Review_opencart search ;
	Utility_opencart utility;
	Loginpage_opencart login;
	final static Logger logger = LogManager.getLogger(Definition_search_review.class.getName());

	@Given("^launch browser and enter the url$")
	public void launch_browser_and_enter_the_url() throws Throwable 
	{
		to_launch_browser();
		logger.info("Browser is launched");
	}
	
	@Then("^enter the product in \"([^\"]*)\"$")
	public void enter_the_product_in(String srchbar) throws Throwable 
	{
		login = new Loginpage_opencart(driver);
	    login.navigate_to_login();
	    login.enter_email("sreehari2808@gmail.com");
	    login.enter_password("sreehari1234");
	    login.login_button();
	    logger.info("Login is clicked");
	    
		search = new Search_Review_opencart(driver);
	    search.search_a_product(srchbar);
	    logger.info("Text is enterd in search bar");
	}
	
	

	@Then("^select the product and review it$")
	public void select_the_product_and_review_it() throws Throwable 
	{
		search = new Search_Review_opencart(driver);
		search.select();
		
		search.review_a_product("demo opencart","This product is good. I kinda liked it.");
		logger.info("Review is given");
		utility = new Utility_opencart(driver);
		utility.to_take_screenshot("F:\\APPU\\eclipse\\Eclipse_projects\\Opencart_project\\src\\test\\resources\\Screenshots\\ReviewSuccess.png");
		logger.info("Screen shot is taken");
		
		to_close_browser();
	}

}
