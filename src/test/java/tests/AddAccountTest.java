package tests;

import dto.Account;
import org.testng.annotations.Test;
import pages.AccountDetailPage;

import static dto.AccountFactory.getAccount;
import static org.testng.Assert.assertEquals;

public class AddAccountTest extends BaseTest {
    private final Account account = getAccount("Integrator", "Energy");

    @Test
    public void checkAddAccount() {
        loginStep.auth("will", "will");
        AccountDetailPage detailPage = accountStep.createAccount(account);
        String actualAccountName = detailPage.isPageOpened().getAccountName();
        assertEquals(actualAccountName, account.getName(), "Account name does not match");
    }
}