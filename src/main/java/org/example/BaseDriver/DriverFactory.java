package org.example.BaseDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//import org.example.utility.ReadFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DriverFactory {
  /* public  WebDriver driver;
    ReadFile readFile = new ReadFile();
    String browserName;


@BeforeClass
    public void launchURL() {
 browserName = readFile.readPropertyFile("browserName");

        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.get(readFile.readPropertyFile("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();

    }

    // Singleton Design Pattern
    public WebDriver getWebDriver() {
        if (driver == null) {
            launchURL();
        }
        return driver;
    }

    @AfterClass
    public void closeBrowser() {
        if (null != driver) {
            driver.quit();
            driver = null;

        }
    }*/
}
