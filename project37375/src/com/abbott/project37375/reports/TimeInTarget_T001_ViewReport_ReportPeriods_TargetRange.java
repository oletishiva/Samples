package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange extends
ReportsHelper {

	@Test
	public void test_T001_ViewReport_ReportPeriods_TargetRange()
			throws Exception {



		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to HomePage and verifying TimeInTarget Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step1);
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Logbook and verifying TimeInTarget Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Reminder and verifying TimeInTarget Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to DailyPatterns and verifying TimeInTarget Report
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Low_Glucose_Events and verifying TimeInTarget
		 *           Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_2);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Average_Glucose and verifying TimeInTarget
		 *           Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_3);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Daily_Graph and verifying TimeInTarget Report
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_4);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Estimated A1c and verifying TimeInTarget Report
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Time In Target");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Sensor Usage and verifying TimeInTarget Report
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to DailyPatterns page and verifying TimeInTarget
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Low_Glucose_Events page and verifying
		 *           TimeInTarget Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_2);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Average_Glucose page and verifying TimeInTarget
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_3);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Daily_Graph page and verifying TimeInTarget
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_4);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Estimated A1c page and verifying TimeInTarget
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Time In Target");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS969_SDAISRS1164_SDAISRS1166
		 * @Expected Navigate to Sensor_Usage page and verifying TimeInTarget
		 *           Report page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Time In Target");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the Phone Timing to 24 Hours Format and Set
		 *           device Date&time to 02-28-2013 23:50, Load Data file to
		 *           "Basic Data.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");
		loadTestData(client,  "MOCK_2","ADC", "Basic Data.json");


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS955_SDAIUIRS970
		 * @Expected Navigate to TimeInTarget page and click on 90 days data
		 *           then verifying TimeInTarget Report for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step6);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		verifyDatePeriodForNDays(client, "TIME IN TARGET",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS955_SDAIUIRS970
		 * @Expected Navigate to TimeInTarget page and click on 30 days data
		 *           then verifying TimeInTarget Report for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step7);
		clickOnDays(client, 30);
		verifyDatePeriodForNDays(client, "TIME IN TARGET",30);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS955_SDAIUIRS970
		 * @Expected Navigate to TimeInTarget page and click on 7 days data then
		 *           verifying TimeInTarget Report for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step8);
		clickOnDays(client, 7);
		verifyDatePeriodForNDays(client, "TIME IN TARGET",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS955_SDAIUIRS970
		 * @Expected Navigate to TimeInTarget page and click on 14 days data
		 *           then verifying TimeInTarget Report for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step9);
		clickOnDays(client, 14);
		verifyDatePeriodForNDays(client, "TIME IN TARGET",14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           100-140 mg/dL or 5.6-7.8 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}

		navigateToScreen(client, "Time In Target");

		/**
		 * 
		 * @stepId Step 10.1
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 100-140 mg/dL or 5.6-7.8 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_1);
		clickOnDays(client, 7);
		verifyTimeInTargetRange100To140(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10.2
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 100-140 mg/dL or 5.6-7.8 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_2);
		clickOnDays(client, 14);
		verifyTimeInTargetRange100To140(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10.3
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 100-140 mg/dL or 5.6-7.8 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_3);
		clickOnDays(client, 30);
		verifyTimeInTargetRange100To140(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10.4
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 100-140 mg/dL or 5.6-7.8 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_4);
		clickOnDays(client, 90);
		verifyTimeInTargetRange100To140(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           70-180 mg/dL or 3.9-10 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}

		navigateToScreen(client, "Time In Target");


		/**
		 * 
		 * @stepId Step 11.1
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 70-180 mg/dL or 3.9-10 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_1);
		clickOnDays(client, 7);
		verifyTimeInTargetRange70To180(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11.2
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 70-180 mg/dL or 3.9-10 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_2);
		clickOnDays(client, 14);
		verifyTimeInTargetRange70To180(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11.3
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 70-180 mg/dL or 3.9-10 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_3);
		clickOnDays(client, 30);
		verifyTimeInTargetRange70To180(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11.4
		 * @Reqt SDAIUIRS1193
		 * @Expected Navigate to TimeInTarget page and verifying Target Range is
		 *           displayed: 70-180 mg/dL or 3.9-10 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_4);
		clickOnDays(client, 90);
		verifyTimeInTargetRange70To180(client);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
