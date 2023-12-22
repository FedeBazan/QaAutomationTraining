package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepOne extends Base{

    By firstNameId = By.id("first-name");
    By lastnameId = By.id("last-name");
    By postalCodeId = By.id("postal-code");
    By continueBtmID = By.id("continue");
    public CheckOutStepOne(WebDriver driver) {
        super(driver);
    }

    public void completeForm(String name, String lastName, String zcode){
        sendKeys(firstNameId,name);
        sendKeys(lastnameId,lastName);
        sendKeys(postalCodeId,zcode);
    }

    public void goToCheckStepTwo (){
        clickOnElement(continueBtmID);
    }
}
