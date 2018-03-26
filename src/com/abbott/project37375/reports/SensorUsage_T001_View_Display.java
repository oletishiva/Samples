package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class SensorUsage_T001_View_Display extends ReportsHelper {

	@Test
	public void test_T001_View_Display() throws Exception {


		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Access Sensor Usage report page form HomePage and verify the Sensor Usage report is
		 *           displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step1);
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Logbook page,select Sensor Usage report from menu and verify the Sensor Usage report
		 *           is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Reminder page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to DailyPatterns page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Time In Target page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_2);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Low_Glucose_Events page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Daily_Graph page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_4);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Average Glucose page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_5);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Estimated A1c page and select Sensor Usage report from menu.
		 *           Verify Sensor Usage report page is displayed and can be viewed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step4_6);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Sensor Usage");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to DailyPatterns page and verifying Sensor Usage
		 *           report is displayed and can be viewed by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Time In Target page and verifying Sensor Usage
		 *           report is displayed and can be viewed by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_2);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Low_Glucose_Events page and verifying Sensor
		 *           Usage Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_3);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Sensor Usage");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Daily_Graph page and verifying Sensor Usage
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_4);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Sensor_Usage page and verifying Sensor Usage
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_5);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Sensor Usage");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS1020_SDASRS1164_SDASRS1170
		 * @Expected Navigate to Estimated A1c page and verifying Sensor Usage
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step5_6);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Sensor Usage");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           02-28-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2 and Navigate to
		 *           Home Page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected verifying Average Glucose Date_period for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step6);
		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 90);
		verifyDatePeriodForNDays(client, "SENSOR USAGE",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected verifying Date 30 Jan-28 Feb 2013 displayed on top of the
		 *           screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step7);
		clickOnDays(client, 30);
		verifyDatePeriodForNDays(client, "SENSOR USAGE",30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected verifying Date 22-28 February 2013 displayed on top of the
		 *           screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step8);
		clickOnDays(client, 7);
		verifyDatePeriodForNDays(client, "SENSOR USAGE",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected verifying Date 15-28 February 2013 displayed on top of the
		 *           screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step9);
		clickOnDays(client, 14);
		verifyDatePeriodForNDays(client, "SENSOR USAGE",14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page Change Time Format to 24 Hours and
		 *           Set device time to 03-02-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 02, 03, 2013, "23:50");

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected Verifying Date 17 Feb -2 Mar 2013 displayed on top of the
		 *           screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step10);
		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 14);
		verifySensorUsageDateFor14DaysWithAdditionalTwoDays(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set device time to 03-02-2016
		 *           23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 02, 03, 2016, "23:50");

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS955_SDAIUIRS1021
		 * @Expected Verifying Date 18 Feb -2 Mar 2016 displayed on top of the
		 *           screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T001_View_Display_Step11);
		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 14);
		verifySensorUsageDateFor14DaysWithLeapYear(client);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
