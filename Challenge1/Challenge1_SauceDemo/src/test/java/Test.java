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
}
