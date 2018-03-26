package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class DailyPatterns_T002_Yaxis extends ReportsHelper {

	@Test
	public void test_T002_Yaxis() throws Exception {

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
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 7 days Data for Y-axis
		 *           with BasicData(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step1);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 14 days Data for Y-axis
		 *           with BasicData(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 30 days Data for Y-axis
		 *           with BasicData(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step3);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 90 days Data for Y-axis
		 *           with BasicData(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step4);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page, Set to Default and Set device time
		 *           to 04-06-2014 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		selectingSASMode(client,"DEFAULT");
		setTheDateAndTime(client, 6, 04, 2014, "23:50");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "20HR-AGP-HG350up.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "20HR-AGP-HG350up.json");

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 90 days Data for Y-axis
		 *           with 20HR_AGP_HG350up(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step5);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 14 days Data for Y-axis
		 *           with 20HR_AGP_HG350up(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step6);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 30 days Data for Y-axis
		 *           with 20HR_AGP_HG350up(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step7);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS965
		 * @Expected Navigate to Reports and Verifying 7 days Data for Y-axis
		 *           with 20HR_AGP_HG350up(DataSet)
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T002_Y_axis_range_Step8);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);


	}

}
