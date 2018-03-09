package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T003_Percentage_DistinguishTargetRange_mg extends
ReportsHelper {

	@Test
	public void test_T003_Percentage_DistinguishTargetRange_mg() throws Exception {

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
		setTheTimeAlone(client, "22:00");
		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           100-140 mg/dL using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 100, 140);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target_7d:'The
		 *           percentage of Within Target is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step1);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS973
		 * @Expected Time In Target report_percentage_below70__7d:The percentage
		 *           of below70 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step2);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS975
		 * @Expected Time In Target report_percentage_70-lowTarget__7d:'The
		 *           percentage of 70-99 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step3);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-240_7d:The
		 *           percentage of 141-240 is 96%;Bar in yellow color;
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step4);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above240_7d:The percentage
		 *           of above240 is 4%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step5);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target_14d:The
		 *           percentage of Within Target is 1%;Bar of the target range
		 *           from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step6);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS973
		 * @Expected Time In Target report_percentage_below70_14d:The percentage
		 *           of below70 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step7);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS975
		 * @Expected Time In Target report_percentage_70-lowTarget_14d:The
		 *           percentage of 70-99 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step8);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-240_14d:The
		 *           percentage of 141-240 is 97%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step9);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above240_14d:The
		 *           percentage of above240 is 2%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step10);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target_30d:The
		 *           percentage of Within Target is 20% with unit mg/dL;Bar of
		 *           the target range from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step11);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS972_SDAIUIRS973
		 * @Expected Time In Target report_percentage_below70_30d:The percentage
		 *           of below70 is 7%;Bar in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step12);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS972_SDAIUIRS975
		 * @Expected Time In Target report_percentage_70-lowTarget_30d:The
		 *           percentage of 70-99 is 12%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step13);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-240_30d:The
		 *           percentage of 141-240 is 60%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above240_30d:The
		 *           percentage of above240 is 1%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step15);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS972_SDAIUIRS974
		 * @Expected Time In Target report_percentage_within Target_90d:The
		 *           percentage of Within Target is 17% with unit mg/dL;Bar of
		 *           the target range from bar graph is in green color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step16);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS972_SDAIUIRS973
		 * @Expected Time In Target report_percentage_below70__90d:'The
		 *           percentage of below70 is 3%;Bar in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step17);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS972_SDAIUIRS975
		 * @Expected Time In Target report_percentage_70-lowTarget__90d:The
		 *           percentage of 70-99 is 11% ;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step18);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS972_SDAIUIRS976
		 * @Expected Time In Target report_percentage_HighTarget-240__90d:The
		 *           percentage of 141-240 is 60%;Bar in yellow color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step19);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS972_SDAIUIRS1194
		 * @Expected Time In Target report_percentage_above240__90d:The
		 *           percentage of above240 is 9%;Bar in orange color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step20);
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
		verifyandsetTGfromSettings(client, 70, 180);

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_70-180__90d:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 70 mg/dL and less than the lower
		 *           target:The percentage of >240 is 9%;The percentage of
		 *           181-240 is 27%;The percentage of 70-180 is 61%;The
		 *           percentage of <70 is 3%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step21);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_70-180__30d:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 70 mg/dL and less than the lower
		 *           target:The percentage of >240 is 1%;The percentage of
		 *           181-240 is 25%;The percentage of 70-180 is 67%;he
		 *           percentage of <70 is 7%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step22);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_70-180__14d:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 70 mg/dL and less than the lower
		 *           target:The percentage of >240 is 2%;The percentage of
		 *           181-240 is 51%;The percentage of 70-180 is 47%;The
		 *           percentage of <70 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step23);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS1124
		 * @Expected Time In Target report_percentage_70-180__7d:Time In Target
		 *           report does not display the percentage of historical
		 *           glucose points in the reporting period that are greater
		 *           than or equal to 70 mg/dL and less than the lower
		 *           target:The percentage of >240 is 4%;The percentage of
		 *           181-240 is 74%;The percentage of 70-180 is 22%;The
		 *           percentage of <70 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step24);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
