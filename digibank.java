import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;

public class Untitled {
 private String reportDirectory = "reports";
 private String reportFormat = "xml";
 private String testName = "Untitled";
 protected AndroidDriver<AndroidElement> driver = null;

 DesiredCapabilities dc = new DesiredCapabilities();
 
 @Before
 public void setUp() throws MalformedURLException {
  dc.setCapability("reportDirectory", reportDirectory);
  dc.setCapability("reportFormat", reportFormat);
  dc.setCapability("testName", testName);
  dc.setCapability(MobileCapabilityType.UDID, "041604aa08431e02");
  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.dbs.sit1.dbsmbanking");
  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.dbs.sg.digibank.MainActivity");
  dc.setCapability("instrumentApp", true);
  driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
 }
 
 @Test
 public void testUntitled() {
  driver.findElement(By.xpath("//*[@text='App']")).click();
  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='UAT4']")));
  driver.findElement(By.xpath("//*[@text='UAT4']")).click();
 }
 
 @After
 public void tearDown() {
     driver.quit();
 }
}