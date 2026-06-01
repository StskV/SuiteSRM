package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailInput {
    private final WebDriver driver;

    public EmailInput(WebDriver driver) {
        this.driver = driver;
    }

    public void write(String email) {
        driver.findElement(By.xpath(
                "//input[@type='email' and contains(@id,'Accounts') and not(contains(@class,'hidden'))]"
        )).sendKeys(email);
    }
}