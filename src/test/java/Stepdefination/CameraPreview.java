package Stepdefination;


import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import AppiumExit.ExitTest.App;
import Page.Camera;
import io.cucumber.java.en.*;

public class CameraPreview extends App{
	Camera Picture; 
	static Logger Logger= LogManager.getLogger(CameraPreview.class);


	

	@Given("user is on app homepage")
	public void user_is_on_app_homepage() throws InterruptedException {
	Logger.info("starting");	
	}
	
	@When("user hits graphics")
	public void user_hits_graphics() throws InterruptedException {
	    Picture=new Camera(wd);
		 Picture.click_on_continue();

	    Picture.click_graphics();
	    
	}

	@Then("user is navigated to the next page")
	public void user_is_navigated_to_the_next_page() {
	  
	}
	
	@When("next user hits camera preview")
	public void next_user_hits_camera_preview() throws InterruptedException {
	    Picture=new Camera(wd);
	    Picture.click_CameraPreview();
		   wd.quit();

	}

	@Then("the camera preview started successfully and the test case is validated!")
	public void the_camera_preview_started_successfully_and_the_test_case_is_validated() {
		Logger.info("Stoped");	

	}
}
