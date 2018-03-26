package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Assert;

import com.abbott.project37375.main.BaseHelper;
import com.experitest.client.Client;

public class HelpHelper extends BaseHelper {


	/**
	 * Author: Ilangovan 
	 * 
	 * Verify Application Version
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 */

	public void verifyApplicationVersion(Client client) {

		client.verifyElementFound("NATIVE", "xpath=//*[@text='Software Version:']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='softwareVersion'] ", 0);
		String appversion = client.elementGetText("NATIVE","xpath=//*[@id='softwareVersion']", 0);
		Assert.assertEquals(appversion.replace("-", "."),getAppversion().replace("-", "."));
	}


	/**
	 * Author: Ilangovan 
	 * 
	 * Verify UDI information
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyUDI(Client client) {

		if (getCountryCode().equals("United States")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='udiLabel' and @onScreen='true']", 0);
			String appUdi= client.elementGetText("NATIVE", "xpath=//*[@id='udiValue' and @onScreen='true']", 0).replaceAll("\\s", "");
			Assert.assertEquals(appUdi.replace("-", "."),getAppudi().replace("-", "."));
		} else if (getCountryCode().equals("United Kingdom")) {
			client.verifyElementNotFound("NATIVE",  "xpath=//*[@text='UDI:' and @onScreen='true']", 0);

		}
	}

	/**
	 * Author: Ilangovan 
	 * 
	 * Verify CE and Website Information
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyCEWebSite(Client client) {

		if (getCountryCode().equals("United States")) {
			client.swipeWhileNotFound("Down", 100, 500, "NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0, 1000, 5, true);
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0);
		} else if (getCountryCode().equals("United Kingdom")) {
			client.swipeWhileNotFound("Down", 100, 500, "NATIVE", "xpath=//*[@id='ceMark' and @onScreen='true']", 0, 1000, 5, true);
			client.verifyElementFound("NATIVE", "xpath=//*[@text='CELogo' and @onScreen='true']", 0);

		}
		client.verifyElementFound("NATIVE", "xpath=//*[@id='customerSupport' and @text='"+getLangPropValue("supportWebsiteValue")+"']", 0);
		client.verifyElementFound("NATIVE", "text=${patentWebsiteLabel}", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+getLangPropValue("patentWebsiteValue")+"' and @onScreen='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='customerSupport' and @text='"+getLangPropValue("supportWebsiteValue")+"']", 0, 1);
		waitFor(client,2);
	}


	/**
	 * Author: Ilangovan 
	 * 
	 * verify user's manual Guide
	 *         
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyUsersManualGuide(Client client) {	
		waitForProgress(client);
		client.waitForElementToVanish("NATIVE","text=${helpItemTitleUserGuide}",0, 80000);
		waitFor(client,30);
		client.verifyElementFound("NATIVE", "text=${helpItemTitleUserGuide}", 0);

	}


	/**
	 * Author: Ilangovan
	 * 
	 * Verify How to Apply new sensor steps
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
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
	 * Author: Ilangovan
	 * 
	 * Verify  How to Scan a sensor Pages
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyHowToScanSensorPages(Client client) {
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


}
