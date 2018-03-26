package com.abbott.project37375.reports;

//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
*
*/
public class Testtime {
  private String host = "localhost";
  private int port = 8889;
  private String projectBaseDirectory = "C:\\Users\\THUMMDX\\workspace\\project2";
  protected Client client = null;

  @Before
  public void setUp(){
      client = new Client(host, port, true);
      client.setProjectBaseDirectory(projectBaseDirectory);
      client.setReporter("xml", "reports", "aa");
  }

  @Test
  public void testaa(){
      // it is recommended to start your script with SetDevice command:
      client.setDevice("adb:SM-G900T");
     // String str0 = client.getDeviceProperty("device.time");
      client.run("adb shell am start -a android.settings.DATE_SETTINGS");
      //TODO
      // check Automatic date and Time checkbox is enabled or not. 
    //  if enable then disable it and click on setTime and Enter time and click OK button then perform deviceback action
      client.click("NATIVE", "xpath=//*[@class='android.widget.RelativeLayout' and ./*[@text='Set time']]", 0, 1);
     // client.elementSendText("NATIVE", "xpath=//*[@id='numberpicker_input' and ./parent::*[@id='hour']]", 0, "24");
      if(client.waitForElement("NATIVE", "xpath=//*[@text='OK']", 0, 30000)){
          // If statement
      }
      client.click("NATIVE", "xpath=//*[@text='OK']", 0, 1);
      client.deviceAction("Back");

    //  System.err.println(str0);
     
  }

  @After
  public void tearDown(){
      // Generates a report of the test case.
      // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
      client.generateReport(false);
      // Releases the client so that other clients can approach the agent in the near future. 
      client.releaseClient();
  }
}
