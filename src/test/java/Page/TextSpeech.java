package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AppiumExit.ExitTest.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement; 
public class TextSpeech extends App
{
	 public TextSpeech(WebDriver wd ) {
		 this.wd = (AppiumDriver<MobileElement>) wd;
		 PageFactory.initElements(wd,this);
     }
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement continu;
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement ok;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]" )
	 WebElement App;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[12]")
	 WebElement TextToSPeech;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button")
	 WebElement Again;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[12]")
	 WebElement TextToSPeechPage;
	public void click_on_continue() throws InterruptedException
	{
		continu.click();
		Thread.sleep(5000);
	}
	
	public void click_App() throws InterruptedException
	 {

		ok.click();
		Thread.sleep(5000);
		App.click();
		Thread.sleep(2000);
		swipeDown(0.70,0.10,0.50);
	 }
	
	public void click_TextToSPeech()
	 {
		Assert.assertTrue(this.TextToSPeechPage.isDisplayed());
		TextToSPeech.click();
	 }
}