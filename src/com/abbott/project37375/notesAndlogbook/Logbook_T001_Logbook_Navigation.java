package com.abbott.project37375.notesAndlogbook;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class Logbook_T001_Logbook_Navigation extends NoteHelper {

	@Test
	public void test_T001_Logbook_Navigation() throws Exception {

		
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS877,SDASRS1162
		 * @Expected displays all required details on Logbook screen like add note, current date, BG icon 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step1);
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogBookEmpty(client);
		verifyLogbookPageContents(client);
		capturescreenshot(client, getStepID(), true);
		
	
		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS877,SDASRS1162
		 * @Expected Logbook option highlighted in blue color
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step2);
		navigateToScreen(client, "Logbook");
		verifyLogBookMenu(client, false);
		capturescreenshot(client, getStepID(), true);
		verifyLogBookMenu(client, true);
		
		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Reminders page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step3);
		navigateToScreen(client, "Reminders");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Daily Patterns page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step4);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Time In Target page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step5);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Low Glucose Events page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step6);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Average Glucose page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step7);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Daily Graph page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step8);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		
		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen is displayed, when navigating from Sensor Usage page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step9);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Logbook");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS877
		 * @Expected Logbook screen displayed with Note
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step10);
		createNewNote(client, 11,00, "am");
		selectNoteAttribute(client, "cbox_food_note");
		selectNoteAttribute(client, "cbox_fast_insulin_note");
		selectNoteAttribute(client, "cbox_slow_insulin_note");

		
		selectNoteAttribute(client, "cbox_exercise_note");
		clickOnButtonOption(client, "Done", true);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS877,SDASRS1162
		 * @Expected Note displayed with Time and Time Zone with Manual BG(if applicable)' icon at the bottom of the screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_1);
		navigateToScreen(client, "Reminders");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_2);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_3);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_4);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_5);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_6);		
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		capturescreenshot(client, getStepID(), true);
		
		setStepID(LibrelinkConstants.Logbook_T001_Logbook_Navigation_Step11_7);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Logbook");
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);
		verifyLogbookPageContents(client);
		verifyaddedNote(client, "11:00");
		

		capturescreenshot(client, getStepID(), true);
		debugDrawerClearData(client);
		


	}

}
