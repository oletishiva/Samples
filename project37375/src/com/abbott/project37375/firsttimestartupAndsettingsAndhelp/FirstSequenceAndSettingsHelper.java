package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Assert;

import com.abbott.project37375.main.BaseHelper;
import com.experitest.client.Client;

public class FirstSequenceAndSettingsHelper extends BaseHelper {

	/**
	 * 
	 * 
	 * Author: Ilangovan
	 * 
	 * Verify Account Setting Page
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 */

	public void verifyAccountSettings(Client client) {
		client.verifyElementFound(
				"NATIVE",
				"text=Changing any of the information below will update your account.",
				0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='firstName']", 0);
		client.click("NATIVE", "xpath=//*[@id='firstName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='lastName']", 0);
		client.click("NATIVE", "xpath=//*[@id='lastName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

		client.verifyElementFound("NATIVE", "xpath=//*[@id='dateOfBirth']",
				0);
		client.click("NATIVE", "xpath=//*[@id='dateOfBirth']", 0, 1);
		client.click("NATIVE", "xpath=//*[@id='mdtp_ok']", 0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='country']", 0);
		client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='email']", 0);
		client.click("NATIVE", "xpath=//*[@id='email']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "xpath=//*[@id='password']", 0);
		client.click("NATIVE", "xpath=//*[@id='password']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify if keyboard is opened or not
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 * 
	 * @return keyboard
	 * 		Keyboard opened true/false
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
	 * Author: Ilangovan
	 * 
	 * Verify the account password page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * 
	 */
	public void verifyAccountPasswordPage(Client client) {
		client.waitForElement("NATIVE", "xpath//*[@text='Account Password']",
				0, 10000);
		client.verifyElementFound("NATIVE", "text=${changePasswordTopText}",0);		 
		client.verifyElementFound("NATIVE","xpath=//*[@id='currentPassword']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='password']",0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='confirm']", 0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Submit']",0);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Change the current password
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param currentPassword
	 *            LibrelinkConstants.CURRENT_PASSWORD
	 *            
	 * @param newPassword
	 *            LibrelinkConstants.NEW_PASSWORD
	 *            
	 * @param confirmNewPassword
	 *            LibrelinkConstants.NEW_PASSWORD
	 *            
	 */

	public void changePassword(Client client, String currentPassword,
			String newPassword, String confirmNewPassword ) {
		client.elementSendText("NATIVE", "xpath=//*[@id='currentPassword' and @onScreen='true']", 0, currentPassword);
		client.elementSendText("NATIVE", "xpath=//*[@id='password' and @onScreen='true']", 0, newPassword);
		client.elementSendText("NATIVE", "xpath=//*[@id='confirm' and @onScreen='true']", 0, confirmNewPassword);
		client.closeKeyboard();
		clickOnButtonOption(client, "Submit", true);
		waitForProgress(client);

	}


	/**
	 * Author: Ilangovan
	 * 
	 * select speech option
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param switchStatus
	 *            set on/off
	 */

	public void selectspeechOption(Client client, String switchStatus) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+switchStatus+"']", 0);
		client.click("NATIVE","xpath=//*[@text='"+switchStatus+"']", 0, 1);
		client.click("NATIVE", "xpath=//*[@id='done' and @onScreen='true']", 0, 1);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * verify speech Settings in App settings page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param switchStatus
	 *            set on/off
	 */

	public void verifySpeechSettings(Client client, String switchStatus) {
		navigateToSubMenuScreens(client ,"textToSpeechTitle");
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Text to Speech']", 0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='"+switchStatus+"' and @checked='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='done' and @onScreen='true']", 0, 1);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * verify Minor To Adult Account Error
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 * 
	 */

	public void verifyMinorToAdultAcctError(Client client) {
		client.waitForElement("NATIVE",
				"xpath=//*[@class='UIView' and @onScreen='true']", 0, 1000);
		client.verifyElementFound("NATIVE", "text=${invalidProfileDOB}", 0);
		clickOnButtonOption(client, "OK", false);
	}



	/**
	 * Author: Ilangovan
	 * 
	 * send Valid Password And Submit
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param password
	 * 			enter the password
	 * 
	 */

	public void sendValidPasswordAndSubmit(Client client,String password) {
		client.elementSwipe("NATIVE", "xpath=//*[@class='android.widget.ScrollView' and @onScreen='true']", 0, "Down", 0, 500);
		client.elementSendText("NATIVE", "xpath=//*[@id='password' and @onScreen='true']", 0,
				password);
		client.elementSendText("NATIVE", "xpath=//*[@id='password' and @onScreen='true']", 0,
				password);
		client.closeKeyboard();
		waitFor(client,3);
		clickOnButtonOption(client, "Submit", true);
		waitForProgress(client);
		waitFor(client,1);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * verify UOM Page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * 
	 */

	public void verifyUOMPage(Client client) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Unit of Measurement']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + getUnits()+"']", 0);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * verify App Setings
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param speech
	 *        verify speech option ON/OFF
	 *        
	 * @param carbohydrateUnit
	 *         verify carbohydrateUnit option mgdl/mmmol
	 *         
	 * @param targetglucoserange
	 * 			verify TargetGlucoseRange option 
	 * 
	 * @param gramValue
	 * 			verify gramvalue in the page
	 */

	public void verifySettingsPage(Client client, String speech,
			String carbohydrateUnit, double gramValue, String targetglucoserange,String Scansounds) {
		clickOnSettingsMenu(client, "settings");
		client.waitForElement("NATIVE",
				"xpath=//*[@text='App Settings']", 0, 1000);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='App Settings']", 0);

		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Unit of Measurement']", 0);
		client.verifyElementFound("NATIVE", "text=" + getUnits(),
				0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Target Glucose Range']", 0);

		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Carbohydrate Units']", 0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Scan Sounds']", 0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='text2' and @text='"+Scansounds+"']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='"+targetglucoserange+"']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Carbohydrate Units']", 0);

		if (carbohydrateUnit.equalsIgnoreCase("grams")) {
			client.verifyElementFound("NATIVE","text=grams",0);
		} else {
			String servingsvalue = getLangPropValue("servings");
			client.verifyElementFound("NATIVE","text="+servingsvalue+" (1 "+servingsvalue.substring(0, (servingsvalue.length()-1))+" = "+gramValue+" grams)",0);
		}     
		if(getTextToSpeech().equalsIgnoreCase("yes")){
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='Text to Speech']", 0);
			client.verifyElementFound("NATIVE", "text=" + speech, 0);
		}

	}


	/**
	 * Author: Ilangovan
	 * 
	 * verify Account Password mismatch Errors
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param errorStringId
	 * 			enter error message 
	 * 
	 */

	public void verifyPasswordMismatchError(Client client, String errorStringId) {

		client.verifyElementFound(
				"NATIVE",
				"text=${"+errorStringId+"}",
				0);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * verify Account Password Errors
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyAccountPasswordInCorrectErrors(Client client) {
		client.verifyElementFound("NATIVE","text=${invalidPasswordErrorMessage}",0);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * verify Parent/Guardian Account page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyParentGuardianAccountpage(Client client) {
		client.waitForElement("NATIVE","xpath=//*[@text='Parent/Guardian Account Login' and @onScreen='true']", 0, 1000);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Parent/Guardian Account Login' and @onScreen='true']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='topText' and @onScreen='true']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='firstName']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='lastName']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='email']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='password']",0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='confirm']",0);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Minor Account Setting Page
	 * 
	 * @param client
	 *  		Integrate SeeTestAutomation
	 */

	public void verifyMinorAccountSettings(Client client) {
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Changing any of the information below will update your account.']",
				0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='firstName']", 0);
		client.click("NATIVE", "xpath=//*[@id='firstName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='lastName']", 0);
		client.click("NATIVE", "xpath=//*[@id='lastName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "xpath=//*[@id='dateOfBirth']",
				0);
		client.click("NATIVE", "xpath=//*[@id='dateOfBirth']", 0, 1);
		client.click("NATIVE", "xpath=//*[@id='mdtp_ok' and @onScreen='true']", 0, 1);

		client.verifyElementFound("NATIVE", "xpath=//*[@id='country']", 0);
		client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);

		client.verifyElementFound("NATIVE","xpath=//*[@id='parentFirstName']", 0);
		client.click("NATIVE","xpath=//*[@id='parentFirstName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='parentLastName']", 0);
		client.click("NATIVE","xpath=//*[@id='parentLastName']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

		client.elementSwipe("NATIVE", "xpath=//*[@class='android.widget.ScrollView' and @onScreen='true']", 0, "Down", 0, 500);

		client.verifyElementFound("NATIVE", "xpath=//*[@id='email']", 0);
		client.click("NATIVE", "xpath=//*[@id='email']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));

		client.elementSwipe("NATIVE", "xpath=//*[@class='android.widget.ScrollView' and @onScreen='true']", 0, "Down", 0, 500);

		client.verifyElementFound("NATIVE", "xpath=//*[@id='password']", 0);
		client.click("NATIVE", "xpath=//*[@id='password']", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Update Minor Account Settings
	 * 
	 * @param client
	 *  		Integrate SeeTestAutomation
	 */

	public void updateMinorAccountSettings(Client client) {
		client.elementSendText("NATIVE","xpath=//*[@id='firstName' and @onScreen='true']",0,"UpdateFirstName");
		client.elementSendText("NATIVE","xpath=//*[@id='lastName']",0,"UpdateLastName");
		client.elementSendText("NATIVE","xpath=//*[@id='parentFirstName']",0,"UpdatePFirstName");
		client.elementSendText("NATIVE","xpath=//*[@id='parentLastName']",0,"UpdatePLastName");



	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify updated Minor Account Settings 
	 * 
	 * @param client
	 *  		Integrate SeeTestAutomation
	 */

	public void verifyUpdateMinorAccountSettings(Client client) {
		client.verifyElementFound("NATIVE", "text=UpdateFirstName", 0);
		client.verifyElementFound("NATIVE", "text=UpdateLastName", 0);
		client.verifyElementFound("NATIVE", "text=UpdatePFirstName", 0);
		client.verifyElementFound("NATIVE", "text=UpdatePLastName", 0);

	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify carbohydrate Units Page Contents
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void carbohydrateUnitsPageDetails(Client client, String Unitsname) {
		verifyPageTitles(client, "carbohydrateUnitsTitle");
		client.verifyElementFound("NATIVE", "text=${carbohydrateUnitsTopText}",
				0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='grams' and @checked='false']", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='${servings}' and @checked='false']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='next']", 0);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * verify Carbohydrate Options
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyCarbohydrateOptions(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='grams' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='servings' and @onScreen='true']", 0); 
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Country Page Details
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyCountryPageDetails(Client client) {
		client.waitForElement("NATIVE", "text=${countryOfOriginTitle}", 0, 2000);
		verifyPageTitles(client, "countryOfOriginTitle");
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='topText']",	0);
		client.verifyElementFound("NATIVE", "text=" + getCountryCode(), 0);
		client.verifyElementFound("NATIVE",	"text=${countryOfOriginExplanation}", 0);
		verifyButtonStatus(client, "Next", true);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Unit Of Measurement Page details
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyUnitOfMeasurementPageDetails(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Unit of Measurement' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='topText' and @enabled='true' and @onScreen='true']",
				0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Your country is' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + getCountryCode()+"']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Your unit of measurement is']",	0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + getUnits()+"']", 0);
		verifyButtonStatus(client, "Next", true);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Target Glucose Range Page details
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyTargetGlucoseRangePageDetails(Client client,String low,String High) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Target Glucose Range' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='topText' and @top='true' and @onScreen='true']",	0);
		client.verifyElementFound("NATIVE", "text=${targetGlucoseRangeTopTextForSetup}", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + getUnits()+"']", 0);
		client.verifyIn("NATIVE", "xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]", 0, "Inside", "NATIVE", "xpath=//*[@text='"+low+"']", 0, 0);
		client.verifyIn("NATIVE", "xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]", 0, "Inside", "NATIVE", "xpath=//*[@text='"+High+"']", 0, 0);
		client.verifyElementFound("NATIVE","xpath=//*[@id='next']", 0);
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify Check glucose sensor icon is displayed or not
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param available
	 *         true/false
	 */
	//TODO  we have to update checkGlucoseIcon proper-id
	public void verifyCheckGlucoseIcon(Client client, boolean available) {

		if (available) {
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='SensorIcon' and @onScreen='true']", 0);
		} else {
			client.verifyElementNotFound("NATIVE",
					"xpath=//*[@id='SensorIcon' and @onScreen='true']", 0);
		}
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Terms of Use \ Privacy Policy page Pop up
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param page
	 *            Terms of Use or Privacy Policy
	 *            
	 */

	public void verifyPagePopUp(Client client, String page) {
		clickOnButtonOption(client,"Accept",true);
		if(client.isElementFound("NATIVE", "xpath=//*[@id='button1'and @enabled='false']", 0)){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='checkBox'and @top='true']", 0);
			client.click("NATIVE", "xpath=//*[@id='checkBox'and @top='true']", 0, 1);
			client.verifyElementFound("NATIVE","xpath=//*[@id='checkBox' and @text='I have read and explicitly accept the "+page+".' and @checked='true']", 0);
			client.verifyElementFound("NATIVE","xpath=//*[@id='button1' and @textColor='0x138BE8' and @onScreen='true']", 0);
			client.verifyElementFound("NATIVE","xpath=//*[@id='button2' and @textColor='0x138BE8' and @onScreen='true']", 0);

		}
		else{
			client.click( "NATIVE", "xpath=//*[@id='button2'and @top='true']", 0, 1);
		}
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify create account Page contents are editable
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 */

	public void verifyCreateAccountScreenisEditable(Client client) {
		client.sleep(1000);
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatEditText' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='topText' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "id=firstName", 0);
		client.click("NATIVE", "id=firstName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));	
		client.verifyElementFound("NATIVE", "id=lastName", 0);
		client.click("NATIVE", "id=lastName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=dateOfBirth",0);

		client.click("NATIVE", "id=dateOfBirth", 0, 1);
		client.verifyElementFound("NATIVE",	"id=mdtp_day_picker_selected_date_layout", 0);
		client.click("NATIVE", "xpath=//*[@id='mdtp_cancel' and @onScreen='true']", 0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='submit']", 0);





	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify Adult account Login Page is editable
	 * 
	 * @param client
	 *			Integrate SeeTestAutomation
	 */

	public void verifyAdultAccountLoginScreenisEditable(Client client) {
		client.waitForElement("NATIVE", "text=Account Login", 0, 5000);
		client.verifyElementFound(
				"NATIVE",
				"text=Create your LibreView account for use with FreeStyle LibreLink and any other compatible apps.",
				0);
		client.verifyElementFound("NATIVE", "id=email", 0);
		client.click("NATIVE", "id=email", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=password", 0);
		client.click("NATIVE", "id=password", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=confirm", 0);
		client.click("NATIVE", "id=confirm", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=yes", 0);
		client.verifyElementFound("NATIVE", "id=no", 0);
		client.verifyElementFound("NATIVE","text=Please send me information about Abbott Diabetes Care and other Abbott products and services. (You can unsubscribe at any time.)",0);
		client.verifyElementFound("NATIVE", "text=Create Account", 0);
	}
	/**
	 * Author: Ilangovan
	 *
	 * Verify Parent Account Login Screen is Editable
	 *
	 * @param client
	 *		Integrate SeeTestAutomation
	 */

	public void verifyParentAccountLoginScreenisEditable(Client client) {
		client.waitForElement("NATIVE", "text=Parent/Guardian Account Login",0, 5000);
		client.verifyElementFound(	"NATIVE","text=This user is a minor. A parent or guardian must complete the account to use this software.",	0);
		client.verifyElementFound("NATIVE", "id=firstName", 0);
		client.click("NATIVE", "id=firstName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=lastName", 0);
		client.click("NATIVE", "id=lastName", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=email", 0);
		client.click("NATIVE", "id=email", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=password", 0);
		client.click("NATIVE", "id=password", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=confirm", 0);
		client.click("NATIVE", "id=confirm", 0, 1);
		Assert.assertEquals(true, isKeyboardOpened(client));
		client.verifyElementFound("NATIVE", "id=yes", 0);
		client.verifyElementFound("NATIVE", "id=no", 0);
		client.verifyElementFound("NATIVE","text=${accountContactOptIn}",0);
		client.verifyElementFound("NATIVE", "text=${createAccountSubmitButtonText}", 0);
	}
	/**
	 * Author: Amaresh/Shabina
	 *
	 * Verify Minor Warning Message
	 *
	 * @param client
	 *			Integrate SeeTestAutomation
	 */

	public void verifyMinorWarningMessage(Client client) {
		client.verifyElementFound("NATIVE", "text=${tooYoungWarningMessage}", 0);
		client.verifyElementFound("NATIVE", "text=Cancel", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='OK']", 0);
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify Low Glucose Range
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param highTGValue
	 * 			high target glucose range
	 * 
	 */

	public void verifyLowGlucoseRange(Client client) {
		if (getUnits().equalsIgnoreCase("mmol/L")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(99);");
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "10.0", 0, 0, 0, 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(40);");
			client.click("TEXT", "3.9", 0, 1);
			client.verifyElementFound("TEXT", "3.9", 0);
			client.verifyElementNotFound("TEXT", "3.8", 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(98);");
			client.click("TEXT", "9.9", 0, 1);
			client.verifyElementFound("TEXT", "9.9", 0);
			client.verifyElementNotFound("TEXT", "10.0", 1);
		}
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(178);");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Down", 180, 1000);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "180", 0, 0, 0, 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(71);");
			client.elementSwipe("NATIVE", "id=rangeLow", 0, "Up", 0, 2000);
			client.click("TEXT", "70", 0, 1);
			client.verifyElementFound("TEXT", "70", 0);
			client.verifyElementNotFound("TEXT", "69", 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(178);");
			client.clickIn("NATIVE", "xpath=//*[@id='rangeLow']",
					0, "Inside", "TEXT", "179", 0, 0, 0, 1);
			client.verifyElementFound("TEXT", "179", 0);
			client.verifyElementNotFound("TEXT", "180", 1);
		}
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify High Glucose Range
	 * 
	 * @param client
	 *    Integrate SeeTestAutomation
	 * @param lowTGValue
	 * 			low target glucose range
	 * 
	 */
	public void verifyHighGlucoseRange(Client client) {
		if (getUnits().equalsIgnoreCase("mmol/L")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(40);");
			client.click("TEXT", "3.9", 0, 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(41);");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Up", 180, 30);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "4.0", 0, 0, 0, 1);
			client.verifyElementFound("TEXT", "4.0", 0);
			client.verifyElementNotFound("TEXT", "3.9", 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(99);");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Down", 180, 30);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "10.0", 0, 0, 0, 1);
			client.verifyElementFound("TEXT", "10.0", 0);
			client.verifyElementNotFound("TEXT", "10.1", 0);
		}
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(71);");
			client.elementSwipe("NATIVE", "id=rangeLow", 0, "Up", 0, 2000);
			client.click("TEXT", "70", 0, 1);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(72);");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Up", 180, 30);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "71", 0, 0, 0, 1);

			client.verifyElementFound("TEXT", "71", 0);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(178);");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Down", 180, 1000);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", "180", 0, 0, 0, 1);
			client.verifyElementFound("TEXT", "180", 0);
			client.verifyElementNotFound("TEXT", "181", 1);
		}
	}

	/**
	 * Author: Ilangovan
	 * 
	 * Verify Start and end Glucose Range Difference
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param setHigh
	 *            set the highest unit
	 * 
	 */

	public void verifyGlucoseRangeDifference(Client client, String setLow,
			String high) {
		if (getUnits().equalsIgnoreCase("mmol/L")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(99);");
			client.click("TEXT", "10.0", 0, 1);
			double set = Double.parseDouble(setLow);
			int set1 = (int) (set * 10);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(" + (set1 + 1) + ");");
			client.click("TEXT", setLow, 0, 1);
			client.verifyElementFound("TEXT", setLow, 0);
			double high1 = Double.parseDouble(high);
			double range = high1 + 0.1;
			String requiredLow = Double.toString(range);
			int high2 = (int) (high1 * 10);
			int low = high2 + 1;
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(" + (low + 1) + ");");
			client.elementSwipe("NATIVE", "id=rangeHigh", 0, "Up", 180, 30);
			client.click("TEXT", requiredLow, 0, 1);
			client.elementSwipeWhileNotFound("NATIVE", "id=rangeHigh", "Up", 0,
					2000, "TEXT", high, 0, 1000, 2, false);
			String minValue = client.runNativeAPICall("NATIVE",
					"xpath=//*[@id='rangeHigh']", 0, "view.getMinValue();");
			Assert.assertNotSame(high, minValue);
			client.verifyElementFound("TEXT", setLow, 0);
			client.verifyElementNotFound("TEXT", high, 1);
			client.verifyElementFound("NATIVE", "text=" + getUnits(), 0);
		}
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(179);");
			client.click("TEXT", "180", 0, 1);
			int set = Integer.parseInt(setLow);

			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
					"view.setValue(" + (set + 1) + ");");
			client.clickIn("NATIVE", "xpath=//*[@id='rangeLow']",
					0, "Inside", "TEXT", setLow, 0, 0, 0, 1);
			client.verifyElementFound("TEXT", setLow, 0);
			int high1 = Integer.parseInt(high);
			int low = high1 + 1;
			String lowHigh = Integer.toString(low);
			client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
					"view.setValue(" + (low + 1) + ");");
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']",
					0, "Inside", "TEXT", lowHigh, 0, 0, 0, 1);
			client.elementSwipeWhileNotFound("NATIVE", "id=rangeHigh", "Up", 0,
					2000, "TEXT", high, 0, 1000, 2, false);
			String minValue = client.runNativeAPICall("NATIVE",
					"xpath=//*[@id='rangeHigh']", 0, "view.getMinValue();");
			Assert.assertNotSame(high, minValue);
			client.verifyElementFound("TEXT", setLow, 0);
			client.verifyElementNotFound("TEXT", high, 1);
			client.verifyElementFound("NATIVE", "text=" + getUnits(), 0);
		}
	}


	/**
	 * Author: Ilangovan
	 * 
	 * Select Grams/servings in carbohydrate Units Page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param units
	 *            Select either Grams/Servings
	 *          
	 */

	public void selectCarbohydrateUnits(Client client, String units) {

		if (units.equalsIgnoreCase("Grams")) {
			client.click("NATIVE", "text=grams", 0, 1);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='grams' and @checked='true']", 0);
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
					"xpath=//*[@text='grams' and @checked='false']", 0);

			if (getCountryCode().equals("United States")) {
				if(client.isElementFound("NATIVE",	"xpath=//*[@id='servingSizeText' and @text='1 serving = 15.0 grams']",0)){
					client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,	"slide", "-10");
				}
				else{
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='servingSizeText' and @text='1 serving = 10.0 grams']",
							0);

				}

				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='servingSizeText' and @text='1 serving = 10.0 grams']",
						0);
				client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,"slide", "3");
				client.verifyElementFound("NATIVE",	"xpath=//*[@id='servingSizeText' and @text='1 serving = 11.5 grams']",0);
				client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,	"slide", "5");
				client.verifyElementFound("NATIVE",	"xpath=//*[@id='servingSizeText' and @text='1 serving = 12.5 grams']",0);
				client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,	"slide", "10");
				client.verifyElementFound("NATIVE","xpath=//*[@id='servingSizeText' and @text='1 serving = 15.0 grams']",
						0);

			} else if (getCountryCode().equals("United Kingdom")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='servingSizeText' and @text='1 portion = 10.0 grams']",
						0);
				client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
						"slide", "5");
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='servingSizeText' and @text='1 portion = 12.5 grams']",
						0);
				client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
						"slide", "10");
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='servingSizeText' and @text='1 portion = 15.0 grams']",
						0);
			}

		}
	}

	/**
	 * Author:     Ilangovan
	 * 
	 *    verify High range limits in target Glucose Range
	 * 
	 * @param client
	 * 
	 * @param set
	 *            set the end unit to be selected
	 * @param high
	 *            set the high range unit to be selected
	 * @param low
	 *            set the low range unit to be selected
	 * 
	 */

	public void verifyHighGlucoseRange(Client client, String set,
			String low, String high) {

		if (getUnits().equals("mg/dL")) {

			// High range Start Value
			System.out.println("Setting High and Low range Value");
			setGlucoseRange(client, high, low);
			System.out.println("Set High range as High range Start Value:"
					+ high);
			client.sleep(2000);

			String highvalue1 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
							0);

			int lowvalue = Integer.parseInt(low);
			int HighValue = Integer.parseInt(highvalue1);
			int PrevHighValue = HighValue + 1;
			String PrevHighValue1 = Integer.toString(PrevHighValue);

			if (HighValue > lowvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", highvalue1, 0);
				client.verifyIn("NATIVE", "id=rangeHigh", 0, "Inside", "TEXT",
						PrevHighValue1, 0, 0);
				client.verifyElementFound("TEXT", low, 0);//ilangovan
				System.out.println("Condition Pass");
			} else {
				System.out.println("Condition Fail");
			}

			// High range End Value
			System.out.println("Setting High and Low range Value");
			setGlucoseRange(client, set, low);
			System.out.println("Setting High range as High range End Value:"
					+ set);
			client.sleep(2000);

			String highvalue2 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
							0);

			int HighValueEnd = Integer.parseInt(highvalue2);
			int setvalue = Integer.parseInt(set);
			int PrevHighValueEnd = HighValueEnd - 1;
			String PrevHighValueEnd1 = Integer.toString(PrevHighValueEnd);
			int NextHighValueEnd = HighValueEnd + 1;
			String NextHighValueEnd1 = Integer.toString(NextHighValueEnd);

			if (HighValueEnd <= setvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", highvalue2, 0);
				client.verifyIn("NATIVE", "id=rangeHigh", 0, "Inside", "TEXT",
						PrevHighValueEnd1, 0, 0);
				client.verifyElementNotFound("TEXT", NextHighValueEnd1, 1);
				System.out.println("Condition Pass");

			} else {
				System.out.println("Condition Fail");
			}

		} else if (getUnits().equals("mmol/L")) {

			// High range Start Value
			System.out.println("Setting High and Low range Value");
			setGlucoseRange(client, high, low);
			System.out.println("Set High range as High range Start Value:"
					+ high);
			client.sleep(2000);

			String highvalue1 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
							0);

			Float lowvalue = Float.parseFloat(low);
			Double HighValue = Double.parseDouble(highvalue1);
			Double PrevHighValue = (Double) (HighValue + 0.1d);
			String PrevHighValue1 = Double.toString(PrevHighValue);

			if (HighValue > lowvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", highvalue1, 0);
				client.verifyIn("NATIVE", "id=rangeHigh", 0, "Inside", "TEXT",
						PrevHighValue1, 0, 0);
				client.verifyElementNotFound("TEXT", low, 1);
				System.out.println("Condition Pass");
			} else {
				System.out.println("Condition Fail");
			}

			// High range End Value
			System.out.println("Setting set and Low range Value");
			setGlucoseRange(client, set, low);
			client.sleep(1000);
			System.out.println("Set High range as High range End Value:" + set);
			client.sleep(2000);

			String highvalue2 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
							0);

			Double HighValueEnd = Double.parseDouble(highvalue2);
			Double setvalue = Double.parseDouble(set);
			Double PrevHighValueEnd = (Double) (HighValueEnd - 0.1d);
			String PrevHighValueEnd1 = Double.toString(PrevHighValueEnd);
			Double NextHighValueEnd = (Double) (HighValueEnd + 0.1d);
			String NextHighValueEnd1 = Double.toString(NextHighValueEnd);

			if (HighValueEnd <= setvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", highvalue2, 0);
				client.verifyIn("NATIVE", "id=rangeHigh", 0, "Inside", "TEXT",
						PrevHighValueEnd1, 0, 0);
				client.verifyElementNotFound("TEXT", NextHighValueEnd1, 1);
				System.out.println("Condition Pass");

			} else {
				System.out.println("Condition Fail");
			}
		}
	}

	/**
	 * Author:   Ilangovan
	 * 
	 *      verify Low range limits in target Glucose Range
	 * 
	 * @param client
	 * 
	 * @param set
	 *            set the end unit to be selected
	 * @param high
	 *            set the high range unit to be selected
	 * @param low
	 *            set the low range unit to be selected
	 * 
	 */

	public void verifyLowGlucoseRange(Client client, String set,
			String low, String high) {

		if (getUnits().equals("mg/dL")) {

			// Low range Start Value
			System.out.println("Setting set and Low range Value");
			setGlucoseRange(client, high, low);
			client.sleep(2000);
			System.out.println("Set Low range as Low range Start Value:" + low);
			client.sleep(2000);

			String lowvalue1 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
							0);

			int HighValueEnd = Integer.parseInt(high);
			int lowvalue = Integer.parseInt(low);
			int ExistLowValue = Integer.parseInt(lowvalue1);
			int NextLowValue = ExistLowValue + 1;
			String NextLowValue1 = Integer.toString(NextLowValue);
			int PrevLowValue = ExistLowValue - 1;
			String PrevLowValue1 = Integer.toString(PrevLowValue);

			if (HighValueEnd > lowvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", lowvalue1, 0);
				client.verifyIn("NATIVE", "id=rangeLow", 0, "Inside", "TEXT",
						NextLowValue1, 0, 0);
				client.verifyElementNotFound("TEXT", PrevLowValue1, 1);
				System.out.println("Condition Pass");
			} else {
				System.out.println("Condition Fail");
			}

			// Low range End Value
			System.out.println("Setting set and Low range Value");
			setGlucoseRange(client, high, set);
			client.sleep(2000);
			System.out.println("Set Low range as Low range End Value:" + set);
			client.sleep(2000);

			String lowvalue2 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
							0);

			int HighValueEnd1 = Integer.parseInt(lowvalue2);
			int setvalue = Integer.parseInt(set);
			int PrevLowValueEnd = setvalue - 1;
			String PrevHighValueEnd1 = Integer.toString(PrevLowValueEnd);
			int NextLowValueEnd = setvalue + 1;
			String NextLowValueEnd1 = Integer.toString(NextLowValueEnd);

			if (HighValueEnd1 <= setvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", set, 0);
				client.verifyIn("NATIVE", "id=rangeLow", 0, "Inside", "TEXT",
						PrevHighValueEnd1, 0, 0);
				client.verifyElementNotFound("TEXT", NextLowValueEnd1, 1);
				System.out.println("Condition Pass");

			} else {
				System.out.println("Condition Fail");
			}

		} else if (getUnits().equals("mmol/L")) {

			// Low range Start Value
			System.out.println("Setting set and Low range Value");
			setGlucoseRange(client, high, low);
			client.sleep(2000);
			System.out.println("Set Low range as Low range Start Value:" + low);
			client.sleep(2000);

			String lowvalue1 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
							0);

			Double HighValueEnd = Double.parseDouble(high);
			Double lowvalue = Double.parseDouble(low);
			Double ExistLowValue = Double.parseDouble(lowvalue1);
			Double NextLowValue = (Double) (ExistLowValue + 0.1d);
			String NextLowValue1 = Double.toString(NextLowValue);
			Double PrevLowValue = (Double) (ExistLowValue - 0.1d);
			String PrevLowValue1 = Double.toString(PrevLowValue);

			if (HighValueEnd > lowvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", lowvalue1, 0);
				client.verifyIn("NATIVE", "id=rangeLow", 0, "Inside", "TEXT",
						NextLowValue1, 0, 0);
				client.verifyElementNotFound("TEXT", PrevLowValue1, 1);
				System.out.println("Condition Pass");
			} else {
				System.out.println("Condition Fail");
			}

			// Low range End Value
			System.out.println("Setting set and Low range Value");
			setGlucoseRange(client, high, set);
			client.sleep(2000);
			System.out.println("Set Low range as Low range End Value:" + set);
			client.sleep(2000);

			String lowvalue2 = client
					.elementGetText(
							"NATIVE",
							"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
							0);

			if (lowvalue2.equals(set)) {
				System.out.println("End value matches!!");
			} else {
				client.elementSwipeWhileNotFound("NATIVE",
						"xpath=//*[@id='rangeLow']", "Down", 200, 2000, "TEXT",
						set, 0, 1000, 50, false);
				client.clickIn("NATIVE", "id=rangeLow", 0, "Inside", "TEXT",
						set, 0, 0, 0, 1);
			}
			client.sleep(2000);

			Double HighValueEnd1 = Double.parseDouble(lowvalue2);
			Double setvalue = Double.parseDouble(set);
			Double NextLowValueEnd = (Double) (setvalue + 0.1d);
			String NextLowValueEnd1 = Double.toString(NextLowValueEnd);
			Double PrevLowValueEnd = (Double) (NextLowValueEnd - 0.2d);
			String PrevHighValueEnd1 = Double.toString(PrevLowValueEnd);

			if (HighValueEnd1 <= setvalue) {
				System.out.println("Verification!!");
				client.verifyElementFound("TEXT", set, 0);
				client.verifyIn("NATIVE", "id=rangeLow", 0, "Inside", "TEXT",
						PrevHighValueEnd1, 0, 0);
				client.verifyElementNotFound("TEXT", NextLowValueEnd1, 1);
				System.out.println("Condition Pass");
			}

		}
	}

	/**
	 * Author:    Ilangovan
	 * 
	 *     verify High range limits in target Glucose Range
	 * 
	 * @param client
	 * 
	 * 
	 * 
	 */

	public void verifyLowerGlucoseRangeUnits(Client client) {

		client.verifyElementFound("NATIVE", "text=Target Glucose Range", 0);

		System.out.println("Verification!!");

		if (getUnits().equals("mg/dL")) {
			client.click(
					"NATIVE",
					"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
					0, 2);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='numberpicker_input' and @text='70']", 0);
			client.verifyElementNotFound("TEXT", "69", 0);
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='rangeLow' and @maxValue='71']", 0);

			client.click(
					"NATIVE",
					"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
					0, 2);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='rangeHigh' and @value='71']", 0);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='numberpicker_input' and @text='71']", 0);
			client.verifyElementNotFound("TEXT", "69", 1);

		} else if (getUnits().equals("mmol/L")) {

			client.click(
					"NATIVE",
					"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
					0, 2);
			client.verifyElementFound("TEXT", "3.9", 0);
			client.verifyElementNotFound("TEXT", "4.0", 1);
			client.verifyElementNotFound("TEXT", "3.8", 1);

			client.click(
					"NATIVE",
					"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
					0, 2);
			client.verifyElementFound("TEXT", "4.0", 0);
			client.verifyIn("NATIVE", "id=rangeHigh", 0, "Inside", "TEXT",
					"4.1", 0, 0);
			client.verifyElementNotFound("TEXT", "3.9", 1);

		}

		System.out.println("Condition Pass");

	}
}

