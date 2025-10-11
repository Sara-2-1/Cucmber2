package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,       // <-- مبدئياً نخليه true لاستخراج الخطوات
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner {
}
