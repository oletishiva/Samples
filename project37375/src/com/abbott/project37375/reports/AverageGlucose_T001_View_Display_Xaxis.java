package com.abbott.project37375.reports;

import org.junit.Test;
import com.abbott.project37375.main.LibrelinkConstants;

public class AverageGlucose_T001_View_Display_Xaxis extends ReportsHelper {

	@Test
	public void test_T001_View_Display_Xaxis() throws Exception {

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from HomePage
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step1);

		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from LogBook
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Reminder
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Daily Patterns Report
		 *         
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from TimeInTarget Report
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_2);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Low Glucose Events Report
		 *          
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Daily Graph Report
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_4);
		navigateToScreen(client, "Daily Graph");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Estimated A1c report
		 *          
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Average Glucose");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Sensor Usage
		 *          
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Daily Pattern report by swiping
		 *          
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from TimeInTarget report by swiping
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_2);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Low Glucose EVents report by swiping
		 *        
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Average Glucose report by swiping
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_4);
		navigateToScreen(client, "Daily Graph");
		navigateToReportBySlide(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Estimated A1C report by swiping
		 *         
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Average Glucose");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS991_SDAISRS1164_SDAISRS1168
		 * @Expected Navigate to Average Glucose Report from Sensor Usage report by swiping
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Average Glucose");
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
		 * @Reqt SDAIUIRS955_SDAIUIRS992
		 * @Expected Average Glucose header date value for 90 days period
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step6);
		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 90);
		verifyDatePeriodForNDays(client, "Average Glucose",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS955_SDAIUIRS992
		 * @Expected Average Glucose header date value for 30 days period
		 *           
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step7);
		clickOnDays(client, 30);
		verifyDatePeriodForNDays(client, "Average Glucose",30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS955_SDAIUIRS992
		 * @Expected Average Glucose header date value for 7 days period
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step8);
		clickOnDays(client, 7);
		verifyDatePeriodForNDays(client, "Average Glucose",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS955_SDAIUIRS992
		 * @Expected Average Glucose header date value for 14 days period
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step9);
		clickOnDays(client, 14);
		verifyDatePeriodForNDays(client, "Average Glucose",14);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS996_SDAIUIRS998
		 * @Expected Verifying Average Glucose Report for X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 14 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step10);
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS996_SDAIUIRS998
		 * @Expected Verifying Average Glucose Report for X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 90 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step11);
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS996_SDAIUIRS998
		 * @Expected Verifying Average Glucose Report for X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 30 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step12);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS996_SDAIUIRS998
		 * @Expected Verifying Average Glucose Report for X-axis (midnight to midnight and with 3hrs gap) 
		 * 			 with 24hours Format for 7 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step13);
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS996_SDAISRS998
		 * @Expected Verifying Average Glucose Report for X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 90 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step14);
		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 90);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS996_SDAISRS998
		 * @Expected Verifying Average Glucose Report for X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 30 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step15);
		clickOnDays(client, 30);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS996_SDAISRS998
		 * @Expected Verifying Average Glucose Report for X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 14 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step16);
		clickOnDays(client, 14);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS996_SDAISRS998
		 * @Expected Verifying Average Glucose Report for X-axis (12AM-12AM and with 3hrs gap) 
		 * 			 with 12hours Format for 7 Days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T001_View_Display_Xaxis_Step17);
		clickOnDays(client, 7);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Average Glucose");
		capturescreenshot(client, getStepID(), true);



		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
