package com.abbott.project37375.uigeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;
import com.abbott.project37375.uigeneral.GeneralReleaseBaseHelper;


public class GeneralFunction_T002_ReleaseBuild_Part2 extends GeneralReleaseBaseHelper {

	/**
	 * Author: ShabinaSherif
	 * 
	 * Script to verify Release Build - Covers Below areas 
	 * Help/About:  SDAUIRS929
	 * Target Glucose Range Settings: SDAUIRS1144, 1253
	 * Carbohydrate Unit of Measure Settings, SDAUIRS1145, 1146
	 * text-to-speech Settings: SDAUIRS1245
	 * Connected Account Settings: SDAUIRS925
	 * Connected Account, adult-create, adult-signin
	 * Logbook: SDAUIRS881, 877, 879, 891, 883, 884  
	 * Notes: (Not including note associated with scan result) : SDAUIRS893, 905.906, 910, 1134,1135, 891, 879
	 * Reminders: SDAUIRS912, 914, 917, 918, 260, 1203, 1183, 1158
	 * REPORTS: SDAUIRS953,954, 957
	 * Daily Graph: SDAUIRS1014, 1004, 1195, 1006, 1007, 954
	 * Daily pattern:SDAUIRS961, 961, 967
	 * Time In Target:  SDAUIRS967, 969, 1193
	 * Low Glucose Events : SDAUIRS979
	 * Sensor Usage: SDAUIRS1020
	 * Estimated A1c: SDAUIRS1016
	 *  
	 */

	/**
	 * @throws Exception
	 * 		GenericException
	 */
	@Test
	public void test_T002_ReleaseBuild_Part2() throws Exception {

		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt SDAUIRS1239
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		launch(client);

		/**
		 * @stepId Step 1
		 * @Reqt SDAUIRS912_SDAUIRS914_SDAUIRS917_SDAUIRS1156_SDAUIRS1203
		 * @Expected Create Reminders with and without repeat options
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step1);
		navigateToScreen(client,"reminders");
		addReminder(client);
		enterReminderdetails(client, "1 once", true, 0, 3,null, false);
		addReminder(client);
		enterReminderdetails(client, "2 Rep", true, 0, 3,null, true);
		addReminder(client);
		enterReminderdetails(client, "3 once", true, 0, 15,null, false);
		addReminder(client);
		enterReminderdetails(client, "4 Rep", true, 1, 0,null, true);
		addReminder(client);
		enterReminderdetails(client, "5 once", false, 00, 00,null, false);

		addReminder(client);
		enterReminderdetails(client, "6 once", false, 23, 59,null, false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 2
		 * @Reqt SDAUIRS912_SDAUIRS917 SDAUIRS1158
		 * @Expected Verify Reminder Notifications and next reminder set for repeat options
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step2);
		moveApptoBackground(client);
		openNotification(client); 
		client.waitForElement("NATIVE", "xpath=//*[@text='Alarm Expired' and ./parent::*[./following-sibling::*[./*[@text='2 Rep']]]]", 0, 180000);
		waitFor(client,2);
		verifyReminderNotification(client, "1 once",false);
		verifyReminderNotification(client, "2 Rep",false);
		clearSingleNotification(client,"1 once");
		clearSingleNotification(client,"2 Rep");
		closeNotification(client);
		launch(client);
		navigateToScreen(client, "reminders");
		verifyReminderStatus(client, "1 once", false);
		verifyReminderStatus(client, "2 Rep", true);
		capturescreenshot(client, getStepID(), true);
		launch(client);
		navigateToScreen(client, "reminders");

		/**
		 * @stepId Step 3
		 * @Reqt SDAUIRS260_SDAUIRS918_SDAUIRS1183
		 * @Expected Verify Reminders in reminder list and next reminder text
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step3);
		enableordisableReminder(client, "6 once",false);
		waitFor(client,1);
		enableordisableReminder(client, "2 Rep",false);
		enableordisableReminder(client, "1 once",true);
		editReminder(client,"3 once");
		enterReminderdetails(client, "33 Rep", true, 0, 30,null, false);
		editReminder(client,"4 Rep");
		enterReminderdetails(client, "44 once", true, 0, 5,null, false);
		verifyReminderStatus(client, "1 once", true);
		verifyReminderStatus(client, "2 Rep", false);
		verifyReminderStatus(client, "33 Rep", true);
		verifyReminderStatus(client, "44 once", true);
		verifyReminderRepeat(client,"44 once");
		verifyReminderStatus(client, "5 once", true);
		verifyReminderStatus(client, "6 once", false);
		verifyNextReminderwithBackGroundColor(client,"44 once");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 4
		 * @Reqt SDAUIRS1123
		 * @Expected Delete reminders and verify remain 4 listed Reminders
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step4);
		deleteReminder(client,"6 once");
		deleteReminder(client,"44 once");
		verifyReminderStatus(client, "1 once", true);
		verifyReminderStatus(client, "2 Rep", false);
		verifyReminderStatus(client, "33 Rep", true);
		verifyReminderStatus(client, "5 once", true);
		capturescreenshot(client, getStepID(), true);
		deleteAllReminders(client);


		/**
		 * @stepId Step 5
		 * @Reqt SDAUIRS877_SDAUIRS879
		 * @Expected Verify Logbook screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step5);
		navigateToScreen(client, "logbook");
		verifyLogbookPageContents(client);
		verifyRequiredDateIsDisplayed(client, getDeviceDate(client), 0);		
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 6
		 * @Reqt SDAUIRS893_SDAUIRS905_SDAUIRS906
		 * @Expected Verify created notes (Food 12am and Exercise 2pm) on Logbook detail screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step6);
		createNewNote(client, 0,0, null);
		selectNoteAttribute(client,"cbox_food_note");
		selectAndVerifyFoodItemFromMenu(client, "breakfast");
		setAndGetCarbAmount(client, "0");
		selectNoteAttribute(client,"cbox_fast_insulin_note");
		selectNoteAttribute(client,"cbox_slow_insulin_note");
		selectNoteAttribute(client,"cbox_exercise_note");
		enterNotesComments(client,
				LibrelinkConstants.TWENTY_CHARACTERS_COMMENTS);
		clickOnButtonOptions(client, "done", true);
		createNewNote(client, 14,0, null);
		addNoteForExercise(client, "lowIntensity", 1, 0);
		clickOnButtonOption(client, "done", true);
		clickOnCreatedNoteTime(client,"2:00 PM");
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 1);		
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		clickOnCalendarDate(client);
		pickDate(client, getDateFormat(-89));
		waitFor(client, 5);
		/**
		 * @stepId Step 7
		 * @Reqt SDAUIRS909
		 * @Expected The Manual BG is displayed at Logbook list with value: 205 mg/dL and Time: 11:01pm
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		if(getCountryCode().contains("United States")){
			setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step7);
			createManualBGNote(client, 23, 01, null, "205");
			verifyManualBGinLogbookList(client,"205","11:01 PM");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,"Step7_ReqtNo_SDAUIRS909_ManualBG_NotApplicable for Non US build");
		}

		/**
		 * @stepId Step 8
		 * @Reqt SDAUIRS1135
		 * @Expected Create a note with Food attribute for 41 svg, error message is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step8);
		createNewNote(client, 21,0, null);
		selectNoteAttribute(client, "cbox_food_note");
		selectAndVerifyFoodItemFromMenu(client, "dinner");
		setAndGetCarbAmount(client,"41");
		verifyFoodError(client,"servings");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 9
		 * @Reqt SDAUIRS881_SDAUIRS1135
		 * @Expected Note with Food attribute 40 svg is displayed on Logbook detail page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step9);
		setAndGetCarbAmount(client,"");
		selectAndVerifyFoodItemFromMenu(client, "dinner");
		setAndGetCarbAmount(client,"40");
		clickOnButtonOptions(client, "done", true);
		clickCreatedNote(client, "9:00 PM");
		verifyFoodInLogBookDetailPage(client, "dinner", "servings", "40.0");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 10
		 * @Reqt SDAUIRS883_SDAUIRS884_SDAUIRS1144
		 * @Expected Verify Logbook graph X and Y axis and Target glucose range highlighted to default value
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step10);
		//Verify Glucose Graph Manually
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);



		/**
		 * @stepId Step 11
		 * @Reqt SDAUIRS909
		 * @Expected The Manual BG is displayed at Logbook list with value:101 mg/dL and Time: 12:00am
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		if(getCountryCode().contains("United States")){
			setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step11);
			createManualBGNote(client, 0, 0, null, "101");
			verifyManualBGinLogbookList(client,"101","12:00 AM");
			capturescreenshot(client, getStepID(), true);

		}
		else{
			showNotApplicableScreenShot(client,"Step11_ReqtNo_SDAUIRS909_ManualBG_NotApplicable for Non US build");
		}
		navigateToScreen(client, "home");
		/**
		 * @stepId Step 12
		 * @Reqt SDAUIRS1144_SDAUIRS1253
		 * @Expected verify Target Glucose Range displayed as 70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step12);
		clickOnSettingsMenu(client, "settings");
		if(getUnits().contains("mg")){
			verifyandsetTGfromSettings(client,70,180);
		}else{
			verifyandsetTGfromSettings(client,3.9,10.0);
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 13
		 * @Reqt SDAUIRS1145_SDAUIRS1146
		 * @Expected Update Carbohydrate units to grams
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step13);
		clickOnSettingsMenu(client, "settings");
		clickOnSettingsOptions(client,"carbohydrateUnitsTitle");
		setCarbohydrateUnits(client,"grams");
		capturescreenshot(client, getStepID(), true);

		if(getTextToSpeech().equalsIgnoreCase("yes")){
			/**
			 * @stepId Step 14
			 * @Reqt SDAUIRS1245
			 * @Expected Update Text to Speech settings to 'On'
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step14);
			clickOnSettingsOptions(client, "textToSpeechTitle");
			selectspeechOption(client,"textToSpeechOn");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,"Step14_ReqtNo_SDAUIRS1245_TextToSpeech_NotApplicable for US build");
		}
		clickOnBackOrMenuIcon(client);

		/**
		 * @stepId Step 15
		 * @Reqt SDAUIRS925
		 * @Expected Verify if account settings have option to edit fields except email id
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step15);
		clickOnSettingsMenu(client, "account");
		verifyAccountSettings(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * @stepId Step 16
		 * @Reqt SDAUIRS925
		 * @Expected Update user details and submit then verify modified fields
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step16);
		clickOnSettingsMenu(client, "account");
		updateAccountSettings(client);
		clickOnSettingsMenu(client, "account");
		verifyUpdatedAccountSettings(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * @stepId Step 17/updated
		 * @Reqt SDAUIRS926
		 * @Expected Update Password
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step17);
		clickOnSettingsMenu(client, "changePassword");
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.EIGHT_CHAR_PASSWORD,
				LibrelinkConstants.EIGHT_CHAR_PASSWORD);
		verifyHomePage(client);
		capturescreenshot(client, getStepID(), true);



		/**
		 * @stepId Step 18
		 * @Reqt SDAUIRS1134_SDAUIRS1135
		 * @Expected Create a new note (Food+insulin) and verify if the new note and previously created
		 * 				 note 12am is also displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step18);
		navigateToScreen(client,"home");
		navigateToScreen(client,"logbook");
		createNewNote(client, 7,0, null);
		selectNoteAttribute(client, "cbox_food_note");
		selectAndVerifyFoodItemFromMenu(client, "breakfast");
		setAndGetCarbAmount(client,"101");
		selectNoteAttribute(client, "cbox_fast_insulin_note");
		clickOnButtonOptions(client, "done", true);
		clickCreatedNote(client, "7:00 AM");
		client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 0, 1);
		verifyFoodNoteInLogBookDetailPage(client, "breakfast", "servings", "0.0", "12:00 AM");
		client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 1, 1);
		verifyFoodNoteInLogBookDetailPage(client, "breakfast", "grams", "101", "7:00 AM");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 19
		 * @Reqt SDAUIRS891
		 * @Expected Verify the attribute count for each note on the Logbook detail graph
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step19);
		//Verify graph and badge count manually
		client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 0, 1);
		verifyCreatedDetailNoteTime(client, "12:00 AM");
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and @text='Breakfast (0.0"+getLangPropValue("servingsSymbol")+")"+"\\n"+"Rapid-Acting Insulin"+"\\n"+"Long-Acting Insulin"+"\\n"+"Exercise"+"\\n"+"Abbott Glucose Meter']", 0);
		client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 1, 1);
		verifyCreatedDetailNoteTime(client, "7:00 AM");
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and @text='Breakfast (101"+getLangPropValue("gramsSymbol")+")"+"\\n"+"Rapid-Acting Insulin']", 0);
		client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", 2, 1);
		verifyCreatedDetailNoteTime(client, "2:00 PM");
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and @text='Exercise Low Intensity (1 hr)']", 0);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 20
		 * @Reqt SDAUIRS883_SDAUIRS884_SDAUIRS1144
		 * @Expected Verify Logbook graph X-axis( midnight to midnight) and Y-axis(0 to at least 350 mg/dL (0-21 mmol/L)) and Target glucose range highlighted to 70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step20);
		//Verify X and Y axis and Target Glucose Range manually
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 21
		 * @Reqt SDAUIRS879
		 * @Expected Verify the attributes of all notes and ManualBG in logbook list page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step21);
		clickOnBackOrMenuIcon(client);
		verifyaddedNote(client,"12:00 AM","5");
		verifyaddedNote(client,"7:00 AM","2");
		verifyaddedNote(client,"2:00 PM","1");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 22
		 * @Reqt SDAUIRS1014
		 * @Expected Verify the notes position and attributes count in Daily graph report
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step22);
		//Verify Daily Graph manually
		navigateToScreen(client, "navigation_drawer_daily_graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 23
		 * @Reqt SDAUIRS894_SDAUIRS910
		 * @Expected Edit 12am note and delete 7am note and Verify the same in logbook list page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step23);
		navigateToScreen(client, "logbook");
		clickCreatedNote(client, "12:00 AM");
		editNote(client);
		unSelectNoteAttribute(client,"cbox_exercise_note");
		clickOnButtonOptions(client, "done", true);
		clickOnBackOrMenuIcon(client);
		clickCreatedNote(client, "7:00 AM");
		editNote(client);
		deleteNote(client,"7:00 AM");
		verifyaddedNote(client,"12:00 AM","4");
		verifyaddedNote(client,"2:00 PM","1");
		client.verifyElementNotFound("NATIVE", "xpath=//*[@text='7:00 AM']", 0);
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 24
		 * @Reqt SDAUIRS1014
		 * @Expected Verify the notes position and attributes count in Daily graph report, deleted 
		 * 			note should not be present and 
		 * 			edited note attribute should be updated
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step24);
		//Verify Daily Graph manually
		navigateToScreen(client, "navigation_drawer_daily_graph");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 25
		 * @Reqt SDAUIRS1004
		 * @Expected Can view last 90 days in Daily Graph Calendar
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step25);
		clickOnCalendarDate(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 26
		 * @Reqt SDAUIRS1006_SDAUIRS1007_SDAUIRS1195
		 * @Expected Verify Daily graph X-axis( midnight to midnight) and Y-axis(0 to at least 350 mg/dL (0-21 mmol/L)) and Target glucose range 
		 * 				highlighted to 70-180 mg/dL or 3.9-10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step26);
		pickDate(client, getDateFormat(-89));
		//Verify Daily Graph manually
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 27
		 * @Reqt SDAUIRS953
		 * @Expected Verify Daily graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step27);
		clickOnIconAndVerifyReportMessage(client, "daily_info_title");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOptions(client, "ok", true);

		/**
		 * @stepId Step 28
		 * @Reqt SDAUIRS954
		 * @Expected Share the report through email
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step28);
		capturescreenshot(client, getStepID()+"before sharing", true);	
		saveTheSharedBitmap(client);
		capturescreenshot(client, getStepID(), true);	
		sendEmail(client);

		/**
		 * @stepId Step 29
		 * @Reqt SDAUIRS955
		 * @Expected Verify the current date of the Daily Graph header and no right arrow icon is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step29);
		navigateToScreen(client, "home");
		navigateToScreen(client, "navigation_drawer_daily_graph");
		verifyDateonGraphAndArrow(client,0);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 30
		 * @Reqt SDAUIRS957
		 * @Expected Not enough sensor data content is displayed on navigating to previous day
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step30);
		clickArrowOnDateBar(client,"back",1);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 31
		 * @Reqt SDAUIRS961_SDAUIRS967
		 * @Expected Verify 0 of 14 days data available text on Daily patterns page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step31);
		navigateToScreen(client, "navigation_drawer_daily_patterns");
		clickOnDays(client, 14);
		verifyReportDataAvailableForNdays(client,14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 32
		 * @Reqt SDAUIRS961_SDAUIRS967
		 * @Expected Swipe to verify 0 of 7 days data available text on Daily patterns page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step32);
		/*swipeOnReport(client,"Right");*/
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 33
		 * @Reqt SDAUIRS953
		 * @Expected Verify Daily Patterns graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step33);
		clickOnIconAndVerifyReportMessage(client, "daily_patterns_info_title");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOptions(client, "ok", true);

		/**
		 * @stepId Step 34
		 * @Reqt SDAUIRS969_SDAUIRS970_SDAUIRS955_SDAUIRS971
		 * @Expected Verify 0 of 30 days data available text Time In Target page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step34);
		navigateToScreen(client, "navigation_drawer_time_in_target");
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client,30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 35
		 * @Reqt SDAUIRS969_SDAUIRS971
		 * @Expected Swipe to verify 0 of 90 days data available text on Time In Target page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step35);
		/*swipeOnReport(client,"Left");*/
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client,90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 36
		 * @Reqt SDAUIRS953
		 * @Expected Verify Time in Target graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step36);
		clickOnIconAndVerifyReportMessage(client, "time_in_target_info_title");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 37
		 * @Reqt SDAUIRS1193_SDAUIRS957
		 * @Expected Verify Target Glucose range below the graph 70-180 mg/dL or 3.9-10.0 mmol/L and not enough sensor data text
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step37);
		clickOnButtonOptions(client, "ok", true);
		verifyNotEnoughSensorDataMessage(client);
		if(getUnits().contains("mg")){
			verifyTargetGlucoseinReports(client,"70 - 180 mg/dL");
		}else{
			verifyTargetGlucoseinReports(client,"3.9 - 10.0 mmol/L");
		}

		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 38
		 * @Reqt SDAUIRS979_SDAUIRS957_SDAUIRS967
		 * @Expected Verify 0 of 7 days data available text, not enough sensor data text on Low Glucose Events page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step38);
		navigateToScreen(client, "navigation_drawer_low_glucose");
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 39
		 * @Reqt SDAUIRS953
		 * @Expected Verify Low Glucose Events graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step39);
		clickOnIconAndVerifyReportMessage(client, "low_glucose_info_title");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOptions(client, "ok", true);

		/**
		 * @stepId Step 40
		 * @Reqt SDAUIRS991_SDAUIRS994_SDAUIRS957
		 * @Expected Verify 0 of 90 days data available text, not enough sensor data text on Average Glucose page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step40);
		navigateToScreen(client, "navigation_drawer_average_glucose");
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client,90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 41
		 * @Reqt SDAUIRS953
		 * @Expected Verify Average Glucose graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step41);
		clickOnIconAndVerifyReportMessage(client, "average_glucose_info_title");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOptions(client, "ok", true);

		/**
		 * @stepId Step 42
		 * @Reqt SDAUIRS1020_SDAUIRS957
		 * @Expected Verify 0 of 14 days data available text, not enough sensor data text on Sensor Usage page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step42);
		navigateToScreen(client, "navigation_drawer_sensor_usage");
		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 43
		 * @Reqt SDAUIRS953
		 * @Expected Verify Sensor Usage graph information by tapping on i icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step43);
		clickOnIconAndVerifyReportMessage(client, "sensor_usage_info_title");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOptions(client, "ok", true);

		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			/**
			 * @stepId Step 44
			 * @Reqt SDAUIRS1016_SDAUIRS957
			 * @Expected Verify not enough sensor data text is displayed on Estimated A1c page
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step44);
			navigateToScreen(client, "navigation_drawer_estimated_a1c");
			verifyNotEnoughSensorDataMessage(client);
			capturescreenshot(client, getStepID(), true);

			/**
			 * @stepId Step 45
			 * @Reqt SDAUIRS953
			 * @Expected Verify Estimated A1c graph information by tapping on i icon
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step45);
			clickOnIconAndVerifyReportMessage(client, "a1c_info_title");
			capturescreenshot(client, getStepID(), true);
			clickOnButtonOptions(client, "ok", true);
		}

		else{
			showNotApplicableScreenShot(client,"Step44 & 45_Part of ReqtNo_SDAUIRS1016_SDAUIRS957_SDAUIRS953 EstimatedA1c_NotApplicable for US build");
		}
		/**
		 * @stepId Step 46
		 * @Reqt SDAUIRS929
		 * @Expected Verify Application version, UDI, CE Mark, Registration Number as applicable to build
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step46);
		clickOnSettingsMenu(client, "about");
		verifyAboutInfo(client);
		verifyAppVersionUDICE(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 47
		 * @Reqt SDAUIRS929
		 * @Expected Verify Customer service link and it is accessible
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step47);
		verifyWebSite(client);
		waitFor(client,10);
		capturescreenshot(client, getStepID(), true);
		//closeRunningBrowser(client);


		/**
		 * @stepId Step 48
		 * @Reqt SDAUIRS1148
		 * @Expected Network error pop up not displayed when time difference between smartphone and network is less than 5 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step48);
		//TODO Pop up is displaying then expected value is wrong
		automaticDateAndTime(client, false);
		advanceTime(client,0,3);
		launch(client);
		//verifyUpdateDateandTimePopUpNotFound(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 49
		 * @Reqt SDAUIRS1148
		 * @Expected Network error pop up is displayed when time difference between smartphone and network is greater than 5 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step49);
		advanceTime(client,0,3);
		launch(client);
		verifyNetworkWarningMsg(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 50
		 * @Reqt SDAUIRS1148
		 * @Expected Network error pop up not displayed when time settings is set to automatic date and time
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T002_ReleaseBuild_Part2_Step50);
		openDateTimeSettings(client);
		automaticDateAndTime(client, true);
		launch(client);
		verifyUpdateDateandTimePopUpNotFound(client);
		capturescreenshot(client, getStepID(), true);

		//unInstall(client);
	}
}
