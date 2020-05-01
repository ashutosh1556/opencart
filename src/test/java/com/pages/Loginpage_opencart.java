package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_opencart
{

	WebDriver driver;
	
	//static Logger logger = Logger.getLogger(Loginpage_opencart.class.getName());
	/*By myacc    = By.xpath("//*[@id='top-links']/ul/li[2]/a");
	By login    = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a");
	By emailid  = By.id("input-email");
	By lpass    = By.xpath("//*[@id='input-password']");
	By loginbtn = By.xpath("//*[@id='content']/div/div[2]/div/form/input"); */
	
	@FindBy(linkText = "My Account")
	WebElement Myaccount;
	@FindBy(linkText = "Login")
	WebElement loginbtn;
	
	@FindBy(xpath = "//*[@id='input-email']")
    WebElement emailaddress;
	@FindBy(xpath = "//*[@id='input-password']")
	WebElement passwrd;
	@FindBy(xpath = "//*[@id='content']/div/div[2]/div/form/input")
	WebElement loginbutton;
	
	public Loginpage_opencart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//go to login page
	public void navigate_to_login()
	{
		Myaccount.click();
		loginbtn.click();
		
	}
	
	
	//To enter email 
	public void enter_email(String email)
	{
		emailaddress.sendKeys(email);
		
	}
	
	//to enter password
	public void enter_password(String pass)
	{
		passwrd.sendKeys(pass);
		
	}
	
	
	//login button
	public void login_button()
	{
		loginbutton.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
