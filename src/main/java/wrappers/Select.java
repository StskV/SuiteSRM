package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select {
    private final WebDriver driver;
    private final String label;

    private static final String SELECT_PATTERN =
            "//div[contains(text(), '%s')]/following-sibling::div//select";

    private static final String OPTION_PATTERN =
            "//div[contains(text(), '%s')]/following-sibling::div//option[contains(text(), '%s')]";

    public Select(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(SELECT_PATTERN, label))).click();
        driver.findElement(By.xpath(String.format(OPTION_PATTERN, label, option))).click();
    }
}