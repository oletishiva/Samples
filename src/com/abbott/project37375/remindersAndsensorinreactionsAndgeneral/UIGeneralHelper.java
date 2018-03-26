package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Assert;

import com.abbott.project37375.main.BaseHelper;
import com.abbott.project37375.main.LibrelinkConstants;
import com.experitest.client.Client;

public class UIGeneralHelper extends BaseHelper {

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Average Glucose Units in Home screen
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */
	public void verifyAvgGlucoseUnitsinHome(Client client)  {
		client.waitForElement("NATIVE",
				"xpath=//*[@id='sensorStatus']", 0,
				10000);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='average_title' and @text='Average']", 0);
		String units[] = getUnits().split("/");
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='numerator' and @text='" + units[0]
						+ "' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='denominator' and @text='" + units[1]
						+ "' and @onScreen='true']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Time in target in Home screen
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void verifyTimeintargetinHome(Client client) {
		client.waitForElement("NATIVE",
				"xpath=//*[@id='sensorStatus']", 0,
				10000);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='time_in_target_title' and @text='Time In Target']",
				0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='home_percent' and @text='%' and ./parent::*[@id='time_in_target']]", 0);
		String timeintarget = client.elementGetText("NATIVE", "xpath=//*[@id='data_value' and ./parent::*[@id='time_in_target']]", 0);
		Integer timeintargetVal = Integer.parseInt(timeintarget);
		Assert.assertTrue("Value in range", 0 <= timeintargetVal
				&& timeintargetVal <= 100);
		client.verifyElementNotFound("NATIVE", "xpath=//*[contains(@text,'"
				+ getUnits().substring(0, 2)
				+ "') and ./parent::*[@id='time_in_target']]", 0);
	}








	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Target Range Unit Of Measurement
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void verifyTargetRangeUOM(Client client) {
		client.waitForElement("NATIVE",
				"text=Target Glucose Range", 0, 10000);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"
				+ getUnits() + "']", 0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify GetStartedNow Screens which support multi language
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void getStartedNowScreens(Client client) {
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"checkGlucoseWithPhone");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"instantAccess");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"actionableInsights");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"shareGlucoseInformation");
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On Country Of Origin Page which support multi language
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 */
	public void clickOnCountryOfOrigin(Client client) {
		client.waitForElement("NATIVE", "text=${countryOfOriginTitle}", 0,10000);
		client.click("NATIVE", "xpath=//*[@id='next' and @onScreen='true']", 0, 1);
	}


	/**
	 * Author:NagarajuKasarla
	 * 
	 * Method to Verify Sensor scan page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void verifySensorscanpage(Client client) {
		client.waitForElement("NATIVE", "id=total_scan_label", 0,
				5000);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='total_scan_label' and @text='Total Scans']",
				0);
		String totalScans = client.elementGetText("NATIVE",
				"id=total_scan_value", 0);
		assertverifyForSensorUsageScan(client, totalScans);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='average_label' and @text='Scans Per Day']",
				0);
		String scansPerDay = client.elementGetText("NATIVE",
				"id=average_value", 0);
		assertverifyForSensorUsageScan(client, scansPerDay);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='captured_label' and @text='% of Sensor Data Captured']",
				0);
		String sensorData = client.elementGetText("NATIVE",
				"id=captured_value", 0);
		assertverifyForSensorUsageScan(client, sensorData);

		client.verifyElementNotFound("NATIVE", "xpath=//*[@text='" + getUnits()
				+ "' and onScreen='true']", 0);
	}

	public void assertverifyForSensorUsageScan(Client client, String scans) {
		int scanvalue = Integer.parseInt(scans);
		Assert.assertTrue("Value in range", 0 <= scanvalue && scanvalue <= 1000);
	}

	/**
	 * Author:NagarajuKasarla
	 * 
	 * Method to Verify Time in Last Scan
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */
	public void verifyTimeinLastScan(Client client) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='last_scan_title' and @text='Last Scan']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='data_value' and ./parent::*[@id='last_scan']]", 0);
		String lastScan = client.elementGetText("NATIVE","xpath=//*[@id='data_value' and ./parent::*[@id='last_scan']]",0);
		String[] lastScanTime = lastScan.split(":");
		Integer scanvalueHours = Integer.parseInt(lastScanTime[0]);
		Integer scanvalueMin = Integer.parseInt(lastScanTime[1]);
		Assert.assertTrue("Value in range", 00 <= scanvalueHours
				&& scanvalueHours <= 23 && 00 <= scanvalueMin
				&& scanvalueMin <= 59);

		client.verifyElementNotFound(
				"NATIVE",
				"xpath=//*[contains(@text,'"
						+ getUnits().substring(0, 2)
						+ "') and @onScreen='true' and ./parent::*[./parent::*[./parent::*[@id='last_scan']]]]",
						0);
	}

	/**
	 * Author:NagarajuKasarla
	 * 
	 * Method to Verify Time in Logbook Details Screen
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void verifyTimeinLogbookDetails(Client client) {
		verifyPageTitles(client, "logbookDetail");
		client.verifyElementFound("NATIVE", "id=scanResultTime", 0);

		String scanResultDate = client.elementGetText("NATIVE",
				"id=scanResultDate",
				0);
		String LogbookScanResultDate = scanResultDate.replaceAll("\\D+", "");
		int scanvalue = Integer.parseInt(LogbookScanResultDate);
		Assert.assertTrue("Value in range", 1 <= scanvalue && scanvalue <= 31);
		client.verifyElementNotFound("NATIVE",
				"xpath=//*[@id='scanResultDate' and contains(@text,'"
						+ getUnits().substring(0, 2) + "']", 0);
	}







	/**
	 * Author:NagarajuKasarla
	 * 
	 * Method to Verify OS details
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 */
	public void verifyOSDetails(Client client) {
		client.verifyElementFound("NATIVE", "text=${genericOSVersion}", 0);
		String DeviceOs = client.elementGetText("NATIVE", "id=osVersion", 0);
		String osversion = client.run(
				"adb shell getprop ro.build.version.release").trim();
		Assert.assertEquals(DeviceOs, osversion);
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On Calendar Arrow Button
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param direction
	 * 			Which arrow has to be clicked
	 */

	public void clickOnCalanderArrowButton(Client client,String direction) {
		client.waitForElement("NATIVE","xpath=//*[@id='"+direction+"Button' and @onScreen='true']", 0, 10000);
		client.click("NATIVE", "xpath=//*[@id='"+direction+"Button' and @onScreen='true']", 0, 1);
	}





	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Glucose Value Type either show in Whole number(mg/dL) or one
	 *         decimal for (mmol/L) in Logbook Screen
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param count
	 *          set the count value           
	 */
	public void verifyGlucoseValueTypeInLogbook(Client client, int count) {
		verifyPageTitles(client, "logbook");
		if (getUnits().equals("mg/dL")) {
			for (int click = 0; click < count; click++) {
				String str0 = client
						.elementGetText("NATIVE", "xpath=//*[@id='value' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']", click);
				Assert.assertFalse(str0, str0.contains("."));
				System.out.println("mg/dL values displayes in whole number ");
			}
		} else {
			for (int click = 0; click < count; click++) {
				String value = client.elementGetText("NATIVE", "xpath=//*[@id='value' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']",
						click);
				Assert.assertTrue(value, value.contains("."));
				System.out.println("mmol/L values displayes in one decimal  ");
			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify AverageGlucose Value Type either show in Whole number(mg/dL)
	 *         or one decimal for (mmol/L)
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyAverageGlucoseValueType(Client client) {
		String str = client.elementGetText("NATIVE", "xpath=//*[@id='chart_summary' and contains(@text,'Average')]", 0);
		String[] splited = str.split(" ");
		if (getUnits().equals("mg/dL")) {
			Assert.assertFalse(splited[1], splited[1].contains("."));
			System.out.println("mg/dL values displayes in whole number ");
		} else {
			Assert.assertTrue(splited[1], splited[1].contains("."));
			System.out.println("mmol/L values displayes in one decimal  ");
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify TimeInTarget Value Type either show in Whole number(mg/dL) or
	 *         one decimal for (mmol/L)
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyTimeInTargetValueType(Client client) {
		String str = client.elementGetText("NATIVE", "xpath=//*[@id='chart_summary' and contains(@text,'Target Range')]", 0);

		String[] splited = str.split(" ");
		if (getUnits().equals("mg/dL")) {
			Assert.assertFalse(splited[2], splited[2].contains("."));
			Assert.assertFalse(splited[4], splited[4].contains("."));
			System.out.println("mg/dL values displayes in whole number ");
		} else {
			Assert.assertTrue(splited[2], splited[2].contains("."));
			Assert.assertTrue(splited[4], splited[4].contains("."));
			System.out.println("mmol/L values displayes in one decimal  ");
		}
	}




	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify LogBook Details Screen Value
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *            set the Scan Value           
	 */
	public void verifyLogBookDetailsScreenValue(Client client, String value) {
		verifyGlucoseValueInLogBookDetailsScreen(client,value);
		if (!(value.equals("HI") || value.equals("LO"))) {
			if (getUnits().equals("mg/dL")) {
				Assert.assertFalse(value, value.contains("."));
				System.out.println("mg/dL values displayes in whole number ");
			} else  {
				Assert.assertTrue(value, value.contains("."));
				System.out.println("mmol/L values displayes in one decimal  ");
			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to Click on Blood Drop Icon
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickBloodDropIcon(Client client) {
		client.click("NATIVE",
				"xpath=//*[@id='logbook_bg_btn' and @onScreen='true']", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to Set the blood glucose result in mg/dL
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param value
	 *            select the value
	 */
	public void setBGR(Client client, String value) {		
		client.verifyElementFound("NATIVE", "id=manualbg_number", 0);
		client.elementSendText("NATIVE", "id=manualbg_number", 0, value);
		client.closeKeyboard();
		waitFor(client, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to Verify BGR Type show in Whole number(mg/dL)
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyBGRValueType(Client client) {
		String value = client.elementGetText("NATIVE", "xpath=//*[@id='manualbg_number' and @onScreen='true']", 0);
		Assert.assertFalse(value, value.contains("."));
		System.out.println("mg/dL values displayes in whole number ");

	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify Insulin Units
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param insulin
	 *            verify the insulin(Rapid/Long - Acting Insulin)
	 */
	public void verifyInsulinUnits(Client client, String insulin,String value){
		if(insulin.equalsIgnoreCase("Rapid")){		
			client.verifyIn("NATIVE", "xpath=//*[@id='rapidInsulinField' and @text='"+value+"' and @class='android.support.v7.widget.AppCompatEditText']", 0, "Right", "NATIVE", "text=units", 0, 0);
		}else{
			client.verifyIn("NATIVE", "xpath=//*[@id='slowInsulinField' and @text='"+value+"' and @class='android.support.v7.widget.AppCompatEditText']", 0, "Right", "NATIVE", "text=units", 0, 0);

		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click on Carbohydrate Unit
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param carbunit
	 *            set and Click the Carbohydrate units
	 */
	public void clickCarbohydrateUnit(Client client, String carbunit) {
		client.waitForElement("NATIVE", "text=${servings}", 0,
				10000);
		client.click("NATIVE", "text=${" + carbunit + "}", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On NoteIcon
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param page
	 *            Verify the page title
	 */
	public void clickOnNoteIcon(Client client,String page) {
		verifyPageTitles(client, page);
		client.waitForElement("NATIVE",
				"xpath=//*[@id='value' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']", 0, 10000);
		client.click("NATIVE",
				"xpath=//*[@id='value' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']", 0, 1);
		/*client.click("NATIVE",
				"xpath=//*[@id='logbookItemText' and @text='Note' and @onScreen='true']", 0, 1);*/
		verifyPageTitles(client, "logbookDetail");
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify sensor life
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param time
	 *          verify the remain sensor life time
	 */
	public void verifySensorlife(Client client, String time) {
		verifyHomePage(client);
		client.waitForElement("NATIVE", "xpath=//*[@id='sensorLifeText' and @onScreen='true']", 0, 60000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='sensorLifeText' and @onScreen='true' and contains(@text,'"+time+"')]", 0);
	}
	/**
	 * Author:NagarajuKasarla
	 * 
	 * Method to Verify Average Glucose Value
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 */
	public void verifyAverageGlucoseValue(Client client) {
		client.verifyElementFound("NATIVE","xpath=//*[@text='Average Glucose']",0);
		String avgGlucose = client.elementGetText("NATIVE","xpath=//*[@id='chart_summary' and contains(@text,'Average')]",0);
		String[] splited = avgGlucose.split(" ");
		if (getUnits().equals("mg/dL")) {
			int avgValue=Integer.parseInt(splited[1]);
			Assert.assertTrue("glucoseValue", 0<=avgValue && avgValue<=500);	
		}else{
			double avgvalue=Double.parseDouble(splited[1]);
			Assert.assertTrue("glucoseValue", 0.0<=avgvalue && avgvalue<=28.0);
		}
	}

	/**
	 * Author: NagarajuKasarla--
	 * 
	 * Method to Verify Glucose Value and Units In Logbook Screen
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param color           
	 *           verify the color
	 *           
	 * @param glucoseValue
	 *            verify the scanned glucose value
	 */
	public void verifyGlucoseValueInLogbook(Client client,String color, String glucoseValue) {
		verifyPageTitles(client, "logbook");
		client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list' and @class='android.widget.ListView' and @onScreen='true']", "Down", 100, 2000, "NATIVE", "xpath=//*[@text='"+glucoseValue+"']", 0, 1000, 5, false);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + glucoseValue
				+ "']", 0); 
		verifyColorInLogbookList(client, color, glucoseValue);
		if (!(glucoseValue.equals("HI") || glucoseValue.equals("LO"))) {
			verifyGlucoseUnits(client);
		}
	}
	public void verifyColorInLogbookList(Client client, String colorCode, String value){
		if(colorCode.contains("orange")){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0xEF6C00']//following-sibling::*//*[@text='"+value+"']", 0);
		}else if(colorCode.contains("green")){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0x8FCB3A']//following-sibling::*//*[@text='"+value+"']", 0);
		}else if(colorCode.contains("yellow")){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0xFFBC00']//following-sibling::*//*[@text='"+value+"']", 0);
		}else if(colorCode.contains("red")){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0xED1C24']//following-sibling::*//*[@text='"+value+"']", 0);
		}		
	}

	/**
	 * Author:NagarajuKasarla--
	 * 
	 *  Method to Verify GlucoseValue In LogBook Details Screen
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *            verify the glucose value           
	 */
	public void verifyGlucoseValueInLogBookDetailsScreen(Client client, String value) {
		verifyPageTitles(client, "logbookDetail");
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + value+ "']", 0);
		if (!(value.equals("HI") || value.equals("LO"))) {
			verifyGlucoseUnits(client);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Timezone Change details from CST to PST
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyTimezoneChangeDetailsFromCstToPst(Client client) {
		waitFor(client, 2);
		System.out.println("==========="+getCstformat());
		System.out.println("==========="+getPstformat());
		System.out.println("==========="+getTimeZoneValue(LibrelinkConstants.US));
		System.out.println("==========="+getTimeZoneValue(LibrelinkConstants.CST));
		if (!getLanguage().contains("English (United Kingdom)")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getCstformat()+" to "+getPstformat()+" (-2 hrs)']", 0);

		} else {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getTimeZoneValue(LibrelinkConstants.CST)+" to "+getTimeZoneValue(LibrelinkConstants.US)+" (-2 hrs)']", 0);

		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Timezone Change details from PST to AKDT
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */

	public void verifyTimezoneChangeDetailsFromPstToAkdt(Client client) {
		client.sleep(1000);
		System.out.println("==========="+getAkdtformat());
		System.out.println("==========="+getPstformat());
		if (!getLanguage().contains("English (United Kingdom)")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getPstformat()+" to "+getAkdtformat()+" (-1 hr)']", 0);
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list' and @class='android.widget.ListView' and @onScreen='true']", "Down", 100, 2000, "NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getAkdtformat()+" to "+getPstformat()+" (+1 hr)']", 0, 1000, 5, false);		
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getAkdtformat()+" to "+getPstformat()+" (+1 hr)']", 0);

		} else {

			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getTimeZoneValue(LibrelinkConstants.US)+" to "+getTimeZoneValue(LibrelinkConstants.AKDT)+" (-1 hr)']", 0);	  
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list' and @class='android.widget.ListView' and @onScreen='true']", "Down", 100, 2000, "NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getTimeZoneValue(LibrelinkConstants.AKDT)+" to "+getTimeZoneValue(LibrelinkConstants.US)+" (+1 hr)']", 0, 1000, 5, false);		
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getTimeZoneValue(LibrelinkConstants.AKDT)+" to "+getTimeZoneValue(LibrelinkConstants.US)+" (+1 hr)']", 0);

		}

	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set the carbohydrate units and save it
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * 
	 * @param unit
	 *            set the unit to be selected
	 */
	public void setCarbohydrateUnits(Client client, String unit)	{
		client.verifyElementFound("NATIVE","text=Carbohydrate Units", 0);
		client.click("NATIVE", "text=Carbohydrate Units", 0, 1);
		client.waitForElement("NATIVE", "text=${servings}", 0,
				10000);
		client.click("NATIVE", "text=${" + unit + "}", 0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='done' and @onScreen='true']", 0);
		client.click("NATIVE",
				"xpath=//*[@id='done' and @onScreen='true']",
				0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify TimezoneChange Details From PST To AKDT In Logbook Detail screen
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void verifyTimezoneChangeDetailsFromPstToAkdtInLogbookDetail(Client client){
		if (!getLanguage().contains("English (United Kingdom)")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getPstformat()+" to "+getAkdtformat()+" (-1 hr)']", 0);
		} else {
			client.verifyElementFound("NATIVE","xpath=//*[@id='tz_change_message' and @text='Time zone change from "+getTimeZoneValue(LibrelinkConstants.US)+" to "+getTimeZoneValue(LibrelinkConstants.AKDT)+" (-1 hr)']",0);

		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify Timezone Icon
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param index
	 *            Verify the timezone index
	 */
	public void verifyTimezoneIcon(Client client,int index) {
		client.verifyElementFound("NATIVE","xpath=//*[@class='com.librelink.app.ui.widget.mpchart.datadecorators.TimeZoneDecorator' and @onScreen='true']", 0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on settings or More Options
	 * @param client
	 *            
	 * @param subSetting
	 *       select sub settings screen
	 * @throws Exception
	 */
	public void clickOnSettings(Client client,String subSetting) {
		client.waitForElement("NATIVE", "xpath=//*[@class='android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton' and @onScreen='true']", 0,
				10000);
		client.click("NATIVE",
				"xpath=//*[@class='android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton' and @onScreen='true']", 0, 1);
		waitFor(client, 1);
		client.waitForElement("NATIVE", "text=${" + subSetting + "}", 0,10000);
		client.click("NATIVE","text=${" + subSetting + "}", 0, 1);


	}
}