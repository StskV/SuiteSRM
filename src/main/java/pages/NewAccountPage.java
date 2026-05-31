package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.*;

public class NewAccountPage extends BasePage {
    private final By SAVE_LOCATOR = By.xpath(
            "//div[@id='EditView_tabs']/following-sibling::div[@class='buttons']/input[@title='Save']"
    );

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage open() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=Accounts&return_action=DetailView");
        return this;
    }

    public NewAccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_LOCATOR));
        return this;
    }

    public NewAccountPage createAccount(Account account) {
        new Input(driver, "Name").write(account.getName());
        new Input(driver, "Office Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Fax").write(account.getFax());
        new EmailInput(driver).write(account.getEmail());
        new Checkbox(driver, "Opted Out").check();
        new AddressField(driver, "Billing Address", "Street").write(account.getBillingStreet());
        new AddressField(driver, "Billing Address", "City").write(account.getBillingCity());
        new AddressField(driver, "Billing Address", "State/Region").write(account.getBillingState());
        new AddressField(driver, "Billing Address", "Postal Code").write(account.getBillingPostalCode());
        new AddressField(driver, "Billing Address", "Country").write(account.getBillingCountry());
        new AddressField(driver, "Shipping Address", "Street").write(account.getShippingStreet());
        new AddressField(driver, "Shipping Address", "City").write(account.getShippingCity());
        new AddressField(driver, "Shipping Address", "State/Region").write(account.getShippingState());
        new AddressField(driver, "Shipping Address", "Postal Code").write(account.getShippingPostalCode());
        new AddressField(driver, "Shipping Address", "Country").write(account.getShippingCountry());
        new TextArea(driver, "Description").write(account.getDescription());
        new Select(driver, "Type").select(account.getType());
        new Select(driver, "Industry").select(account.getIndustry());
        return this;
    }

    public void saveNewAccount() {
        driver.findElement(SAVE_LOCATOR).click();
    }
}