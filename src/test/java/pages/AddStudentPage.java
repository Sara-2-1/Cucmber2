package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class AddStudentPage {

    private By name = By.id("name");
    private By studentId = By.id("studentId");
    private By email = By.id("email");
    private By course = By.id("course");
    private By grade = By.id("grade");
    private By submitBtn = By.id("submitBtn");
    private By firstRow = By.xpath("//tbody/tr");
    private By message = By.id("message"); // تأكدي من الـ id في صفحة الـ HTML

    public AddStudentPage enterFullName(String fullName) {
        Driver.getDriver().findElement(name).clear();
        Driver.getDriver().findElement(name).sendKeys(fullName);
        return this;
    }

    public AddStudentPage enterStudentId(String studentId) {
        Driver.getDriver().findElement(this.studentId).clear();
        Driver.getDriver().findElement(this.studentId).sendKeys(studentId);
        return this;
    }

    public AddStudentPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).clear();
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public AddStudentPage enterCourse(String course) {
        Driver.getDriver().findElement(this.course).clear();
        Driver.getDriver().findElement(this.course).sendKeys(course);
        return this;
    }

    public AddStudentPage selectGrade(String grade) {
        new Select(Driver.getDriver().findElement(this.grade)).selectByVisibleText(grade);
        return this;
    }

    public AddStudentPage clickAddStudentButton() {
        Driver.getDriver().findElement(submitBtn).click();
        return this;
    }
    public boolean isStudentAdded() {
        return Driver.getDriver().findElement(firstRow).isDisplayed();
    }

    public String getErrorMessage() {
        WebElement errorMsg = Driver.getDriver().findElement(message);
        return errorMsg.getText().trim();
    }
}
