package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexLogin extends Base {

    By usernameLabelId = By.id("user-name");
    By passwordLabelId = By.id("password");
    By loginBtmId = By.id("login-button");

    String userName1 = "standard_user";
    String password = "secret_sauce";
    public IndexLogin(WebDriver driver) {
        super(driver);
    }

    public void loginSuccefull(){
        sendKeys(usernameLabelId,userName1);
        sendKeys(passwordLabelId,password);
        clickOnElement(loginBtmId);
    }
}
