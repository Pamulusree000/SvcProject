package com.SvcProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SvcProject.TestBase.TestBase;


public class UtilClass extends TestBase{

	public UtilClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void acceptAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
	
	public void scrollToElementDown(WebElement ele) throws InterruptedException {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", ele);
		Thread.sleep(2000);
	}
	
	public void scrollToElementUp(WebElement ele) throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
	}
    
	public void WindowHandles()
	{
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> itr=set.iterator();
		
		String parentwindow = itr.next();
		
		
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
			
		}
		driver.switchTo().window(parentwindow);
	}
	
	
	public void selectdropdown(WebElement ele,String visibletext)
	{
		Select sec=new Select(ele);
		sec.selectByVisibleText(visibletext);		
	}
	
	
	public static void takeSS(String filename) 
	{
		String path = "./screenshots/";
		String timestamp = new SimpleDateFormat("dd/mm/yyyy-hh:mm:ss a").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename+".png");
		try 
		{
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
	public static String takeScreenshot(String testName,WebDriver driver) {
		
		File sourceScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationScreenshotFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png");
		try {
			FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return destinationScreenshotFile.getAbsolutePath();
	
	}
	
	
	
	
}
