package testrunner;

	
	import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
		@CucumberOptions
				(
						
						
						features={"G:\\eclipse\\Automationteststore_hcl\\src\\test\\resources\\parallel"},
								glue={"stepdefinitions"},
								dryRun=false,
								monochrome=true,
								plugin={"pretty","html:target/reports.html"}
			
				)

		public class Testrunner extends AbstractTestNGCucumberTests {
			
			

		    @Override
		    @DataProvider(parallel = true)
		    public Object[][] scenarios() {
		        return super.scenarios();
		    
		}
		}

