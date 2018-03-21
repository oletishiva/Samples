package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange
extends ReportsHelper {

	@Test
	public void test_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange() throws Exception {

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from HomePage and verify DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step1);
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Logbook page and verify DailyPatternsReport
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Reminder page and verify DailyPatternsReport
		 *           page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Time_In_Target page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_1);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Low_Glucose_Events page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_2);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Average_Glucose page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_3);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Daily_Graph page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_4);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Estimated A1c page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Daily Patterns");
			capturescreenshot(client, getStepID(), true);

		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}

		/**
		 * 
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Sensor_Usage page and verify
		 *           DailyPatternsReport page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Time_In_Target page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_1);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Low_Glucose_Events page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_2);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Average_Glucose page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_3);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Daily_Graph page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_4);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Estimated A1c page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Daily Patterns");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS961_SDAISRS1164_SDAISRS1165
		 * @Expected Navigate from Sensor_Usage page and verify
		 *           DailyPatternsReport page by Slide
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           02-28-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC","Basic Data.json");

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUISRS962
		 * @Expected Navigate to Daily_Patterns page and verifying
		 *           DailyPatternGraph for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step6);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS962
		 * @Expected verifying DailyPatternGraph for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step7);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS962
		 * @Expected verifying DailyPatternGraph for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step8);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS962
		 * @Expected verifying DailyPatternGraph for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step9);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS955_SDAUISRS963
		 * @Expected Navigate to Daily_Patterns page and verifying DailyPattern
		 *           Date_period for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step10);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 30);
		verifyDatePeriodForNDays(client, "DAILY PATTERNS",30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS955_SDAUISRS963
		 * @Expected verifying DailyPattern Date_period for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step11);
		clickOnDays(client, 7);
		verifyDatePeriodForNDays(client, "DAILY PATTERNS",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS955_SDAUISRS963
		 * @Expected verifying DailyPattern Date_period for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step12);
		clickOnDays(client, 90);
		verifyDatePeriodForNDays(client, "DAILY PATTERNS",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS955_SDAUISRS963
		 * @Expected verifying DailyPattern Date_period for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step13);
		clickOnDays(client, 14);
		verifyDatePeriodForNDays(client, "DAILY PATTERNS",14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 24hours Format for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step14);
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 24hours Format for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step15);
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 24hours Format for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step16);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 24hours Format for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step17);
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set Phone timing to 12hr Format
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 12hours Format for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step18);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 12hours Format for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step19);
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 12hours Format for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step20);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS964
		 * @Expected Verifying DailyPattern Report X-axis with 12hours Format for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step21);
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Daily Patterns");
		capturescreenshot(client, getStepID(), true);
		navigateToScreen(client,"Home");


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Target Glucose Range to 70-71 mg/dL or 3.9-4.0
		 *           mmol/L using Librelink Settings and Navigatae to Daily
		 *           Patterns
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 71);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 4.0);
		}
		navigateToScreen(client, "Daily Patterns");

		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 70-71mg/dL or 3.9-4.0
		 *           mmol/L is distinguished For 7 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step22);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 70-71mg/dL or 3.9-4.0
		 *           mmol/L is distinguished For 90 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step23);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 70-71mg/dL or 3.9-4.0
		 *           mmol/L is distinguished For 14 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step24);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 70-71mg/dL or 3.9-4.0
		 *           mmol/L is distinguished For 30 Days
		 * @Dependancy NA
		 * 
		 **/

		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step25);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate Home page Set the Target Glucose Range to 100-140
		 *           mg/dL and 5.6-7.8 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}


		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 100-140 mg/dL or 5.6-7.8
		 *           mmol/L is distinguished 30 days
		 * @Dependancy NA
		 * 
		 **/

		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step26);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 27
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 100-140 mg/dL or 5.6-7.8
		 *           mmol/L is distinguished 7 days
		 * @Dependancy NA
		 * 
		 **/

		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step27);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate Home page Set the Target Glucose Range to 150-180
		 *           mg/dL 8.3-10.0 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 150, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 8.3, 10.0);
		}


		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 150-180 mg/dL or
		 *           8.3-10.0 mmol/L is distinguished 14 days
		 * @Dependancy NA
		 * 
		 **/

		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step28);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 29
		 * @Reqt SDAIUIRS966
		 * @Expected Verifying The glucose target range 150-180 mg/dL or
		 *           8.3-10.0 mmol/L is distinguished 90 days
		 * @Dependancy NA
		 * 
		 **/

		setStepID(LibrelinkConstants.DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step29);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		cleanUpForTG(client);
		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
