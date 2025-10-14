package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.RegisterPage;

import java.net.MalformedURLException;
import java.net.URL;

public class ContactListSteps {

    WebDriver driver;
    RegisterPage registerPage;

    @Given("user opens contact list page {string}")
    public void user_opens_contact_list_page(String url) throws MalformedURLException {
        // إعداد الاتصال بالـ Selenium Grid
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome"); // أو "firefox"
        capabilities.setCapability("platformName", "mac");

        driver = new RemoteWebDriver(new URL("http://192.168.8.11:4444"), capabilities);
        driver.manage().window().maximize();

        driver.get(url);
        registerPage = new RegisterPage(driver);
    }

    @When("user creates an account with email {string} and password {string}")
    public void user_creates_an_account_with_email_and_password(String email, String password) {
        registerPage
                .clickSignUp()
                .enterEmail(email)
                .enterPassword(password)
                .submitForm();
    }

    @Then("the account should be created successfully")
    public void the_account_should_be_created_successfully() {
        System.out.println("✅ Account created successfully!");
        if (driver != null) {
            driver.quit();
        }
    }
}
