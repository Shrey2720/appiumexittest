package Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppiumExit.ExitTest.App;
import Page.TextSpeech;
import io.cucumber.java.en.*;

public class TextToSpeech extends App{
	TextSpeech Text;
	static Logger Logger= LogManager.getLogger(TextToSpeech.class);

	
	
	@Given("the app is open")
	public void the_app_is_open() throws InterruptedException {
		Logger.info("starting");	

	 
	}
	 
	@When("user hits app options")
	public void user_hits_app_options() throws InterruptedException {
	    Text=new TextSpeech(wd);
		Text.click_on_continue();
	    Text.click_App();
	}
	@Then("user is navigated to app page")
	   public void user_is_navigated_to_app_page() throws Throwable {
		
		}

	@When("next user swipe down")
	public void next_user_swipe_down() {
	   
	}
	 
	@And("clicks text to speech")
	public void clicks_text_to_speech() throws InterruptedException {
	    Text=new TextSpeech(wd);
	    Text.click_TextToSPeech();
		   wd.quit();

	}

	@Then("the fuctionaltity starts working and is validated")
	public void the_fuctionaltity_starts_working_and_is_validated() {
		Logger.info("Stoped");	

}
}