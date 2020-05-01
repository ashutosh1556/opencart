package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage_opencart {

	WebDriver driver;
	static Logger logger = Logger.getLogger(Registerpage_opencart.class.getName());
	/* By myacc    = By.xpath("//*[@id='top-links']/ul/li[2]/a");
	By register = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a");
	By fname    = By.id("input-firstname");
	By lname    = By.id("input-lastname");
	By email    = By.id("input-email");
	By tphone   = By.id("input-telephone");
	By ypass    = By.id("input-password");
	By cpass    = By.id("input-confirm");
	By agreebtn = By.xpath("//*[@id='content']/form/div/div/input[1]");
	By contbtn  = By.xpath("//*[@id='content']/form/div/div/input[2]");
	By contbtn2 = By.xpath("//*[@id='content']/div/div/a"); */
	
	@FindBy(linkText = "My Account")
	WebElement Myaccount;
	@FindBy(linkText = "Register")
	WebElement Registerbtn;
	
	@FindBy(id = "input-firstname")
	WebElement firstuname;
	@FindBy(id ="input-lastname")
	WebElement lastuname;
	@FindBy(id ="input-email")
	WebElement emailid;
	@FindBy(id ="input-telephone")
	WebElement phone;
	@FindBy(id="input-password")
	WebElement yourpass;
	@FindBy(id="input-confirm")
	WebElement confirmpass;
	
	
	@FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
	WebElement agreebtn;
	@FindBy(xpath = "//*[@id='content']/form/div/div/input[2]")
	WebElement contbtn;
	@FindBy(xpath = "//*[@id='content']/div/div/a")
	WebElement contbtn2;
	
	//constructor
	public Registerpage_opencart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//going to Register
	public void navigate_to_registerpage()
	{
		Myaccount.click();
		Registerbtn.click();
		logger.info("Register is clicked");
	}
	
	//enter first name
	public void enter_fname(String userfname)
	{
		
		firstuname.sendKeys(userfname);
		logger.info("user first name is enterd");
	}
	
	//enter last name
	public void enter_lname(String userlname)
	{
		lastuname.sendKeys(userlname);
		logger.info("user last name is enterd");
	}
	
	//enter email
	public void enter_email(String useremail)
	{
		emailid.sendKeys(useremail);
		logger.info("Email id  is enterd");
	}
	
	//enter phone number
	public void enter_phonenumer(String telenumber)
	{
		phone.sendKeys(telenumber);
		logger.info("Telephone number is  enterd");
	}
	
	//enter password
	public void enter_password(String pass)
	{
		yourpass.sendKeys(pass);
		logger.info("password is enterd");
	}
	
	//confirm password
	public void confirm_password(String confirm)
	{
		confirmpass.sendKeys(confirm);
		logger.info("Password is confirmed");
	}
	
	//complete registration
	public void register_completion()
	{
		agreebtn.click();
		contbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		contbtn2.click();
		logger.info("Registration is completed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
