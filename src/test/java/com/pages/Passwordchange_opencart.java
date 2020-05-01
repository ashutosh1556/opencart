package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordchange_opencart {
	
	WebDriver driver;
	static Logger logger = Logger.getLogger(Passwordchange_opencart.class.getName());
/*	By password       = By.xpath("//*[@id='column-right']/div/a[3]");
	By passchange     = By.id("input-password");
	By passconfirm    = By.id("input-confirm");
	By contbtn	      = By.xpath("//*[@id='content']/form/div/div[2]/input");
	By myacc          = By.xpath("//*[@id='top-links']/ul/li[2]/a");
	By myaccdropdown  = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a"); */
	
	@FindBy(xpath ="//*[@id='column-right']/div/a[3]")
	WebElement password;
	
	@FindBy(id = "input-password")
	WebElement passchange;
	@FindBy(id = "input-confirm")
	WebElement passconfirm;
	
	@FindBy(xpath ="//*[@id='content']/form/div/div[2]/input")
	WebElement contbtn;	
	@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/a")
	WebElement myacc; 
	@FindBy(xpath ="//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
	WebElement myaccdropdown;
	
	//constructor
	public Passwordchange_opencart(WebDriver driver)
	{
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
	//navigate to my account after login
	public void navigate_myacc()
	{
		myacc.click();
		myaccdropdown.click();
		logger.info("my account is clicked");
	}
	
	
	//password change
	public void password_change(String chpass , String conpass)
	{
		password.click();
		passchange.sendKeys(chpass);
		passconfirm.sendKeys(conpass);
		contbtn.click();
		logger.info("password is changed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
}
