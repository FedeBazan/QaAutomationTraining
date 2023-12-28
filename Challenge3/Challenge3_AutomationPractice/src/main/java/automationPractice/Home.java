package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends Base {

    By logInBtmId = By.id("login2");
    By usernameLabelId = By.id("loginusername");
    By passwordLabelId = By.id("loginpassword");

    By loginBtmFormXpath = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    By phonCategoryId = By.xpath("//*[@id=\"itemc\"]");

    By nokiaLumiaLinkText = By.linkText("Nokia lumia 1520");
    By nokiaLumiaXparh = By.xpath("//a[@href='prod.html?idp_=2' and img[@class='card-img-top img-fluid']] ");

    public Home(WebDriver driver) {
        super(driver);
    }

    public void loginAccount(String username, String password) {
        clickOnElement(logInBtmId);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLabelId));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLabelId));
        sendKeys(usernameLabelId, username);
        sendKeys(passwordLabelId, password);
        clickOnElement(loginBtmFormXpath);
    }

    public void clickOnPhonesCategoty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phonCategoryId));
        clickOnElement(phonCategoryId);
    }

    public void goToItem() {
        // System.out.println(getText(nokiaLumiaXparh));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nokiaLumiaXparh));
        clickOnElement(nokiaLumiaXparh);
    }
}
