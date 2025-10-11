package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    LocalDateTime startTime;

    @Before
    public void beforeScenario(Scenario scenario) {
        startTime = LocalDateTime.now();
        System.out.println("========================================");
        System.out.println("Test Started: " + startTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Scenario: " + scenario.getName());
        System.out.println("========================================");
    }

    @After
    public void afterScenario(Scenario scenario) {
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("========================================");
        System.out.println("Test Finished: " + endTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Duration: " + duration.getSeconds() + " seconds");
        System.out.println("Status: " + scenario.getStatus());
        System.out.println("========================================");
    }
}
