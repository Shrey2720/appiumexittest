package AppiumExit.ExitTest;
import java.net.URL;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class App {
	public static AppiumDriver<MobileElement> wd ;
	
	public App() {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability ("platformVersion", "10.0");
		capabilities.setCapability ("appPackage", "com.hmh.api"); 
		capabilities.setCapability("appActivity", ".ApiDemos");
		capabilities.setCapability ("deviceName", "Android");
		capabilities.setCapability ("app", "C:\\Users\\shreykhanna\\Downloads\\apidemos.apk");
	try {
		wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}catch(Exception e) {
	 e.printStackTrace();
	}
	}
	

public int swipeDown(double startpercentage, double endpercentage, double anchorpercentage) {   
	Dimension size = wd.manage().window().getSize();
	int anchor = (int) (size.width * anchorpercentage);
	int startpoint = (int) (size.height * startpercentage);
	int endpoint = (int) (size.height * endpercentage);
	new TouchAction (wd).press (point (anchor, startpoint))
	.waitAction (waitOptions(ofMillis(1000))).moveTo(point (anchor, endpoint)).release().perform();
	return 1;
}// Scrolling Function

	@AfterTest
	public void stopappium() {
		wd.quit();
	}
}
