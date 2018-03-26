package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T001_GlucoseGraph_TimeZoneChange extends UIGeneralHelper {

	@Test
	public void test_General_T001_GlucoseGraph_TimeZoneChange() throws Exception {

		changeTimeZone(client, LibrelinkConstants.US);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1168
		 * @Expected The software displays a scan results screen containing the current Real-time glucose value and Trend Arrow as 50 mg/dL or 2.8 mmol/L and glucose is falling
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step1);
		launch(client);
		setTheTimeAlone(client, "15:00");
		loadTestData(client, "MOCK_2", "ADC","9hr-notes.json");
		navigateToMyGlucosePage(client);	
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"2.8");
		}		
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1168
		 * @Expected The software displays a scan results screen containing a glucose graph of 8 hours HG displayed from graph ending around 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step2);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS869
		 * @Expected Home screen glucose graph displays the most recent realtime glucose 50 mg/dL or 2.8 mmol/L around 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step3);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client,"2.8");
		}
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS868
		 * @Expected Home screen glucose graph displays 9 hours Historical Glucose values ending aroung 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step4);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS1168
		 * @Expected Glucose graph displays 8 hours Historical glucose values ending around 17:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step5);
		changeTimeZone(client, LibrelinkConstants.EST);
		reLaunch(client);
		navigateToMyGlucosePage(client);	
		waitFor(client, 3);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS1168
		 * @Expected Verify the current Real-time glucose in My Glucose screen Around 17:50, 50 mg/dL or 2.8 mmol/L and Trend Arrow going low
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step6);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"2.8");
		}
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS869
		 * @Expected Home screen glucose graph displays the most recent realtime glucose values as 50 mg/dL or 2.8 mmol/L around 17:50.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step7);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client,"2.8");
		}
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS868
		 * @Expected Home screen glucose graph displays 9 hours Historical Glucose values ending around 17:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step8);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt 
		 * @Expected Change phone time 4 hrs ahead and launch the App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step9);
		advanceTime(client,4,0);
		launch(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS868
		 * @Expected Home screen glucose graph displays 9 hours Historical Glucose values ending around 17:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step10);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS1243
		 * @Expected Timezone change indicator displayed around 11:00 in My Glucose screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step11);
		changeTimeZone(client,LibrelinkConstants.US);
		setTheTimeAlone(client, "15:00");
		reLaunch(client);
		loadTestData(client, "MOCK_2", "ADC","9hr-notes-chicago.json");
		waitFor(client,2);
		navigateToMyGlucosePage(client);	
		waitFor(client, 3);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS1244
		 * @Expected Timezone change indicator displayed Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step12);
		clickOnNotesorTimeZoneorBG(client, "timezone",0);
		verifyTimezoneChangeDetailsFromCstToPst(client);		
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS870
		 * @Expected Timezone change indicator displayed around 11:00 in Home screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step13);
		clickOnBackOrMenuIcon(client);
		verifyTimezoneIcon(client, 0);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAUIRS1241
		 * @Expected Timezone change indicator displayed Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step14);
		clickOnNotesorTimeZoneorBG(client, "timezone",0);
		verifyTimezoneChangeDetailsFromCstToPst(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAUIRS880_SDAUIRS882
		 * @Expected Timezone change indicator displayed in the list, and the information Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h) can be viewed in Logbook
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step15);
		navigateToScreen(client, "logbook");
		waitFor(client, 2);
		client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list' and @class='android.widget.ListView' and @onScreen='true']", "Down", 100, 2000, "NATIVE", "xpath=//*[@id='tz_clock_icon' and @class='android.support.v7.widget.AppCompatImageView' and @onScreen='true']", 0, 1000, 5, false);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_clock_icon' and @class='android.support.v7.widget.AppCompatImageView' and @onScreen='true']",0);
		verifyTimezoneChangeDetailsFromCstToPst(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAUIRS889,SDAISRS307 
		 * @Expected Timezone change indicator displayed around 11:00 in Logbook Details page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step16);
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='logbook_list']", 0, "view.setSelectionFromTop(0, 0);");
		client.click("NATIVE", "xpath=//*[@id='logbookItemText' and @onScreen='true']", 0, 1);
		waitFor(client,1);
		client.verifyElementFound("NATIVE", "xpath=//*[@class='com.librelink.app.ui.widget.mpchart.datadecorators.TimeZoneDecorator']",0);		
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAUIRS890
		 * @Expected The line of HG on graph has a gap around TimeZone change Indicator.HG with 150 and 200 mg/dL or 8.3 and 11.1 mmol/L not displayed on graph
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step17);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAUIRS1243
		 * @Expected Timezone change indicators displayed around 11:00 and 13:00 in  My Glucose screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step18);
		changeTimeZone(client,LibrelinkConstants.US);
		setTheTimeAlone(client, "15:00");
		reLaunch(client);
		loadTestData(client, "MOCK_2", "ADC","9hr-notes-Anchorage-SF-Anchorage.json");
		waitFor(client, 2);
		navigateToMyGlucosePage(client);
		verifyTimezoneIcon(client, 0);
		verifyTimezoneIcon(client, 1);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAUIRS1168
		 * @Expected My Glucose screen displays current real time glucose value as 50 mg/dL or 2.8 mmol/L around 14:50 and Trend arrow as Glucose is falling.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step19);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client, "50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"2.8");
		}

		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAUIRS1168
		 * @Expected My Glucose screen Glucose graph displays 8 hours Historical Glucose values ending around 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step20);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAUIRS868
		 * @Expected Home screen Glucose graph displays 9 hours historical glucose values ending around 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step21);
		clickOnBackOrMenuIcon(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAUIRS869
		 * @Expected Home screen Glucose graph displays most recent real time glucose value as 50 mg/dL or 2.8 mmol/L around 14:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step22);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"50");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client,"2.8");
		}
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAUIRS870
		 * @Expected Timezone change indicators displayed around 11:00 and 13:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step23);
		verifyTimezoneIcon(client, 0);
		verifyTimezoneIcon(client, 1);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAUIRS880
		 * @Expected Two Timezone change indicators displayed in the list
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step24);
		navigateToScreen(client, "logbook");
		verifyTimezoneChangeDetailsFromPstToAkdt(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAUIRS889,SDAISRS307 
		 * @Expected Timezone change indicators displayed around 11:00 and 12:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step25);
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='logbook_list']", 0, "view.setSelectionFromTop(0, 0);");
		client.click("NATIVE", "xpath=//*[@id='logbookItemText' and @onScreen='true']", 0, 1);
		verifyTimezoneIcon(client, 0);
		verifyTimezoneIcon(client, 1);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAUIRS1242
		 * @Expected Time change magnitude is displayed as Time zone change from PDT/PST to AKDT/AKST (-1h) or GMT-7/GMT-8 to GMT-8/GMT-9 (-1h) and vice versa (1h)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_GlucoseGraph_TimeZoneChange_Step26);
		clickOnNotesorTimeZoneorBG(client, "timezone",1);
		waitFor(client, 1);
		//TODO Here two Timezones are co-inside each so whenever we clicking on Timezone1 foreground Timezone0 is clicking(so that's why i have written below step)
		client.clickCoordinate(820, 1900, 2);
		verifyTimezoneChangeDetailsFromPstToAkdtInLogbookDetail(client);
		//GRAPH MANUAL VERIFICATION
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		selectingSASMode(client,"DEFAULT");
		changeTimeZone(client, getDefaultTimeZone());
		currentSystemTime(client);


	}

}
