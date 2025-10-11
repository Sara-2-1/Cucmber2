package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ArithmeticSteps {

    int num1, num2, result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(Integer int1, Integer int2) {
        num1 = int1;
        num2 = int2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        result = num1 + num2;
    }

    @When("I subtract the numbers")
    public void i_subtract_the_numbers() {
        result = num1 - num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expectedResult) {
        Assert.assertEquals(expectedResult.intValue(), result);
        System.out.println("✅ Result verified: " + result);
    }
}
