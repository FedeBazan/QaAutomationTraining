package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Example1Page extends Base{

    By starBtmTag = By.tagName("button");
    By helloWorldMsgId = By.id("finish");

    public Example1Page(WebDriver driver) {
        super(driver);
    }

    public void clickOnStartBtm (){
        clickOnElement(starBtmTag);
    }

    public boolean checkHelloWorldMsg(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldMsgId));
        return isDisplayed(helloWorldMsgId);
    }
}
