package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class FirstTimeStartup_T002_TermsOfUseandPrivacyNotice extends
FirstSequenceAndSettingsHelper {

	@Test
	public void test_T002_TermsOfUseandPrivacyNotice() throws Exception {

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS939
		 * @Expected Confirm country screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step1);
		getStarted(client, true);
		verifyCountryPageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS939
		 * @Expected Terms of Use Screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step2);
		clickOnButtonOption(client, "Next", true);
		verifyTermsAndPolicyPageDetails(client, "termsOfUseTitle",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3 -TO Do for librelinkWelcomePage
		 * @Reqt SDAUIRS939
		 * @Expected App displays the welcome screen 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step3);
		clickOnButtonOption(client, "Reject", true);
		librelinkWelcomePage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS939
		 * @Expected Terms of Use Screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step4);
		getStarted(client, true);
		clickOnButtonOption(client, "Next", true);
		verifyTermsAndPolicyPageDetails(client, "termsOfUseTitle",true);
		clickCheckBox(client, "termsOfUseTitle", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS939
		 * @Expected Privacy Notice screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step5);
		clickCheckBox(client, "termsOfUseTitle", true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS939
		 * @Expected Terms of Use Page gets displayed with NEXT button
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step6);
		clickOnBackOrMenuIcon(client);
		verifyTermsAndPolicyPageDetails(client, "termsOfUseTitle",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS939
		 * @Expected The Pop-up displays with message I have read and explicitly
		 *           accept the Terms of Use. CANCEL and ACCEPT button are in
		 *           enabled state
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step7);
		closeRunningBrowser(client);
		launch(client);
		getStarted(client, true);
		verifyConfirmCountryPage(client);
		clickOnButtonOption(client, "Next", true);
		verifyPagePopUp(client, "Terms of Use");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS939
		 * @Expected App displays the Terms of Use screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step8);
		clickOnButtonOption(client, "Cancel", true);
		verifyPageTitles(client, "termsOfUseTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 9
		 * @Reqt SDAUIRS939
		 * @Expected Privacy Notice is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step9);
		clickOnButtonOption(client,"Accept",true);
	    clickCheckBox(client,"termsOfUseTitle",true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 10
		 * @Reqt SDAUIRS939
		 * @Expected App displays the welcome screen
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step10);
		clickOnButtonOption(client, "Reject", true);
		librelinkWelcomePage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 11
		 * @Reqt SDAUIRS939
		 * @Expected Privacy Notice screen is displayed with details
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step11);
		getStarted(client, true);
		verifyConfirmCountryPage(client);
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client, "termsOfUseTitle", true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		clickCheckBox(client, "privacyNoticeTitle", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 12
		 * @Reqt SDAUIRS939
		 * @Expected The Pop-up displays with message I have read and explicitly
		 *           accept the Privacy Notice. CANCEL and ACCEPT button are in
		 *           enabled state
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step12);
		verifyPagePopUp(client, "Privacy Notice");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 13
		 * @Reqt SDAUIRS939
		 * @Expected Create New Account screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step13);
		clickOnButtonOption(client, "Accept", true);
		verifyPageTitles(client, "createNewAccountText");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 14
		 * @Reqt SDAUIRS939
		 * @Expected The Startup wizard screen displays with Confirm Country
		 *           screen with NEXT button
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step14);
		clickOnBackOrMenuIcon(client);
		verifyCountryPageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 15
		 * @Reqt SDAUIRS939
		 * @Expected The Pop-up displays with message I have read and explicitly
		 *           accept the Terms of Use. CANCEL and ACCEPT button are in
		 *           enabled state
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step15);
		closeRunningBrowser(client);
		launch(client);
		getStarted(client, true);
		verifyConfirmCountryPage(client);
		clickOnButtonOption(client, "Next", true);
		verifyPagePopUp(client, "Terms of Use");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 16
		 * @Reqt SDAUIRS939
		 * @Expected The Privacy Notice Page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step16);
		clickOnButtonOption(client, "Accept", true);
		verifyPageTitles(client, "privacyNoticeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 17
		 * @Reqt SDAUIRS939
		 * @Expected Create New Account Screen is displayed is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step17);
		clickCheckBox(client, "privacyNoticeTitle", true);
		verifyPageTitles(client, "createNewAccountText");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 18
		 * @Reqt SDAUIRS939
		 * @Expected Privacy notice page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step18);
		clickOnBackOrMenuIcon(client);
		verifyPageTitles(client, "countryOfOriginTitle");
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client,"termsOfUseTitle",true);
		waitForProgress(client);
		verifyPagePopUp(client, "Privacy Notice");
		clickOnButtonOption(client, "Cancel", true);
		verifyPageTitles(client, "privacyNoticeTitle");
		capturescreenshot(client, getStepID(), true);

	}
}
