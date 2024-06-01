package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features\\LoginModuleDataProvider.feature","features\\LoginModule.feature"},
glue = {"step.definition"},
plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty"}
		)
public class LoginTestRunner2 extends AbstractTestNGCucumberTests{

}
