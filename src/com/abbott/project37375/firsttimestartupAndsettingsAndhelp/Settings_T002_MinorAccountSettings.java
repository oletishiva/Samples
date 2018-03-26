package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class Settings_T002_MinorAccountSettings extends FirstSequenceAndSettingsHelper {

	@Test
	public void test_T002_MinorAccountSettings() throws Exception {

		setEmail();
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1238
		 * @Expected First Name,Last Name,Date of Birth are displayed on App's New Account registration page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step1); 
		getStarted(client, true);
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client, "termsOfUseTitle", true);	
		clickCheckBox(client, "privacyNoticeTitle", true);
		verifyCreateAccountScreen(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1238
		 * @Expected Date of birth is used to set up your LibreView account and
		 *           not to determine whether the App is appropriate for your
		 *           use.Please consult the App user's manual before using the
		 *           App' displayed ";
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step2);
		createMinorAccountDetails(client,"Mock","User");
		clickOnButtonOption(client, "Next", true);
		verifyMinorWarningMessage(client);
		capturescreenshot(client, getStepID(), true);
		
		
		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUISRS1238
		 * @Expected Parent/Guardian Account Login page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step3);
		clickOnButtonOption(client, "OK", true);
		verifyParentGuardianAccountpage(client);
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUISRS1238
		 * @Expected Unit of Measure screen is displayed without any account creation errors.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step4);
		minorLoginDetails(client,"Parentfirst","Parentlast",getEmail(),LibrelinkConstants.CURRENT_PASSWORD,LibrelinkConstants.CURRENT_PASSWORD,true);
		clickOnCreateAccount(client);
		verifyUOMPage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUISRS1238
		 * @Expected HOME screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step5);
		defaultSettings(client,"grams");
		verifyHomePageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS925, SDAUIRS926
		 * @Expected The App Navigates to Account Settings screen and has an
		 *           option to modify the fields
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step6);
		clickOnSettingsMenu(client, "account");
		verifyMinorAccountSettings(client);
		capturescreenshot(client, getStepID(), true);
		
		
		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS925, SDAUIRS926
		 * @Expected Date of birth is used to set up your LibreView account and
		 *           not to determine whether the App is appropriate for your
		 *           use.Please consult the user's manual page of app before using the
		 *           App.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step7);
		//client.elementSwipe("NATIVE", "xpath=//*[@class='android.widget.ScrollView' and @onScreen='true']", 0, "Up", 0, 500);
		enterAgePickDOB(client, "3");
		sendValidPasswordAndSubmit(client,"Abbott@123");
		verifyMinorWarningMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS925, SDAUIRS926
		 * @Expected The App is accepting the changes and displayed the settings page.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step8);
		clickOnButtonOption(client, "OK", true);
		verifyHomePage(client);
		// verifyPageTitles(client, "settings");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS925, SDAUIRS926
		 * @Expected The following fields are editable First Name,Last
		 *           Name,Parent/Legal Guardian First Name,Parent/Legal Guardian
		 *           Last Name";
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step9);
		clickOnSettingsMenu(client, "account");
		updateMinorAccountSettings(client);
		sendValidPasswordAndSubmit(client,"Abbott@123");
		clickOnButtonOption(client, "OK", true);
		verifyHomePage(client);
		capturescreenshot(client, getStepID(), true);
		clickOnSettingsMenu(client, "account");
		verifyUpdateMinorAccountSettings(client);
		clickOnBackOrMenuIcon(client);
		
		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS926
		 * @Expected The App Navigates to Account Password Screen and has the
		 *           fields Current Password,New Password,Confirm
		 *           password.SUBMIT button is disabled
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step10);
		clickOnSettingsMenu(client, "changePassword");
		verifyAccountPasswordPage(client);
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step11);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.NEW_PASSWORD,
				LibrelinkConstants.INVALID_PASSWORD);
		verifyPasswordMismatchError(client,"passwordMismatchErrorMessage");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step12);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.CHAR_PASSWORD,
				LibrelinkConstants.CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step13);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.NUMBER_PASSWORD,
				LibrelinkConstants.NUMBER_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step14);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.CAPS_PASSWORD,
				LibrelinkConstants.CAPS_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);
	

		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step15);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.LOWER_PASSWORD,
				LibrelinkConstants.LOWER_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step16);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.SEVEN_CHAR_PASSWORD,
				LibrelinkConstants.SEVEN_CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected Error message is displayed and App does not allow the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step17);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.THIRTYSEVEN_CHAR_PASSWORD,
				LibrelinkConstants.THIRTYSEVEN_CHAR_PASSWORD);
		verifyAccountPasswordInCorrectErrors(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAUIRS926, SDAUIRS1255
		 * @Expected App does allows the user to change the password.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step18);
		changePassword(client, LibrelinkConstants.CURRENT_PASSWORD,
				LibrelinkConstants.THIRTYSIX_CHAR_PASSWORD,
				LibrelinkConstants.THIRTYSIX_CHAR_PASSWORD);
		verifyHomePage(client);
		capturescreenshot(client, getStepID(), true);

		
		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUISRS926
		 * @Expected The App allows the user to Log in.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step19);
		debugDrawerClearData(client);
		clickSignInButton(client,true);
		signInClick(client, getEmail(),LibrelinkConstants.THIRTYSIX_CHAR_PASSWORD, false);
		capturescreenshot(client, getStepID(), true);

		
		
		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUISRS926
		 * @Expected Selected Country with Unit of Measurement
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step20);
		submitSignIn(client);
		clickCheckBox(client, "Terms of Use", true);
		clickCheckBox(client, "Privacy Notice", true);;
		verifyUOMPage(client);
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUISRS926,SDAUISRS1238
		 * @Expected HOME screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T002_MinorAccountSettings_Step21);
		defaultSettings(client,"grams");
		verifyHomePageDetails(client);
		capturescreenshot(client, getStepID(), true);


	}
	

}
