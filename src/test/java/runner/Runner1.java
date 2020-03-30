package runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"steps"},
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports",
        		"json:target/cucumber-reports/cucumber.xml"}
)

public class Runner1 {
}
