package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T004_DefaultLang_SysInfo extends UIGeneralHelper {


	@Test
	public void test_General_T004_DefaultLang_SysInfo() throws Exception {

		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt NA
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clearData(client);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1167,SDAISRS133
		 * @Expected Welcome Screen all strings are displayed in selected language that is supported by App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step1);
		getStartedNowScreens(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1167,SDAISRS133
		 * @Expected Terms of Use and  Privacy Notice all strings are displayed in selected language that is supported by App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step2);
		getStarted(client,true);
		clickOnCountryOfOrigin(client);
		verifyTermsAndPolicyPageDetails(client,"termsOfUseTitle",true);
		clickCheckBox(client, "termsOfUseTitle", true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		capturescreenshot(client, getStepID(), true);
		clickAndAcceptPage(client, "privacyNoticeTitle");

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1167,SDAISRS133
		 * @Expected Create My Account screen all Strings are displayed in selected language that is supported by App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step3);
		verifyCreateAccountScreen(client);
		capturescreenshot(client, getStepID()+"_Language Selected: "+getLanguage(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1167,SDAISRS133
		 * @Expected Home,Logbook,Reminders, all reports all Strings are displayed in selected language that is supported by App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step4);
		clickOnBackOrMenuIcon(client);
		clickOnBackOrMenuIcon(client);
		clickSignInButton(client,true);
		signInClick(client, LibrelinkConstants.Username, LibrelinkConstants.Password,true);
		defaultSettings(client,"grams");
		loadTestData(client, "MOCK_2", "Autodated","90days_autoDate.json");
		navigateToScreen(client, "home");
		navigateToScreen(client, "logbook");
		navigateToScreen(client, "reminders");
		navigateToScreen(client, "daily_patterns");
		navigateToScreen(client, "time_in_target");
		navigateToScreen(client, "navigation_drawer_low_glucose");
		navigateToScreen(client, "navigation_drawer_average_glucose");
		navigateToScreen(client, "daily_graph");
		navigateToScreen(client, "navigation_drawer_sensor_usage");
		capturescreenshot(client, getStepID()+"_Language Selected: "+getLanguage(), true);
		navigateToScreen(client, "home");

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS1167,SDAISRS133
		 * @Expected App Settings,Account Settings,Change Password,Help,About are displayed in selected language that is supported by App
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step5);
		clickOnSettingsMenu(client, "settings");
		waitFor(client, 2);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client, "account");
		waitFor(client, 2);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client, "changePassword");
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client, "help");
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client, "about");
		waitFor(client, 2);
		capturescreenshot(client, getStepID()+"_Language Selected: "+getLanguage(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAISRS668 SDAISRS133
		 * @Expected App displayed all the strings in default language US English when unsupported language is selected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step6);
		System.out.println("========"+getLanguage());
		changeLanguageinDevice(client,getProperty("unsupportedlanguage"));
		waitFor(client,2);
		waitFor(client,5);
		capturescreenshot(client, "TestPrecondition: Selected Unsupported Language "+getProperty("unsupportedlanguage"),true);
		setInputLanguage(client, "values");
		launch(client);
		clearData(client);
		getStartedNowScreens(client);
		getStarted(client,true);
		clickOnCountryOfOrigin(client);
		verifyTermsAndPolicyPageDetails(client,"termsOfUseTitle",true);
		clickCheckBox(client, "termsOfUseTitle", true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		clickCheckBox(client, "privacyNoticeTitle", true);
		verifyCreateAccountScreen(client);
		createDefaultAccount(client,"Adult");
		clickOnSettings(client, "settings");
		navigateToSubMenuScreens(client, "carbohydrateUnitsTitle");
		capturescreenshot(client, getStepID()+"_Displayed Default Language is English (United States)", true);
		changeLanguageinDevice(client,getLanguage());
		launch(client);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS1166
		 * @Expected About screen displays the smart device OS version details
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_DefaultLang_SysInfo_Step7);
		clickOnSettingsMenu(client,"about");
		verifyOSDetails(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);



		selectingSASMode(client,"DEFAULT");
	}

}
