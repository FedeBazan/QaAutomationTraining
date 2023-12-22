package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutComplete extends Base{

    By thankYouMsgClass = By.className("complete-header");
    public CheckOutComplete(WebDriver driver) {
        super(driver);
    }

    public String checkOutComplete (){
        return getText(thankYouMsgClass);
    }

}
