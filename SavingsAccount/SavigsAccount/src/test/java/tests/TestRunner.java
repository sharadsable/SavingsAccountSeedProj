package tests;
import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun=true,
features="src/test/resources/Features/HomePage1.feature", 
// \src\test\resources\Feature\HomePage.feature
//SF.feature
///Registration.feature
///FlightSearch.feature
//RediffPOM.feature
glue ="stepdefinitions",
plugin= {"pretty", "html:target/test-report"},
monochrome=true
//tags ="@pri2"

//tags = "@pri1 and @regression"// runs all scenarious tagged as both pri1
//tags = "@pri2 or @smoke"// 
//tags ="not @pri2"
		)
	
	
	public class TestRunner {

}
