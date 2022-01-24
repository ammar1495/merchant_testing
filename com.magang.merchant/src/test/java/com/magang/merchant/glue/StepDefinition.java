package com.magang.merchant.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.magang.merchant.config.AutomationFrameworkConfiguration;
import com.magang.merchant.driver.DriverSingleton;
import com.magang.merchant.page.CompletedData;
import com.magang.merchant.page.LoginPage;
import com.magang.merchant.page.MonitoringMD;
import com.magang.merchant.page.Validasi;
import com.magang.merchant.utils.ConfigurationProperties;
import com.magang.merchant.utils.Constants;
import com.magang.merchant.utils.TestCases;
import com.magang.merchant.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
	private Validasi validasi;
	private CompletedData completed;
	private MonitoringMD monitoring;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());

		loginPage = new LoginPage();
	//	validasi = new Validasi();
	//	completed = new CompletedData();
		monitoring = new MonitoringMD();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	//LOGIN MODUL
		@Given("^User go to the Website")
		public void user_go_to_the_website() {
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URL);
			extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
		}
		
		@When("^User input username password and click Login")
		public void User_input_username_password_and_click_login() {
			loginPage.gotoLogin(configProperties.getMyusername(), configProperties.getPassword());

			extentTest.log(LogStatus.PASS, "User input username password and click Login");
		}
		
		@Then("^User can login to the Website")
		public void user_can_login_to_the_website() {
			loginPage.clikClose();
			extentTest.log(LogStatus.PASS, "User can login to the Website");
		}
			
	//modul validasi
//	@When("^User go to Validasi page and Action button")
//	public void user_go_to_validasi_page_and_action_button() {
//		validasi.gotoValidasi();
//		extentTest.log(LogStatus.PASS, "User go to Validasi page and Action button");
//	}
//	
//	@Then("^User can approve data") 
//	public void User_can_approve_data() {
//		
//		extentTest.log(LogStatus.PASS, "User can approve data");
//	
//	}
//
//	//Modul CompletedData
//	@When("^User can go Completed Data page and Action button sukses")
//	public void User_can_go_Completed_Data_page_and_Action_button_sukses() {
//		completed.gotoCompletedData();
//		extentTest.log(LogStatus.PASS, "User can go Completed Data page and Action button");
//	}
//	
//	@When("^User can go Completed Data page and Action button gagal")
//	public void User_can_go_Completed_Data_page_and_Action_button_gagal() {
//		completed.gotoCompletedDataGagal();
//		extentTest.log(LogStatus.PASS, "User can go Completed Data page and Action button gagal");
//	}
//	
//	@Then("^User can print and edit status")
//	public void User_can_print_and_edit_status() {
//		extentTest.log(LogStatus.PASS, "User can print and edit status");
//	}
	
	
	//Modul MonitoringMD
	@When("^User can go Monitoring MD page and Action button")
	public void User_can_go_Monitoring_MD_page_and_Action_button() {
		monitoring.MonitoringMD();
		extentTest.log(LogStatus.PASS, "User can go Monitoring MD page and Action button");
	}
	
	@Then("^User can see Action button data")
	public void User_can_see_Action_button_data() {
		extentTest.log(LogStatus.PASS, "User can see Action button data");
	}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
