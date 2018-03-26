package com.abbott.project37375.notesAndlogbook;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class Logbook_T002_Graph_Axis_Display extends NoteHelper {

	@Test
	public void test_T002_Graph_Axis_Display() throws Exception {

		/**
		 * 
		 * @stepId Pre Condition
		 * @Reqt
		 * @Expected Time need be Updated as per Test case
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 3, 8, 2017, "23:50");
		
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS878
		 * @Expected Logbook displayed information about scan results, including glucose value, UOM, Trend arrow, Time and TimeZone
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step1);
		loadTestData(client,"MOCK_2","ADC","2d-G39-501distinguish.json");
		navigateToScreen(client, "Logbook");
		verifyNoOfScanResult(client, 8);
		verifyLogbookListForGlucoseValues(client,"160","TrendArrow_Straight","23:50","yellow");
		verifyLogbookListForGlucoseValues(client,"241",null,"20:50","orange");
		verifyLogbookListForGlucoseValues(client,"500","TrendArrow_High","17:50","orange");
		verifyLogbookListForGlucoseValues(client,"HI",null,"14:50","orange");
		verifyLogbookListForGlucoseValues(client,"179","TrendArrow_GoingLow","11:50","yellow");
		verifyLogbookListForGlucoseValues(client,"180","TrendArrow_Low","08:50","yellow");
		verifyLogbookListForGlucoseValues(client,"239","TrendArrow_High","05:50","yellow");
		verifyLogbookListForGlucoseValues(client,"240","TrendArrow_GoingHigh","02:50","yellow");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS885
		 * @Expected Verify the Logbook glucose graph displays 8 Real time glucose values.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step2);
		clickCreatedNote(client, "23:50");
		verifyLogbookDetail(client,"160","TrendArrow_Straight","03.08.2017","23:50","yellow");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 0);
		verifyLogbookDetail(client,"240","TrendArrow_GoingHigh","03.08.2017","02:50","yellow");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 1);
		verifyLogbookDetail(client,"239","TrendArrow_High","03.08.2017","05:50","yellow");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 2);
		verifyLogbookDetail(client,"180","TrendArrow_Low","03.08.2017","08:50","yellow");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 3);
		verifyLogbookDetail(client,"179","TrendArrow_GoingLow","03.08.2017","11:50","yellow");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 4);
		verifyLogbookDetail(client,"HI",null,"03.08.2017","14:50","orange");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 5);
		verifyLogbookDetail(client,"500","TrendArrow_High","03.08.2017","17:50","orange");
		clickOnNotesorTimeZoneorBG(client, "realtimePointWithIndex", 6);
		verifyLogbookDetail(client,"241",null,"03.08.2017","20:50","orange");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS886
		 * @Expected The historical glucose values displayed on graph
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step3);
		//Verify Image manually
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS883
		 * @Expected Logbook Detail screen displays graph with X-axis range from midnight (00:00) to midnight (00:00) in 24-Hours (HH:MM) format
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step4);
		//Verify Image manually
		capturescreenshot(client, getStepID(), true);
		

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS884
		 * @Expected Logbook Detail screen displays graph with Y-Axis range from 0 to 500 mg/dL, split into 50 mg/dL equal or 0 to 27, split into 3 mmol/L equal if UOM is in mmol
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step5);
		//Verify Image manually
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre Condition
		 * @Reqt
		 * @Expected Time need be Updated as per Test case
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		
		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS878
		 * @Expected Logbook displayed  information about scan results, including glucose value, UOM, Trend arrow, Time and TimeZone
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step6);
		navigateToScreen(client, "Logbook");
		clickOnCalendarDate(client);
		pickDate(client,getDateFormat("2017-08-02"));
		verifyNoOfScanResult(client, 8);
		verifyLogbookListForGlucoseValues(client,"71","TrendArrow_Straight","11:50 PM","yellow");
		verifyLogbookListForGlucoseValues(client,"99","TrendArrow_Straight","8:50 PM","yellow");
		verifyLogbookListForGlucoseValues(client,"100","TrendArrow_Straight","5:50 PM","green");
		verifyLogbookListForGlucoseValues(client,"101","TrendArrow_Straight","2:50 PM","green");
		verifyLogbookListForGlucoseValues(client,"LO",null,"11:50 AM","red");
		verifyLogbookListForGlucoseValues(client,"40","TrendArrow_Low","8:50 AM","red");
		verifyLogbookListForGlucoseValues(client,"69","TrendArrow_GoingLow","5:50 AM","red");
		verifyLogbookListForGlucoseValues(client,"70","TrendArrow_GoingLow","2:50 AM","yellow");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS883
		 * @Expected Logbook Detail screen displays graph with X-axis range from midnight (12 AM) to 
		 * 				midnight (12 AM) in 12-Hours (AM/PM) format
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step7);
		clickCreatedNote(client, "11:50 PM");
		//Verify Image manually
		capturescreenshot(client, getStepID(), true);
		

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS884
		 * @Expected Logbook Detail screen displays graph with Y-Axis range from (0 - 350 mg/dL or 0-21.0 mmol/L), 
		 * 				split into (50 mg/dL or 3 mmol/L) equal
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T002_Graph_Axis_Display_Step8);
		//Verify Image manually
		capturescreenshot(client, getStepID(), true);
		
		selectingSASMode(client,"DEFAULT");
        currentSystemTime(client);
	}

}
