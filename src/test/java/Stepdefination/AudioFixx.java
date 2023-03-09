package Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppiumExit.ExitTest.App;
import Page.AudioFix;
import io.cucumber.java.en.*;

public class AudioFixx extends App{
AudioFix Equalizer;
static Logger Logger= LogManager.getLogger(AudioFixx.class);



@Given("user is on the apphomepage")
public void user_is_on_the_apphomepage() throws InterruptedException {
	Logger.info("starting");	

	//Equalizer.click_on_continue();
}

@When("user click media")
public void user_hits_media() throws InterruptedException {
    
    Equalizer=new AudioFix(wd);
	Equalizer.click_on_continue();

    Equalizer.click_media();
}

@Then("user is navigated to media page")
public void user_is_navigated_to_media_page() {
 
}
@When("next user hits audioFx")
public void next_user_hits_audioFx() throws InterruptedException {
   
    Equalizer=new AudioFix(wd);
    Equalizer.click_AudioFx();
}

@Then("user is navigated to audioFx page")
public void user_is_navigated_to_audioFx_page() {
  
}
@Then("user starts equalizing audio from resources")
public void user_starts_equalizing_audio_from_resources() throws InterruptedException{
   
    Equalizer=new AudioFix(wd);
    Equalizer.click_Equalizer();
	   wd.quit();

}

@Then("the audio started successfully and the test case is validated!")
public void the_audio_started_successfully_and_the_test_case_is_validated() {
	Logger.info("stoped");	

}


	}

