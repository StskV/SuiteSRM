package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressField {
    private final WebDriver driver;
    private final String section;
    private final String field;

    public AddressField(WebDriver driver, String section, String field) {
        this.driver = driver;
        this.section = section;
        this.field = field;
    }

    public void write(String text) {
        String xpath = String.format(
                "//div[contains(@class,'edit-view-field')]"
                        + "[.//*[contains(normalize-space(.), '%s')]]"
                        + "//*[contains(normalize-space(.), '%s')]"
                        + "/following::input[1] | "
                        + "//div[contains(@class,'edit-view-field')]"
                        + "[.//*[contains(normalize-space(.), '%s')]]"
                        + "//*[contains(normalize-space(.), '%s')]"
                        + "/following::textarea[1]",
                section, field, section, field
        );
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
}