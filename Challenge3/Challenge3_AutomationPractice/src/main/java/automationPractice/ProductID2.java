package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductID2 extends Base{

    By descriptionProductXpath = By.xpath("//*[@id=\"more-information\"]/p");

    public ProductID2(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedDescription(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionProductXpath));
        return isDisplayed(descriptionProductXpath);
    }
}
