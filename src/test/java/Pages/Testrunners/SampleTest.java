package Pages.Testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/Features"},
        glue = {"Steps"},plugin = {"pretty"},
        dryRun = true,
        monochrome = true,
        tags = "@smoke,@regression")



public class SampleTest {
}
