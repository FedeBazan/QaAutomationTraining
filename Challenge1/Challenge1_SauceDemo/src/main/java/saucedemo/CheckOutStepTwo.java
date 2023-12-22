package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwo extends Base{

    By finishBtmId = By.id("finish");
    public CheckOutStepTwo(WebDriver driver) {
        super(driver);
    }

    public void goToFinish(){
        clickOnElement(finishBtmId);
    }
}
