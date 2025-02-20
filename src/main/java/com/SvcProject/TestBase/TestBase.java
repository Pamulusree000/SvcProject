package com.SvcProject.TestBase;

import java.io.IOException;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.SvcProject.PageLayer.AppointmentStatusChangePage;
import com.SvcProject.PageLayer.AssetDetailsPage;
import com.SvcProject.PageLayer.AssetMappingPage;
import com.SvcProject.PageLayer.AssetMasterPage;
import com.SvcProject.PageLayer.BookAppointmentPage;
import com.SvcProject.PageLayer.BulkCancellationPage;
import com.SvcProject.PageLayer.ChangePasswordPage;
import com.SvcProject.PageLayer.CommandCenterPage;
import com.SvcProject.PageLayer.DeviceStatusPage;
import com.SvcProject.PageLayer.DoctorProfilePage;
import com.SvcProject.PageLayer.DoctorRegistrationPage;
import com.SvcProject.PageLayer.FAQsPage;
import com.SvcProject.PageLayer.ForgotPasswordPage;
import com.SvcProject.PageLayer.HolidayCalendarPage;
import com.SvcProject.PageLayer.HomePage;
import com.SvcProject.PageLayer.LeavePage;
import com.SvcProject.PageLayer.MyAppointmentsPage;
import com.SvcProject.PageLayer.NotificationConfigurationPage;
import com.SvcProject.PageLayer.PatientProfilePage;
import com.SvcProject.PageLayer.PatientRegistrationPage;
import com.SvcProject.PageLayer.RaiseTicketPage;
import com.SvcProject.PageLayer.ReleaseNotePage;
import com.SvcProject.PageLayer.SignInPage;
import com.SvcProject.PageLayer.SignInViaOtpPage;
import com.SvcProject.PageLayer.SignupPage;
import com.SvcProject.PageLayer.SlotConfigurationPage;
import com.SvcProject.PageLayer.SpecializationPage;
import com.SvcProject.PageLayer.StaffRegistrationPage;
import com.SvcProject.PageLayer.SvcRegistrationPage;
import com.SvcProject.PageLayer.UserManagementPage;
import com.SvcProject.Utilities.ExcelHandling;
import com.SvcProject.Utilities.ExtentReportGenerator;
import com.SvcProject.Utilities.PropertiesFile;
import com.SvcProject.Utilities.UtilClass;
import com.SvcProject.Utilities.WebDriverUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestBase {

	
	public static WebDriver driver;
	public static Logger logger;
	
	public ExtentReports report= ExtentReportGenerator.getExtentReport();
	public ExtentTest eTest=null;
	public UtilClass util;
	public PropertiesFile propfile;
	public ExcelHandling excel;
	public WebDriverUtils utils;
	
	
	public SignInPage signin;
	public SignupPage signup;
	public SignInViaOtpPage signinviaotp;
	public ForgotPasswordPage forgotpassword;
	public ChangePasswordPage changepassword;
	public HomePage homepage;
	public PatientProfilePage patientprofile;
	public PatientRegistrationPage patientregistration;
	public BookAppointmentPage bookappointment;
	public DoctorRegistrationPage doctorregistration;
	public StaffRegistrationPage staffregistration;
	public SvcRegistrationPage svcregistration;
	public SpecializationPage specialization;
	public CommandCenterPage commandcenter;
	public SlotConfigurationPage slotconfiguration;
	public AssetMasterPage assetmaster;
	public AssetDetailsPage assetdetails;
	public AssetMappingPage assetmapping;
	public DeviceStatusPage devicestatus;
	public ReleaseNotePage  releasenote;
	public RaiseTicketPage raiseticket;
	public MyAppointmentsPage myappointments;
	public LeavePage  leavepage;
	public NotificationConfigurationPage notificationconfiguration;
	public DoctorProfilePage doctorprofile;
	public BulkCancellationPage bulkcancellation;
	public UserManagementPage  usermanagement;
	public AppointmentStatusChangePage appointmentstatuschange;
	public HolidayCalendarPage holidaycalendar;
	public FAQsPage faq;
	
	

	@BeforeTest
	public void start()
	{
		logger=	Logger.getLogger("Svc Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution Started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution Stopped");
	}

	
	@BeforeMethod
	public void setUp() throws IOException 
	{
		String browser ="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("open the default browser");
		}
		
		propfile=new PropertiesFile();
		
		driver.get(propfile.getUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		logger.info("Browser launches,Url,Maximize");
		
		
		//-------------------object creation----------------------------------
		
		
		util=new UtilClass();
		excel=new ExcelHandling();
		propfile=new PropertiesFile();
		utils=new WebDriverUtils(driver);
		
		signin =new SignInPage();		
		signup =new SignupPage();
		signinviaotp =new SignInViaOtpPage();
		forgotpassword =new ForgotPasswordPage();
		changepassword =new ChangePasswordPage();
		homepage = new HomePage();
		patientprofile=new PatientProfilePage();
		patientregistration=new PatientRegistrationPage();
		bookappointment =new BookAppointmentPage();
		doctorregistration=new DoctorRegistrationPage();
		staffregistration=new StaffRegistrationPage();
		svcregistration=new SvcRegistrationPage();
		specialization=new SpecializationPage();
		commandcenter=new CommandCenterPage();
		slotconfiguration=new SlotConfigurationPage();
		assetmaster =new AssetMasterPage();
		assetdetails=new AssetDetailsPage();
		assetmapping=new AssetMappingPage();
		devicestatus=new DeviceStatusPage();
		releasenote=new ReleaseNotePage();
		raiseticket =new RaiseTicketPage();
		myappointments=new MyAppointmentsPage();
		leavepage=new LeavePage();
		notificationconfiguration=new NotificationConfigurationPage();
		doctorprofile=new DoctorProfilePage();
		bulkcancellation=new BulkCancellationPage();
		usermanagement =new UserManagementPage();
		appointmentstatuschange=new AppointmentStatusChangePage();
		holidaycalendar= new HolidayCalendarPage();
		faq=new FAQsPage();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	

	
	
}
