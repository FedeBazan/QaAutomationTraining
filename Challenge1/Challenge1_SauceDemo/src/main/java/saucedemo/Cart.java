package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart  extends Base{

    By checkOutBtmId = By.id("checkout");
    By titlePageClass = By.className("title");
    public Cart(WebDriver driver) {
        super(driver);
    }


    public String checkPageTitle(){
        return getText(titlePageClass);

    }
    public void clickOnCheckOutCart(){
        clickOnElement(checkOutBtmId);
    }
}
