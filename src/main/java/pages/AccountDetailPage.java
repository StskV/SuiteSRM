package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountDetailPage extends BasePage {

    private final By OVERVIEW_TAB = By.id("tab0");
    private final By ACCOUNT_NAME_FIELD = By.xpath("//div[contains(text(), 'Name:')]/following-sibling::div");

    public AccountDetailPage(WebDriver driver) {
        super(driver);
    }

    public AccountDetailPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(OVERVIEW_TAB));
        return this;
    }

    public String getAccountName() {
        return driver.findElement(ACCOUNT_NAME_FIELD).getText();
    }
}