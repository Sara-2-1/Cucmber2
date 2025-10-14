package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // مسار ملفات feature
        glue = "stepdefinitions",                  // package الكلاسات الي فيها step definitions
        tags = "@ContactList",                     // tag اللي تريدين تشغليه
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class ContactListRunner {

}

