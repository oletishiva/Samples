package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class A1c_T002_View_Display extends ReportsHelper {

	@Test
	public void test_T002_View_Display() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           04-05-2014 18:20
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 05, 04, 2014, "18:20");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC","20HR-AGP-1HG.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1250
		 * @Expected 1) Estimated A1c report displays 'Not Enough Sensor Data'.
		 *           2) Less than 20 hours AGP is displayed on Daily Patterns
		 *           Report
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step1);
		navigateToScreen(client, "Estimated A1c");
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step1_2);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           04-05-2014 18:40
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 05, 04, 2014, "18:40");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC","20HR-AGP-1HG.json");

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1250
		 * @Expected 1) Estimated A1c report displays A1c calculated values. 
		 *           2) 20 hours AGP is displayed on Daily Patterns Report
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step2);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportCalculatedValues(client);
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step2_2);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1017
		 * @Expected Date 6 Jan - 5 Apr 2014 is displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step3);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cDateHeader(client, "Apr5");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS1018
		 * @Expected Data spans 5 of 90 days is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step4);
		verifyEstimatedA1cReportDataSpanForNdays(client, 5);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           04-05-2014 18:40
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 8, 04, 2014, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC","20HR-AGP-1HG.json");

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS1017
		 * @Expected Date 9 Jan - 8 Apr 2014 is displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step5);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cDateHeader(client, "Apr8");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS1018
		 * @Expected Data spans 7 of 90 days is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step6);
		verifyEstimatedA1cReportDataSpanForNdays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           05-22-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 11, 04, 2014, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "20HR-AGP-1HG.json");

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS1017
		 * @Expected Date 12 Jan - 11 Apr 2014 is displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step7);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cDateHeader(client, "Apr11");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS1018
		 * @Expected Data spans 10 of 90 days is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T002_View_Display_Step8);
		verifyEstimatedA1cReportDataSpanForNdays(client, 10);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
