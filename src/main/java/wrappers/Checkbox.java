package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
    private final WebDriver driver;
    private final String label;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void check() {
        String xpath = String.format("//*[contains(text(), '%s')]/parent::div//input", label);
        WebElement checkboxElement = driver.findElement(By.xpath(xpath));
        if (!checkboxElement.isSelected()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", checkboxElement);
        }
    }
}