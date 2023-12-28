import automationPractice.Home;
import automationPractice.ProductID2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    //@org.testng.annotations.Test
    public void testConnection(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.demoblaze.com/");
    }

    @org.testng.annotations.Test
    public void testHomePageLoged(){
        Home home = new Home(driver);
        String username = "Lordmilagruesa99";
        String password = "Jol04w3A!";
        home.loginAccount(username,password);
    }

    @org.testng.annotations.Test
    public void selectPhoneCategory(){
        Home home = new Home(driver);
        String username = "Lordmilagruesa99";
        String password = "Jol04w3A!";
        home.loginAccount(username,password);
        home.clickOnPhonesCategoty(); //no hace click en la categoria
    }

    @org.testng.annotations.Test
    public void testProductsDetails(){
        Home home = new Home(driver);
        ProductID2 productID2 = new ProductID2(driver);
        String username = "Lordmilagruesa99";
        String password = "Jol04w3A!";
        home.loginAccount(username,password);
        home.goToItem();
        Assert.assertTrue(productID2.isDisplayedDescription());
    }
}