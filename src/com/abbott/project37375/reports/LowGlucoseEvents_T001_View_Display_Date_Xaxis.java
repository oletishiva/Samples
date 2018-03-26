package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class LowGlucoseEvents_T001_View_Display_Date_Xaxis extends
ReportsHelper {

	@Test
	public void test_T001_View_Display_Date_Xaxis() throws Exception {


		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Low Glucose Events page from home page and verifying Low Glucose Events
		 *           Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step1);
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Logbook page,from there move to Low Glucose Events report page and verifying Low Glucose Events
		 *           Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Reminder page,from there move to Low Glucose Events report page and verifying Low Glucose Events
		 *           Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to DailyPatterns page,from there move to Low Glucose Events report page and verifying Low Glucose
		 *           Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Time In Target page,select Low Glucose Events report from menu and verify Low
		 *           Glucose Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_2);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Average_Glucose page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_3);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Daily_Graph page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_4);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Estimated A1c page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Low Glucose Events");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}

		/**
		 * 
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Sensor_Usage page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to DailyPatterns page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Time In Target page,select Low Glucose Events report from menu and verify Low
		 *           Glucose Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_2);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Average_Glucose page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_3);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Daily_Graph page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_4);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Estimated A1c page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Low Glucose Events");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS979_SDASRS1164_SDASRS1167
		 * @Expected Navigate to Sensor_Usage page,select Low Glucose Events report from menu and verify Low Glucose
		 *           Events Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the Phone Timing to 24 Hours Format and Set
		 *           device Date&time to 02-28-2013 23:50, Load Data file to
		 *           "Basic Data.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS955_SDAIUIRS981
		 * @Expected Click on 90 days Data and verify Low Glucose Events
		 *           Date_period for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step6);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 90);
		verifyDatePeriodForNDays(client, "LOW GLUCOSE EVENTS",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS955_SDAIUIRS981
		 * @Expected Click on 30 days Data and verify Low Glucose Events
		 *           Date_period for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step7);
		clickOnDays(client, 30);
		verifyDatePeriodForNDays(client, "LOW GLUCOSE EVENTS",30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS955_SDAIUIRS981
		 * @Expected Click on 7 days Data and verify Low Glucose Events
		 *           Date_period for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step8);
		clickOnDays(client, 7);
		verifyDatePeriodForNDays(client, "LOW GLUCOSE EVENTS",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS955_SDAIUIRS981
		 * @Expected Click on 14 days Data and verify Low Glucose Events
		 *           Date_period for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step9);
		clickOnDays(client, 14);
		verifyDatePeriodForNDays(client, "LOW GLUCOSE EVENTS",14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verifying LowGlucoseEvents Report for X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 14 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step10);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verifying LowGlucoseEvents Report X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 90 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step11);
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verifying LowGlucoseEvents Report X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 30 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step12);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verifying LowGlucoseEvents Report X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 7 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step13);
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page Set Phone timing to 12hr Format
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verify LowGlucoseEvents Report_X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 90 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step14);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verify LowGlucoseEvents Report_X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 30 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step15);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verify LowGlucoseEvents Report_X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 14 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step16);
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS985_SDAIUIRS987
		 * @Expected Verify LowGlucoseEvents Report_X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 7 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step17);
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Low Glucose Events");
		capturescreenshot(client, getStepID(), true);



		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}
}
