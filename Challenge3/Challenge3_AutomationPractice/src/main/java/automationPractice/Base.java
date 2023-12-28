package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

    WebDriver driver;
    WebDriverWait wait;

    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void sendKeys(By locator, String data) {
        driver.findElement(locator).sendKeys(data);
    }

    public void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    public void findElement(By locator) {
        driver.findElement(locator);
    }

    public boolean isDisplayed(By locator) {
        boolean element = driver.findElement(locator).isDisplayed();
        return element;
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getTittleWeb() {
        String text = driver.getTitle();
        return text;
    }
}
