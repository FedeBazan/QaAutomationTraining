package saucedemo;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(By locator,String data){
        driver.findElement(locator).sendKeys(data);
    }

    public void clickOnElement(By locator){
        driver.findElement(locator).click();
    }

    public void findElement ( By locator){
        driver.findElement(locator);
    }

    public boolean isDisplayed(By locator){
        boolean element = driver.findElement(locator).isDisplayed();
        return element;
    }
}
