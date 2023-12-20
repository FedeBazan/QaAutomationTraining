import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import saucedemo.IndexLogin;
import saucedemo.Inventory;


public class Test {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    @org.testng.annotations.Test
    public void testConnection(){
        String title=driver.getTitle();
        Assert.assertEquals("Swag Labs",title);
    }

    //Login Succefully

    @org.testng.annotations.Test
    public void loginsuccessfully(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        indexLogin.loginSuccefull();
        Assert.assertTrue(inventory.isDisplayedCart());
    }

    //Login Eail (Epic sadface)
    @org.testng.annotations.Test
    public void faillogin(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Assert.assertTrue(indexLogin.loginUnsuccefull());
    }

    //Add item to cart
    @org.testng.annotations.Test
    public void addItemToCart(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        indexLogin.loginSuccefull();
        Assert.assertTrue(inventory.addToCart());
    }

    //Delete Item
    @org.testng.annotations.Test
    public void deleteItemToCart(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        indexLogin.loginSuccefull();
        Assert.assertTrue(inventory.addToCart());
        Assert.assertTrue(inventory.deleteItemCart());
    }

    @org.testng.annotations.Test
    public void checkOutItems(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        indexLogin.loginSuccefull();
        Assert.assertTrue(inventory.addToCart());
    }
}
