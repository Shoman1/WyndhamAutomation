package testRunner;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
/*
import cucumbers.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//Features/Login.feature", 
		glue = "stepDefinations",
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty", "html:test-output" }
		
		)

public class TestRunner {

}
*/

@CucumberOptions
(features = {".//Features/Login.feature"}, 
glue= {"stepDefinations"}, 
plugin = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
monochrome = true, 
strict = true,
dryRun=false
//tags={"@CRMLoginTest"})
//tags={"@SanityTest, @RegressionTest"}
)

public class TestRunner 
{
private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun = true)
public void setUpClass() throws Exception 
{
testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
}

@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
public void feature(CucumberFeatureWrapper cucumberFeature) 
{
testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
}

@DataProvider
public Object[][] features() 
{
return testNGCucumberRunner.provideFeatures();
}

@AfterClass(alwaysRun = true)
public void tearDownClass() throws Exception 
{
testNGCucumberRunner.finish();
}
}