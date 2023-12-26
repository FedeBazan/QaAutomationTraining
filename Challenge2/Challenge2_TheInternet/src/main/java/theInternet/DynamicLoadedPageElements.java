package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadedPageElements extends Base{

    By example1LinkText = By.linkText("Example 1: Element on page that is hidden");
    By example2LinkText = By.linkText("Example 2: Element rendered after the fact");


    public DynamicLoadedPageElements(WebDriver driver) {
        super(driver);
    }

    public void clickOnExample1 (){
        clickOnElement(example1LinkText);
    }

    public void clickOnExample2 (){
        clickOnElement(example2LinkText);
    }
}
