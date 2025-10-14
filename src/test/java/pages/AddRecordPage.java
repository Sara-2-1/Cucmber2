package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class AddRecordPage {

    public AddRecordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nameInput")
    private WebElement nameInput;

    @FindBy(id = "ageInput")
    private WebElement ageInput;

    @FindBy(id = "countrySelect")
    private WebElement countrySelect;

    @FindBy(xpath = "//button[.='Add Record']")
    private WebElement addRecord;

    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void enterAge(String age) {
        ageInput.sendKeys(age);
    }

    public void selectCountry(String country) {
        new Select(countrySelect).selectByVisibleText(country);
    }

    public void clickAddRecord() {
        addRecord.click();
    }

}
