import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void mainSetUp(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp(){

        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown(){

        driver.close();
    }

}