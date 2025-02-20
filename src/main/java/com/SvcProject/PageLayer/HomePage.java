package com.SvcProject.PageLayer;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SvcProject.TestBase.TestBase;



public class HomePage extends TestBase{
	
	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='./login/login']/span")
	private WebElement homelogin_link;
	
//	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='./login/login']/span")
//	private WebElement homesignin_btn;
	
	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='/Login/Register']/span")
	private WebElement homesignup_btn;
	


	
	
	
	
	public void exmaple() 
	{
	
		
		String parentwindow=driver.getWindowHandle();
		
		
		Set<String>childwindows=driver.getWindowHandles();
		
		
		for(String windows:childwindows)
		{
			String title=driver.getTitle();
			if(windows.equals(title))
			{
				driver.switchTo().window(windows);
			}
		}
		
		driver.switchTo().window(parentwindow);
		
		int i=10;
		String i_string=String.valueOf(i);
		System.out.println(i_string);
	
	}
	
	
	
	public String getSignInText() {
		return homelogin_link.getText();
	
	}
	
	public String getSignUpText() {
		return homesignup_btn.getText();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
