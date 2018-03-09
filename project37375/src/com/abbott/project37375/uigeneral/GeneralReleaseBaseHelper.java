package com.abbott.project37375.uigeneral;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.abbott.project37375.main.BaseHelper;
import com.abbott.project37375.main.LibrelinkConstants;
import com.experitest.client.Client;
import com.experitest.client.InternalException;

public class GeneralReleaseBaseHelper extends BaseHelper {


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Librelink Application Tour Screens
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param pageId
	 *            Set the page to verify
	 * @param pageno
	 * 			page no to be verified           
	 */

	public void verifyAppTourScreens(Client client, int pageno, String pageId) {
		if(pageno==1){
			client.waitForElement("NATIVE","xpath=//*[@id='appTourImage' and @onScreen='true']", 0, 5000);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='appTourImage' and @onScreen='true']", 0);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='appTourText' and @text='']", 0);

		}else{
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@text='"+getLangPropValue(pageId)+"']",
					0);
		}
		client.verifyElementFound("NATIVE", "text="+getLangPropValue("getStartedNow"), 0);
		client.verifyElementFound("NATIVE", "xpath=//*[contains(@text,'"+getLangPropValue("alreadyHaveAccountPromptText")+"')]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[contains(@text,'"+getLangPropValue("account_sign_in_title")+"')]", 0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify Confirm Country Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void verifyConfirmCountryPageDetails(Client client) {
		client.waitForElement("NATIVE", "text=${countryOfOriginTitle}", 0, 2000);
		client.verifyElementFound("NATIVE", "text=${countryOfOriginTitle}", 0);
		client.verifyElementFound("NATIVE", "text=${countryOfOriginExplanation}", 0);
		client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);
		verifyButtonStatus(client, "next", true);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Next or Save or Ok or Cancel Button Options
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param option
	 *            NEXT, OK, SAVE , CANCEL , SUBMIT, ACCEPT, REJECT, Radio Options like Grams and Servings
	 *            
	 * @param click
	 *          true/false
	 *          
	 */
	public void clickOnButtonOptions(Client client, String option,
			boolean click) {
		option = getLangPropValue(option);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+option+"' and @class='android.support.v7.widget.AppCompatButton' and @onScreen='true']", 0);
		if (click){
			client.click("NATIVE", "xpath=//*[@text='"+option+"' and @class='android.support.v7.widget.AppCompatButton' and @onScreen='true']", 0,
					1);
		}
		waitFor(client,1);
		waitForProgress(client);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Terms of Use and Privacy Policy page details
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param page
	 *            Verify the page title
	 * 
	 */
	public void verifyTermsAndPolicyPageDetails(Client client, String page,boolean verifyCheckbox) {
		waitFor(client, 5);
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='scrollView']", 0,
				"view.scrollTo(0, 0);");
		verifyPageTitles(client, page);
		client.verifyElementFound("NATIVE", "text=${reject}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		if (verifyCheckbox) {
			client.runNativeAPICall("NATIVE", "id=scrollView", 0,
					"view.scrollTo(0, 9999999)");
			if(page.equalsIgnoreCase("termsOfUseAcceptanceStatement")){
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='checkBox' and @text='${termsOfUseAcceptanceStatement}']",
						0);
			}else{
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='checkBox' and @text='${privacyNoticeAcceptanceStatement}']",
						0);
			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Checkbox in Terms of Use and Privacy Policy page
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param clickCheckbox
	 *            true/false
	 * 
	 */
	public void clickCheckBox(Client client, boolean clickCheckbox) {
		if(!client.isElementFound("NATIVE", "xpath=//*[@id='checkBox' and @top='true']", 0)){
			try{

				client.runNativeAPICall("NATIVE", "xpath=//*[@id='scrollView']", 0, "view.scrollTo(0, 999999);");

			}  
			catch(Exception e){
				client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='scrollView' and @class='android.widget.ScrollView']", "Down", 0, 2000, "NATIVE", "xpath=//*[@id='checkBox' and @top='true']", 0, 1000, 5, false);
			}
		}
		waitFor(client,2);

		if (clickCheckbox) {
			if(client.isElementFound("NATIVE", "xpath=//*[@id='checkBox' and @checked='false' and @onScreen='true']", 0)){
				client.click("NATIVE",
						"xpath=//*[@id='checkBox' and @onScreen='true']",
						0, 1);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='checkBox' and @checked='true' and @onScreen='true']", 0);
			}
		} 
		clickOnButtonOption(client, "accept", true);
		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Terms of Use \ Privacy Policy page Pop up
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param page
	 *         send page name
	 *            
	 */

	public void verifyPagePopUp(Client client,String page) {
		if(page.equalsIgnoreCase("termsOfUseAcceptanceStatement")){
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='checkBox' and @text='${termsOfUseAcceptanceStatement}' and @top='true']",
					0);
		}else{
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='checkBox' and @text='${privacyNoticeAcceptanceStatement}' and @top='true']",
					0);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Enter first name  last name and DOB details for Create new account
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 * @param fname
	 *            Enter fname as FirstName
	 *            
	 * @param lname
	 *            Enter lname as LastName
	 *            
	 * @param age
	 *            Select Date of Birth from app calendar using age
	 *            
	 * 
	 */

	public void createNewAccountDetails(Client client, String fname,
			String lname, String age) {
		client.elementSendText("NATIVE", "id=firstName", 0, fname);
		client.elementSendText("NATIVE", "id=lastName", 0, lname);
		client.closeKeyboard();
		client.sleep(500);
		client.click("NATIVE", "id=dateOfBirth", 0, 1);
		enterAgePickDOB(client, age);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Select Minor DOB "X" years back to current date
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param age
	 *            choose age
	 */
	public void enterAgePickDOB(Client client, String age) {
		int year = Integer.parseInt(age);
		SimpleDateFormat y = new SimpleDateFormat("MM,d,yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -year);
		String requiredYear = y.format(cal.getTime());
		String[] date = requiredYear.split(",");
		String day = date[1];
		System.out.println(day);
		int month = Integer.parseInt(date[0]);
		int year1 = Integer.parseInt(date[2]);
		int requiredYearIndex = year1 - 1900;
		int requiredMonthIndex = requiredYearIndex * 12 + month - 1;
		System.out.println(requiredMonthIndex);
		client.waitForElement("NATIVE", "id=mdtp_animator", 0, 5000);
		client.click("NATIVE", "id=mdtp_animator", 0, 1);
		client.elementScrollToTableRow(
				"NATIVE",
				"xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView']",
				0, requiredMonthIndex);
		client.sleep(2000);
		client.click(
				"NATIVE",
				"xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView']",
				0, 1);
		client.sleep(1000);
		client.click("NATIVE", "id=mdtp_ok", 0, 1);

	}
	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify Adult Login Screen
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 */
	public void verifyAdultLoginScreen(Client client){
		client.waitForElement("NATIVE", "text=${adultRegistrationTitle}", 0, 5000);
		client.verifyElementFound(
				"NATIVE",
				"text=${enter_numera_data}",
				0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Adult login details for Create an account
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param email
	 *         Enter email from getEmail
	 *                
	 * @param password
	 *            Enter password
	 *            
	 * @param confirmpassword
	 *          enter confirm password
	 *            
	 * @param checkSubscription
	 *            true/false
	 */

	public void adultLoginDetails(Client client, String email, String password,
			String confirmpassword, boolean checkSubscription) {
		client.waitForElement("NATIVE", "id=email", 0, 10000);
		client.sleep(1000);
		client.elementSendText("NATIVE", "id=email", 0, email);
		client.elementSendText("NATIVE", "id=password", 0, password);
		client.elementSendText("NATIVE", "id=confirm", 0, confirmpassword);
		client.closeKeyboard();
		client.sleep(500);
		if (checkSubscription) {
			client.click("NATIVE", "id=yes", 0, 1);
		}
	}

	
	

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Createaccount page
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickOnCreateAccount(Client client) {
		client.waitForElement("NATIVE",
				"text=${createAccountSubmitButtonText}", 0, 10000);
		client.click("NATIVE", "text=${createAccountSubmitButtonText}", 0, 1);
		for (int i = 0; i < 10; i++) {
			client.sleep(3000);
			if (client
					.isElementFound(
							"NATIVE",
							"xpath=//*[contains(@text,'"+getLangPropValue("defaultNetworkErrorMessage")+"')]",
							0)) {
				client.click("NATIVE",
						"xpath=//*[@id='button1' and @text='${ok}']", 0, 1);
				client.click("NATIVE", "text=${createAccountSubmitButtonText}",
						0, 1);
			} else
				break;
		}
		client.waitForElementToVanish("NATIVE", "xpath=//*[@id='progress']", 0,
				60000);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Unit Of Measurement Page details
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyUnitOfMeasurementPageDetails(Client client) {
		client.verifyElementFound("NATIVE", "text=${unitOfMeasurementTitle}", 0);
		if (getCountryCode().equals("Germany")) {
			client.verifyElementFound("NATIVE",
					"text=${unitOfMeasurementTopTextForSetup}", 0);
			client.verifyElementFound("NATIVE",
					"text=${mgPerDeciliterRadioText}", 0);
			client.verifyElementFound("NATIVE",
					"text=${mmolPerLiterRadioText}", 0);
			client.verifyElementFound("NATIVE", "text=${unitOfMeasureWarning}",
					0);
			client.verifyElementFound("NATIVE", "text=${next}", 0);
			unitOfMeasurementGerman(client);
			verifyButtonStatus(client, "next", true);
		} else {
			client.verifyElementFound("NATIVE",
					"text=${unitOfMeasurementFixedTopText}", 0);
			client.verifyElementFound("NATIVE",
					"text=${unitOfMeasurementFixedCountryText}", 0);
			client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);
			client.verifyElementFound("NATIVE",
					"text=${unitOfMeasurementFixedText}", 0);
			client.verifyElementFound("NATIVE", "text=" + getUnits(), 0);
			verifyButtonStatus(client, "next", true);
		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to select Unit of measurement when both units are present
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */
	public void unitOfMeasurementGerman(Client client){
		client.click("NATIVE", "xpath=//*[contains(@text,'"+getUnits()+"')]", 0, 1);
		waitFor(client,1);


	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Target Glucose Range Page details
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyTargetGlucoseRangePageDetails(Client client) {
		client.verifyElementFound("NATIVE", "text=${targetGlucoseRangeTitle}",
				0);
		client.verifyElementFound("NATIVE",
				"text=${targetGlucoseRangeTopTextForSetup}", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='rangeLow']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='rangeHigh']", 0);
		client.verifyElementFound("NATIVE",
				"text=${targetGlucoseRangeUnitText}", 0);

		if (getUnits().equalsIgnoreCase("mg/dL")) {

			client.verifyElementFound("NATIVE", "text=${mgdl}", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='100']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='140']", 0);
		} else if (getUnits().equalsIgnoreCase("mmol/L")
				&& getLanguage().contains("Deutsch")) {
			client.verifyElementFound("NATIVE", "text=${mmol}", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='5,6']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='7,8']", 0);
		} else {
			client.verifyElementFound("NATIVE", "text=${mmol}", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='5.6']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='numberpicker_input' and @text='7.8']", 0);
		}

		client.verifyElementFound("NATIVE", "text=${next}", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Swipe on report
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param direction
	 * 		Provide the direction to swipe
	 */

	public void swipeOnReport(Client client, String direction) {
		client.elementSwipe("NATIVE", "xpath=//*[@class='android.widget.FrameLayout' and @hidden='false']", 0, direction, 100, 500);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify carbohydrate Units Page details
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param units
	 *         verify units grams/servings(portions)        
	 *         
	 *         
	 */

	public void verifyCarbohydrateUnitsPageDetails(Client client,String units) {
		client.waitForElement("NATIVE", "text=${carbohydrateUnitsTitle}", 0,
				10000);

		if (units.equalsIgnoreCase("Grams")) {
			client.click("NATIVE", "text=${grams}", 0, 1);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${grams}' and @checked='true']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeMessage' and @enabled='false']",
					0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${servings}' and @checked='false']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeBar' and @enabled='false']", 0);
		} else {
			client.click("NATIVE", "text=${servings}", 0, 1);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${servings}' and @checked='true']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeMessage' and @enabled='true']",
					0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${grams}' and @checked='false']", 0);

			client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
					"slide", "10");

			if (getCountryCode().equals("France")
					|| getCountryCode().equals("Deutschland")) {

				String servingsWithGramsEquivalent = getLangPropValue("serving_size_in_grams");
				servingsWithGramsEquivalent = servingsWithGramsEquivalent
						.replace("%.1f", "15,0");
				client.verifyElementFound("NATIVE", "text="
						+ servingsWithGramsEquivalent, 0);

			} else {

				String servingsWithGramsEquivalent = getLangPropValue("serving_size_in_grams");
				servingsWithGramsEquivalent = servingsWithGramsEquivalent
						.replace("%.1f", "15.0");
				client.verifyElementFound("NATIVE", "text="
						+ servingsWithGramsEquivalent, 0);

			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Select Grams/servings in carbohydrate Units Page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param units
	 *            Select either Grams/Servings
	 *          
	 */

	public void selectCarbohydrateUnits(Client client, String units) {
		client.waitForElement("NATIVE", "text=${carbohydrateUnitsTitle}", 0,
				10000);

		if (units.equalsIgnoreCase("Grams")) {
			client.click("NATIVE", "text=${grams}", 0, 1);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${grams}' and @checked='true']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeMessage' and @enabled='false']",
					0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${servings}' and @checked='false']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeBar' and @enabled='false']", 0);
		} else {
			client.click("NATIVE", "text=${servings}", 0, 1);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${servings}' and @checked='true']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='servingSizeMessage' and @enabled='true']",
					0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${grams}' and @checked='false']", 0);

			client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
					"slide", "10");

			if (getCountryCode().equals("France")
					|| getCountryCode().equals("Deutschland")) {

				String servingsWithGramsEquivalent = getLangPropValue("serving_size_in_grams");
				servingsWithGramsEquivalent = servingsWithGramsEquivalent
						.replace("%.1f", "15,0");
				client.verifyElementFound("NATIVE", "text="
						+ servingsWithGramsEquivalent, 0);

			} else {

				String servingsWithGramsEquivalent = getLangPropValue("serving_size_in_grams");
				servingsWithGramsEquivalent = servingsWithGramsEquivalent
						.replace("%.1f", "15.0");
				client.verifyElementFound("NATIVE", "text="
						+ servingsWithGramsEquivalent, 0);

			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify My Glucose Page information
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param screenName
	 *           set the Screen Name         
	 */

	public void verifyMyGlucoseInfoPage(Client client, String screenName) {
		if(screenName.contains("setup")){
			client.verifyElementFound("NATIVE",
					"text=${myGlucoseExplanationTitle}", 0);
			client.verifyElementFound("NATIVE",
					"text=${myGlucoseExplanationTopText}", 0);
			verifyButtonStatus(client, "next", true);
		}else{
			client.verifyElementFound("NATIVE",
					"text=${helpItemTitleGlucoseHelp}", 0);
		}
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='${myGlucoseExplanationResultCallouts}']",
				0);
		client.verifyElementFound("NATIVE", "id=next", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Glucose Trend arrow Page Contents
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * @param screenName
	 *           set the Screen Name         
	 */

	public void verifyGlucoseTrendArrow(Client client, String screenName) {
		if(screenName.contains("setup")){
			client.verifyElementFound("NATIVE",
					"text=${trendExplanationTitle}", 0);
			client.verifyElementFound("NATIVE","text=${trendExplanationTopText}",0);
			verifyButtonStatus(client, "next", true);
		}else{
			client.verifyElementFound("NATIVE",
					"text=${helpItemTitleGlucoseHelp}", 0);
		}
		client.verifyElementFound("NATIVE", "text=${trendExplanationRisingQuickly}", 0);
		client.verifyElementFound("NATIVE", "text=${trendExplanationRising}", 0);
		client.verifyElementFound("NATIVE", "text=${trendExplanationStable}",0);
		client.verifyElementFound("NATIVE", "text=${trendExplanationFalling}", 0);
		client.verifyElementFound("NATIVE", "text=${trendExplanationFallingQuickly}", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify and Click How to Apply new sensor link
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 */

	public void verifyandClickHowToApplyNewSensorLink(Client client) {	
		client.waitForElement("NATIVE", "text=${applyNewSensorDetail}", 0, 1000);
		client.click(
				"NATIVE",
				"xpath=//*[@id='howToApply' and @textColor='0xFFFFFF' and @onScreen='true']",
				0,1);	
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify How to Apply new sensor pages
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 */

	public void verifyHowToApplyNewSensorSteps(Client client) {
		client.waitForElement("NATIVE", "text=${applySensorTextStep1}", 0, 1000);
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep1}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep1}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep2}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep2}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep3}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep3}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep4}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep4}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep5}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep5}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep6}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep6}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep7}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep7}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep8}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep8}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep9}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep9}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${applySensorTitleStep10}", 0);
		client.verifyElementFound("NATIVE", "text=${applySensorTextStep10}", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify How to Scan a sensor Pages
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */

	public void verifyHowToScanSensorSteps(Client client) {
		client.waitForElement("NATIVE", "text=${scanSensorTitle}", 0, 10000);
		client.verifyElementFound("NATIVE", "text=${scanSensorTitleStep1}", 0);
		client.verifyElementFound("NATIVE", "text=${scanSensorTextStep1}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${scanSensorTitleStep2}", 0);
		client.verifyElementFound("NATIVE", "text=${scanSensorTextStep2}", 0);
		swipePage(client, "Right");
		client.verifyElementFound("NATIVE", "text=${scanSensorTitleStep3}", 0);
		client.verifyElementFound("NATIVE", "text=${scanSensorTextStep3}", 0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify User's Manual
	 *         
	 * @param client
	 *        Integrate SeeTestAutomation
	 */

	public void verifyUsersManualGuide(Client client) {
		waitFor(client,1);
		client.waitForElementToVanish("NATIVE","text=${helpItemTitleUserGuide}",0, 80000);
		waitFor(client,30);
		client.verifyElementFound("NATIVE", "text=${helpItemTitleUserGuide}", 0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Get the Calendar date
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 * @throws ParseException
	 * 			Throws Parse Exception for date selection
	 *@return date
	 *		Returns the date in String format
	 */
	public String getCalendarDate(Client client) throws ParseException {
		String systemDateTime = client.elementGetText("NATIVE",
				"xpath=//*[@id='logbook_date_text' and @textColor='0xFFFFFF']", 0);
		SimpleDateFormat deviceFormat = new SimpleDateFormat("MMMMM d, yyyy");
		if (getLanguage().contains("English (U.K.)") ) {
			deviceFormat = new SimpleDateFormat("d MMMMM yyyy");
		}
		Date d = deviceFormat.parse(systemDateTime);
		deviceFormat.applyPattern("dd.MM.yyyy");
		String devicedate = deviceFormat.format(d);
		return devicedate;

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On Created Note
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param logBookTime
	 *            set the note time for click
	 */
	public void clickCreatedNote(Client client, String logBookTime) {
		logBookTime=setAMPM(client,logBookTime);
		client.sleep(3000);
		client.click("NATIVE", "xpath=//*[@text='" + logBookTime + "']", 0,1);
		client.sleep(1000);


	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Setting AM/PM
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param noteTime
	 *                set the notetime       
	 */
	public String setAMPM(Client client, String noteTime){
		if (getCountryCode().contains("United Kingdom")&&! getDeviceOSVer().contains("6.")) {
			noteTime = noteTime.replace("PM", "pm");
			noteTime = noteTime.replace("AM", "am");
		}else if (getCountryCode().contains("United Kingdom")){
			noteTime = noteTime.replace("PM", "p.m.");
			noteTime = noteTime.replace("AM", "a.m.");
		}
		else if(!getCountryCode().contains("United Kingdom")&&getLanguage().contains("English")){
			//no change
		}else{
			noteTime = noteTime.substring(0, 4);
		}
		return noteTime;
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Delete Note
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param addNoteTime
	 *                delete the note using  note time       
	 */
	public void deleteNote(Client client,String addNoteTime) {

		client.waitForElement("NATIVE",
				"xpath=//*[@id='note_discard' and @onScreen='true']", 0, 5000);

		client.click("NATIVE",
				"xpath=//*[@id='note_discard' and @onScreen='true']", 0, 1);
		waitFor(client, 1);
		client.verifyElementNotFound("NATIVE", "xpath=//*[@text= '"
				+ addNoteTime + "']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 *  Method to Select The Note Attribute
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param attribute
	 *         set the Attribute(Food/Rapid Acting-Insulin/Long Acting-Insulin/Exercise)
	 * 
	 */

	public void selectNoteAttribute(Client client, String attribute) {
	    if(client.isElementFound("NATIVE", "xpath=//*[@id='"+attribute+"' and @checked='false']", 0)){
		client.click("NATIVE", "xpath=//*[@id='"+attribute+"']", 0, 1);
		waitFor(client,1);
	}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Food In LogBook Detail Page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param mealType
	 *            set the meal type(breakfast/lunch/dinner/snack)
	 * @param carbUnit
	 *            Set the CarbUnit
	 * @param carbAmount
	 *            Set the CarbAmount
	 */
	public void verifyFoodInLogBookDetailPage(Client client, String mealType,
			String carbUnit, String carbAmount) {
		String value=null;
		if(mealType!=null){
			value = getLangPropValue(mealType);
		}else{
			value = getLangPropValue("food");
		}
		if (carbUnit.equals("grams")) {
			value = value+" ("+carbAmount+getLangPropValue("gramsSymbol")+")";

		} else if (carbUnit.equals("servings") || carbUnit.equals("portions")) {
			value = value+" ("+carbAmount+getLangPropValue("servingsSymbol")+")";

		}

		client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+value+"')]", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify the Food Error
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * @param units
	 *        set the Units
	 *
	 */
	public void verifyFoodError(Client client, String units) {
		String value=null;
		if (units.equalsIgnoreCase("grams")) {
			value = getLangPropValue("carbsGramsError").replace("%2$@", "400");
		} else {
			value = getLangPropValue("carbsServingsError").replace("%2$@", "40");
		}
		value = value.replace("%1$@", "0");
		waitFor(client, 2);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='"+value+"']",
				0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for Edit the Note
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void editNote(Client client) { 
		client.waitForElement("NATIVE",
				"xpath=//*[@id='lbdetail_note_btn' and @onScreen='true']", 0,
				10000);
		waitFor(client, 1);
		client.click("NATIVE",
				"xpath=//*[@id='lbdetail_note_btn' and @onScreen='true']", 0, 1);
		client.waitForElement("NATIVE",
				"xpath=//*[@id='note_discard' and @onScreen='true']", 0, 10000);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Get TimeZone value As GMT format
	 * 
	 * @param zone
	 *            Set the Zone
	 *            
	 * @param selecteddate
	 *         set the date
	 * @return timezone
	 * 		Returns the time zone value          
	 */
	public String getTimeZoneValueForSelectedDate(String zone, String selecteddate) {
		String timeZoneString;
		Calendar c = Calendar.getInstance();

		if(selecteddate!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Date date = null;
			try {
				date = sdf.parse(selecteddate);
			} catch (ParseException e) {
		
				e.printStackTrace();
			}
			c.setTime(date);
			c.add(Calendar.HOUR, 2);
		}else{
			c.setTime(new Date());
		}

		Date date = c.getTime();
		System.out.println("SelectedDate:"+date);
		TimeZone tz = TimeZone.getTimeZone(zone);
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
				- TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		if (tz.inDaylightTime(date)) {
			hours = hours + 1;
		}

		if (hours > 0) {
			timeZoneString = String.format("GMT+%s:%02d", hours, minutes);
		} else {

			timeZoneString = String.format("GMT%s:%02d", hours, minutes);
		}

		timeZoneString = timeZoneString.replace(":00", "");
		return timeZoneString;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for click Calendar Arrow Button
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param count
	 *         set count for click
	 *
	 */
	public void clickCalendarArrow(Client client, int count) {
		if(count<0){
			for (int click = 0; click > count; click--) {
				client.click(
						"NATIVE",
						"xpath=//*[@id='backButton' and @class='android.support.v7.widget.AppCompatImageButton' and @top='true']",
						0, 1);


			}
		}else{
			for (int click = 0; click < count; click++) {
				client.click(
						"NATIVE",
						"xpath=//*[@id='forwardButton' and @class='android.support.v7.widget.AppCompatImageButton' and @top='true']",
						0, 1);

			}
		}
		waitFor(client,1);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Add Note for Insulin
	 * 
	 * @param client
	 *         Integrate SeeTestAutomationo
	 *         
	 * @param indexOfTextField
	 *            set the index value   
	 *                
	 * @param value
	 *            set the glucose value
	 */

	public void addNoteForInsulin(Client client, String insulin,String value) {
		if(insulin.equalsIgnoreCase("rapidActingInsulin")){
			client.click("NATIVE","id=rapidInsulinField", 0, 1);	
			client.elementSendText("NATIVE", "id=rapidInsulinField", 0, value);
			client.closeKeyboard();
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='rapidInsulinField' and @text='" + value + "']",
					0);
		}else{
			client.click("NATIVE","id=slowInsulinField", 0, 1);
			client.elementSendText("NATIVE", "id=slowInsulinField", 0, value);
			client.closeKeyboard();
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='slowInsulinField' and @text='" + value + "']",
					0);
		}
	}

	/**
	 * Author: NagarajuKasarlala
	 * 
	 * Method to Verify LogBook Detail Page for Insulin Note
	 * 
	 * @param client
	 *         Integrate SeeTestAutomationo  
	 *         
	 * @param insulinType
	 *            set the insulin type
	 *            
	 * @param insulinUnit
	 *            set the insulin Units
	 */

	public void verifyInsulinLogBookDetailPage(Client client,
			String insulinType, String insulinUnit) {

		String value = getLangPropValue(insulinType);
		if(insulinUnit!=null){

			if ((insulinUnit.equals("1"))) {
				value = value+" ("+getLangPropValue("insulinUnits_one").replace("%1$@", "1")+")";
			} else {
				value = value+" ("+getLangPropValue("insulinUnits_other").replace("%1$@", insulinUnit)+")";

			}
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+ value + "' and @top='true']", 0);
	}

	/** Author: NagarajuKasarla
	 * 
	 * Method to verify the Insulin Error
	 * 
	 * @param client
	 *            Integrate SeeTestAutomationo
	 *
	 */
	public void verifyInsulinError(Client client) {

		String value = getLangPropValue("insulinDoseError").replace("%1$d", "200");
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='"+value+"']",
				0);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to verify added manual BG in Logbook list
	 *         
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param logBookTime
	 *            set the time
	 *            
	 * @param value
	 *          set the value
	 *          
	 *@throws ParseException
	 *		Throws parse exception for setting date
	 */
	public void verifyManualBGinLogbookList(Client client, String value, String logBookTime) throws InternalException, ParseException {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + value + "']",
				0);
		client.verifyElementFound("NATIVE", "text=" + getUnits(), 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + logBookTime
				+ "']", 0);
	}





	/**
	 * Author: NagarajuKasarla
	 * 
	 *    Method to verify BG error
	 *         
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	public void verifyBGError(Client client) {
		String value = getLangPropValue("carbsGramsError").replace("%1$@", "20").replace("%2$@", "500");
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='"+value+"']",
				0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Exercise Note with Intensity with set time on LogBook Detail Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param intensity
	 *            set intensity
	 * @param hr
	 *            set hour
	 * @param min
	 *            set minutes
	 */
	public void verifyExerciseIntensityInLogBookDetailPage(Client client,
			String intensity, String hour, String minute) {
		if (minute.equals("0")) {
			if (hour.equals("1")) {

				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} ("
								+ abbrevDurationHrs_singular + ")']", 0);

			} else {

				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_plural");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%d", hour);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} (" + abbrevDurationHrs_plural
								+ ")']", 0);
			}

		} else if (hour.equals("0")) {
			if (minute.equals("1")) {

				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} ("
								+ abbrevDurationMins_singular + ")']", 0);

			} else {

				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_plural");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} (" + abbrevDurationMins_plural
								+ ")']", 0);
			}
		} else {

			if (minute.equals("1") && (hour.equals("1"))) {

				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");
				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");

				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} ("
								+ abbrevDurationHrs_singular + " "
								+ abbrevDurationMins_singular + ")']", 0);

			} else if (minute.equals("1")) {

				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_plural");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%d", hour);

				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");

				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} (" + abbrevDurationHrs_plural
								+ " " + abbrevDurationMins_singular + ")']", 0);

			} else if (hour.equals("1")) {

				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");

				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_plural");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);

				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} ("
								+ abbrevDurationHrs_singular + " "
								+ abbrevDurationMins_plural + ")']", 0);

			} else {

				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_other");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%d", hour);
				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_other");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);

				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='lbdetail_note_description' and @text='${exercise} ${"
								+ intensity + "} (" + abbrevDurationHrs_plural
								+ " " + abbrevDurationMins_plural + ")']", 0);

			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for Unselect Note Attribute
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param attribute
	 *  	   set the Attribute
	 * 
	 */

	public void unSelectNoteAttribute(Client client, String attribute) {
		client.click("NATIVE", "xpath=//*[@id='"+attribute+"']", 0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='"+attribute+"' and @checked='false']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *    Method for  Enter Notes Comments
	 *    
	 * @param client
	 *            Integrate SeeTestAutomation 
	 *            
	 * @param notesComments
	 *            set the comments
	 */
	public void enterNotesComments(Client client, String notesComments) {
		client.swipeWhileNotFound("Down", 0, 2000, "NATIVE", "xpath=//*[@id='etext_note_comments']", 0, 1000, 5, false);
		client.elementSendText("NATIVE",
				"xpath=//*[@id='etext_note_comments']", 0, notesComments);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *   Method to  Verify Notes Comments
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation  
	 * @param notesComments
	 *            set the comments
	 */
	public void verifyNotesComments(Client client, String notesComments) {
		client.verifyElementFound("NATIVE",
				"text="+notesComments, 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Click Arrow On Top Left Of The Graph
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param count
	 *            Number of times to Click on Top Left Arrow
	 * 
	 */

	public void clickArrowOnDateBar(Client client,String direction, int count) {
		if (client.isElementFound("NATIVE", "xpath=//*[@id='dateBar' and @onScreen='true']", 0)) {
			for (int i = 1; i <= count; i++) {
				client.click("NATIVE", "xpath=//*[@id='"+direction+"_button' and @onScreen='true']", 0, 1);
			}
			waitFor(client,1);
		}
	}

	public String getNewDate(Client client, int count) throws ParseException {
		String currentDate = client.elementGetText("NATIVE", "xpath=//*[@class='UILabel' and @textColor='0x000000' and @top='true' and ./parent::*[@class='UIView' ]]", 0);
		SimpleDateFormat sdf;
		Date date;
		String dateToBeDisplayed=null;
		Calendar c1 = null;
		if (getLanguage().contains("U.S.")) {
			sdf = new SimpleDateFormat("MMMMM d, yyyy");
			date = sdf.parse(currentDate);
			c1 = Calendar.getInstance();
			c1.setTime(date);
			c1.add(Calendar.DATE, count);
			dateToBeDisplayed = sdf.format(c1.getTime());

		} else if (getLanguage().contains("U.K.")) {
			sdf = new SimpleDateFormat("d MMMMM yyyy");
			date = sdf.parse(currentDate);
			c1 = Calendar.getInstance();
			c1.setTime(date);
			c1.add(Calendar.DATE, count);
			dateToBeDisplayed = sdf.format(c1.getTime());

		}
		return dateToBeDisplayed;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for Sign-In to the App
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param email
	 *            Enter email
	 * @param pwd
	 *            Enter Password
	 */
	public void signIn(Client client, String email, String pwd) {

		client.waitForElement("TEXT", "LibreLink", 0, 1000);
		client.verifyElementFound("NATIVE", "text=${signIn}", 0);
		client.click("NATIVE", "text=${signIn}", 0, 1);

		client.waitForElement("NATIVE", "text=${signIn}", 0, 10000);
		client.verifyElementFound("NATIVE", "text=${normal_user_login_text}", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='email']", 0, email);
		client.elementSendText("NATIVE", "xpath=//*[@id='password']", 0, pwd);
		client.click("NATIVE", "xpath=//*[@id='submit']", 0, 1);
		client.waitForElementToVanish("NATIVE",
				"xpath=//*[@id='progress']", 0, 60000);
		if(client.isElementFound("NATIVE", "xpath=//*[contains(@text,'${defaultNetworkErrorMessage}')]", 0)){
			client.click("NATIVE", "xpath=//*[@id='button1' and @text='${ok}']", 0, 1);
			launch(client);
			signIn(client, email,pwd);
		}

		if (client.isElementFound("NATIVE", "xpath=//*[@id='message']", 0)) {
			client.click("NATIVE",
					"xpath=//*[@text='${ok}' and @hidden='false']", 0, 1);
		}
		client.sleep(3000);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify default settings
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * @param units
	 *           Set the Units
	 * @param value
	 *          Set the Value           
	 */
	public void defaultSettings(Client client, String units, double value) {

		client.verifyElementFound("NATIVE", "text=${unitOfMeasurementTitle}", 0);

		if (getapkPackage().equals("com.freestylelibre.app.de")
				|| getapkPackage().equals("com.freestylelibre.app.om")
				|| getapkPackage().equals("com.freestylelibre.app.bh")) {

			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.click(
						"NATIVE",
						"xpath=(//*[@id='radioGroup']/*[@class='android.support.v7.widget.AppCompatRadioButton'])[1]",
						0, 1);
				client.click("NATIVE", "id=next", 0, 1);
				client.verifyElementFound("NATIVE",
						"text=${settingsUnitOfMeasureConfirmationMessage}", 0);
				client.verifyElementFound("NATIVE", "text=${mgdl}", 0);
				client.click("NATIVE", "id=button1", 0, 1);

			} else {
				client.click(
						"NATIVE",
						"xpath=(//*[@id='radioGroup']/*[@class='android.support.v7.widget.AppCompatRadioButton'])[2]",
						0, 1);
				client.click("NATIVE", "id=next", 0, 1);
				client.verifyElementFound("NATIVE",
						"text=${settingsUnitOfMeasureConfirmationMessage}", 0);
				client.verifyElementFound("NATIVE", "text=${mmol}", 0);
				client.click("NATIVE", "id=button1", 0, 1);
			}

		} else {
			client.click("NATIVE", "id=next", 0, 1);
		}

		client.verifyElementFound("NATIVE", "text=${targetGlucoseRangeTitle}",
				0);
		client.click("NATIVE", "id=next", 0, 1);
		client.verifyElementFound("NATIVE", "text=${carbohydrateUnitsTitle}", 0);
		if (units.equals("grams")) {
			client.click("NATIVE", "text=${grams}", 0, 1);
		} else {
			client.click("NATIVE", "text=${servings}", 0, 1);
		}
		client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
				"slide", "5");
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='servingSizeText' and @text='1 serving = 12.5 grams']",
				0);
		client.click("NATIVE", "id=next", 0, 1);
		if (!getDeviceOSVer().contains("4.")) {
			if (client.isElementFound("NATIVE", "text=${scanSoundsTitle}", 0)) {
				client.click("NATIVE", "text=${scanSoundsOsDefault}", 0, 1);
				client.click("NATIVE", "id=next", 0, 1);
			}
		}
		if (client.isElementFound("NATIVE",
				"text=${myGlucoseExplanationTitle}", 0)) {
			client.click("NATIVE", "id=next", 0, 1);
		}
		if (client.isElementFound("NATIVE", "text=${trendExplanationTitle}", 0)) {
			client.click("NATIVE", "id=next", 0, 1);
		}

	}	

	/**
	 * Author: NagarajuKasarla
	 *            
	 * 
	 * Method for Add reminder
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void addReminder(Client client){
		client.click("NATIVE", "xpath=//*[@id='addReminderButton']", 0, 1);
		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * 
	 * Method to Edit the reminder 
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param reminderName
	 *             select the reminder name to edit           
	 */
	public void editReminder(Client client, String reminderName){
		selectReminder(client,reminderName,true);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * 
	 * Method for Enter Reminder details
	 * @param client
	 * 
	 * @param Name
	 *            send the name for reminder
	 *  * @param isAdvance
	 *            if advance time true/false           
	 * @param hrs
	 *            set the hours
	 * @param mins
	 *            set the minutes
	 * @param ampm
	 *            choose am or pm
	 *  * @param isRepeat
	 *             if Repeat alarm true/false                
	 */
	public void enterReminderdetails(Client client, String Name,boolean isAdvance,
			int hrs, int mins, String ampm,boolean isRepeat) {
		client.verifyElementFound("NATIVE", "id=alarmName", 0);
		client.sendText("{CLOSEKEYBOARD}");
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='alarmCancelButton']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='alarmDoneButton']",
				0);

		client.verifyElementFound("NATIVE", "text=Repeating", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='alarmTime']", 0);
		if (client.isElementFound("NATIVE", "id=alarmName")) {
			client.elementSendText("NATIVE", "id=alarmName", 0, Name);

		}

		if(isAdvance){
			SimpleDateFormat dateFormatHrs = new SimpleDateFormat("HH");
			String formattedDatehrs = dateFormatHrs.format(new Date()).toString();
			int hr = Integer.parseInt(formattedDatehrs);
			SimpleDateFormat dateFormatMins = new SimpleDateFormat("mm");
			String formattedDateMins = dateFormatMins.format(new Date()).toString();
			int min1 = Integer.parseInt(formattedDateMins);
			hr = hr+hrs;
			int minute = min1 + mins;

			if (minute > 60) {
				hrs = hr + 1;
				mins = minute - 60;
			} else if (minute < 60) {
				hrs = hr;
				mins = minute;
			} else {
				hrs = hr + 1;
				mins = 00;
			}
			if(hrs>23){
				hrs=hrs-23;
			}

			reminderSetTime(client, hrs, mins, ampm);
		}else{
			reminderSetTime(client, hrs, mins, ampm);
		}


		if(isRepeat){
			if(!(client.isElementFound("NATIVE", "xpath=//*[@id='alarmRepeatSwitch' and @checked='true']", 0))){
				client.click("NATIVE", "id=alarmRepeatSwitch", 0, 1);
				waitFor(client,1);
				client.click("NATIVE","xpath=//*[@id='alarmRepeatAll' and @text='"+getLangPropValue("all")+"']", 0, 1);
				waitFor(client,1);
			}
		}
		waitFor(client, 1);
		client.click("NATIVE", "xpath=//*[@id='alarmDoneButton']", 0, 1);
		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * 
	 * Method to Set the reminder time
	 * @param client
	 * 
	 * 
	 * @param hrs
	 *            set the hours
	 * @param mins
	 *            set the minutes
	 *
	 * @param ampm
	 *            set AM/PM
	 */
	public void reminderSetTime(Client client, int hrs, int mins, String ampm) {

		System.out.println("======hrs======"+hrs);
		System.out.println("=======mins====="+mins);
		System.out.println("============"+ampm);


		if (client.isElementFound("NATIVE", "xpath=//*[@id='alarmTime']", 0)) {
			client.click("NATIVE", "xpath=//*[@id='alarmTime']", 0, 1);
			client.runNativeAPICall("NATIVE",
					"xpath=//*[@id='mdtp_time_picker']", 0,
					"view.setTime(new com.wdullaer.materialdatetimepicker.time.Timepoint("
							+ hrs + "," + mins + "))");
			if (ampm != null) {
				if (ampm.equalsIgnoreCase("AM")) {
					client.runNativeAPICall("NATIVE",
							"xpath=//*[@id='mdtp_time_picker']", 0,
							"view.setAmOrPm(0)");
				} else if (ampm.equalsIgnoreCase("PM")) {
					client.runNativeAPICall("NATIVE",
							"xpath=//*[@id='mdtp_time_picker']", 0,
							"view.setAmOrPm(1)");
				}
			}
		}
		client.click("NATIVE", "xpath=//*[@id='mdtp_ok']", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to verify Reminder notification 
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation  
	 * @param name
	 *            choose the reminder name
	 *     
	 * @param openReminder
	 *            true/false
	 *
	 */
	public void verifyReminderNotification(Client client, String name, boolean openReminder) {

		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+getLangPropValue("alarmExpired")+"' and ./parent::*[./following-sibling::*[./*[@text='"+name+"']]]]", 0);
		if(openReminder){
			client.elementSwipe("NATIVE", "xpath=//*[@text='"+getLangPropValue("alarmExpired")+"' and ./parent::*[./following-sibling::*[./*[@text='"+name+"']]]]", 0, "Left", 100, 500);
			waitFor(client,5);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to verify Reminder switch is enabled/disabled
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param name
	 *         reminder name
	 *  
	 * @param isEnabled
	 *         true/false        
	 *         
	 */
	public void verifyReminderStatus(Client client, String name, boolean isEnabled) {
		selectReminder(client,name,false);


		if(isEnabled){
			client.verifyIn(
					"NATIVE",
					"text=" + name,
					0,
					"Right",
					"NATIVE",
					"xpath=//*[@knownSuperClass='android.widget.CompoundButton' and @checked='true']",
					0, 0);
		}else{
			client.verifyIn(
					"NATIVE",
					"text=" + name,
					0,
					"Right",
					"NATIVE",
					"xpath=//*[@knownSuperClass='android.widget.CompoundButton' and @checked='false']",
					0, 0);
		}
	}


	/**
	 * Author: NagarajuKasarla-
	 *            
	 * Method to swipe down and select the reminder
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param reminderName
	 *            reminderName to be selected
	 *            
	 * @param click
	 *            true/false
	 *            
	 */
	public void selectReminder(Client client, String reminderName, boolean click) {
		if(!client.isElementFound("NATIVE", "xpath=//*[@text='"+getLangPropValue("scanSensor")+"' and @onScreen='true']", 0)){
			client.swipeWhileNotFound("Up", 500, 1000, "NATIVE", "xpath=//*[@text='"+getLangPropValue("scanSensor")+"' and @top='true']", 0, 1000, 3, false);
		}
		if(!client.isElementFound("NATIVE","text=" + (reminderName),0)){
			client.elementSwipeWhileNotFound("NATIVE", "id=reminderList", "Down",
					300, 300, "NATIVE", "text=" + (reminderName), 0, 1000, 5, false);
			client.verifyElementFound("NATIVE", "xpath=//*[@text='"+(reminderName)+"' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']", 0);
		}
		if(click){
			waitFor(client,1);
			client.click("NATIVE", "xpath=//*[@text='"+reminderName+"' and @class='android.support.v7.widget.AppCompatTextView' and @onScreen='true']", 0, 1);

		}

		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to verify enable or disable reminder
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param name
	 *            choose the reminder
	 *
	 * @param enable
	 *            true/false
	 *            
	 */
	public void enableordisableReminder(Client client, String name, boolean enable) {
		selectReminder(client,name,false);
		if(enable==true){
			if(!(client.isElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.SwitchCompat' and @checked='true' and ./preceding-sibling::*[@text='"+name+"']]", 0))){
				client.clickIn("NATIVE", "text="+name, 0, "Right", "NATIVE", "class=android.support.v7.widget.SwitchCompat", 0, 0, 0, 1);
			}

		}else if(enable==false){
			if(client.isElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.SwitchCompat' and @checked='true' and ./preceding-sibling::*[@text='"+name+"']]", 0)){
				client.clickIn("NATIVE", "text="+name, 0, "Right", "NATIVE", "class=android.support.v7.widget.SwitchCompat", 0, 0, 0, 1);
			}
		}

		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to verify  Reminder Repeat option
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param name
	 *            reminder name
	 * 
	 *            
	 */
	public void verifyReminderRepeat(Client client, String name) {
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and @top='true' and ./preceding-sibling::*[@text='"+name+"']]", 0);

	}

	/**
	 * Author: NagarajuKasarla-
	 *            
	 * Method to verify Next Reminder with BackGround Color
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param name
	 *            reminder name
	 * 
	 *            
	 */

	public void verifyNextReminderwithBackGroundColor(Client client,
			String name) {
		client.waitForElement("NATIVE", "xpath=//*[@id='nextReminderText' and contains(@text,'" + name + "')]", 0, 180000);

		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='nextReminderText' and contains(@text,'" + name + "')]", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='nextReminderText' and @backColor='0x138BE8']",
				0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to delete  a single reminder
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param name
	 *            choose the reminder name
	 *            
	 */

	public void deleteReminder(Client client, String name) {
		selectReminder(client,name,false);
		client.elementSwipe("NATIVE", "text=" + (name), 0, "Left", 0, 500);
		client.waitForElement(
				"NATIVE",
				"xpath=//*[@knownSuperClass='android.widget.ImageButton' and @backColor='0xE0E0E0' and @top='true']",
				0, 500);
		client.click(
				"NATIVE",
				"xpath=//*[@knownSuperClass='android.widget.ImageButton' and @backColor='0xE0E0E0' and @top='true']",
				0, 1);
		waitFor(client,1);
		client.verifyElementNotFound("NATIVE", "text=" + (name), 1);
	}


	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to delete all the reminders
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 */

	public void deleteAllReminders(Client client) {
		if (client.isElementFound("NATIVE", "id=action_reminder")) {
			client.click("NATIVE", "id=action_reminder", 0, 1);
		}
		while ((client
				.isElementFound(
						"NATIVE",
						"xpath=(//*[@id='reminderList']/*/*/*[@class='android.widget.LinearLayout' and @width>0 and ./*[@class='android.support.v7.widget.AppCompatImageView'] and ./*[@class='android.support.v7.widget.SwitchCompat'] and ./*[@class='android.support.v7.widget.AppCompatTextView']])[2]"))) {
			client.elementSwipe(
					"NATIVE",
					"xpath=(//*[@id='reminderList']/*/*/*[@class='android.widget.LinearLayout' and @width>0 and ./*[@class='android.support.v7.widget.AppCompatImageView'] and ./*[@class='android.support.v7.widget.SwitchCompat'] and ./*[@class='android.support.v7.widget.AppCompatTextView']])[2]",
					0, "Left", 0, 2000);
			client.waitForElement(
					"NATIVE",
					"xpath=//*[@knownSuperClass='android.widget.ImageButton' and @backColor='0xE0E0E0' and @top='true']",
					0, 5000);

			client.click(
					"NATIVE",
					"xpath=//*[@knownSuperClass='android.widget.ImageButton' and @backColor='0xE0E0E0' and @top='true']",
					0, 1);
			client.sleep(1000);
		}
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to Verify Target glucose range value
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param low
	 *            Target Glucose Low Range
	 * 
	 * @param high
	 *            Target Glucose high Range
	 * @return verifyTG
	 * 		Returns the boolean value of verification true/false
	 */

	public boolean verifyTargetGlucoseRange(Client client, double low,
			double high) {

		String lowValue,highValue;
		boolean alreadySet = false;
		if(getUnits().contains("mg")){
			lowValue = (int)low+"";
			highValue = (int)high+"";
		}else{
			lowValue = low+"";
			highValue = high+"";

		}
		System.out.println("'" + lowValue + " - " + highValue + " " + getUnits() + "'");
		if (client.isElementFound("NATIVE", "text=" + lowValue + " - " + highValue + " "
				+ getUnits(), 0)) {

			alreadySet = true;
		}

		return alreadySet;

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set the carbohydrate units and save it
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param unit
	 *            set the unit to be selected
	 *@throws Exception
	 *		GeneralException
	 */
	public void setCarbohydrateUnits(Client client, String unit)
			throws Exception {

		client.waitForElement("NATIVE", "text=${servings}", 0,
				10000);
		client.click("NATIVE", "text=${" + unit + "}", 0, 1);
		client.click("NATIVE","xpath=//*[@id='done' and @onScreen='true']",0, 1);
		waitFor(client, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[contains(@text,'"+unit+"') and @onScreen='true' and  ./preceding-sibling::*[@text='Carbohydrate Units']]", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Select speech option
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param switchStatus
	 *            set on/off
	 */
	public void selectspeechOption(Client client, String type) {
		client.verifyElementFound("NATIVE", "text=${"+type+"}", 0);
		client.click("NATIVE", "text=${"+type+"}", 0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='"+getLangPropValue(type)+"' and @checked='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='done' and @onScreen='true']", 0, 1);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Account Setting Page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyAccountSettings(Client client) {
		client.waitForElement("NATIVE", "text=${account}", 0,
				10000);
		client.verifyElementFound(
				"NATIVE",
				"text=${profileUpdateTopText}",
				0);
		client.verifyElementFound("NATIVE", "id=firstName", 0);
		client.click("NATIVE", "id=firstName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));	

		client.verifyElementFound("NATIVE", "id=lastName", 0);
		client.click("NATIVE", "id=lastName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

		client.verifyElementFound("NATIVE", "id=dateOfBirth",
				0);
		client.click("NATIVE", "id=dateOfBirth", 0, 1);
		client.verifyElementFound("NATIVE",
				"id=mdtp_day_picker_selected_date_layout", 0);
		client.click("NATIVE", "xpath=//*[@id='mdtp_cancel' and @onScreen='true']", 0, 1);

		client.verifyElementFound("NATIVE","id=country", 0);
		client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);

		client.verifyElementFound("NATIVE", "id=email", 0);
		client.click("NATIVE", "id=email", 0, 1);

		client.verifyElementFound("NATIVE", "id=password", 0);
		client.click("NATIVE", "id=password", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify if keyboard is opened
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @return keyboardValue
	 * 		Returns the boolean value of keyboard opened or not
	 */
	public boolean isKeyboardOpened(Client client) {
		String isOpened;
		boolean isKeyboardOpened;
		client.sleep(1000);
		isOpened = client.run("adb shell dumpsys window InputMethod | grep \"mHasSurface\"");
		System.out.println(isOpened);
		if(isOpened.contains("true")){
			isKeyboardOpened = true;
			client.deviceAction("Back");
		}else{
			isKeyboardOpened = false;
		}
		return isKeyboardOpened;
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to Update Account Setting 
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *  
	 */

	public void updateAccountSettings(Client client) {

		client.elementSendText("NATIVE", "id=firstName", 0, "UpdatedFirstName");
		client.elementSendText("NATIVE", "id=lastName", 0, "UpdatedLastName");
		enterDOB(client, "5","17","1960");
		sendValidPasswordAndSubmit(client,LibrelinkConstants.CURRENT_PASSWORD);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Send Valid Password And Submit
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param password
	 * 			enter the password
	 * 
	 */

	public void sendValidPasswordAndSubmit(Client client,String password) {
		client.elementSendText("NATIVE", "xpath=//*[@id='password' and @onScreen='true']", 0,
				password);
		waitFor(client,3);
		clickOnButtonOption(client, "submit", true);
		waitForProgress(client);
		waitFor(client,1);
	}


	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to Verify updated Account Settings 
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyUpdatedAccountSettings(Client client) {
		client.verifyElementFound("NATIVE", "text=UpdatedFirstName", 0);
		client.verifyElementFound("NATIVE", "text=UpdatedLastName", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Change the current password
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param currentPassword
	 *            LibrelinkConstants.CURRENT_PASSWORD
	 *            
	 * @param newPassword
	 *            LibrelinkConstants.NEW_PASSWORD
	 *            
	 * @param confirmNewPassword
	 *            LibrelinkConstants.CURRENT_PASSWORD
	 *            
	 */

	public void changePassword(Client client, String currentPassword,
			String newPassword, String confirmNewPassword ) {
		client.verifyElementFound("NATIVE", "xpath=//*[@id='currentPassword']", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='currentPassword']", 0,
				currentPassword);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='password']", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='password']", 0,
				newPassword);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='confirm']", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='confirm']", 0,
				confirmNewPassword);
		client.sendText("{CLOSEKEYBOARD}");
		client.verifyElementFound("NATIVE", "xpath=//*[@id='submit']",
				0);
		client.click("NATIVE", "xpath=//*[@id='submit']", 0, 1);
		waitForProgress(client);

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Get the date format
	 *
	 * @param noOfdayFromCurrent
	 *        No of days from current date
	 *        
	 *@throws ParseException
	 *		Throws parse exception for setting date
	 *@return date
	 *		Return the date format
	 */
	public Date getDateFormat(int noOfdayFromCurrent) throws ParseException {

		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_YEAR, noOfdayFromCurrent);
		Date dateBefore = cal.getTime();
		System.out.println(dateBefore);
		return dateBefore;

	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Click On Icon in Reports page and verify the information content
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param reportName
	 *            report to be selected
	 * 
	 */

	public void clickOnIconAndVerifyReportMessage(Client client, String reportName) {
		client.waitForElement("NATIVE", "xpath=//*[@id='info' and @onScreen='true']", 0, 3000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='info' and @onScreen='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='info' and @onScreen='true']", 0, 1);
		client.verifyElementFound("NATIVE", "text=${"+reportName+"}", 0);
		reportName = getLangPropValue(reportName);
		if (reportName.equalsIgnoreCase("Daily Patterns")){
			client.verifyElementFound("NATIVE", "text=${daily_patterns_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${daily_patterns_info_title}", 0);

		} else if (reportName.equalsIgnoreCase("Time In Target")) {
			client.verifyElementFound("NATIVE", "text=${time_in_target_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${time_in_target_info_title}", 0);

		} else if (reportName.equalsIgnoreCase("Low Glucose Events")) {
			client.verifyElementFound("NATIVE", "text=${low_glucose_info_title}", 0);
			if(getUnits().contains("mg")){
				client.verifyElementFound("NATIVE", "text=${low_glucose_info_msg_mg}", 0);
			}else{
				client.verifyElementFound("NATIVE", "text=${low_glucose_info_msg_mmol}", 0);
			}
		} else if (reportName.equalsIgnoreCase("Average Glucose")) {
			client.verifyElementFound("NATIVE", "text=${average_glucose_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${average_glucose_info_title}", 0);

		} else if (reportName.equalsIgnoreCase("Daily Graph")) {
			client.verifyElementFound("NATIVE", "text=${daily_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${daily_info_title}", 0);

		} else if (reportName.equalsIgnoreCase("Estimated A1c")) {
			client.verifyElementFound("NATIVE", "text=${a1c_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${a1c_info_title}", 0);

		} else if (reportName.equalsIgnoreCase("Sensor Usage")) {
			client.verifyElementFound("NATIVE", "text=${sensor_usage_info_msg}", 0);
			client.verifyElementFound("NATIVE", "text=${sensor_usage_info_title}", 0);

		}



	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for saving the Notes
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void saveNotes(Client client) {
		waitFor(client, 1);
		client.click("NATIVE",
				"nixpath=//*[@value='Save' and @class='UIAButton']", 0, 1);
		waitFor(client, 1);
		launch(client);
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify date on Logbook and the arrow's visibility
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param count 
	 * 			set the count from no of days
	 * 
	 */

	public void verifyDateonGraphAndArrow(Client client, int count) {
		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_YEAR, count);
		Date dateBefore = cal.getTime();
		System.out.println(dateBefore);
		SimpleDateFormat sdf = null;
		String dateToBeDisplayed=null;
		if (getLanguage().contains("U.S.")) {
			sdf = new SimpleDateFormat("d MMMMM yyyy");

		} else if (getLanguage().contains("U.K.")) {
			sdf = new SimpleDateFormat("d MMMMM yyyy");

		} 
		dateToBeDisplayed = sdf.format(dateBefore);
		client.verifyElementFound("NATIVE","xpath=//*[@id='date_header' and @text='"+dateToBeDisplayed+"']", 0);
		client.verifyElementNotFound("NATIVE","xpath=//*[@id='forward_button' and @top='true']", 0);
		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to Verify Not Enough Sensor Data Message
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyNotEnoughSensorDataMessage(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@text='Error loading data']", 0, 1000);
		client.verifyElementFound("NATIVE","xpath=//*[@id='not_enough_data' and @text='Not Enough Sensor Data']",0);
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify report available period for n days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Number of days Data available
	 * 
	 */

	public void verifyReportDataAvailableForNdays(Client client,  int noOfDays) {
		String daysAvailable = getLangPropValue("days_of_data").replace("%1$d", "0").replace("%2$d", Integer.toString(noOfDays));
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='days_of_data' and @text='"+daysAvailable+"']",
				0);



	}

	/**
	 * Author: NagarajuKasarla 
	 * 
	 * Method to verify Target Glucose range in Time In target report
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param tgRange
	 *            Target Glucose Range
	 * 
	 */

	public void verifyTargetGlucoseinReports(Client client,  String tgRange) {

		String targetRange = getLangPropValue("timeInTargetGlucoseRangeLabel").replace("%@", tgRange);
		client.verifyElementFound("NATIVE","xpath=//*[@id='chart_summary' and @text='"+targetRange+"']",0);
	}


	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify application version, CE mark, Registration no, UDI (based on build) on About screen
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void verifyAppVersionUDICE(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Software Version:']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='softwareVersion'] ", 0);
		String appversion = client.elementGetText("NATIVE","xpath=//*[@id='softwareVersion']", 0);
		Assert.assertEquals(appversion.replace("-", "."),getAppversion().replace("-", "."));

		if (getCountryCode().equals("United States")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='udiLabel' and @onScreen='true']", 0);
			String appUdi= client.elementGetText("NATIVE", "xpath=//*[@id='udiValue' and @onScreen='true']", 0).replaceAll("\\s", "");
			Assert.assertEquals(appUdi.replace("-", "."),getAppudi().replace("-", "."));
			client.swipeWhileNotFound("Down", 100, 500, "NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0, 1000, 5, true);
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0);

		} else if (getCountryCode().equals("United Kingdom")||getCountryCode().equals("Germany")) {
			client.swipeWhileNotFound("Down", 100, 500, "NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0, 1000, 5, true);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0);

		}
	}


	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify website details on About screen
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyWebSite(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@id='customerSupport' and @text='"+getLangPropValue("supportWebsiteValue")+"']", 0);
		client.verifyElementFound("NATIVE", "text=${patentWebsiteLabel}", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+getLangPropValue("patentWebsiteValue")+"' and @onScreen='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='customerSupport' and @text='"+getLangPropValue("supportWebsiteValue")+"']", 0, 1);
		waitFor(client,2);

	}


	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify the contents of Update date and time pop up
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */

	public void verifyNetworkWarningMsg(Client client) {
		client.waitForElement("NATIVE",
				"xpath=//*[@id='alertTitle']", 0,
				5000);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='${error_networktime_disabled}']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='${enableNetworkTime}']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='${yes}']", 0);
		client.verifyElementFound("NATIVE", "text=${no}", 0);
		waitFor(client,1);

	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify if Update date and time pop up not displayed
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyUpdateDateandTimePopUpNotFound(Client client) {
		client.verifyElementNotFound("NATIVE",
				"xpath=//*[@text='${error_networktime_disabled}']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to select OK/Settings from Update date and time pop up
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param option
	 *            OK/SETTINGS
	 */
	public void selectOptioninNetworkWarning(Client client, String option) {
		client.click("NATIVE", "text=" + option, 0, 1);
		waitFor(client, 2);
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify Logbook page contents
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyLogbookPageContents(Client client) {
		client.waitForElement("NATIVE", "text=${logbook}", 0, 10000);	     
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and ./parent::*[@id='logbook_datebar']]", 0);
		client.verifyElementFound("NATIVE", "id=action_reminder", 0); 
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_note_btn' and @contentDescription='Add Note']", 0); 
		client.verifyElementFound("NATIVE", "id=logbook_date_text", 0);
		if (getCountryCode().equalsIgnoreCase("United States")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_bg_btn' and @onScreen='true']", 0);
		}
		client.verifyElementFound("NATIVE","xpath=//*[@id='logbook_empty' and @onScreen='true']", 0);
	}

	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to verify the required date to be displayed
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param currentDate
	 *            current date
	 * @param minusDays
	 *            past how many days          
	 *@throws ParseException
	 *		Throws parse exception for setting date
	 */

	public void verifyRequiredDateIsDisplayed(Client client, Date currentDate,
			int minusDays) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, -minusDays);
		verifyPickedDateIsDisplayed(client, calendar.getTime());
	}

	public String getUSExecutionFormat(Client client, String selectedDate) throws ParseException{
		String dateformat = getTimeZoneValueForSelectedDate(LibrelinkConstants.US,selectedDate);
		String abbrevatedFormat = null;
		String format[]=null;
		if(dateformat.contains("GMT-7")){
			format= getProperty("test.timezoneformat.1").split(";");
		}else{
			format= getProperty("test.timezoneformat.0").split(";");
		}
		abbrevatedFormat = format[0];
		return abbrevatedFormat;
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify Home Screen details with data
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyHomePageDetailsWithData(Client client) {
		client.verifyElementFound("NATIVE","xpath=//*[@id='last_scan_title' and @onScreen='true']" ,0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='average_title' and @onScreen='true']" ,0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='time_in_target_title' and @onScreen='true']" ,0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click Blood Drop Icon and Create ManualBG note
	 * 
	 * @param client
	 * Integrate SeeTestAutomation
	 * 
	 * @param hrs
	 * Set the hrs 
	 * 
	 * @param mins
	 * Set the mins
	 * 
	 * @param time
	 * Set the time
	 * 
	 * @param ampm
	 * Set the am/pm
	 * 
	 * @param value
	 * Set the BloodGlucose value
	 */
	public void createManualBGNote(Client client, int hrs, int mins,String ampm, String value) {
		client.waitForElement("NATIVE", "xpath=//*[@id='logbook_bg_btn' and @hidden='false']", 0,10000);
		client.click("NATIVE",
				"xpath=//*[@id='logbook_bg_btn' and @hidden='false']", 0, 1);
		setLogBookTime(client, hrs, mins, ampm);
		client.verifyElementFound("NATIVE", "id=manualbg_number", 0);
		client.elementSendText("NATIVE", "id=manualbg_number", 0, value);
		client.closeKeyboard();
		waitFor(client, 1);
		client.click("NATIVE", "text=Done", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to closeNotification
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void closeNotification(Client client) {
		client.run("adb shell service call statusbar 2");
	}



	/**
	 * Author: NagarajuKasarla-
	 * 
	 * Method to Click on settings menu
	 * 
	 * @param client
	 *   Integrate SeeTestAutomation         
	 * @param subSetting
	 *         selecting the sub option from Settings
	 * 
	 * @throws Exception
	 */
	public void clickOnSettingsMenu(Client client,String subSetting) {
		client.waitForElement("NATIVE", "xpath=//*[@class='android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton' and @onScreen='true']", 0,
				10000);
		client.click("NATIVE",
				"xpath=//*[@class='android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton' and @onScreen='true']", 0, 1);
		client.sleep(500);
		client.waitForElement("NATIVE", "text=${" + subSetting + "}", 0,10000);
		client.click("NATIVE","text=${" + subSetting + "}", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to click on settings options
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param page
	 *           page to be selected
	 */
	public void clickOnSettingsOptions(Client client, String page)
	{
		client.waitForElement("NATIVE", "text=${settings}", 0,
				10000);
		client.click("NATIVE", "text=${" + page + "}", 0, 1);
		waitFor(client, 1);
		client.verifyElementFound("NATIVE", "text=${" + page + "}", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *         Uncheck Food Attribute
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	public void uncheckFoodAttribute(Client client) {
		client.click("NATIVE", "xpath=//*[@id='cbox_food_note']", 0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='cbox_food_note' and @checked='false']", 0);
		client.verifyElementNotFound("NATIVE",
				"xpath=//*[@text='Meal'and @hidden='false']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to verify Logbook Detail Date Time
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param date
	 *            check date
	 * @param scantime
	 *          set the scan time
	 */
	public void verifyLogbookDetailDateTime(Client client, String scantime,
			String date) {
		client.waitForElement("NATIVE", "text=${logbookDetail}", 0, 10000);
		client.verifyElementFound("NATIVE", "text=" + scantime, 0);
		client.verifyElementFound("NATIVE", "text=" + date, 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *   Method to verify Multiple Note logbook detail page
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param attributes
	 *            set the attibute
	 */
	public void verifyMultipleNoteLogBookDetailPage(Client client,
			String attributes) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='lbdetail_note_description' and @text='"
						+ attributes + "']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *    Method to  verify added note
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param logBookTime
	 *            set the time
	 * @throws ParseException 
	 * @throws InternalException 
	 */
	public void verifyaddedNote(Client client, String logBookTime,String badge) throws InternalException, ParseException {
		client.verifyElementFound("NATIVE", "xpath=//*[@id='icon']", 0);
		client.verifyElementFound("NATIVE", "text=${note}", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='badge' and @text='"+badge+"']", 0);
		logBookTime=setAMPM(client,logBookTime);	
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"
				+ logBookTime + "']", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * 
	 * Set new email id as per current date and time
	 * 
	 * 
	 */
	public String getEmail() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		SimpleDateFormat sampledate = new SimpleDateFormat("HHmmMMddYY");
		String MMDDYY = sampledate.format(c.getTime());
		String Email = "manual" + MMDDYY + "@abbott.com";
		return Email;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * 
	 * Method to selecting FoodItem From Menu
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param foodtype
	 *            set the food type
	 */

	public void selectAndVerifyFoodItemFromMenu(Client client, String foodtype) {
		String str0 = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@id='text1' and ./parent::*[@id='spinner_food_type']]",
						0);
		if (!str0.equalsIgnoreCase(foodtype)) {
			client.verifyElementFound("NATIVE", "id=spinner_food_type", 0);
			client.click("NATIVE", "id=spinner_food_type", 0, 1);
			waitFor(client, 3);
			client.click("NATIVE", "text=${"+foodtype+"}", 0, 1);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Food In LogBook Detail Page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param mealType
	 *            set the meal type(breakfast/lunch/dinner/snack)
	 * @param carbUnit
	 *            Set the CarbUnit
	 * @param carbAmount
	 *            Set the CarbAmount
	 */
	public void verifyFoodNoteInLogBookDetailPage(Client client, String mealType,
			String carbUnit, String carbAmount,String time) {
		String value=null;
		if(mealType!=null){
			value = getLangPropValue(mealType);
		}else{
			value = getLangPropValue("food");
		}
		if (carbUnit.equals("grams")) {
			value = value+" ("+carbAmount+getLangPropValue("gramsSymbol")+")";

		} else if (carbUnit.equals("servings") || carbUnit.equals("portions")) {
			value = value+" ("+carbAmount+getLangPropValue("servingsSymbol")+")";

		}
		verifyCreatedDetailNoteTime(client, time);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and contains(@text,'"+value+"')]", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Created note in Logbook detail page
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param notetime
	 *            set the note time for click
	 */
	public void verifyCreatedDetailNoteTime(Client client, String time) {
		time=setAMPM(client,time);
		client.sleep(2000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='timeView' and @text='"+time+"']", 0);
		client.sleep(1000);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On Created Note
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param notetime
	 *            set the note time for click
	 */
	public void clickOnCreatedNoteTime(Client client, String time) {
		time=setAMPM(client,time);    	
		client.click("NATIVE", "xpath=//*[@text='"+time+"']", 0, 1);
		client.sleep(2000);

	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Save the shared bit map
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 */
	public void saveTheSharedBitmap(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@id='share' and @onScreen='true']", 0, 10000)) {
			client.click("NATIVE", "xpath=//*[@id='share' and @onScreen='true']", 0, 1);
			client.sleep(1000);
			if(client.isElementFound("NATIVE", "xpath=//*[@text='Gmail']", 0)){
				client.click("NATIVE", "xpath=//*[@text='Gmail']", 0, 1);
			}else{
				client.elementSwipeWhileNotFound("NATIVE",
						"xpath=//*[contains(@id,'list')]", "Left", 0, 2000,
						"NATIVE", "xpath=//*[@text='Gmail']", 0, 1000, 5, true);
			}

			if (client.isElementFound("NATIVE", "xpath=//*[contains(@text,'Compose')]", 0)) {


				if (client
						.isElementFound("NATIVE", "xpath=//*[contains(@text,'Compose')]", 0)) {
					client.elementSendText("NATIVE", "xpath=//*[@id='to']", 0,
							"abbott.automation@gmail.com");

				}

			}
			client.click("NATIVE", "xpath=//*[@id='body_wrapper']", 0, 1);
			client.closeKeyboard();
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *         click email send button
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * 
	 */
	public void sendEmail(Client client) {
		client.click("NATIVE", "id=send", 0, 1);
		client.sleep(2000);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Verify End User Agreement Accept
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void termsOfPageAccept(Client client) {
		client.waitForElementToVanish("NATIVE", "id=progress", 0, 80000);
		client.verifyElementFound("NATIVE", "text=${termsOfUseTitle}", 0);
		client.verifyElementFound("NATIVE", "text=${reject}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		client.click("NATIVE", "id=accept", 0, 1);
		client.verifyElementFound("NATIVE",
				"text=${termsOfUseAcceptanceStatement}", 0);
		client.click("NATIVE", "id=checkBox", 0, 1);
		client.verifyElementFound("NATIVE", "text=${cancel}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		client.click("NATIVE", "id=button1", 0, 1);
		client.waitForElementToVanish("NATIVE", "id=progress", 0, 60000);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Accept Button, click check box and accept on Privacy page
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickAndAcceptPrivacyNoticePage(Client client) {
		client.verifyElementFound("NATIVE", "text=${privacyNoticeTitle}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		client.verifyElementFound("NATIVE", "text=${reject}", 0);
		client.click("NATIVE", "id=accept", 0, 1);
		client.verifyElementFound("NATIVE",
				"text=${privacyNoticeAcceptanceStatement}", 0);
		client.click("NATIVE", "id=checkBox", 0, 1);
		client.verifyElementFound("NATIVE", "text=${cancel}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		client.click("NATIVE", "id=button1", 0, 1);
		client.waitForElementToVanish("NATIVE", "id=progress", 0, 60000);
	}
}
