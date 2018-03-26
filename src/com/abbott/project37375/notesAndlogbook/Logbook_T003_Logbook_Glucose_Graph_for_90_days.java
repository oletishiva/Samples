package com.abbott.project37375.notesAndlogbook;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class Logbook_T003_Logbook_Glucose_Graph_for_90_days extends NoteHelper {

	@Test
	public void test_T003_Logbook_Glucose_Graph_for_90_days() throws Exception {

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook screen displays Current date scan result, notes, Date ,Calendar icon next to current date,left navigation button on the left corner of Date Label box.
		 * 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step1);
		setTheTimeAlone(client, "22:00");
		//selectSkipForDebugging(client);
		loadTestData(client, "MOCK_2", "ADC", "90days_autoDate_Notes.json");
		navigateToScreen(client, "Logbook");
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "Note");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook calendar displays the 89 days before the current
		 *           date in enabled state for selection.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step2);
		clickCalendar(client);
		verifyRequiredPreviousDateIsDisplayed(client, getDeviceDate(client), 89);
		capturescreenshot(client, getStepID(), true);
		clickCalendarCancelButton(client);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook screen displays Previous date scan result and notes values,Previous Date,Calendar icon ,left and right navigation button 
		 * 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step3);
		clickCalendar(client);
		pickAndVerifyPreviousDateIsDisplayed(client, getDeviceDate(client), 1);
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "210");
		verifyAddedScanOrNote(client, "Note");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook calendar displays the 89 days before the current
		 *           date in enabled state for selection.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step4);
		clickCalendar(client);
		verifyRequiredPreviousDateIsDisplayed(client, getDeviceDate(client), 89);
		capturescreenshot(client, getStepID(), true);
		clickCalendarCancelButton(client);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook screen displays date, scan result, right and left arrows, calendar icon etc
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step5);
		clickCalendar(client);
		pickAndVerifyPreviousDateIsDisplayed(client, getDeviceDate(client), 2);		
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "210");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook screen displays the scan and note values for one day before current date
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step6);
		clickCalanderRightButton(client, 1);
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 1);
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "210");
		verifyAddedScanOrNote(client, "Note");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook details screen displays previous date and scanned
		 *           time for the selected scan value with glucose graph
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step7);

		String scantime = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@accessibilityIdentifier='LogbookTimeLabel']",
						0);
		String scanDate = null;
		//scanDate= getCalendarDateForLogbookDetail(client);
		scanDate= getCalanderDate(client);
		System.err.println("Logbook Date:"+scanDate);
		clickCreatedNote(client, scantime);
		verifyLogbookDetailDateTime(client, scantime, scanDate);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS882
		 * @Expected Logbook details screen displays current date and Note time
		 *           for the selected Note with glucose graph
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step8);
		clickCalendarCancelButton(client);
		client.sleep(2000);
		clickCalanderRightButton(client, 1);
		VerifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		String scantime1 = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@accessibilityLabel='Note' and @accessibilityIdentifier='LogbookGlucoseValueLabel']",
						0);

		//scanDate= getCalendarDateForLogbookDetail(client);
		scanDate= getCalanderDate(client);
		client.click("NATIVE", "xpath=//*[@accessibilityLabel='" + scantime1
				+ "']", 0, 1);
		verifyLogbookDetailDateTime(client, scantime1, scanDate);
		capturescreenshot(client, getStepID(), true);
		clickCalendarCancelButton(client);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS881
		 * @Expected Logbook screen displays scan and note values for the date
		 *           selected - leap year
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step9);
		setTheDateAndTime(client, 01, 04, 2016, "22:00");	
		selectingSASMode(client,"DEFAULT");	
		debugDrawerClearData(client);
		loadTestData(client, "MOCK_2", "ADC", "90days_autoDate_Notes.json");
		navigateToScreen(client, "Logbook");
		clickCalendar(client);
		verifyLeapYear(client, 2016);
		clickCalendarCancelButton(client);
		if (getCountryCode().equalsIgnoreCase("United States")) {
			verifyLogBookDisplaysStaticDate(client, "April 1, 2016");
		} else {
			verifyLogBookDisplaysStaticDate(client, "1 April 2016");
		}
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "Note");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS881
		 * @Expected Logbook calendar displays 89 days before current date
		 *           enabled for selection - leap year
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step10);
		clickCalendar(client);
		verifyCalenderDateDifference(client, 2016);
		capturescreenshot(client, getStepID(), true);
		clickCalendarCancelButton(client);
		
		/**
		 * 
		 * @stepId Step11
		 * @Reqt SDAIUIRS881
		 * @Expected Logbook screen displays scan and note values for the date changed - non leap year
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step11);
		setTheDateAndTime(client, 01, 04, 2017,"22:00");	
		selectingSASMode(client,"DEFAULT");	
		debugDrawerClearData(client);
		loadTestData(client, "MOCK_2", "ADC", "90days_autoDate_Notes.json");
		navigateToScreen(client, "Logbook");
		clickCalendar(client);
		verifyLeapYear(client, 2017);
		clickCalendarCancelButton(client);
		if (getCountryCode().equalsIgnoreCase("United States")) {
			verifyLogBookDisplaysStaticDate(client, "April 1, 2017");
		} else {
			verifyLogBookDisplaysStaticDate(client, "1 April 2017");
		}
		verifyAddedScanOrNote(client, "180");
		verifyAddedScanOrNote(client, "195");
		verifyAddedScanOrNote(client, "Note");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS881
		 * @Expected Logbook calendar displays 89 days before current date
		 *           enabled for selection.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step12);
		clickCalendar(client);
		verifyCalenderDateDifference(client, 2017);
		capturescreenshot(client, getStepID(), true);
		clickCalendarCancelButton(client);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS881
		 * @Expected LogBook detail screen displays the glucose graph for the scanned result
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step13);
		loadTestData(client, "MOCK_2", "Autodated", "2days_autoDate.json");
		navigateToScreen(client, "Logbook");
		clickCalendar(client);
		verifyDataWithBoldLetters(client);
		verifyRequiredPreviousDateIsDisplayed(client, getDeviceDate(client), 89);
		clickCalendarCancelButton(client);
		verifyAddedScanOrNote(client, "90");
		String glucosevalue = client.elementGetText("NATIVE", "xpath=//*[@accessibilityIdentifier='LogbookGlucoseValueLabel'][1]", 1);
		clickAndVerifyGlucoseGraph(client, glucosevalue);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS881
		 * @Expected 'No entries exist for this date' message is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step14);
		clickCalendarCancelButton(client);
		clickCalendar(client);
		selectDateWithoutBoldLetter(client, "29");
		verifyLogBookEmpty(client);
		capturescreenshot(client, getStepID(), true);		
		
		selectingSASMode(client,"DEFAULT");	
	}


}
