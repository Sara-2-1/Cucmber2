package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddStudentPage;

public class AddStudentStepDefinitions {
    AddStudentPage studentPage = new AddStudentPage();

    @When("user enters full name {string}")
    public void user_enters_full_name(String name) {
        studentPage.enterFullName(name);
    }

    @When("user enters student id {string}")
    public void user_enters_student_id(String id) {
        studentPage.enterStudentId(id);
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        studentPage.enterEmail(email);
    }

    @When("user enters course {string}")
    public void user_enters_course(String course) {
        studentPage.enterCourse(course);
    }

    @When("user selects grade {string}")
    public void user_selects_grade(String grade) {
        studentPage.selectGrade(grade);
    }

    @When("user click on add student button")
    public void user_click_on_add_student_button() {
        studentPage.clickAddStudentButton();
    }

    @Then("assert that student is added")
    public void assert_that_student_is_added() {
        Assert.assertTrue("Student was not added successfully!", studentPage.isStudentAdded());
    }

    @Then("assert that error message is displayed as {string}")
    public void assertThatErrorMessageIsDisplayedAs(String expectedMessage) {
        String actualMessage = studentPage.getErrorMessage();
        Assert.assertEquals("Error message did not match!", expectedMessage, actualMessage);
    }
}
