import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import theInternet.Base;
import theInternet.DynamicLoadedPageElements;
import theInternet.Example1Page;
import theInternet.Example2Page;


public class Test{
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    //Test Web Connection
    @org.testng.annotations.Test
    public void testConnection(){
        String expectedText = "The Internet";
        String title = driver.getTitle();
        Assert.assertEquals(title,expectedText);
    }

    //Test Example2
    @org.testng.annotations.Test
    public void runExample2(){
        DynamicLoadedPageElements dynamicLoadedPageElements = new DynamicLoadedPageElements(driver);
        Example2Page example2Page = new Example2Page(driver);
        dynamicLoadedPageElements.clickOnExample2();
        example2Page.clickOnStartBtm();
        Assert.assertTrue(example2Page.checkHelloWorldMsg());
    }

    //Test Example1
    @org.testng.annotations.Test
    public void runExample1(){
        DynamicLoadedPageElements dynamicLoadedPageElements = new DynamicLoadedPageElements(driver);
        Example1Page example1Page = new Example1Page(driver);
        dynamicLoadedPageElements.clickOnExample1();
        example1Page.clickOnStartBtm();
        Assert.assertTrue(example1Page.checkHelloWorldMsg());
    }
}
