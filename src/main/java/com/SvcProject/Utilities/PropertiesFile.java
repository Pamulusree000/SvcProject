package com.SvcProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.SvcProject.TestBase.TestBase;

public class PropertiesFile extends TestBase{
	

	public Properties prop;
	
	
	public PropertiesFile() 
	{
		File file=new File("./src/test/resources/config/SvcDetails.properties");
		
		prop= new Properties();
		
		try {
		
		FileInputStream fis=new FileInputStream(file);
		
		prop.load(fis);
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public String getUrl() 
	{
		return prop.getProperty("URL");
	}
	public String getHealthLockerConsultationFilePath()
	{
		return prop.getProperty("HealthLockerConsultationFilePath");
	}
	public String getHealthLockerEmailUploadFilePath()
	{
		return prop.getProperty("HealthLockerEmailUploadFilePath");
	}
	public String getHealthLockerLabReportsFilePath()
	{
		return prop.getProperty("HealthLockerLabReportsFilePath");
	}
	public String getHealthLockerMedcialInvoiceFilePath()
	{
		return prop.getProperty("HealthLockerMedcialInvoiceFilePath");
	}
	
	public String[] getHealthDoucmentsArray() {
		String[] HealthDoucmentsArray = {getHealthLockerConsultationFilePath(), 
										 getHealthLockerEmailUploadFilePath(), 
										 getHealthLockerLabReportsFilePath(), 
										 getHealthLockerMedcialInvoiceFilePath()
										};
		return HealthDoucmentsArray;
	}
	
	public List<String> getHealthLockerDocuments(){
		List<String> HealthLockerDocumentPaths = new ArrayList<>(Arrays.asList(getHealthDoucmentsArray()));
		return HealthLockerDocumentPaths;
	}
	
}
