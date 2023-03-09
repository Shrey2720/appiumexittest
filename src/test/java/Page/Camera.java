package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Camera {
	 private AppiumDriver<MobileElement> wd;

	public Camera(WebDriver wd ) {
		 this.wd = (AppiumDriver<MobileElement>) wd;
		 PageFactory.initElements(wd,this);
     }
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement continu;
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement ok;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]" )
	 WebElement graphics;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]")
	 WebElement Camerapage;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]")
	 WebElement CameraPreview;
	
	public void click_on_continue() throws InterruptedException
	{
		continu.click();
		Thread.sleep(5000);
	}
	
	public void click_graphics() throws InterruptedException
	 {
		
		ok.click();
		Thread.sleep(5000);
		graphics.click();
		Thread.sleep(2000);
	 }
	
	public void click_CameraPreview()
	 {
		Assert.assertTrue(this.Camerapage.isDisplayed());

		CameraPreview.click();
	 }

}
