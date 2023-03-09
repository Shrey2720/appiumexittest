package Stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppiumExit.ExitTest.App;
import Page.DataType;
import io.cucumber.java.en.*;

public class DataTypes extends App{
	DataType Text;
	static Logger Logger= LogManager.getLogger(DataTypes.class);


	@Given("user is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException {
	  // Text.click_on_continue();
		Logger.info("starting");	

	}
	
	@When("user hits content")
	public void user_hits_content() throws InterruptedException {
	    Text=new DataType(wd);
	    Text.click_on_continue();
	    Text.click_content();
	    
	    
	}

	@Then("user is navigated to content page")
	public void user_is_navigated_to_content_page() {
	  
	}
	
	@When("next user hits clipboard")
	public void next_user_hits_clipboard() throws InterruptedException {
	    Text=new DataType(wd);
	    Text.click_clipboard();
	}

	@Then("user is navigated to clipboard page")
	public void user_is_navigated_to_clipboard_page() {
	 
	}
	
	@When("user hits Data Types")
	public void user_hits_Data_Types() throws InterruptedException {
	   Text=new DataType(wd);
	   Text.click_Datatypes();
	}

	@Then("user is navigated to Data Type Page")
	public void user_is_navigated_to_Data_Type_Page() {

	}
	
	@And("user starts writing the Data Type")
	public void user_starts_writing_the_Data_Type() throws InterruptedException, IOException {
	    Text=new DataType(wd);
	    Text.click_textclip();
		   wd.quit();

	       
	}

	@Then("the text started typing successfully and the test case is validated!")
	public void the_text_started_typing_successfully_and_the_test_case_is_validated() {
		Logger.info("Stoped");	

	}

}
