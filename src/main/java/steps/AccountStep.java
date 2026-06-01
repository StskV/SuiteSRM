package steps;

import dto.Account;
import org.openqa.selenium.WebDriver;
import pages.AccountDetailPage;
import pages.NewAccountPage;

public class AccountStep {
    private final WebDriver driver;
    private final NewAccountPage newAccountPage;

    public AccountStep(WebDriver driver) {
        this.driver = driver;
        this.newAccountPage = new NewAccountPage(driver);
    }

    public AccountDetailPage createAccount(Account account) {
        newAccountPage.open()
                .isPageOpened()
                .createAccount(account)
                .saveNewAccount();
        return new AccountDetailPage(driver);
    }
}