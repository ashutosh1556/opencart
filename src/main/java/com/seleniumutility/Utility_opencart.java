package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library_opencart;

public class Utility_opencart extends Library_opencart
{
	WebDriver driver;
	
	//constructor
	public  Utility_opencart(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//to take screenshot
	public void to_take_screenshot(String path)
	{
		TakesScreenshot ss =  (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
