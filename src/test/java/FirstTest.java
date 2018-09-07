import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.print.DocFlavor;

public class FirstTest {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new ChromeDriver();

        driver.get("https://stackoverflow.com/questions/18674092/how-to-implement-chromedriver-in-selenium-in-linux-platform");
        Assert.assertEquals(driver.getTitle(),"webdriver - How to implement chromedriver in selenium in Linux platform - Stack Overflow");
        driver.close();
        driver.quit();
    }

}
