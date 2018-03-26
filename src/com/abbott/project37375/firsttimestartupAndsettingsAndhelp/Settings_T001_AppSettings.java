package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class Settings_T001_AppSettings extends FirstSequenceAndSettingsHelper {

	@Test
	public void test_T001_AppSettings() throws Exception {
		String verifyTG = null;
	
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1144,SDAUIRS1253
		 * @Expected The App Navigates to Target Glucose Range screen and has an
		 *           option to set the Target Glucose Range.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step1);
		clickOnSettingsMenu(client, "settings");
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");
		verifyPageTitles(client,"targetGlucoseRangeTitle");
		capturescreenshot(client, getStepID(), true);

		
		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1144,SDAUIRS1253,SDAISRS172
		 * @Expected The App Allows the user to set the Upper Value between
		 *           71-180 mg/dL or 4.0 -10.0 mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step2);
		if (getUnits().equals("mg/dL")) {
			verifyHighGlucoseRange(client, "180", "70", "71");
		} else if (getUnits().equals("mmol/L")) {
			verifyHighGlucoseRange(client, "10.0", "3.9", "4.0");
		}
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");
		

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1144,SDAUIRS1253,SDAISRS172
		 * @Expected The App is Allowed the user to set the Upper Value between (101-180 mg/dL or 5.7-10.0 mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step3);
		if (getUnits().equals("mg/dL")) {
			verifyHighGlucoseRange(client, "180", "100", "101");
		} else if (getUnits().equals("mmol/L")) {
			verifyHighGlucoseRange(client, "10.0", "5.6", "5.7");
		}
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1144,SDAUIRS1253,SDAISRS172
		 * @Expected The App is allowed the user to set the Lower Value between (70 -179 mg/dL or 3.9 - 9.9 mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step4);
		if (getUnits().equals("mg/dL")) {
			verifyLowGlucoseRange(client, "179", "70", "180");
		} else if (getUnits().equals("mmol/L")) {
			verifyLowGlucoseRange(client, "9.9", "3.9", "10.0");
		}
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");
		
		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS1144,SDAUIRS1253,SDAISRS172
		 * @Expected 'The App is allowed the user to set the Lower Value as ( 70 mg/dL or 3.9 mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step5);
		if (getUnits().equals("mg/dL")) {
			setGlucoseRange(client, "71", "70");
			verifyLowerGlucoseRangeUnits(client);
		} else if (getUnits().equals("mmol/L")) {
			setGlucoseRange(client, "4.0", "3.9");
			verifyLowerGlucoseRangeUnits(client);
		}
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");
		
	

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS1144,SDAUIRS1253,SDAISRS172
		 * @Expected The App is Allowed the user to set the Lower Value  between ( 70 -139 mg/dL or 3.9 - 7.7 mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step6);
		if (getUnits().equals("mg/dL")) {
			verifyLowGlucoseRange(client, "139", "70", "140");
		} else if (getUnits().equals("mmol/L")) {
			verifyLowGlucoseRange(client, "7.7", "3.9", "7.8");
		}
		clickOnBackOrMenuIcon(client);
		
		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS1145
		 * @Expected The App Navigates to Carbohydrate Units screen and has an option to set the Carbohydrate Units as grams or servings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step7);
		navigateToSubMenuScreens(client,"carbohydrateUnitsTitle");
		verifyCarbohydrateOptions(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS1145, SDAISRS830
		 * @Expected grams UOM is selected & serving size selection is disabled.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step8);
		selectCarbohydrateUnits(client,"grams");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS1145, SDAUIRS1146, SDAISRS830 
		 * @Expected servings UOM is selected & the App allows the user to set 1 serving as 10 -15 grams, in 0.5 grams increments.  ( For UK build, it is 1 portions as 10-15 grams, in 0.5 grams increments).
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step9);
		selectCarbohydrateUnits(client,"servings");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOption(client,"Save", true);
		
		if(getTextToSpeech().equalsIgnoreCase("yes")){
		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS1245
		 * @Expected 'Text to Speech' feature is 'on' is displayed on App Settings screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step10);
		navigateToSubMenuScreens(client ,"textToSpeechTitle");
		selectspeechOption(client, "on");
		verifySpeechSettings(client, "on");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS1246
		 * @Expected Text to Speech feature is 'off' is displayed on App Settings screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step11);
		navigateToSubMenuScreens(client ,"textToSpeechTitle");
		selectspeechOption(client, "off");
		verifySpeechSettings(client, "off");
		capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step10 & 11_NotApplicable_For US Build_Text to Speech");
		}
		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS1144, SDAUIRS1145,SDAUIRS1246
		 * @Expected The App Settings screen is displayed the following parameters:Target Glucose Range with range 100-140 mg/dL ( or 5.6-7.8  mmol/L);Carbohydrate Units with UOM as servings.(  or Portion For UK Build );Text to Speech  Setting is set to 'off'.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step12);
		if (getUnits().equals("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
			verifyTG= "100 - 140 mg/dL";
		} else if (getUnits().equals("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
			verifyTG= "5.6 - 7.8 mmol/L";
		}
		verifySettingsPage(client, "off", "servings",15.0,verifyTG,"sound and vibration");
		capturescreenshot(client, getStepID(), true);
	
		
		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS1144, SDAUIRS1145, SDAUIRS1245,SDAUIRS1246,SDAISRS172, SDAISRS830
		 * @Expected The App Settings screen is displayed the following parameters,Target Glucose Range with range 140-160 mg/dL ( or 7.8-8.9  mmol/L),Carbohydrate Units with UOM as grams,Text to Speech setting is set to 'on'
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Settings_T001_AppSettings_Step13);
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equals("mg/dL")) {
			verifyandsetTGfromSettings(client, 140, 160);
			verifyTG= "140 - 160 mg/dL";
		} else if (getUnits().equals("mmol/L")) {
			verifyandsetTGfromSettings(client, 7.8,8.9);
			verifyTG= "7.8 - 8.9 mmol/L";
		}
		navigateToSubMenuScreens(client ,"carbohydrateUnitsTitle");
		selectCarbohydrateUnits(client,"grams");
		clickOnButtonOption(client,"Save", true);
		if(getTextToSpeech().equalsIgnoreCase("yes")){
		navigateToSubMenuScreens(client ,"textToSpeechTitle");
		selectspeechOption(client, "on");
		}
		verifySettingsPage(client,"on", "grams",0, verifyTG,"sound and vibration");
		capturescreenshot(client, getStepID(), true);

	}
	


}
