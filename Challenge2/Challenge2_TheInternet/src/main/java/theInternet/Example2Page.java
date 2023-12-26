package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2Page extends Base{

    By starBtmTag = By.tagName("button");
    By helloWorldMsgId = By.id("finish");

    public Example2Page(WebDriver driver) {
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
