package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserAccountPage;

public class UserAccountStepdefinitions {
    UserAccountPage AccountPage;

    @When("user types email {string}")
    public void user_types_email(String email) {
        AccountPage = new UserAccountPage();
        AccountPage.enterEmail(email);

}
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        AccountPage = new UserAccountPage();
        AccountPage.enterPassword(password);

    }
    @When("user clicks on {string} button")
    public void user_clicks_on_button(String buttonName) {
        UserAccountPage accountPage = new UserAccountPage();
        switch(buttonName.toLowerCase()) {
            case "submit":
                accountPage.clickSubmitButton();
                break;
            case "add a new contact":
                accountPage.clickAddUserButton();
                break;
            default:
                throw new IllegalArgumentException("Button " + buttonName + " not found");
        }
    }




    @Then("assert that {string} is displayed")
    public void assert_that_is_displayed(String message) {
    }

    @When("user enters first name {string}")
    public void user_enters_first_name(String name) {
        AccountPage = new UserAccountPage();
        AccountPage.enterFirstName(name);

    }
    @When("user enters last name {string}")
    public void user_enters_last_name(String name) {
        AccountPage = new UserAccountPage();
        AccountPage.enterLastName(name);

    }

    @Then("assert that {string} is displayed in the contact list")
    public void assert_that_is_displayed_in_the_contact_list(String message) {

    }


}