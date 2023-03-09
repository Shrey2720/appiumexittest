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
public class Audioo extends App
{
	 public Audioo(WebDriver wd ) {
		 this.wd = (AppiumDriver<MobileElement>) wd;
		 PageFactory.initElements(wd,this);
     }
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement continu;
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement ok;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]" )
	 WebElement media;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 WebElement mediaplayer;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[4]")
	WebElement playaudiopage;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[4]")
	WebElement playaudio;
	
	public void click_on_continue() throws InterruptedException
	{
		continu.click();
		Thread.sleep(5000);
	}
	
	
	public void click_media() throws InterruptedException
	 {
		
		ok.click();
		Thread.sleep(5000);
		media.click();
		Thread.sleep(2000);
	 }
	
	public void click_mediaplayer()
	 {
		mediaplayer.click();
	 }
	
	public void click_playaudio() throws InterruptedException
	 {

		Assert.assertTrue(this.playaudiopage.isDisplayed());
		playaudio.click(); 
		Thread.sleep(10000);
	
	 }
	
}