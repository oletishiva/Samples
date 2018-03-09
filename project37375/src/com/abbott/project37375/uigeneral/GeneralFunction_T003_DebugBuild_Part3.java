package com.abbott.project37375.uigeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;
import com.abbott.project37375.uigeneral.GeneralReleaseBaseHelper;

public class GeneralFunction_T003_DebugBuild_Part3 extends GeneralReleaseBaseHelper {

	/**
	 * Author: ShabinaSherif
	 * 
	 * Script to verify Debug Build - Covers Below areas 
	 * This test covers screens incluiding Result Home screen, logbook and reports
	 * 
	 * 	Test area include:
	 * 	SDAUIRS861, SDAUIRS863, SDAUIRS864, SDAUIRS868, SDAUIRS871 
	 * 	SDAUIRS937, SDAUIRS938, SDAUIRS939, SDAUIRS963, SDAUIRS967 
	 * 	SDAUIRS970, SDAUIRS971, SDAUIRS977, SDAUIRS1021, SDAUIRS1238 
	 * 	SDAUIRS1239, SDAUIRS992 SDAUIRS993 SDAUIRS995, SDAUIRS1004 SDAUIRS1005 SDAUIRS1195 
	 * 	SDAUIRS1250, SDAUIRS1018, SDAUIRS1131, SDAUIRS1243, SDAUIRS1168
	 * 	SDAUIRS1127, SDAUIRS860 SDAUIRS870, SDAUIRS1241, SDAUIRS878, SDAUIRS879, SDAUIRS880
	 * 	SDAUIRS884, SDAUIRS885, SDAUIRS886, SDAUIRS888, SDAUIRS889 
	 * 	SDAUIRS981, SDAUIRS982, SDAUIRS983, SDAUIRS984 
	 * 	SDAUIRS1007, SDAUIRS1011, SDAUIRS1012, SDAUIRS1014 
	 * 	SDAUIRS954, SDAUIRS1131 SDAUIRS1127 
	 * 	 
	 * 	Datasets:
	 * 	90days_autoDate_Notes.json
	 * 	9hr-notes-chicago.json
	 * 
	 *  @throws Exception
	 *  		Throws Exception as it involves date selection
	 */

	@Test
	public void test_T003_DebugBuild_Part3() throws Exception {

		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt NA
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		setTheTimeAlone(client,"12:00");
		/*selectSkipForDebugging(client);*/
		loadTestData(client,  "MOCK_2","ADC","90days_autoDate_Notes.json");


		/**
		 * @stepId Step 1
		 * @Reqt SDAUIRS861 SDAUIRS863 SDAUIRS864 SDAUIRS868 SDAUIRS871
		 * @Expected Verify the HomeScreen with data
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step1);
		navigateToScreen(client, "home");
		verifyHomePageDetailsWithData(client);
		client.verifyElementFound("NATIVE","xpath=//*[contains(@text,':') and ./parent::*[@id='last_scan']]" ,0);		
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 2
		 * @Reqt SDAUIRS963 SDAUIRS967
		 * @Expected Verify the Daily Pattern Report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step2);
		navigateToScreen(client, "navigation_drawer_daily_patterns");
		clickOnDays(client, 7);
		//TODO
		/*	swipeOnReport(client,"Right");
		swipeOnReport(client,"Right");
		swipeOnReport(client,"Right");*/
		verifyReportDataAvailableForNdays(client,90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 3
		 * @Reqt SDAUIRS1021
		 * @Expected Verify the Sensor Usage Report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step3);
		navigateToScreen(client, "navigation_drawer_sensor_usage");
		clickOnDays(client, 90);
		//TODO
		/*swipeOnReport(client,"Left");
		swipeOnReport(client,"Left");*/
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 4
		 * @Reqt SDAUIRS970 SDAUIRS971 SDAUIRS977
		 * @Expected Verify the Time In target Report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step4);
		navigateToScreen(client, "navigation_drawer_time_in_target");
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 5
		 * @Reqt SDAUIRS992 SDAUIRS993 SDAUIRS995
		 * @Expected Verify the Average Glucose Report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step5);
		navigateToScreen(client, "navigation_drawer_average_glucose");
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client,30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 6
		 * @Reqt SDAUIRS1004 SDAUIRS1005 SDAUIRS1195
		 * @Expected Verify the Daily Graph Report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step6);
		navigateToScreen(client, "navigation_drawer_daily_graph");
		clickOnCalendarDate(client);
		pickDate(client, getDateFormat(-89));
		capturescreenshot(client, getStepID(), true);

		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			/**
			 * @stepId Step 7
			 * @Reqt SDAUIRS1250 SDAUIRS1018
			 * @Expected Verify the Estimated A1c Report
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step7);
			navigateToScreen(client, "navigation_drawer_estimated_a1c");
			verifyReportDataAvailableForNdays(client,90);
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,"Step7_Estimated A1c_NotApplicable");
		}
		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt NA
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changeTimeZone(client, LibrelinkConstants.USZone);
		setTheTimeAlone(client,"16:00");
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		clickOnSettingsMenu(client, "settings");
		if(getUnits().contains("mg")){
			verifyandsetTGfromSettings(client,150,180);
		}else{
			verifyandsetTGfromSettings(client,8.3,10.0);
		}
		loadTestData(client,  "MOCK_2","ADC","9hr-notes-chicago.json");

		/**
		 * @stepId Step 8
		 * @Reqt SDAUIRS1131 SDAUIRS1243 SDAUIRS1168
		 * @Expected Verify the Glucose Value and Units in MyGlucose page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step8);
		navigateToMyGlucosePage(client);
		if (getUnits().equals("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"50");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"2.8");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 9
		 * @Reqt SDAUIRS1127
		 * @Expected Low Glucose - Check Glucose Alarm
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step9_1);
		clickAlertIcon(client);
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step9_2);
		clickSetCheckGlucoseReminder(client);
		selectLowReminderTime(client, 15);
		clickOnButtonOptions(client, "start", true);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "reminders");
		verifyCheckGlucoseReminderCountdown(client, "14:");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 10
		 * @Reqt SDAUIRS860 SDAUIRS870
		 * @Expected Verify the Home Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step10);
		navigateToScreen(client, "home");
		verifyHomePageDetails(client);
		client.verifyElementFound("NATIVE","xpath=//*[contains(@text,'"+getUnits()+"') and ./parent::*[@id='last_scan']]" ,0);		
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 11
		 * @Reqt SDAUIRS1241
		 * @Expected Verify the Time Zone text
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step11);
		clickOnNotesorTimeZoneorBG(client, "Timezone", 0);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[contains(@text,'Time zone change from')]",
				0);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 12
		 * @Reqt SDAUIRS1127
		 * @Expected Verify the Timer Expired Notification
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step12);
		advanceTime(client, 0, 12);
		waitFor(client, 2);
		verifyReminderNotification(client, "Timer Expired",false);
		verifyTimerExpiredNotification(client);
		capturescreenshot(client, getStepID(), true);
		clearSingleNotification(client, "Timer Expired");
		launch(client);

		/**
		 * @stepId Step 13
		 * @Reqt SDAUIRS878 SDAUIRS879 SDAUIRS880
		 * @Expected Verify the Logbook
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step13);
		navigateToScreen(client, "logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 14
		 * @Reqt SDAUIRS884 SDAUIRS885 SDAUIRS886 SDAUIRS888 SDAUIRS889
		 * @Expected Verify the Logbook detail screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step14);
		if (getUnits().equals("mg/dL")) {
			clickCreatedNote(client, "50");
		}else{
			clickCreatedNote(client, "2.8");
		}
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * @stepId Step 15
		 * @Reqt SDAUIRS981 SDAUIRS982 SDAUIRS983 SDAUIRS984
		 * @Expected Verify the Low Glucose events report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step15);
		navigateToScreen(client, "navigation_drawer_low_glucose");
		clickOnDays(client, 14);
		client.verifyElementFound("NATIVE","xpath=//*[@id='days_of_data' and @text='Data available for 2 of 14 days']",0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='chart_summary' and @text='Total Events: 1']",0);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 16
		 * @Reqt SDAUIRS1007 SDAUIRS1011 SDAUIRS1012 SDAUIRS1014
		 * @Expected Verify the daily graph report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step16);
		navigateToScreen(client, "navigation_drawer_daily_graph");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 17
		 * @Reqt SDAUIRS954
		 * @Expected Share the report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T003_DebugBuild_Part3_Step17);
		saveTheSharedBitmap(client);
		capturescreenshot(client, getStepID(), true);
		saveNotes(client);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}
}
