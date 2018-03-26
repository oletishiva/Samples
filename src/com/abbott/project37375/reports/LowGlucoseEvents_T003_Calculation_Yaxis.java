package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class LowGlucoseEvents_T003_Calculation_Yaxis extends ReportsHelper {

	@Test
	public void test_T003_Calculation_Yaxis() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 12 Hours and Set device Date&Time to
		 *           02-28-2013 12:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setTheDateAndTime(client, 28, 02, 2013, "12:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2 and Navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS982
		 * @Expected Navigate to Low Glucose Events Reports and Click on 14 days
		 *           Data and verify Low Glucose Events for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step1);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 14);
		verifyLowGlucoseEventsReportForTotalEvents(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS982
		 * @Expected Click on 7 days Data and verify The total number of low
		 *           glucose events in 7 days: 0
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step2);
		clickOnDays(client, 7);
		verifyLowGlucoseEventsReportForTotalEvents(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS982
		 * @Expected Click on 90 days Data and verify The total number of low
		 *           glucose events in 90 days:8
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step3);
		clickOnDays(client, 90);
		verifyLowGlucoseEventsReportForTotalEvents(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS982
		 * @Expected Click on 30 days Data and verify The total number of low
		 *           glucose events in 30 days:8
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step4);
		clickOnDays(client, 30);
		verifyLowGlucoseEventsReportForTotalEvents(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home Page Change Time Format to 12 Hours and
		 *           Set device Date&Time to 02-12-2013 12:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 12, 02, 2013, "12:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);


		/**
		 * 
		 * @stepId Step 5_1
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar 24 hr format
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step5_1);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Step 5_2
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar 12 hr format
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step5_2);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the NO count of events corresponding to each bar.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step6);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Low Glucose Events");

		/**
		 * 
		 * @stepId Step 7_1
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar,00:00-03:00: 0;
		 *           03:00-06:00: 0;06:00-09:00: 1;09:00-12:00: 1;12:00-15:00:
		 *           0;15:00-18:00: 1;18:00-21:00: 2;21:00-00:00: 3
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step7_1);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Low Glucose Events");

		/**
		 * 
		 * @stepId Step 7_2
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar.12AM-3AM:
		 *           0;3AM-6AM : 0;6AM-9AM: 1;9AM-12PM: 1;12PM-3PM: 0;3PM-6PM:
		 *           1;6PM-9PM: 2;9PM-12AM: 3
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step7_2);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Low Glucose Events");

		/**
		 * 
		 * @stepId Step 8_1
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar.00:00-03:00: 
		 *           1;03:00-06:00: 0;06:00-09:00: 1;09:00-12:00: 1;12:00-15:00:
		 *           0;15:00-18:00: 1;18:00-21:00: 2;21:00-00:00: 2
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step8_1);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Low Glucose Events");


		/**
		 * 
		 * @stepId Step 8_2
		 * @Reqt SDAIUIRS984_SDAIUIRS989
		 * @Expected The Low Glucose Events report displays a bar graph showing
		 *           the count of events corresponding to each bar.12AM-3AM:
		 *           1;3AM-6AM: 0;6AM-9AM: 1;9AM-12PM: 1;12PM-3PM: 0;3PM-6PM:
		 *           1;6PM-9PM: 2;9PM-12AM: 2
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step8_2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home Page Change Time Format to 12 Hours and
		 *           Set device Date&Time to 06-22-2013 20:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setTheDateAndTime(client, 22, 06, 2013, "20:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "lowglucose-scan.json" using MOCK_2 and
		 *           Navigate to Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "lowglucose-scan.json");

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS986
		 * @Expected The Low Glucose Events report bar graph has a Y-axis whose
		 *           range is higher than highest bar(1) and Y axis is not labeled
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step9);
		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS986
		 * @Expected The Low Glucose Events report bar graph has a Y-axis whose
		 *           range is higher than highest bar(2) and Y axis is not labeled
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step10);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS986
		 * @Expected The Low Glucose Events report bar graph has a Y-axis whose
		 *           range is higher than highest bar(5) and Y axis is not labeled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step11);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS986
		 * @Expected The Low Glucose Events report bar graph has a Y-axis whose
		 *           range is higher than highest bar(7) and Y axis is not labeled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T003_Calculation_Yaxis_Step12);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
