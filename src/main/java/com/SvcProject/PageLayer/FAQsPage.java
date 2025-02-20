package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class FAQsPage extends TestBase {
	
	
	
	
	public FAQsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//variables
	
	@FindBy(xpath="//span[text()='Support']")
	private WebElement support_module;
	
	@FindBy(xpath="//span[text()='Raise Ticket']")
	private WebElement raiseticket_form;
	
	@FindBy(xpath="//div[@class='faq_data']/button")
	private List<WebElement> searchFAQs;
	
	
	//methods
	
	
	public void clickSupportmodule()
	{
		support_module.click();
	}
	public void clickraiseticketform()
	{
		raiseticket_form.click();
	}
	
	
	public void selectFAQs(String input)
	{
		
		List<String> faqslist=new ArrayList<>();
		
		for(int f=0;f<searchFAQs.size();f++)
		{
			faqslist.add(searchFAQs.get(f).getText());
			
		}
		for(int f=0;f<faqslist.size();f++) {
			if(faqslist.get(f).equals(input))
			{
				searchFAQs.get(f).click();
				break;
			}
		}
		
		
	}
	

}
