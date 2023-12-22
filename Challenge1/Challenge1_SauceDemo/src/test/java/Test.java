import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import saucedemo.*;


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
        inventory.addToCart();
        Assert.assertTrue(inventory.checkAddToCart());
    }

    //Delete Item
    @org.testng.annotations.Test
    public void deleteItemToCart(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        indexLogin.loginSuccefull();
        inventory.addToCart();
        Assert.assertTrue(inventory.checkAddToCart());
        Assert.assertTrue(inventory.deleteItemCart());
    }

    //CheckOut Item

    @org.testng.annotations.Test
    public void checkOutItems(){
        IndexLogin indexLogin = new IndexLogin(driver);
        Inventory inventory = new Inventory(driver);
        CheckOutStepOne checkOutStepOne = new CheckOutStepOne(driver);
        CheckOutStepTwo checkOutStepTwo = new CheckOutStepTwo(driver);
        CheckOutComplete checkOutComplete = new CheckOutComplete(driver);
        Cart cart = new Cart(driver);
        String titleExpected = "Your Cart";
        indexLogin.loginSuccefull();
        inventory.addToCart();
        Assert.assertTrue(inventory.checkAddToCart());
        inventory.goToCartCheck();
        Assert.assertEquals(cart.checkPageTitle(),titleExpected);
        cart.clickOnCheckOutCart();
        checkOutStepOne.completeForm("fede","bazan","478502");
        checkOutStepOne.goToCheckStepTwo();
        checkOutStepTwo.goToFinish();
        Assert.assertEquals(checkOutComplete.checkOutComplete(),"Thank you for your order!");
    }
}
