package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class General_T005_Data_HistoricUserTime_TimeZoneChange extends
ReportsHelper {

	@Test
	public void test_T005_Data_HistoricUserTime_TimeZoneChange()
			throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Change Time to Current System Time With 12 Hours
		 *           Format and Set device time to 10:00, Load Data file to
		 *           "4hr-5d.json" using MOCK_2 and Navigate to HomePage and set
		 *           the Target Glucose Range to 100-140 mg/dL 5.6-7.8 mmol/L.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/


		setTheDateAndTime(client, 01, 07, 2016, "10:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		loadTestData(client,  "MOCK_2","ADC", "4hr-5d.json");
		navigateToScreen(client, "Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS958
		 * @Expected Daily Patterns report displays glucose values according to
		 *           their historic user time:Verify Image manually The Daily
		 *           Patterns graph matches the one from attached file (Appolo):
		 *           For mg/dL unit '4hr-5d-DailyPatterns.pdf' For mmol/L/dL
		 *           unit '4hr-5d-DailyPatterns-mmol.pdf'
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step1);

		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: Navigate to HomePage and set the Target Glucose
		 *           Range to 70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS958
		 * @Expected Time In Target report displays glucose values according to
		 *           their historic user time:3.9-10.0: 75%;<3.9: 25%;or 70-180:
		 *           75%;<70: 25%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step2);

		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Low_Glucose_Events page and verifying Low
		 *           Glucose Event report displays glucose values according to
		 *           their historic user time:6am-9am: 5;9am-12pm: 5
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step3);

		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Average_Glucose page and verifying Average
		 *           Glucose report displays glucose values according to their
		 *           historic user time:6am-9am: 107;9am-12pm: 100
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step4);

		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Daily_Graph page and verifying Daily Graph
		 *           report displays glucose values according to their historic
		 *           user time:Two real time scan data;Four hours HG data around
		 *           6am-10am
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step5);

		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Sensor_Usage page and verifying Sensor Usage
		 *           report displays glucose values according to their historic
		 *           user time:10 Total Scans;1 scans Per Day;12 % of Sensor
		 *           Data Captured
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step6);

		navigateToScreen(client, "Sensor Usage");
		verifyHistoricUserTimeReportFor4hrTo5dDatafile(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set device time to 10:00, Load Data file to
		 *           "4hr-5dAnchorage_local-plus1hr.json" using MOCK_2 and
		 *           Navigate to HomePage and set the Target Glucose Range to
		 *           70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/


		changeTimeZone(client, LibrelinkConstants.USZone);
		setTheDateAndTime(client, 01, 07, 2016, "10:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Settings");

		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}
		loadTestData(client,  "MOCK_2","ADC",
				"4hr-5dAnchorage_local-plus1hr.json");

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Daily Patterns and verifying Daily Patterns
		 *           report displays glucose values according to their
		 *           historic user time:The graph matches the attached one
		 *           from Appolo '4hr-5d-AGP-TZ-plus1hr.pdf'
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step7);

		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: Navigate to HomePage and set the Target
		 *           Glucose Range to 70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Time In Target report displays glucose values according
		 *           to their historic user time:70-180: 75%;<70: 25%;or
		 *           3.9-10.0: 75%;<3.9: 25%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step8);

		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Low_Glucose_Events page and verifying Low
		 *           Glucose Event report displays glucose values according
		 *           to their historic user time:3am-6am: 1;6am-9am:
		 *           4;9am-12pm: 5
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step9);

		navigateToScreen(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS958
		 * @Expected Average Glucose report displays glucose values
		 *           according to their historic user time:3AM-6AM: 80 or
		 *           4.4;6AM-9AM: 109 or 6.1;9AM-12PM: 100 or 5.6
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step10);

		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Daily_Graph page and verifying Average
		 *           Glucose report displays glucose values according to
		 *           their historic user time:Two real time scan data;Two
		 *           hours HG data around 5am-7am;Two hours HG data around
		 *           8am-10am
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step11);

		navigateToScreen(client, "Daily Graph");
		clickArrowOnTopLeftOfTheGraph(client, 4);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS958
		 * @Expected Navigate to Sensor_Usage page and verifying Sensor
		 *           Usage report displays glucose values according to their
		 *           historic user time:10 Total Scans;1 scans Per Day;12 %
		 *           of Sensor Data Captured
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Data_HistoricUserTime_TimeZoneChange_Step12);

		navigateToScreen(client, "Sensor Usage");
		verifyHistoricUserTimeReportFor4hrTo5dDatafile(client);
		capturescreenshot(client, getStepID(), true);
		
		selectingSASMode(client,"DEFAULT");
		changeTimeZone(client, getDefaultTimeZone());		
		currentSystemTime(client);

	}


}
