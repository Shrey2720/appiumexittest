package AppiumExit.ExitTest;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
   features = "C:\\Users\\shreykhanna\\eclipse-workspace\\ExitTest\\src\\test\\java\\Feature",
   glue = {"Stepdefination"},
   monochrome=true,
   plugin= {"pretty","html:target/cucumber-report",
		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
   tags= "@Tag3"
   )
public class Runner extends AbstractTestNGCucumberTests{
}
