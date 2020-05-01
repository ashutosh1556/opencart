
package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Search_Review_opencart 
{

	WebDriver driver;
    static Logger logger = Logger.getLogger(Search_Review_opencart.class.getName());
	/* By searchbar = By.xpath("//*[@id='search']/input");
	By searchbtn = By.xpath("//*[@id='search']/span/button");
	By imac      = By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[1]/h4/a");
	By review    = By.xpath("//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a");
	By yname     = By.id("input-name");
	By yreview   = By.id("input-review");
	By rating    = By.xpath("//*[@id='form-review']/div[4]/div/input[4]");
	By contbtn   = By.xpath("//*[@id='button-review']");  */
    
    @FindBy(xpath ="//*[@id='search']/input")
    WebElement searchbar;
    @FindBy(xpath ="//*[@id='search']/span/button")
    WebElement searchbtn;
    
    @FindBy(linkText ="iMac")
	WebElement imac;
    @FindBy(linkText ="Reviews (0)")
    WebElement review;
    
    @FindBy(id ="input-name")
    WebElement yname;
    @FindBy(id = "input-review")
    WebElement yreview;
    @FindBy(xpath = "//*[@id='form-review']/div[4]/div/input[4]")
    WebElement rating;
    @FindBy(xpath = "//*[@id='button-review']")
    WebElement contbtn;
    
    
    
	//constructor
	public Search_Review_opencart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//search a product
	public void search_a_product(String srchbar)
	{
		searchbar.sendKeys(srchbar);
		searchbtn.click();
		logger.info("Product has bee clicked");
	}
	
	//select a product
	public void select()
	{
		imac.click();
		logger.info("A Product is selected");
	}
	
	//review a product
	public void review_a_product(String name, String writereview)
	{
		
		review.click();
		yname.sendKeys(name);
		yreview.sendKeys(writereview);
		rating.click();
		logger.info("Rating is given");
		contbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
