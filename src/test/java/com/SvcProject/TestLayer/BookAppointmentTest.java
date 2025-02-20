package com.SvcProject.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class BookAppointmentTest extends TestBase{

	@DataProvider(name="bookappointmentdata")
	public Object [][] bookappointmentdata() throws Exception
	{
		Object [][]data=ReadExcelData.excelTestData("bookappointment");
		return data;
	}
	
	
	
	@Test(dataProvider="bookappointmentdata")
	public void verifyBookAppointment(String Username,String Password,String Specialization,String SvcSearch,String DoctorSearch,String FamilyName)
	{
		
		signin.clickOnSigninButton();
		signin.setUsername(Username);
		signin.setPassword(Password);
		signin.clickOnLoginbutton();
		bookappointment.clickOnBookAppointmentLink();
		bookappointment.selectSpecializationlist(Specialization);
		bookappointment.setSvcSearchtxt(SvcSearch);
		bookappointment.clickOnBookAppointmentBtn();
		
		
		bookappointment.setDoctorSearch(DoctorSearch);
		bookappointment.clickOnRadioBtn();
		bookappointment.clickOnConfirmClinicbtn();
		bookappointment.clickOnConfirmOkBtn();
		
		
	}
	
	
	
	
	
	
}
