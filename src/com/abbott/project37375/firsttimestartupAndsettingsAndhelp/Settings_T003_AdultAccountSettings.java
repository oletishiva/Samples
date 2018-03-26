package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class Settings_T003_AdultAccountSettings extends FirstSequenceAndSettingsHelper {

	@Test
	public void test_T003_AdultAccountSettings() throws Exception {
		
		
		createDefaultAccount(client,"Adult");
		
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS925
		 * @Expected The App Navigates to Account Settings screen and has an option to modify the following fields:First Name,Last Name,Date of birth,Email,Password
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step1);
		clickOnSettingsMenu(client, "account");
		verifyAccountSettings(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUISRS925
		 * @Expected The app will show a message to the user that:You cannot change your account type from adult to minor. Please edit your date of birth accordingly with OK button
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step2);
		enterAgePickDOB(client, "3");
		sendValidPasswordAndSubmit(client,LibrelinkConstants.CURRENT_PASSWORD);
		verifyMinorToAdultAcctError(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUISRS925
		 * @Expected The App shows the previous date
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step3);
		enterAgePickDOB(client, "18");
		sendValidPasswordAndSubmit(client,LibrelinkConstants.CURRENT_PASSWORD);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUISRS925
		 * @Expected The following fields are edited:First Name,Last Name
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step4);
		clickOnSettingsMenu(client, "account");
		setFirstAndLastName(client, "Mock", "User");
		sendValidPasswordAndSubmit(client,LibrelinkConstants.CURRENT_PASSWORD);
		capturescreenshot(client, getStepID(), true);
		
		

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS926
		 * @Expected The App Navigates to Account Password Screen and has the following fields:Current Password,New Password,Confirm password,SUBMIT button is disabled.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step5);
		clickOnSettingsMenu(client, "changePassword");
		verifyAccountPasswordPage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for invalid password and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step6);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.INVALID_PASSWORD,
				LibrelinkConstants.INVALID_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for password without numbers and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step7);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.CHAR_PASSWORD,
				LibrelinkConstants.CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for password without letters and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step8);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.NUMBER_PASSWORD,
				LibrelinkConstants.NUMBER_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
	

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for password without any lower case letters and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step9);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.CAPS_PASSWORD,
				LibrelinkConstants.CAPS_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
		

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for password without any upper case letters and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step10);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.LOWER_PASSWORD,
				LibrelinkConstants.LOWER_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
	

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected Error message is displayed for password with 7 characters and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step11);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.SEVEN_CHAR_PASSWORD,
				LibrelinkConstants.SEVEN_CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
	
		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected The app does not allow the user to enter 37th character.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step12);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.THIRTYSEVEN_CHAR_PASSWORD,
				LibrelinkConstants.THIRTYSEVEN_CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected The app does not allow the user to progress when passwords mismatch
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step13);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.NEW_PASSWORD,
				LibrelinkConstants.INVALID_PASSWORD);
		verifyPasswordMismatchError(client,"passwordMismatchErrorMessage");
		capturescreenshot(client, getStepID(), true);
	

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAUIRS926_SDAUIRS1255
		 * @Expected The app allows the user to change the password when it is valid. 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T003_AdultAccountSettings_Step14);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.EIGHT_CHAR_PASSWORD,
				LibrelinkConstants.EIGHT_CHAR_PASSWORD);
		verifyHomePage(client);
		capturescreenshot(client, getStepID(), true);

	}

}
