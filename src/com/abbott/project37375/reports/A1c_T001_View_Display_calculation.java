package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class A1c_T001_View_Display_calculation extends ReportsHelper {

	@Test
	public void test_T001_View_Display_calculation() throws Exception {


		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from HomePage and verifying EstimatedA1c Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step1);
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Logbook page and verifying EstimatedA1c Report
		 *           page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Reminder page and verifying EstimatedA1c Report
		 *           page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from DailyPatterns page and verifying EstimatedA1c
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Time In Target page and verifying EstimatedA1c
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_2);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Low_Glucose_Events page and verifying
		 *           EstimatedA1c Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Average Glucose page and verifying EstimatedA1c
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_4);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Daily Graph page and verifying Estimated A1c
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_5);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Sensor_Usage page and verifying Estimated A1c
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from DailyPatterns page and verifying Estimated A1c
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Time In Target page and verifying Estimated A1c
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_2);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Low_Glucose_Events page and verifying Estimated
		 *           A1c Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Daily_Graph page and verifying Estimated A1c
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_4);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Daily_Graph page and verifying Estimated A1c
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_5);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS1016_SDASRS1164 & SDASRS1186
		 * @Expected Navigate from Sensor_Usage page and verifying Estimated A1c
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Estimated A1c");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device date to
		 *            05-24-2013 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 24, 05, 2013, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basic Data_onlyJanFeb.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC","Basic Data_onlyJanFeb.json");

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected verifying Date 24 Feb -24 May  2013 displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step6);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "24May");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c percentage is displayed as 8.5%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step7);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "24May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1C in mmol/mol is displayed as:69 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step8);
		verifyEstimatedA1cReportCalmmolForNdays(client, "24May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the reporting period: Data spans 5 of 90 days 
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step9);
		verifyEstimatedA1cReportDataSpanForNdays(client, 5);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           05-22-2013
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		
		setTheDateAndTime(client, 22, 05, 2013, "00:00");

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date.Date 22 Feb -22 May 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step10);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "22May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c percentage(%) displayed:For mg/dL unit: 8.6% ; For mmol/L unit:8.5%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step11);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "22May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1c in mmol/mol displayed:For mg/dL unit: 70
		 *           mmol/mol ; For mmol/L unit: 69 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step12);
		verifyEstimatedA1cReportCalmmolForNdays(client, "22May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the number of days including
		 *           and between the first point and the last point within the
		 *           reporting period Data spans 7 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step13);
		verifyEstimatedA1cReportDataSpanForNdays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           05-22-2013
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 15, 05, 2013, "00:00");

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date. Date 15 Feb -15 May 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step14);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "15May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c % displays: 8.1%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step15);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "15May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1C in mmol/mol displayed:65 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step16);
		verifyEstimatedA1cReportCalmmolForNdays(client, "15May");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the number of days including
		 *           and between the first point and the last point within the
		 *           reporting period Data spans 14 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step17);
		verifyEstimatedA1cReportDataSpanForNdays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           04-29-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 29, 04, 2013, "00:00");

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date.Date 30 Jan -29 Apr 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step18);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "29Apr");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c % displays: 6.8%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step19);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "29Apr");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1c in mmol/mol displayed: 51 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step20);
		verifyEstimatedA1cReportCalmmolForNdays(client, "29Apr");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the number of days including
		 *           and between the first point and the last point within the
		 *           reporting period Report displays Data spans 30 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step21);
		verifyEstimatedA1cReportDataSpanForNdays(client, 30);
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
		 * @stepId Step 22
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date.Date 1 Dec 2012 -28 Feb 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step22);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "28Feb");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c % displayed: 7.4%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step23);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "28Feb");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1c in mmol/mol displayed: 57 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step24);
		verifyEstimatedA1cReportCalmmolForNdays(client, "28Feb");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the number of days including
		 *           and between the first point and the last point within the
		 *           reporting period Data spans 59 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step25);
		verifyEstimatedA1cReportDataSpanForNdays(client, 59);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           01-05-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 05, 01, 2013, "23:50");

		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date.Date 8 Oct 2012 -5 Jan 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step26);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "5Jan");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 27
		 * @Reqt SDAIUIRS1249
		 * @Expected A1c % displayed: 5.7%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step27);
		verifyEstimatedA1cReportCalPercentageForNdays(client, "5Jan");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAIUIRS1249
		 * @Expected The estimated A1c in mmol/mol displayed:39 mmol/mol
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step28);
		verifyEstimatedA1cReportCalmmolForNdays(client, "5Jan");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 29
		 * @Reqt SDAIUIRS1018
		 * @Expected Estimated A1c report displays the number of days including
		 *           and between the first point and the last point within the
		 *           reporting period Report displays Data spans 5 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step29);
		verifyEstimatedA1cReportDataSpanForNdays(client, 5);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           01-05-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 4, 01, 2013, "23:50");

		/**
		 * 
		 * @stepId Step 30
		 * @Reqt SDAIUIRS955_SDAIUIRS1017
		 * @Expected The reporting period begins 89 days before the current date
		 *           and ending on the current date.Date 7 Oct 2012 -4 Jan 2013
		 *           displayed on top of the screen
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.A1c_T001_View_Display_calculation_Step30);
		navigateToScreen(client, "Estimated A1c");
		verifyEstimatedA1cReportDatePeriodForNdays(client, "4Jan");
		capturescreenshot(client, getStepID(), true);
		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
