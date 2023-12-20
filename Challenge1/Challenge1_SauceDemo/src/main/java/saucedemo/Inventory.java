package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Inventory extends Base {

    public Inventory(WebDriver driver) {
        super(driver);
    }

    By inventoryContainerId = By.id("inventory_container");

    public boolean isDisplayedCart(){
        return isDisplayed(inventoryContainerId);
    }
}
