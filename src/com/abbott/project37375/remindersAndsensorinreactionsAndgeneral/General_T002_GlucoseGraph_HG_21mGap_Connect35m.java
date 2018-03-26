package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T002_GlucoseGraph_HG_21mGap_Connect35m extends UIGeneralHelper {


	@Test
	public void test_General_T002_GlucoseGraph_HG_21mGap_Connect35m() throws Exception {

		changeTimeZone(client, LibrelinkConstants.US);
		launch(client);
		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1192
		 * @Expected My Glucose Screen displays No gaps around 09:19 to 09:39; No gaps around 12:30 to 12:50 ; Gap around 07:39 to 08:00 and Gap around 10:54 to 11:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step1);
		setTheTimeAlone(client, "14:00");
		loadTestData(client, "MOCK_2", "ADC","Gaps21min-19m20m.json");
		navigateToMyGlucosePage(client);
		waitFor(client, 2);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS873
		 * @Expected Home screen glucose graph displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 ; Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step2);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "home");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS887
		 * @Expected Logbook Detail screen glucose graph displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 ;Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step3);
		navigateToScreen(client, "logbook");
		clickOnNoteIcon(client,"logbook");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1192
		 * @Expected My Glucose Screen displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 with TZ change icon; Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step4);
		setTheTimeAlone(client, "14:00");
		loadTestData(client, "MOCK_2", "ADC","Gaps21min-19m20m-Anchorage80m.json");
		navigateToMyGlucosePage(client);
		waitFor(client, 2);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS873
		 * @Expected Home screen glucose graph displays No gaps from 09:19 to 09:39 ;No gaps from 12:30 to 12:50 with TZ change icon ;Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step5);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "home");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS887
		 * @Expected Logbook Detail Screen glucose graph No gaps from 09:19 to 09:39;Gaps from 11:40 to 12:40 with TZ change icon ;Gap from 06:39 to 07:00;Gap from 09:54 to 10:15
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step6);
		navigateToScreen(client, "logbook");
		clickOnNoteIcon(client,"logbook");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS1232 
		 * @Expected The scan results screen glucose graph connects the scan result and the last historical glucose
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step7);
		setTheTimeAlone(client, "12:00");
		loadTestData(client, "MOCK_2", "ADC","4hrs-withNotes-35min.json");
		navigateToMyGlucosePage(client);
		waitFor(client, 2);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS1230
		 * @Expected The Home screen glucose graph connects the scan result and the last historical glucose
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step8);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "home");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS1231
		 * @Expected The Logbook Details screen glucose graph connects the scan result and the last historical glucose
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step9);
		navigateToScreen(client, "logbook");
		clickOnNoteIcon(client,"logbook");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS1232  
		 * @Expected The scan results screen glucose graph doesn't connect the scan result and the last historical glucose as the time difference is greater than 35 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step10);
		debugDrawerClearData(client);
		loadTestData(client, "MOCK_2", "ADC","4hrs-withNotes-36min.json");
		navigateToMyGlucosePage(client);
		waitFor(client, 2);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS1230
		 * @Expected The Home screen glucose graph doesn't connect  the scan result and the last historical glucose as the time difference is greater than 35 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step11);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "home");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS1231
		 * @Expected The Logbook Details screen glucose graph doesn't connect  the scan result and the last historical glucose as the time difference is greater than 35 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step12);
		navigateToScreen(client, "logbook");
		clickOnNoteIcon(client,"logbook");
		waitFor(client, 1);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}

}
