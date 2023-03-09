package Stepdefination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppiumExit.ExitTest.*;
import Page.Audioo;
import io.cucumber.java.en.*;
@Test
public class Audio extends App {
	Audioo Media;
	static Logger Logger= LogManager.getLogger(Audio.class);


	@Given("^user is on the app homepage$")
	public void user_is_on_the_app_homepage() throws Throwable {
		Media=new Audioo(wd);
		Thread.sleep(5000);
		Logger.info("starting");	
		//Media.click_on_continue();
		
	  
	}
   @When("^user hits media$")
   public void user_hits_media() throws Throwable {
	//   Media=new Audioo(wd);
		Media.click_on_continue();
	   Media.click_media();
	  
	}

   @Then("^user is navigated to next page$")
   public void user_is_navigated_to_next_page() throws Throwable {
	
	}
	@When("^next user hits media player$")
	public void next_user_hits_media_player() throws Throwable {
	  Media.click_mediaplayer();
	}
	@Then("^user is navigated to media player page$")
	public void user_is_navigated_to_media_player_page() throws Throwable {
	    
	}
	@Then("^user hits play audio from resources$")
	public void user_hits_play_audio_from_resources() throws Throwable{
	   Media.click_playaudio();
	   wd.quit();
	}

	@Then("^the audio started playing successfully and the test case is validated!$")
	public void the_audio_started_playing_successfully_and_the_test_case_is_validated() throws Throwable {
		Logger.info("stoped");	

	}
}
