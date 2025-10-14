package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class UserAccountPage {

    private By email = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By addNewContact = By.id("signup");  // تم تعديلها
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By submitButton = By.id("submit");

    public UserAccountPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public UserAccountPage enterPassword(String password) {
        Driver.getDriver().findElement(this.password).sendKeys(password);
        return this;
    }

    public UserAccountPage clickLoginButton() {
        Driver.getDriver().findElement(loginButton).click();
        return this;
    }

    public UserAccountPage clickAddUserButton() {
        Driver.getDriver().findElement(addNewContact).click();
        return this;
    }

    public UserAccountPage enterFirstName(String name) {
        Driver.getDriver().findElement(firstName).sendKeys(name);
        return this;
    }

    public UserAccountPage enterLastName(String name) {
        Driver.getDriver().findElement(lastName).sendKeys(name);
        return this;
    }

    public UserAccountPage clickSubmitButton() {
        Driver.getDriver().findElement(submitButton).click();
        return this;
    }
}
