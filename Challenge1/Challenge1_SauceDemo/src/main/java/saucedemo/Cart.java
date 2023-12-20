package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart  extends Base{

    By checkOutBtmId = By.id("checkout");
    public Cart(WebDriver driver) {
        super(driver);
    }

    public void clickOnCheckOutCart(){
        clickOnElement(checkOutBtmId);
    }
}
