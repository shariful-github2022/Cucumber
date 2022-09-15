package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Feature",  
		glue= "stepDef",
		dryRun=true,
		monochrome=true,
		plugin= {"json:target/cucumber.json"}
		
	
		
		
		
		
		
		) 





public class RunClass extends AbstractTestNGCucumberTests{
	
	

}
