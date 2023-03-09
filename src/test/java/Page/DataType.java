package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import AppiumExit.ExitTest.excel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DataType {
	 private AppiumDriver<MobileElement> wd;

	public DataType(WebDriver wd ) {
		 this.wd = (AppiumDriver<MobileElement>) wd;
		 PageFactory.initElements(wd,this);
     }
	excel user;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement continu;
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement ok;
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	 WebElement content;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 WebElement clipboard;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView")
	WebElement Datatypes;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
	WebElement textclipPage;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
	WebElement textclip;
	
	public void click_on_continue() throws InterruptedException
	{
		continu.click();
		Thread.sleep(5000);
	}
	
	public void click_content() throws InterruptedException
	 {
		
		ok.click();
		Thread.sleep(5000);
		content.click();
		Thread.sleep(2000);
	 }
	
	public void click_clipboard()
	 {
		clipboard.click();
	 }
	
	public void click_Datatypes() 
	 {
		//Assert.assertTrue(this.textclipPazzge.isDisplayed());

		Datatypes.click(); 
		
	 }
	public void click_textclip() throws InterruptedException, IOException {
		Assert.assertTrue(this.textclipPage.isDisplayed());
		textclip.sendKeys(user.name());
		Thread.sleep(10000);
	}
}
