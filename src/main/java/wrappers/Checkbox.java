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

    public void check(boolean checked) {
        String titleValue = label.equals("Opted Out") ? "Opt Out" : label;
        String xpathExpression = String.format("//div[contains(@id, 'emailAddressRow0')]//input[@title='%s']", titleValue);
        WebElement checkbox = driver.findElement(By.xpath(xpathExpression));
        if (checkbox.isSelected() != checked) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
        }
    }
}