package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inventory extends Base {

    public Inventory(WebDriver driver) {
        super(driver);
    }

    By inventoryContainerId = By.id("inventory_container");
    By backpackAddToCartId = By.id("add-to-cart-sauce-labs-backpack");
    By backpackRemoveToCartId =By.id("remove-sauce-labs-backpack");
    By productCountCartClass = By.className("shopping_cart_badge");

    By cartBtmClass = By.className("shopping_cart_link");

    public boolean isDisplayedCart(){
        return isDisplayed(inventoryContainerId);
    }

    public void addToCart(){
        clickOnElement(backpackAddToCartId);
    }

    public boolean checkAddToCart(){
        return isDisplayed(productCountCartClass);
    }

    public boolean deleteItemCart(){
        if (isDisplayed(productCountCartClass)){
            clickOnElement(backpackRemoveToCartId);
            return isDisplayed(backpackAddToCartId);
        }else {
            return false;
        }
    }

    public void goToCartCheck(){
        if (checkAddToCart()){
            clickOnElement(cartBtmClass);
        }
    }

}
