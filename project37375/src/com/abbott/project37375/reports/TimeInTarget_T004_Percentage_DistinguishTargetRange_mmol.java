package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol extends
ReportsHelper {

	@Test
	public void test_T004_Percentage_DistinguishTargetRange_mmol() throws Exception {

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
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           5.6-7.8 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 5.6, 7.8);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target for 7 days:The
		 *           percentage of Within Target is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step1);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target for 14 days:The
		 *           percentage of Within Target is 1%;Bar of the target range
		 *           from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected The percentage of Within Target is 21% with unit mmol/L;Bar
		 *           of the target range from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step3);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected The percentage of Within Target is 18% with unit mmol/L;Bar
		 *           of the target range from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step4);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS973
		 * @Expected Time In Target report_percentage_below 3.9 for 14 days:The
		 *           percentage of below 3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step5);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS972_SDAIUIRS973
		 * @Expected Time In Target report_percentage_below3.9 for 30 days:The
		 *           percentage of below 3.9 is 7%;Bar in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step6);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS972_SDAIUIRS973
		 * @Expected Time In Target report_percentage_below3.9 for 90 days:The
		 *           percentage of below 3.9 is 3%;Bar in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step7);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS973
		 * @Expected Time In Target report_percentage_below3.9 for 7 days:The
		 *           percentage of below 3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step8);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS972_SDAIUIRS975
		 * @Expected Time In Target report_percentage_3.9-lowTarget for 30 days:The
		 *           percentage of 3.9-5.5 is 12%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step9);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS972_SDAIUIRS975
		 * @Expected Time In Target report_percentage_3.9-lowTarget for 90 days:The
		 *           percentage of 3.9-5.5 is 11% ;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step10);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS975
		 * @Expected Time In Target report_percentage_3.9-lowTarget for 7 days:The
		 *           percentage of 3.9-5.5 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step11);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS975
		 * @Expected Time In Target report_percentage_3.9-lowTarget for 14 days:The
		 *           percentage of 3.9-5.5 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step12);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-13.3 for 90 days:The
		 *           percentage of 7.9-13.3 is 59%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step13);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-13.3 for 7days:The
		 *           percentage of 7.9-13.3 is 96%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step14);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-13.3 for 14 days:The
		 *           percentage of 7.9-13.3 is 97%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step15);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-13.3 for 30 days:The
		 *           percentage of 7.9-13.3 is 59%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step16);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above13.3 for 90 days:The
		 *           percentage of above13.3 is 9%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step17);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above 13.3 for 7 days:The
		 *           percentage of above13.3 is 4%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step18);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above 13.3 for 14 days:The
		 *           percentage of above13.3 is 2%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step19);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above 13.3 for 30 days:The
		 *           percentage of above13.3 is 1%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step20);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           70-180 mg/dL using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 3.9, 10.0);

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_3,9-10 for 90 days:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 3.9 mmol/L and less than the lower
		 *           target.The percentage of >13.3 is 9%;The percentage of
		 *           10.1-13.3 is 27%;The percentage of 3.9-10 is 61%;The
		 *           percentage of <3.9 is 3%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step21);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_3,9-10 for 30 days:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 3.9 mmol/L and less than the lower
		 *           target:The percentage of >13.3 is 1%;The percentage of
		 *           10.1-13.3 is 25%;The percentage of 3.9-10 is 67%;The
		 *           percentage of <3.9 is 7%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step22);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_3,9-10 for 14 days:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 3.9 mmol/L and less than the lower
		 *           target:The percentage of >13.3 is 2%;The percentage of
		 *           10.1-13.3 is 51%;The percentage of 3.9-10 is 47%;The
		 *           percentage of <3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step23);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_3,9-10__7d:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 3.9 mmol/L and less than the lower
		 *           target:The percentage of >13.3 is 4%;The percentage of
		 *           10.1-13.3 is 74%;The percentage of 3.9-10 is 22%;The
		 *           percentage of <3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step24);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
