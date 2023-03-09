package Stepdefination;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import AppiumExit.ExitTest.App;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Screenshot {
	
@Before
	public void BeforeHook() {
		System.out.print("Running before hook");
	}

	@After
	public void Screenshot(Scenario scenario) throws InterruptedException {
		System.out.print("Running after hook................");
		if(scenario.isFailed())
		{
			App sk =new App();
			final byte[] screenshot = ((TakesScreenshot) sk.wd).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
			System.out.print(" ....SCREENSHOT TAKEN!..... ");
		}
	}		
}


